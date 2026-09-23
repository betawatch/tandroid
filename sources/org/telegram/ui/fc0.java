package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class fc0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ gc0 c;

    public /* synthetic */ fc0(gc0 gc0Var, float f7, int i10) {
        this.a = i10;
        this.c = gc0Var;
        this.b = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                gc0 gc0Var = this.c;
                TextView textView = gc0Var.f;
                int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.y6, false);
                int w03 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.n6, false);
                float f7 = this.b;
                gc0Var.s = f7;
                textView.setTextColor(i0.a.d(f7, w02, w03));
                break;
            default:
                gc0 gc0Var2 = this.c;
                TextView textView2 = gc0Var2.d;
                int w04 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.y6, false);
                int w05 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.n6, false);
                float f10 = this.b;
                gc0Var2.w = f10;
                textView2.setTextColor(i0.a.d(f10, w04, w05));
                break;
        }
    }
}
