package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class c60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ e60 b;

    public c60(e60 e60Var, FrameLayout frameLayout) {
        this.b = e60Var;
        this.a = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        e60 e60Var = this.b;
        if (e60Var.z0 == null) {
            e60Var.z0 = (uc) e60Var.B0(e60Var.Z);
        }
        e60Var.z0.f.setOnClickListener(new x50(this, 1));
    }
}
