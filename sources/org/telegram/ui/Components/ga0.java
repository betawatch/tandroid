package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ga0 extends o71 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ab0 b;

    public ga0(ab0 ab0Var, Context context) {
        this.b = ab0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.o71
    public final void b(View view, int i10, int i11) {
        ua0 ua0Var = (ua0) view;
        ua0Var.i();
        ua0Var.l(false);
    }

    @Override // org.telegram.ui.Components.o71
    public final View d(int i10) {
        return new ua0(this.b, this.a, i10);
    }

    @Override // org.telegram.ui.Components.o71
    public final int e() {
        return this.b.e.a.size();
    }

    @Override // org.telegram.ui.Components.o71
    public final int h(int i10) {
        return ((xa0) this.b.e.a.get(i10)).a;
    }
}
