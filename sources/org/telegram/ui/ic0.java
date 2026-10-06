package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class ic0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ jc0 c;

    public /* synthetic */ ic0(jc0 jc0Var, float f7, int i10) {
        this.a = i10;
        this.c = jc0Var;
        this.b = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                jc0 jc0Var = this.c;
                TextView textView = jc0Var.f;
                int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.y6, false);
                int w03 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.n6, false);
                float f7 = this.b;
                jc0Var.s = f7;
                textView.setTextColor(i0.a.d(f7, w02, w03));
                break;
            default:
                jc0 jc0Var2 = this.c;
                TextView textView2 = jc0Var2.d;
                int w04 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.y6, false);
                int w05 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.n6, false);
                float f10 = this.b;
                jc0Var2.w = f10;
                textView2.setTextColor(i0.a.d(f10, w04, w05));
                break;
        }
    }
}
