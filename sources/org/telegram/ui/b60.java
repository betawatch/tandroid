package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
