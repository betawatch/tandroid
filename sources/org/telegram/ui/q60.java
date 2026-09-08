package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
