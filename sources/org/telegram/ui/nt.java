package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nt implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ qt b;

    public /* synthetic */ nt(qt qtVar, int i7) {
        this.a = i7;
        this.b = qtVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                qt qtVar = this.b;
                qtVar.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new nt(qtVar, 1));
                break;
            default:
                this.b.getMessagesController().R2(true);
                break;
        }
    }
}
