// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class h93 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k93 b;

    public /* synthetic */ h93(k93 k93Var, byte b) {
        this.a = b;
        this.b = k93Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        byte b2 = 1;
        k93 k93Var = this.b;
        switch (b) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                k93Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new h93(k93Var, b2));
                break;
            default:
                k93Var.getMessagesController().a3(true);
                break;
        }
    }
}
