package le;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.v1;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c(Object obj, float f7, float f10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = f7;
        this.c = f10;
    }

    public void a() {
        e eVar = (e) this.d;
        if (eVar.g) {
            eVar.d(this.b + this.c, 1.0f);
            if (eVar.g) {
                eVar.g = false;
            }
            eVar.b.V(eVar.e, eVar.a);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                a();
                break;
            default:
                v1 v1Var = (v1) this.d;
                v1Var.O = false;
                v1Var.M = true;
                v1Var.W = this.b;
                v1Var.a0 = this.c;
                v1Var.requestLayout();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((e) this.d).getClass();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
