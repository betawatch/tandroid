package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class wt0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ aw0 a;

    public wt0(aw0 aw0Var) {
        this.a = aw0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        aw0 aw0Var = this.a;
        if (aw0Var.p0 == null) {
            return;
        }
        aw0Var.p0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - aw0Var.p0.getRight());
    }
}
