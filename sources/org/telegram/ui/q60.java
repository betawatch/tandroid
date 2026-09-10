package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class q60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ s60 b;

    public q60(s60 s60Var, FrameLayout frameLayout) {
        this.b = s60Var;
        this.a = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        s60 s60Var = this.b;
        if (s60Var.z0 == null) {
            s60Var.z0 = (vc) s60Var.y0(s60Var.Z);
        }
        s60Var.z0.f.setOnClickListener(new l60(this, 1));
    }
}
