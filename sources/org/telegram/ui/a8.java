package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a8 implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ qn a;
    public final /* synthetic */ b8 b;

    public a8(b8 b8Var, qn qnVar) {
        this.b = b8Var;
        this.a = qnVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        d8 d8Var = this.b.b;
        d8Var.x.finishFragment();
        g8 g8Var = d8Var.x;
        this.a.S7(g8Var.L, g8Var.M + 86400, z10);
    }
}
