package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class lj implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ mj b;

    public lj(mj mjVar, boolean z10) {
        this.b = mjVar;
        this.a = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        zn znVar = this.b.b;
        if (z10) {
            TLRPC.User user = znVar.f;
            boolean z11 = this.a;
            if (user != null || z11) {
                znVar.getMessagesStorage().getMessagesCount(znVar.T5, new kj(1, this, z11));
                return;
            }
        }
        znVar.qa(znVar.d4, z10);
    }
}
