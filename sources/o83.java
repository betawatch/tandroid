// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class o83 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r83 b;

    public /* synthetic */ o83(r83 r83Var, byte b) {
        this.a = b;
        this.b = r83Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        byte b2 = 1;
        r83 r83Var = this.b;
        switch (b) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                r83Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new o83(r83Var, b2));
                break;
            default:
                r83Var.getMessagesController().U2(true);
                break;
        }
    }
}
