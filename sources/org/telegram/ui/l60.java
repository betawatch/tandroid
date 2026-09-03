package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class l60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ n60 b;

    public l60(n60 n60Var, FrameLayout frameLayout) {
        this.b = n60Var;
        this.a = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        n60 n60Var = this.b;
        if (n60Var.w0 == null) {
            n60Var.w0 = (tc) n60Var.y0(n60Var.W);
        }
        n60Var.w0.f.setOnClickListener(new f60(this, 1));
    }
}
