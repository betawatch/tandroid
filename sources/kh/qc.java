package kh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class qc implements Runnable {
    public final /* synthetic */ MessagesController a;
    public final /* synthetic */ TLRPC.User[] b;
    public final /* synthetic */ double c;
    public final /* synthetic */ double d;
    public final /* synthetic */ int[] e;
    public final /* synthetic */ ConnectionsManager f;
    public final /* synthetic */ oc h;
    public final /* synthetic */ String n;

    public /* synthetic */ qc(MessagesController messagesController, TLRPC.User[] userArr, double d, double d9, int[] iArr, ConnectionsManager connectionsManager, oc ocVar, String str) {
        this.a = messagesController;
        this.b = userArr;
        this.c = d;
        this.d = d9;
        this.e = iArr;
        this.f = connectionsManager;
        this.h = ocVar;
        this.n = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = this.a.getInputUser(this.b[0]);
        tL_messages_getInlineBotResults.query = "";
        tL_messages_getInlineBotResults.offset = "";
        tL_messages_getInlineBotResults.flags |= 1;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
        final double d = this.c;
        tL_inputGeoPoint.lat = d;
        final double d9 = this.d;
        tL_inputGeoPoint._long = d9;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        final int[] iArr = this.e;
        final oc ocVar = this.h;
        final String str = this.n;
        iArr[0] = this.f.sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() { // from class: kh.nc
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final int[] iArr2 = iArr;
                final oc ocVar2 = ocVar;
                final double d10 = d;
                final double d11 = d9;
                final String str2 = str;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: kh.mc
                    @Override // java.lang.Runnable
                    public final void run() {
                        iArr2[0] = 0;
                        TLObject tLObject2 = tLObject;
                        boolean z10 = tLObject2 instanceof TLRPC.messages_BotResults;
                        oc ocVar3 = ocVar2;
                        if (z10) {
                            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                            if (!messages_botresults.results.isEmpty()) {
                                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(0);
                                String str3 = botInlineResult.title;
                                try {
                                    float parseFloat = Float.parseFloat(botInlineResult.description);
                                    tc tcVar = new tc();
                                    tcVar.a = d10;
                                    tcVar.b = d11;
                                    tcVar.c = str3;
                                    tcVar.d = parseFloat;
                                    uc.a = str2;
                                    uc.b = tcVar;
                                    ocVar3.run(tcVar);
                                    return;
                                } catch (Exception unused) {
                                    ocVar3.run(null);
                                    return;
                                }
                            }
                        }
                        ocVar3.run(null);
                    }
                });
            }
        });
    }
}
