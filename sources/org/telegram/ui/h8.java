package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class h8 implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ wn a;
    public final /* synthetic */ i8 b;

    public h8(i8 i8Var, wn wnVar) {
        this.b = i8Var;
        this.a = wnVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        k8 k8Var = this.b.b;
        k8Var.x.finishFragment();
        n8 n8Var = k8Var.x;
        this.a.b8(n8Var.P, n8Var.Q + 86400, z10);
    }
}
