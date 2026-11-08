package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.iz;
import org.telegram.ui.Components.dh0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class y8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ p9 b;

    public /* synthetic */ y8(p9 p9Var, int i7) {
        this.a = i7;
        this.b = p9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        i4 z9;
        dh0 dh0Var;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                p9 p9Var = this.b;
                m9 m9Var = p9Var.s0;
                e9 e9Var = p9Var.w;
                if (e9Var != null) {
                    e9Var.a(true);
                }
                p9Var.q();
                p9Var.I0.e();
                c7 c7Var = p9Var.t1;
                if (c7Var != null) {
                    c7Var.b();
                    org.telegram.messenger.g0.E2(p9Var.t1);
                    p9Var.t1 = null;
                }
                ImageReceiver imageReceiver = m9Var.b;
                if (imageReceiver != null) {
                    imageReceiver.O0(true, true);
                    m9Var.b = null;
                }
                ImageReceiver imageReceiver2 = m9Var.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    m9Var.c.O0(true, true);
                }
                if (m9Var.d != null && (z9 = p9Var.z()) != null && (dh0Var = z9.X0.d) != null) {
                    dh0 dh0Var2 = m9Var.d;
                    dh0Var2.getClass();
                    dh0Var2.c = dh0Var.c;
                    dh0Var2.f = dh0Var.f;
                    dh0Var2.b = dh0Var.b;
                    dh0Var2.a = System.currentTimeMillis();
                    dh0Var2.c();
                }
                h4 h4Var = p9Var.F0;
                if (h4Var != null) {
                    h4Var.b();
                }
                SurfaceView surfaceView = p9Var.C0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                p9Var.O();
                try {
                    org.telegram.messenger.g0.h3(new s7(this, 5));
                } catch (Exception unused) {
                }
                p9Var.m0 = false;
                p9Var.d = false;
                l3 l3Var = p9Var.n1;
                if (l3Var != null) {
                    l3Var.run();
                    p9Var.n1 = null;
                    break;
                }
                break;
            case 1:
                p9 p9Var2 = this.b;
                p9Var2.H = null;
                p9Var2.Z = 0.0f;
                p9Var2.d0 = 0.0f;
                f9 f9Var = p9Var2.n0;
                i4 currentPeerView = f9Var != null ? f9Var.getCurrentPeerView() : null;
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                p9 p9Var3 = this.b;
                m9 m9Var2 = p9Var3.s0;
                p9Var3.U = 1.0f;
                p9Var3.q();
                p9.w1 = false;
                e9 e9Var2 = p9Var3.w;
                if (e9Var2 != null) {
                    e9Var2.a(true);
                }
                d9 d9Var = p9Var3.s;
                if (d9Var != null) {
                    d9Var.invalidate();
                }
                ImageReceiver imageReceiver3 = m9Var2.b;
                if (imageReceiver3 != null && !p9Var3.d) {
                    imageReceiver3.O0(true, true);
                    m9Var2.b = null;
                }
                ImageReceiver imageReceiver4 = m9Var2.c;
                if (imageReceiver4 != null && !p9Var3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    m9Var2.c.O0(true, true);
                    m9Var2.c = null;
                }
                i4 z10 = p9Var3.z();
                if (z10 != null) {
                    z10.d1(false);
                }
                g1 g1Var = p9Var3.A0;
                if (g1Var != null) {
                    g1Var.v((1.0f - p9Var3.V) * p9Var3.U);
                }
                if (p9Var3.v1) {
                    p9Var3.v1 = false;
                    p9Var3.r();
                    org.telegram.messenger.g0.i3(new l3(p9Var3, 1), 30L);
                } else if (!iz.U) {
                    if (p9Var3.t1 == null && p9Var3.w != null) {
                        c7 c7Var2 = new c7(p9Var3.w.getContext(), p9Var3.s);
                        p9Var3.t1 = c7Var2;
                        c7Var2.setAlpha(0.0f);
                        p9Var3.w.addView(p9Var3.t1);
                    }
                    c7 c7Var3 = p9Var3.t1;
                    if (c7Var3 != null) {
                        c7Var3.setOnClickListener(new ah.d(this, 18));
                        p9Var3.t1.animate().alpha(1.0f).setDuration(150L).setListener(new i9(this, 1)).start();
                    }
                    iz.G(true);
                }
                p9Var3.V();
                p9Var3.I0.e();
                break;
        }
    }
}
