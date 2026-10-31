package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class pu implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ su b;

    public /* synthetic */ pu(su suVar, int i10) {
        this.a = i10;
        this.b = suVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                su suVar = this.b;
                suVar.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new pu(suVar, 1));
                break;
            default:
                this.b.getMessagesController().P2(true);
                break;
        }
    }
}
