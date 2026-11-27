// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
