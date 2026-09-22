package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ct0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ lv0 a;

    public ct0(lv0 lv0Var) {
        this.a = lv0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        lv0 lv0Var = this.a;
        if (lv0Var.n0 == null) {
            return;
        }
        lv0Var.n0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - lv0Var.n0.getRight());
    }
}
