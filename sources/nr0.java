// default package

import android.animation.AnimatorSet;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class nr0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rr0 b;
    public final /* synthetic */ AnimatorSet c;

    public /* synthetic */ nr0(rr0 rr0Var, AnimatorSet animatorSet, byte b) {
        this.a = b;
        this.b = rr0Var;
        this.c = animatorSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        AnimatorSet animatorSet = this.c;
        rr0 rr0Var = this.b;
        switch (b) {
            case 0:
                rr0Var.c.postOnAnimation(new nr0(rr0Var, animatorSet, (byte) 1));
                break;
            default:
                if (rr0Var.y == animatorSet) {
                    animatorSet.start();
                    break;
                }
                break;
        }
    }
}
