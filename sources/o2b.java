// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class o2b extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p2b b;

    public /* synthetic */ o2b(p2b p2bVar, byte b) {
        this.a = b;
        this.b = p2bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        p2b p2bVar = this.b;
        switch (b) {
            case 0:
                p2bVar.E = 1.0f;
                p2bVar.invalidate();
                p2bVar.H = null;
                break;
            case 1:
                p2bVar.m(((Float) p2bVar.w.getAnimatedValue()).floatValue());
                p2bVar.w = null;
                break;
            default:
                super.onAnimationEnd(animator);
                p2bVar.G = null;
                break;
        }
    }
}
