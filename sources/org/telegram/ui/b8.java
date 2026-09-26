package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class b8 implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ wn a;
    public final /* synthetic */ c8 b;

    public b8(c8 c8Var, wn wnVar) {
        this.b = c8Var;
        this.a = wnVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        e8 e8Var = this.b.b;
        e8Var.x.finishFragment();
        h8 h8Var = e8Var.x;
        this.a.S7(h8Var.P, h8Var.Q + 86400, z10);
    }
}
