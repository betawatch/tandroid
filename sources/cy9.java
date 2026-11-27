// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class cy9 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SecretMediaViewer b;

    public /* synthetic */ cy9(SecretMediaViewer secretMediaViewer, byte b) {
        this.a = b;
        this.b = secretMediaViewer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        SecretMediaViewer secretMediaViewer = this.b;
        switch (b) {
            case 0:
                Runnable runnable = secretMediaViewer.n0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.n0 = null;
                    break;
                }
                break;
            case 1:
                AnimatorSet animatorSet = secretMediaViewer.H;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    secretMediaViewer.G.setVisibility(8);
                    secretMediaViewer.H = null;
                    secretMediaViewer.Z.scrollTo(0, 0);
                    break;
                }
                break;
            case 2:
                Runnable runnable2 = secretMediaViewer.n0;
                if (runnable2 != null) {
                    runnable2.run();
                    secretMediaViewer.n0 = null;
                    break;
                }
                break;
            default:
                secretMediaViewer.J0 = null;
                secretMediaViewer.e.invalidate();
                break;
        }
    }
}
