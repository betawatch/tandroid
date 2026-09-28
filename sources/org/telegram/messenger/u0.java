package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMessagesMetadataController b;

    public /* synthetic */ u0(ChatMessagesMetadataController chatMessagesMetadataController, int i10) {
        this.a = i10;
        this.b = chatMessagesMetadataController;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                this.b.lambda$loadExtendedMediaForMessages$4(tLObject, tL_error);
                break;
            default:
                this.b.lambda$loadReactionsForMessages$3(tLObject, tL_error);
                break;
        }
    }
}
