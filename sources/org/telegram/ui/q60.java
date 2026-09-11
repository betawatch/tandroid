package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class q60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ t60 b;

    public q60(t60 t60Var, FrameLayout frameLayout) {
        this.b = t60Var;
        this.a = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        t60 t60Var = this.b;
        if (t60Var.z0 == null) {
            t60Var.z0 = (uc) t60Var.y0(t60Var.Z);
        }
        t60Var.z0.f.setOnClickListener(new l60(this, 1));
    }
}
