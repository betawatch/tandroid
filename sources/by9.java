// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class by9 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lc8 b;

    public /* synthetic */ by9(lc8 lc8Var, byte b) {
        this.a = b;
        this.b = lc8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        lc8 lc8Var = this.b;
        switch (b) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) lc8Var.b;
                secretMediaViewer.Y.getNextView().setText((CharSequence) null);
                ic8 ic8Var = secretMediaViewer.Z;
                ic8Var.l0 = false;
                if (ic8Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) ic8Var.o0.getLayoutParams()).topMargin = ic8Var.m0;
                    ic8Var.m0 = -1;
                    ic8Var.requestLayout();
                    break;
                }
                break;
            default:
                ((SecretMediaViewer) lc8Var.b).Y.setTranslationY(0.0f);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ic8 ic8Var = ((SecretMediaViewer) this.b.b).Z;
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
