package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class v8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ x8 c;

    public /* synthetic */ v8(x8 x8Var, int i10, int i11) {
        this.a = i11;
        this.c = x8Var;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                x8 x8Var = this.c;
                x8Var.r = 0;
                x8Var.setBackgroundColor(this.b);
                x8Var.invalidate();
                break;
            default:
                int i10 = this.b;
                x8 x8Var2 = this.c;
                x8Var2.setBackgroundColor(i10);
                x8Var2.r = 0;
                x8Var2.invalidate();
                break;
        }
    }
}
