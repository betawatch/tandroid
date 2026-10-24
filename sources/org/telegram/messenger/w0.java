package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class w0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMessagesMetadataController b;

    public /* synthetic */ w0(ChatMessagesMetadataController chatMessagesMetadataController, int i10) {
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
