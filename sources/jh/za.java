package jh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.d00;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class za extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ View d;

    public /* synthetic */ za(View view, int i10, float f9, int i11) {
        this.a = i11;
        this.d = view;
        this.b = i10;
        this.c = f9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ab abVar = (ab) this.d;
                abVar.V = this.c;
                if (abVar.getValue() != this.b) {
                    abVar.e(abVar.getValue());
                }
                abVar.invalidate();
                break;
            case 1:
                d00 d00Var = (d00) this.d;
                int i10 = this.b;
                d00Var.b(i10 == 5 ? 0.0f : -this.c, i10 + 1);
                d00Var.y = 0.0f;
                d00Var.invalidate();
                break;
            default:
                ((org.telegram.ui.web.r1) this.d).c(this.b, this.c, false);
                break;
        }
    }

    public za(ab abVar, float f9, int i10) {
        this.a = 0;
        this.d = abVar;
        this.c = f9;
        this.b = i10;
    }
}
