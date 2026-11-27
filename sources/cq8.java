// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cq8 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eq8 b;

    public /* synthetic */ cq8(eq8 eq8Var, byte b) {
        this.a = b;
        this.b = eq8Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        byte b2 = 1;
        eq8 eq8Var = this.b;
        switch (b) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                eq8Var.c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new cq8(eq8Var, b2));
                break;
            default:
                eq8Var.c.getMessagesController().a3(true);
                break;
        }
    }
}
