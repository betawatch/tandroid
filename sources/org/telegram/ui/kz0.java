package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kz0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ nz0 b;

    public /* synthetic */ kz0(nz0 nz0Var, int i10) {
        this.a = i10;
        this.b = nz0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                nz0 nz0Var = this.b;
                nz0Var.c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new kz0(nz0Var, 1));
                break;
            default:
                this.b.c.getMessagesController().loadAppConfig();
                break;
        }
    }
}
