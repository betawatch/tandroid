package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class wq0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ zs0 a;

    public wq0(zs0 zs0Var) {
        this.a = zs0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        zs0 zs0Var = this.a;
        if (zs0Var.p0 == null) {
            return;
        }
        zs0Var.p0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - zs0Var.p0.getRight());
    }
}
