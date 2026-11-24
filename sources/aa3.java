// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class aa3 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ da3 b;

    public /* synthetic */ aa3(da3 da3Var, byte b) {
        this.a = b;
        this.b = da3Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        byte b2 = 1;
        da3 da3Var = this.b;
        switch (b) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                da3Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new aa3(da3Var, b2));
                break;
            default:
                da3Var.getMessagesController().W2(true);
                break;
        }
    }
}
