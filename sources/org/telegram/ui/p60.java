package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
