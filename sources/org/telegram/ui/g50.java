package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g50 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ i50 b;

    public g50(i50 i50Var, FrameLayout frameLayout) {
        this.b = i50Var;
        this.a = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        i50 i50Var = this.b;
        if (i50Var.z0 == null) {
            i50Var.z0 = (sc) i50Var.E0(i50Var.Z);
        }
        i50Var.z0.f.setOnClickListener(new f50(this, 0));
    }
}
