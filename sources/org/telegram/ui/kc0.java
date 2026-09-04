package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class kc0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ lc0 c;

    public /* synthetic */ kc0(lc0 lc0Var, float f7, int i10) {
        this.a = i10;
        this.c = lc0Var;
        this.b = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                lc0 lc0Var = this.c;
                TextView textView = lc0Var.f;
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y6, false);
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.n6, false);
                float f7 = this.b;
                lc0Var.s = f7;
                textView.setTextColor(i0.a.d(f7, w02, w03));
                break;
            default:
                lc0 lc0Var2 = this.c;
                TextView textView2 = lc0Var2.d;
                int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y6, false);
                int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.n6, false);
                float f10 = this.b;
                lc0Var2.w = f10;
                textView2.setTextColor(i0.a.d(f10, w04, w05));
                break;
        }
    }
}
