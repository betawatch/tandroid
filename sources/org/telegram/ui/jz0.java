package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class jz0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ mz0 b;

    public /* synthetic */ jz0(mz0 mz0Var, int i10) {
        this.a = i10;
        this.b = mz0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                mz0 mz0Var = this.b;
                mz0Var.c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new jz0(mz0Var, 1));
                break;
            default:
                this.b.c.getMessagesController().loadAppConfig();
                break;
        }
    }
}
