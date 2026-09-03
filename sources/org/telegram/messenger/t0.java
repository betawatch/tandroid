package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class t0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMessagesMetadataController b;

    public /* synthetic */ t0(ChatMessagesMetadataController chatMessagesMetadataController, int i10) {
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
