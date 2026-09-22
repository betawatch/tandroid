package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
