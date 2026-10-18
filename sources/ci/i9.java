package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.yj0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class i9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ z9 b;

    public /* synthetic */ i9(z9 z9Var, int i10) {
        this.a = i10;
        this.b = z9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        p4 t10;
        yj0 yj0Var;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                z9 z9Var = this.b;
                w9 w9Var = z9Var.s0;
                o9 o9Var = z9Var.v;
                if (o9Var != null) {
                    o9Var.a(true);
                }
                z9Var.o();
                z9Var.J0.unlock();
                l7 l7Var = z9Var.u1;
                if (l7Var != null) {
                    l7Var.b();
                    AndroidUtilities.removeFromParent(z9Var.u1);
                    z9Var.u1 = null;
                }
                ImageReceiver imageReceiver = w9Var.b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    w9Var.b = null;
                }
                ImageReceiver imageReceiver2 = w9Var.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    w9Var.c.setVisible(true, true);
                }
                if (w9Var.d != null && (t10 = z9Var.t()) != null && (yj0Var = t10.o1.d) != null) {
                    yj0 yj0Var2 = w9Var.d;
                    yj0Var2.getClass();
                    yj0Var2.c = yj0Var.c;
                    yj0Var2.f = yj0Var.f;
                    yj0Var2.b = yj0Var.b;
                    yj0Var2.a = System.currentTimeMillis();
                    yj0Var2.c();
                }
                o4 o4Var = z9Var.G0;
                if (o4Var != null) {
                    o4Var.b();
                }
                SurfaceView surfaceView = z9Var.C0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                z9Var.I();
                try {
                    AndroidUtilities.runOnUIThread(new androidx.fragment.app.d(this, 26));
                } catch (Exception unused) {
                }
                z9Var.m0 = false;
                z9Var.d = false;
                s3 s3Var = z9Var.o1;
                if (s3Var != null) {
                    s3Var.run();
                    z9Var.o1 = null;
                    break;
                }
                break;
            case 1:
                z9 z9Var2 = this.b;
                z9Var2.H = null;
                z9Var2.Z = 0.0f;
                z9Var2.d0 = 0.0f;
                p9 p9Var = z9Var2.n0;
                p4 currentPeerView = p9Var != null ? p9Var.getCurrentPeerView() : null;
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                z9 z9Var3 = this.b;
                w9 w9Var2 = z9Var3.s0;
                z9Var3.U = 1.0f;
                z9Var3.o();
                z9.x1 = false;
                o9 o9Var2 = z9Var3.v;
                if (o9Var2 != null) {
                    o9Var2.a(true);
                }
                n9 n9Var = z9Var3.s;
                if (n9Var != null) {
                    n9Var.invalidate();
                }
                ImageReceiver imageReceiver3 = w9Var2.b;
                if (imageReceiver3 != null && !z9Var3.d) {
                    imageReceiver3.setVisible(true, true);
                    w9Var2.b = null;
                }
                ImageReceiver imageReceiver4 = w9Var2.c;
                if (imageReceiver4 != null && !z9Var3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    w9Var2.c.setVisible(true, true);
                    w9Var2.c = null;
                }
                p4 t11 = z9Var3.t();
                if (t11 != null) {
                    t11.f1(false);
                }
                h1 h1Var = z9Var3.A0;
                if (h1Var != null) {
                    h1Var.v((1.0f - z9Var3.V) * z9Var3.U);
                }
                if (z9Var3.w1) {
                    z9Var3.w1 = false;
                    z9Var3.p();
                    AndroidUtilities.runOnUIThread(new s3(z9Var3, 1), 30L);
                } else if (!SharedConfig.storiesIntroShown) {
                    if (z9Var3.u1 == null && z9Var3.v != null) {
                        l7 l7Var2 = new l7(z9Var3.v.getContext(), z9Var3.s);
                        z9Var3.u1 = l7Var2;
                        l7Var2.setAlpha(0.0f);
                        z9Var3.v.addView(z9Var3.u1);
                    }
                    l7 l7Var3 = z9Var3.u1;
                    if (l7Var3 != null) {
                        l7Var3.setOnClickListener(new ah.g0(this, 16));
                        z9Var3.u1.animate().alpha(1.0f).setDuration(150L).setListener(new s9(this, 1)).start();
                    }
                    SharedConfig.setStoriesIntroShown(true);
                }
                z9Var3.P();
                z9Var3.J0.unlock();
                break;
        }
    }
}
