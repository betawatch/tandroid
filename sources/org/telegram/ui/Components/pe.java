package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class pe implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ jt0 a;
    public final /* synthetic */ en0 b;

    public pe(jt0 jt0Var, en0 en0Var) {
        this.a = jt0Var;
        this.b = en0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        jt0 jt0Var = this.a;
        jt0Var.post(new ki.n(this, jt0Var, this.b, 29));
    }
}
