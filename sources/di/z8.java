package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.iz;
import org.telegram.ui.Components.dh0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class z8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q9 b;

    public /* synthetic */ z8(q9 q9Var, int i7) {
        this.a = i7;
        this.b = q9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        j4 z9;
        dh0 dh0Var;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                q9 q9Var = this.b;
                n9 n9Var = q9Var.s0;
                f9 f9Var = q9Var.w;
                if (f9Var != null) {
                    f9Var.a(true);
                }
                q9Var.q();
                q9Var.I0.e();
                d7 d7Var = q9Var.t1;
                if (d7Var != null) {
                    d7Var.b();
                    org.telegram.messenger.g0.E2(q9Var.t1);
                    q9Var.t1 = null;
                }
                ImageReceiver imageReceiver = n9Var.b;
                if (imageReceiver != null) {
                    imageReceiver.O0(true, true);
                    n9Var.b = null;
                }
                ImageReceiver imageReceiver2 = n9Var.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    n9Var.c.O0(true, true);
                }
                if (n9Var.d != null && (z9 = q9Var.z()) != null && (dh0Var = z9.X0.d) != null) {
                    dh0 dh0Var2 = n9Var.d;
                    dh0Var2.getClass();
                    dh0Var2.c = dh0Var.c;
                    dh0Var2.f = dh0Var.f;
                    dh0Var2.b = dh0Var.b;
                    dh0Var2.a = System.currentTimeMillis();
                    dh0Var2.c();
                }
                i4 i4Var = q9Var.F0;
                if (i4Var != null) {
                    i4Var.b();
                }
                SurfaceView surfaceView = q9Var.C0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                q9Var.O();
                try {
                    org.telegram.messenger.g0.h3(new f8(this, 4));
                } catch (Exception unused) {
                }
                q9Var.m0 = false;
                q9Var.d = false;
                l3 l3Var = q9Var.n1;
                if (l3Var != null) {
                    l3Var.run();
                    q9Var.n1 = null;
                    break;
                }
                break;
            case 1:
                q9 q9Var2 = this.b;
                q9Var2.H = null;
                q9Var2.Z = 0.0f;
                q9Var2.d0 = 0.0f;
                g9 g9Var = q9Var2.n0;
                j4 currentPeerView = g9Var != null ? g9Var.getCurrentPeerView() : null;
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                q9 q9Var3 = this.b;
                n9 n9Var2 = q9Var3.s0;
                q9Var3.U = 1.0f;
                q9Var3.q();
                q9.w1 = false;
                f9 f9Var2 = q9Var3.w;
                if (f9Var2 != null) {
                    f9Var2.a(true);
                }
                e9 e9Var = q9Var3.s;
                if (e9Var != null) {
                    e9Var.invalidate();
                }
                ImageReceiver imageReceiver3 = n9Var2.b;
                if (imageReceiver3 != null && !q9Var3.d) {
                    imageReceiver3.O0(true, true);
                    n9Var2.b = null;
                }
                ImageReceiver imageReceiver4 = n9Var2.c;
                if (imageReceiver4 != null && !q9Var3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    n9Var2.c.O0(true, true);
                    n9Var2.c = null;
                }
                j4 z10 = q9Var3.z();
                if (z10 != null) {
                    z10.d1(false);
                }
                g1 g1Var = q9Var3.A0;
                if (g1Var != null) {
                    g1Var.v((1.0f - q9Var3.V) * q9Var3.U);
                }
                if (q9Var3.v1) {
                    q9Var3.v1 = false;
                    q9Var3.r();
                    org.telegram.messenger.g0.i3(new l3(q9Var3, 1), 30L);
                } else if (!iz.U) {
                    if (q9Var3.t1 == null && q9Var3.w != null) {
                        d7 d7Var2 = new d7(q9Var3.w.getContext(), q9Var3.s);
                        q9Var3.t1 = d7Var2;
                        d7Var2.setAlpha(0.0f);
                        q9Var3.w.addView(q9Var3.t1);
                    }
                    d7 d7Var3 = q9Var3.t1;
                    if (d7Var3 != null) {
                        d7Var3.setOnClickListener(new ah.d(this, 18));
                        q9Var3.t1.animate().alpha(1.0f).setDuration(150L).setListener(new j9(this, 1)).start();
                    }
                    iz.G(true);
                }
                q9Var3.V();
                q9Var3.I0.e();
                break;
        }
    }
}
