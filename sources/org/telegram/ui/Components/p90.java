package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class p90 extends n61 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ja0 b;

    public p90(ja0 ja0Var, Context context) {
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
