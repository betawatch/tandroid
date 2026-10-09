package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class n60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ q60 b;

    public n60(q60 q60Var, FrameLayout frameLayout) {
        this.b = q60Var;
        this.a = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        q60 q60Var = this.b;
        if (q60Var.z0 == null) {
            q60Var.z0 = (uc) q60Var.y0(q60Var.Z);
        }
        q60Var.z0.f.setOnClickListener(new m60(this, 0));
    }
}
