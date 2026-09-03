package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class os0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ yu0 a;

    public os0(yu0 yu0Var) {
        this.a = yu0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        yu0 yu0Var = this.a;
        if (yu0Var.k0 == null) {
            return;
        }
        yu0Var.k0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - yu0Var.k0.getRight());
    }
}
