// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class dsc implements Runnable {
    public final /* synthetic */ na7 a;
    public final /* synthetic */ TLRPC.User[] b;
    public final /* synthetic */ double c;
    public final /* synthetic */ double d;
    public final /* synthetic */ int[] e;
    public final /* synthetic */ ConnectionsManager f;
    public final /* synthetic */ o42 h;
    public final /* synthetic */ String n;

    public /* synthetic */ dsc(na7 na7Var, TLRPC.User[] userArr, double d, double d2, int[] iArr, ConnectionsManager connectionsManager, o42 o42Var, String str) {
        this.a = na7Var;
        this.b = userArr;
        this.c = d;
        this.d = d2;
        this.e = iArr;
        this.f = connectionsManager;
        this.h = o42Var;
        this.n = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = this.a.o1(this.b[0]);
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
        final o42 o42Var = this.h;
        final String str = this.n;
        iArr[0] = this.f.sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() { // from class: csc
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final int[] iArr2 = iArr;
                final o42 o42Var2 = o42Var;
                final double d3 = d;
                final double d4 = d2;
                final String str2 = str;
                gl.c3(new Runnable() { // from class: bsc
                    @Override // java.lang.Runnable
                    public final void run() {
                        iArr2[0] = 0;
                        TLObject tLObject2 = tLObject;
                        boolean z = tLObject2 instanceof TLRPC.messages_BotResults;
                        o42 o42Var3 = o42Var2;
                        if (z) {
                            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                            if (!messages_botresults.results.isEmpty()) {
                                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(0);
                                String str3 = botInlineResult.title;
                                try {
                                    float parseFloat = Float.parseFloat(botInlineResult.description);
                                    fsc fscVar = new fsc();
                                    fscVar.a = d3;
                                    fscVar.b = d4;
                                    fscVar.c = str3;
                                    fscVar.d = parseFloat;
                                    gsc.a = str2;
                                    gsc.b = fscVar;
                                    o42Var3.a(fscVar);
                                    return;
                                } catch (Exception unused) {
                                    o42Var3.a(null);
                                    return;
                                }
                            }
                        }
                        o42Var3.a(null);
                    }
                });
            }
        });
    }
}
