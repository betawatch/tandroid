package hi;

import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class mb implements Runnable {
    public final /* synthetic */ np a;
    public final /* synthetic */ TLRPC.User[] b;
    public final /* synthetic */ double c;
    public final /* synthetic */ double d;
    public final /* synthetic */ int[] e;
    public final /* synthetic */ ConnectionsManager f;
    public final /* synthetic */ kb h;
    public final /* synthetic */ String n;

    public /* synthetic */ mb(np npVar, TLRPC.User[] userArr, double d, double d2, int[] iArr, ConnectionsManager connectionsManager, kb kbVar, String str) {
        this.a = npVar;
        this.b = userArr;
        this.c = d;
        this.d = d2;
        this.e = iArr;
        this.f = connectionsManager;
        this.h = kbVar;
        this.n = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = this.a.q1(this.b[0]);
        tL_messages_getInlineBotResults.query = "";
        tL_messages_getInlineBotResults.offset = "";
        tL_messages_getInlineBotResults.flags |= 1;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
        final double d = this.c;
        tL_inputGeoPoint.lat = d;
        final double d2 = this.d;
        tL_inputGeoPoint._long = d2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        final int[] iArr = this.e;
        final kb kbVar = this.h;
        final String str = this.n;
        iArr[0] = this.f.sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() { // from class: hi.jb
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final int[] iArr2 = iArr;
                final kb kbVar2 = kbVar;
                final double d10 = d;
                final double d11 = d2;
                final String str2 = str;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: hi.ib
                    @Override // java.lang.Runnable
                    public final void run() {
                        iArr2[0] = 0;
                        TLObject tLObject2 = tLObject;
                        boolean z10 = tLObject2 instanceof TLRPC.messages_BotResults;
                        kb kbVar3 = kbVar2;
                        if (z10) {
                            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                            if (!messages_botresults.results.isEmpty()) {
                                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(0);
                                String str3 = botInlineResult.title;
                                try {
                                    float parseFloat = Float.parseFloat(botInlineResult.description);
                                    pb pbVar = new pb();
                                    pbVar.a = d10;
                                    pbVar.b = d11;
                                    pbVar.c = str3;
                                    pbVar.d = parseFloat;
                                    qb.a = str2;
                                    qb.b = pbVar;
                                    kbVar3.a(pbVar);
                                    return;
                                } catch (Exception unused) {
                                    kbVar3.a(null);
                                    return;
                                }
                            }
                        }
                        kbVar3.a(null);
                    }
                });
            }
        });
    }
}
