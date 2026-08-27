package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class wr0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ hu0 a;

    public wr0(hu0 hu0Var) {
        this.a = hu0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        hu0 hu0Var = this.a;
        if (hu0Var.j0 == null) {
            return;
        }
        hu0Var.j0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - hu0Var.j0.getRight());
    }
}
