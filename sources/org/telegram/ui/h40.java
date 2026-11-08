package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
