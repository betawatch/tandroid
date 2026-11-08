package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class h40 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ j40 b;

    public h40(j40 j40Var, FrameLayout frameLayout) {
        this.b = j40Var;
        this.a = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        j40 j40Var = this.b;
        if (j40Var.z0 == null) {
            j40Var.z0 = (kc) j40Var.F0(j40Var.Z);
        }
        j40Var.z0.f.setOnClickListener(new g40(this, 0));
    }
}
