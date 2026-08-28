package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p71 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ z71 b;

    public /* synthetic */ p71(z71 z71Var, int i9) {
        this.a = i9;
        this.b = z71Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                z71 z71Var = this.b;
                z71Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new p71(z71Var, 1));
                break;
            default:
                this.b.getMessagesController().loadAppConfig();
                break;
        }
    }
}
