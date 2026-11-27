// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ig5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lg5 b;

    public /* synthetic */ ig5(lg5 lg5Var, byte b) {
        this.a = b;
        this.b = lg5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        lg5 lg5Var = this.b;
        switch (b) {
            case 0:
                lg5Var.d = null;
                ea5 ea5Var = new ea5(this, (byte) 7);
                lg5Var.e = ea5Var;
                hl.d3(ea5Var, lg5Var.w);
                break;
            default:
                lg5Var.setVisibility(4);
                lg5Var.c = null;
                lg5Var.d = null;
                break;
        }
    }
}
