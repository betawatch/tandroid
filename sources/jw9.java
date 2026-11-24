// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jw9 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wa8 b;

    public /* synthetic */ jw9(wa8 wa8Var, byte b) {
        this.a = b;
        this.b = wa8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        wa8 wa8Var = this.b;
        switch (b) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) wa8Var.b;
                secretMediaViewer.Y.getNextView().setText((CharSequence) null);
                ta8 ta8Var = secretMediaViewer.Z;
                ta8Var.l0 = false;
                if (ta8Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) ta8Var.o0.getLayoutParams()).topMargin = ta8Var.m0;
                    ta8Var.m0 = -1;
                    ta8Var.requestLayout();
                    break;
                }
                break;
            default:
                ((SecretMediaViewer) wa8Var.b).Y.setTranslationY(0.0f);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ta8 ta8Var = ((SecretMediaViewer) this.b.b).Z;
                Method method = ta8Var.f0;
                if (method != null) {
                    try {
                        method.invoke(ta8Var, null);
                        break;
                    } catch (Exception e) {
                        fc4.g(e, true);
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
