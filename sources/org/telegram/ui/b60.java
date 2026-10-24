package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
