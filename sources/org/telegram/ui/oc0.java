package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class oc0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ pc0 c;

    public /* synthetic */ oc0(pc0 pc0Var, float f7, int i10) {
        this.a = i10;
        this.c = pc0Var;
        this.b = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                pc0 pc0Var = this.c;
                TextView textView = pc0Var.f;
                int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.y6, false);
                int x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.n6, false);
                float f7 = this.b;
                pc0Var.s = f7;
                textView.setTextColor(i0.a.d(f7, x02, x03));
                break;
            default:
                pc0 pc0Var2 = this.c;
                TextView textView2 = pc0Var2.d;
                int x04 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.y6, false);
                int x05 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.n6, false);
                float f10 = this.b;
                pc0Var2.w = f10;
                textView2.setTextColor(i0.a.d(f10, x04, x05));
                break;
        }
    }
}
