package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.bj0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class r8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i9 b;

    public /* synthetic */ r8(i9 i9Var, int i10) {
        this.a = i10;
        this.b = i9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d4 t10;
        bj0 bj0Var;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                i9 i9Var = this.b;
                f9 f9Var = i9Var.o0;
                x8 x8Var = i9Var.v;
                if (x8Var != null) {
                    x8Var.a(true);
                }
                i9Var.o();
                i9Var.F0.unlock();
                w6 w6Var = i9Var.q1;
                if (w6Var != null) {
                    w6Var.b();
                    AndroidUtilities.removeFromParent(i9Var.q1);
                    i9Var.q1 = null;
                }
                ImageReceiver imageReceiver = f9Var.b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    f9Var.b = null;
                }
                ImageReceiver imageReceiver2 = f9Var.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    f9Var.c.setVisible(true, true);
                }
                if (f9Var.d != null && (t10 = i9Var.t()) != null && (bj0Var = t10.k1.d) != null) {
                    bj0 bj0Var2 = f9Var.d;
                    bj0Var2.getClass();
                    bj0Var2.c = bj0Var.c;
                    bj0Var2.f = bj0Var.f;
                    bj0Var2.b = bj0Var.b;
                    bj0Var2.a = System.currentTimeMillis();
                    bj0Var2.c();
                }
                c4 c4Var = i9Var.C0;
                if (c4Var != null) {
                    c4Var.a();
                }
                SurfaceView surfaceView = i9Var.y0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                i9Var.I();
                try {
                    AndroidUtilities.runOnUIThread(new m5(this, 11));
                } catch (Exception unused) {
                }
                i9Var.i0 = false;
                i9Var.d = false;
                j3 j3Var = i9Var.k1;
                if (j3Var != null) {
                    j3Var.run();
                    i9Var.k1 = null;
                    break;
                }
                break;
            case 1:
                i9 i9Var2 = this.b;
                i9Var2.D = null;
                i9Var2.V = 0.0f;
                i9Var2.Z = 0.0f;
                y8 y8Var = i9Var2.j0;
                d4 currentPeerView = y8Var != null ? y8Var.getCurrentPeerView() : null;
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                i9 i9Var3 = this.b;
                f9 f9Var2 = i9Var3.o0;
                i9Var3.Q = 1.0f;
                i9Var3.o();
                i9.t1 = false;
                x8 x8Var2 = i9Var3.v;
                if (x8Var2 != null) {
                    x8Var2.a(true);
                }
                w8 w8Var = i9Var3.s;
                if (w8Var != null) {
                    w8Var.invalidate();
                }
                ImageReceiver imageReceiver3 = f9Var2.b;
                if (imageReceiver3 != null && !i9Var3.d) {
                    imageReceiver3.setVisible(true, true);
                    f9Var2.b = null;
                }
                ImageReceiver imageReceiver4 = f9Var2.c;
                if (imageReceiver4 != null && !i9Var3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    f9Var2.c.setVisible(true, true);
                    f9Var2.c = null;
                }
                d4 t11 = i9Var3.t();
                if (t11 != null) {
                    t11.f1(false);
                }
                d1 d1Var = i9Var3.w0;
                if (d1Var != null) {
                    d1Var.v((1.0f - i9Var3.R) * i9Var3.Q);
                }
                if (i9Var3.s1) {
                    i9Var3.s1 = false;
                    i9Var3.p();
                    AndroidUtilities.runOnUIThread(new j3(i9Var3, 1), 30L);
                } else if (!SharedConfig.storiesIntroShown) {
                    if (i9Var3.q1 == null && i9Var3.v != null) {
                        w6 w6Var2 = new w6(i9Var3.v.getContext(), i9Var3.s);
                        i9Var3.q1 = w6Var2;
                        w6Var2.setAlpha(0.0f);
                        i9Var3.v.addView(i9Var3.q1);
                    }
                    w6 w6Var3 = i9Var3.q1;
                    if (w6Var3 != null) {
                        w6Var3.setOnClickListener(new ag.o(this, 29));
                        i9Var3.q1.animate().alpha(1.0f).setDuration(150L).setListener(new b9(this, 1)).start();
                    }
                    SharedConfig.setStoriesIntroShown(true);
                }
                i9Var3.P();
                i9Var3.F0.unlock();
                break;
        }
    }
}
