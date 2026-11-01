package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class f50 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ h50 b;

    public f50(h50 h50Var, FrameLayout frameLayout) {
        this.b = h50Var;
        this.a = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        h50 h50Var = this.b;
        if (h50Var.z0 == null) {
            h50Var.z0 = (sc) h50Var.F0(h50Var.Z);
        }
        h50Var.z0.f.setOnClickListener(new e50(this, 0));
    }
}
