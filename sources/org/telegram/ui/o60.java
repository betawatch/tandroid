package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class o60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ r60 b;

    public o60(r60 r60Var, FrameLayout frameLayout) {
        this.b = r60Var;
        this.a = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        r60 r60Var = this.b;
        if (r60Var.z0 == null) {
            r60Var.z0 = (vc) r60Var.y0(r60Var.Z);
        }
        r60Var.z0.f.setOnClickListener(new j60(this, 1));
    }
}
