package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
