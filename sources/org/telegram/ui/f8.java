package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class f8 implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ fo a;
    public final /* synthetic */ g8 b;

    public f8(g8 g8Var, fo foVar) {
        this.b = g8Var;
        this.a = foVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        i8 i8Var = this.b.b;
        i8Var.x.finishFragment();
        l8 l8Var = i8Var.x;
        this.a.V7(l8Var.P, l8Var.Q + 86400, z10);
    }
}
