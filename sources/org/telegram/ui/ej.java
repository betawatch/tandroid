package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ej implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ fj b;

    public ej(fj fjVar, boolean z10) {
        this.b = fjVar;
        this.a = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        sn snVar = this.b.b;
        if (z10) {
            TLRPC.User user = snVar.f;
            boolean z11 = this.a;
            if (user != null || z11) {
                snVar.getMessagesStorage().getMessagesCount(snVar.f6, new dj(1, this, z11));
                return;
            }
        }
        snVar.va(snVar.p4, z10);
    }
}
