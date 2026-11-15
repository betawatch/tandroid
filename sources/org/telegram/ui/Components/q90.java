package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class q90 extends n61 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ja0 b;

    public q90(ja0 ja0Var, Context context) {
        this.b = ja0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.n61
    public final void b(View view, int i7, int i10) {
        da0 da0Var = (da0) view;
        da0Var.i();
        da0Var.l(false);
    }

    @Override // org.telegram.ui.Components.n61
    public final View d(int i7) {
        return new da0(this.b, this.a, i7);
    }

    @Override // org.telegram.ui.Components.n61
    public final int e() {
        return this.b.e.a.size();
    }

    @Override // org.telegram.ui.Components.n61
    public final int h(int i7) {
        return ((ga0) this.b.e.a.get(i7)).a;
    }
}
