package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
