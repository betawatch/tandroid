package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ew0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ gw0 b;

    public /* synthetic */ ew0(gw0 gw0Var, int i10) {
        this.a = i10;
        this.b = gw0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                gw0 gw0Var = this.b;
                gw0Var.c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new ew0(gw0Var, 1));
                break;
            default:
                this.b.c.getMessagesController().P2(true);
                break;
        }
    }
}
