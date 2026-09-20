package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class p60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ s60 b;

    public p60(s60 s60Var, FrameLayout frameLayout) {
        this.b = s60Var;
        this.a = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        s60 s60Var = this.b;
        if (s60Var.z0 == null) {
            s60Var.z0 = (uc) s60Var.y0(s60Var.Z);
        }
        s60Var.z0.f.setOnClickListener(new k60(this, 1));
    }
}
