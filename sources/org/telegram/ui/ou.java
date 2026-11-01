package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ou implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ru b;

    public /* synthetic */ ou(ru ruVar, int i10) {
        this.a = i10;
        this.b = ruVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                ru ruVar = this.b;
                ruVar.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new ou(ruVar, 1));
                break;
            default:
                this.b.getMessagesController().P2(true);
                break;
        }
    }
}
