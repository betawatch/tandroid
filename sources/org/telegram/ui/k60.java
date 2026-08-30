package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class k60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ m60 b;

    public k60(m60 m60Var, FrameLayout frameLayout) {
        this.b = m60Var;
        this.a = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        m60 m60Var = this.b;
        if (m60Var.w0 == null) {
            m60Var.w0 = (uc) m60Var.y0(m60Var.W);
        }
        m60Var.w0.f.setOnClickListener(new e60(this, 1));
    }
}
