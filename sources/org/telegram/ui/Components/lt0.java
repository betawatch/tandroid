package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class lt0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ uv0 a;

    public lt0(uv0 uv0Var) {
        this.a = uv0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        uv0 uv0Var = this.a;
        if (uv0Var.n0 == null) {
            return;
        }
        uv0Var.n0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - uv0Var.n0.getRight());
    }
}
