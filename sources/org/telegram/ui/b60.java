package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class b60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ d60 b;

    public b60(d60 d60Var, FrameLayout frameLayout) {
        this.b = d60Var;
        this.a = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        d60 d60Var = this.b;
        if (d60Var.z0 == null) {
            d60Var.z0 = (tc) d60Var.A0(d60Var.Z);
        }
        d60Var.z0.f.setOnClickListener(new w50(this, 1));
    }
}
