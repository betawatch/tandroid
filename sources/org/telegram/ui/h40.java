package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class h40 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ j40 b;

    public h40(j40 j40Var, FrameLayout frameLayout) {
        this.b = j40Var;
        this.a = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        j40 j40Var = this.b;
        if (j40Var.A0 == null) {
            j40Var.A0 = (jc) j40Var.F0(j40Var.a0);
        }
        j40Var.A0.f.setOnClickListener(new g40(this, 0));
    }
}
