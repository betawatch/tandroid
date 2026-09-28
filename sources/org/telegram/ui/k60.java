package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class k60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ n60 b;

    public k60(n60 n60Var, FrameLayout frameLayout) {
        this.b = n60Var;
        this.a = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        n60 n60Var = this.b;
        if (n60Var.z0 == null) {
            n60Var.z0 = (tc) n60Var.y0(n60Var.Z);
        }
        n60Var.z0.f.setOnClickListener(new f60(this, 1));
    }
}
