package ih;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.qi0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class v8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ m9 b;

    public /* synthetic */ v8(m9 m9Var, int i9) {
        this.a = i9;
        this.b = m9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        i4 t10;
        qi0 qi0Var;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                m9 m9Var = this.b;
                j9 j9Var = m9Var.o0;
                b9 b9Var = m9Var.v;
                if (b9Var != null) {
                    b9Var.a(true);
                }
                m9Var.o();
                m9Var.F0.unlock();
                z6 z6Var = m9Var.q1;
                if (z6Var != null) {
                    z6Var.b();
                    AndroidUtilities.removeFromParent(m9Var.q1);
                    m9Var.q1 = null;
                }
                ImageReceiver imageReceiver = j9Var.b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    j9Var.b = null;
                }
                ImageReceiver imageReceiver2 = j9Var.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    j9Var.c.setVisible(true, true);
                }
                if (j9Var.d != null && (t10 = m9Var.t()) != null && (qi0Var = t10.k1.d) != null) {
                    qi0 qi0Var2 = j9Var.d;
                    qi0Var2.getClass();
                    qi0Var2.c = qi0Var.c;
                    qi0Var2.f = qi0Var.f;
                    qi0Var2.b = qi0Var.b;
                    qi0Var2.a = System.currentTimeMillis();
                    qi0Var2.c();
                }
                h4 h4Var = m9Var.C0;
                if (h4Var != null) {
                    h4Var.a();
                }
                SurfaceView surfaceView = m9Var.y0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                m9Var.I();
                try {
                    AndroidUtilities.runOnUIThread(new g(this, 20));
                } catch (Exception unused) {
                }
                m9Var.i0 = false;
                m9Var.d = false;
                n3 n3Var = m9Var.k1;
                if (n3Var != null) {
                    n3Var.run();
                    m9Var.k1 = null;
                    break;
                }
                break;
            case 1:
                m9 m9Var2 = this.b;
                m9Var2.D = null;
                m9Var2.V = 0.0f;
                m9Var2.Z = 0.0f;
                c9 c9Var = m9Var2.j0;
                i4 currentPeerView = c9Var != null ? c9Var.getCurrentPeerView() : null;
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                m9 m9Var3 = this.b;
                j9 j9Var2 = m9Var3.o0;
                m9Var3.Q = 1.0f;
                m9Var3.o();
                m9.t1 = false;
                b9 b9Var2 = m9Var3.v;
                if (b9Var2 != null) {
                    b9Var2.a(true);
                }
                a9 a9Var = m9Var3.s;
                if (a9Var != null) {
                    a9Var.invalidate();
                }
                ImageReceiver imageReceiver3 = j9Var2.b;
                if (imageReceiver3 != null && !m9Var3.d) {
                    imageReceiver3.setVisible(true, true);
                    j9Var2.b = null;
                }
                ImageReceiver imageReceiver4 = j9Var2.c;
                if (imageReceiver4 != null && !m9Var3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    j9Var2.c.setVisible(true, true);
                    j9Var2.c = null;
                }
                i4 t11 = m9Var3.t();
                if (t11 != null) {
                    t11.f1(false);
                }
                f1 f1Var = m9Var3.w0;
                if (f1Var != null) {
                    f1Var.v((1.0f - m9Var3.R) * m9Var3.Q);
                }
                if (m9Var3.s1) {
                    m9Var3.s1 = false;
                    m9Var3.p();
                    AndroidUtilities.runOnUIThread(new n3(m9Var3, 1), 30L);
                } else if (!SharedConfig.storiesIntroShown) {
                    if (m9Var3.q1 == null && m9Var3.v != null) {
                        z6 z6Var2 = new z6(m9Var3.v.getContext(), m9Var3.s);
                        m9Var3.q1 = z6Var2;
                        z6Var2.setAlpha(0.0f);
                        m9Var3.v.addView(m9Var3.q1);
                    }
                    z6 z6Var3 = m9Var3.q1;
                    if (z6Var3 != null) {
                        z6Var3.setOnClickListener(new androidx.mediarouter.app.c(this, 23));
                        m9Var3.q1.animate().alpha(1.0f).setDuration(150L).setListener(new f9(this, 1)).start();
                    }
                    SharedConfig.setStoriesIntroShown(true);
                }
                m9Var3.P();
                m9Var3.F0.unlock();
                break;
        }
    }
}
