// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ab2 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gb2 b;

    public /* synthetic */ ab2(gb2 gb2Var, byte b) {
        this.a = b;
        this.b = gb2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        gb2 gb2Var = this.b;
        switch (b) {
            case 0:
                gb2Var.Q5.O0 = true;
                gb2Var.invalidate();
                break;
            default:
                gb2Var.setSelectedBackgroundProgress(0.0f);
                break;
        }
    }
}
