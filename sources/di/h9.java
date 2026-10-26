package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.bk0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class h9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ y9 b;

    public /* synthetic */ h9(y9 y9Var, int i10) {
        this.a = i10;
        this.b = y9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        q4 t10;
        bk0 bk0Var;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                y9 y9Var = this.b;
                v9 v9Var = y9Var.s0;
                n9 n9Var = y9Var.v;
                if (n9Var != null) {
                    n9Var.a(true);
                }
                y9Var.o();
                y9Var.J0.unlock();
                l7 l7Var = y9Var.u1;
                if (l7Var != null) {
                    l7Var.b();
                    AndroidUtilities.removeFromParent(y9Var.u1);
                    y9Var.u1 = null;
                }
                ImageReceiver imageReceiver = v9Var.b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    v9Var.b = null;
                }
                ImageReceiver imageReceiver2 = v9Var.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    v9Var.c.setVisible(true, true);
                }
                if (v9Var.d != null && (t10 = y9Var.t()) != null && (bk0Var = t10.d1.d) != null) {
                    bk0 bk0Var2 = v9Var.d;
                    bk0Var2.getClass();
                    bk0Var2.c = bk0Var.c;
                    bk0Var2.f = bk0Var.f;
                    bk0Var2.b = bk0Var.b;
                    bk0Var2.a = System.currentTimeMillis();
                    bk0Var2.c();
                }
                p4 p4Var = y9Var.G0;
                if (p4Var != null) {
                    p4Var.b();
                }
                SurfaceView surfaceView = y9Var.C0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                y9Var.I();
                try {
                    AndroidUtilities.runOnUIThread(new s8(this, 3));
                } catch (Exception unused) {
                }
                y9Var.m0 = false;
                y9Var.d = false;
                s3 s3Var = y9Var.o1;
                if (s3Var != null) {
                    s3Var.run();
                    y9Var.o1 = null;
                    break;
                }
                break;
            case 1:
                y9 y9Var2 = this.b;
                y9Var2.H = null;
                y9Var2.Z = 0.0f;
                y9Var2.d0 = 0.0f;
                o9 o9Var = y9Var2.n0;
                q4 currentPeerView = o9Var != null ? o9Var.getCurrentPeerView() : null;
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                y9 y9Var3 = this.b;
                v9 v9Var2 = y9Var3.s0;
                y9Var3.U = 1.0f;
                y9Var3.o();
                y9.x1 = false;
                n9 n9Var2 = y9Var3.v;
                if (n9Var2 != null) {
                    n9Var2.a(true);
                }
                m9 m9Var = y9Var3.s;
                if (m9Var != null) {
                    m9Var.invalidate();
                }
                ImageReceiver imageReceiver3 = v9Var2.b;
                if (imageReceiver3 != null && !y9Var3.d) {
                    imageReceiver3.setVisible(true, true);
                    v9Var2.b = null;
                }
                ImageReceiver imageReceiver4 = v9Var2.c;
                if (imageReceiver4 != null && !y9Var3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    v9Var2.c.setVisible(true, true);
                    v9Var2.c = null;
                }
                q4 t11 = y9Var3.t();
                if (t11 != null) {
                    t11.d1(false);
                }
                h1 h1Var = y9Var3.A0;
                if (h1Var != null) {
                    h1Var.v((1.0f - y9Var3.V) * y9Var3.U);
                }
                if (y9Var3.w1) {
                    y9Var3.w1 = false;
                    y9Var3.p();
                    AndroidUtilities.runOnUIThread(new s3(y9Var3, 1), 30L);
                } else if (!SharedConfig.storiesIntroShown) {
                    if (y9Var3.u1 == null && y9Var3.v != null) {
                        l7 l7Var2 = new l7(y9Var3.v.getContext(), y9Var3.s);
                        y9Var3.u1 = l7Var2;
                        l7Var2.setAlpha(0.0f);
                        y9Var3.v.addView(y9Var3.u1);
                    }
                    l7 l7Var3 = y9Var3.u1;
                    if (l7Var3 != null) {
                        l7Var3.setOnClickListener(new ai.s(this, 17));
                        y9Var3.u1.animate().alpha(1.0f).setDuration(150L).setListener(new r9(this, 1)).start();
                    }
                    SharedConfig.setStoriesIntroShown(true);
                }
                y9Var3.P();
                y9Var3.J0.unlock();
                break;
        }
    }
}
