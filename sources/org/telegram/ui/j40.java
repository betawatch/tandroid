package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class j40 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ l40 b;

    public j40(l40 l40Var, FrameLayout frameLayout) {
        this.b = l40Var;
        this.a = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        l40 l40Var = this.b;
        if (l40Var.z0 == null) {
            l40Var.z0 = (kc) l40Var.F0(l40Var.Z);
        }
        l40Var.z0.f.setOnClickListener(new i40(this, 0));
    }
}
