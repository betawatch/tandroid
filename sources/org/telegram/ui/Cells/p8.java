package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class p8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ r8 c;

    public /* synthetic */ p8(r8 r8Var, int i10, int i11) {
        this.a = i11;
        this.c = r8Var;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                r8 r8Var = this.c;
                r8Var.r = 0;
                r8Var.setBackgroundColor(this.b);
                r8Var.invalidate();
                break;
            default:
                int i10 = this.b;
                r8 r8Var2 = this.c;
                r8Var2.setBackgroundColor(i10);
                r8Var2.r = 0;
                r8Var2.invalidate();
                break;
        }
    }
}
