package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lt implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ot b;

    public /* synthetic */ lt(ot otVar, int i3) {
        this.a = i3;
        this.b = otVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                ot otVar = this.b;
                otVar.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new lt(otVar, 1));
                break;
            default:
                this.b.getMessagesController().R2(true);
                break;
        }
    }
}
