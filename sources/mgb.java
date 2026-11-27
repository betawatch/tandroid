// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class mgb extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Switch b;

    public /* synthetic */ mgb(Switch r1, byte b) {
        this.a = b;
        this.b = r1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Switch r1 = this.b;
        switch (b) {
            case 0:
                r1.d = null;
                break;
            default:
                r1.e = null;
                break;
        }
    }
}
