package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        if (l40Var.A0 == null) {
            l40Var.A0 = (jc) l40Var.F0(l40Var.a0);
        }
        l40Var.A0.f.setOnClickListener(new i40(this, 0));
    }
}
