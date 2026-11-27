// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class fc8 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ PhotoViewer c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ fc8(PhotoViewer photoViewer, int i, byte b) {
        this.a = b;
        this.c = photoViewer;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        byte b2 = this.b;
        PhotoViewer photoViewer = this.c;
        switch (b) {
            case 0:
                gc8 gc8Var = photoViewer.O1;
                gc8Var.e.setVisibility(0);
                FrameLayout frameLayout = gc8Var.r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(hl.L(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                k43 k43Var = k43.h;
                ik8.t(translationY, k43Var, 320L);
                gc8Var.x.animate().alpha(1.0f).translationX(0.0f).setInterpolator(k43Var).setDuration(320L).start();
                photoViewer.t4 = b2;
                photoViewer.p6 = null;
                photoViewer.n6 = -1;
                break;
            default:
                photoViewer.t4 = b2;
                photoViewer.p6 = null;
                photoViewer.n6 = -1;
                break;
        }
    }
}
