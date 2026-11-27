// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class kc8 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lc8 b;

    public /* synthetic */ kc8(lc8 lc8Var, byte b) {
        this.a = b;
        this.b = lc8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        lc8 lc8Var = this.b;
        switch (b) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) lc8Var.b;
                photoViewer.R1.getNextView().setText((CharSequence) null);
                ic8 ic8Var = photoViewer.U1;
                ic8Var.l0 = false;
                if (ic8Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) ic8Var.o0.getLayoutParams()).topMargin = ic8Var.m0;
                    ic8Var.m0 = -1;
                    ic8Var.requestLayout();
                    break;
                }
                break;
            default:
                ((PhotoViewer) lc8Var.b).R1.setTranslationY(0.0f);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ic8 ic8Var = ((PhotoViewer) this.b.b).U1;
                Method method = ic8Var.f0;
                if (method != null) {
                    try {
                        method.invoke(ic8Var, null);
                        break;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return;
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
