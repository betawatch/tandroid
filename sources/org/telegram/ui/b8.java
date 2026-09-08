package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class b8 implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ co a;
    public final /* synthetic */ c8 b;

    public b8(c8 c8Var, co coVar) {
        this.b = c8Var;
        this.a = coVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        e8 e8Var = this.b.b;
        e8Var.x.finishFragment();
        h8 h8Var = e8Var.x;
        this.a.S7(h8Var.P, h8Var.Q + 86400, z10);
    }
}
