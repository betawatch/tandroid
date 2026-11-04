package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c40 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ e40 b;

    public c40(e40 e40Var, FrameLayout frameLayout) {
        this.b = e40Var;
        this.a = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        e40 e40Var = this.b;
        if (e40Var.A0 == null) {
            e40Var.A0 = (ic) e40Var.F0(e40Var.a0);
        }
        e40Var.A0.f.setOnClickListener(new b40(this, 0));
    }
}
