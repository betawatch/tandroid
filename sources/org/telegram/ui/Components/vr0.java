package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vr0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ eu0 a;

    public vr0(eu0 eu0Var) {
        this.a = eu0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        eu0 eu0Var = this.a;
        if (eu0Var.j0 == null) {
            return;
        }
        eu0Var.j0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - eu0Var.j0.getRight());
    }
}
