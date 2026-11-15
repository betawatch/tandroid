package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class wq0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ ys0 a;

    public wq0(ys0 ys0Var) {
        this.a = ys0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        ys0 ys0Var = this.a;
        if (ys0Var.q0 == null) {
            return;
        }
        ys0Var.q0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - ys0Var.q0.getRight());
    }
}
