package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o81 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ z81 b;

    public /* synthetic */ o81(z81 z81Var, int i10) {
        this.a = i10;
        this.b = z81Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                z81 z81Var = this.b;
                z81Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new o81(z81Var, 1));
                break;
            default:
                this.b.getMessagesController().loadAppConfig();
                break;
        }
    }
}
