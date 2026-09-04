package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class q60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ t60 b;

    public q60(t60 t60Var, FrameLayout frameLayout) {
        this.b = t60Var;
        this.a = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        t60 t60Var = this.b;
        if (t60Var.z0 == null) {
            t60Var.z0 = (uc) t60Var.y0(t60Var.Z);
        }
        t60Var.z0.f.setOnClickListener(new l60(this, 1));
    }
}
