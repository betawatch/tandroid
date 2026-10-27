package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class e60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ g60 b;

    public e60(g60 g60Var, FrameLayout frameLayout) {
        this.b = g60Var;
        this.a = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        g60 g60Var = this.b;
        if (g60Var.z0 == null) {
            g60Var.z0 = (uc) g60Var.B0(g60Var.Z);
        }
        g60Var.z0.f.setOnClickListener(new z50(this, 1));
    }
}
