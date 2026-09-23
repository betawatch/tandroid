package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ps0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ yu0 a;

    public ps0(yu0 yu0Var) {
        this.a = yu0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        yu0 yu0Var = this.a;
        if (yu0Var.n0 == null) {
            return;
        }
        yu0Var.n0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - yu0Var.n0.getRight());
    }
}
