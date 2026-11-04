package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.az;
import org.telegram.ui.Components.gh0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r9 b;

    public /* synthetic */ z8(r9 r9Var, int i3) {
        this.a = i3;
        this.b = r9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        j4 H;
        gh0 gh0Var;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                r9 r9Var = this.b;
                o9 o9Var = r9Var.t0;
                f9 f9Var = r9Var.w;
                if (f9Var != null) {
                    f9Var.a(true);
                }
                r9Var.B();
                r9Var.K0.e();
                d7 d7Var = r9Var.v1;
                if (d7Var != null) {
                    d7Var.b();
                    org.telegram.messenger.g0.E2(r9Var.v1);
                    r9Var.v1 = null;
                }
                ImageReceiver imageReceiver = o9Var.b;
                if (imageReceiver != null) {
                    imageReceiver.O0(true, true);
                    o9Var.b = null;
                }
                ImageReceiver imageReceiver2 = o9Var.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    o9Var.c.O0(true, true);
                }
                if (o9Var.d != null && (H = r9Var.H()) != null && (gh0Var = H.Y0.d) != null) {
                    gh0 gh0Var2 = o9Var.d;
                    gh0Var2.getClass();
                    gh0Var2.c = gh0Var.c;
                    gh0Var2.f = gh0Var.f;
                    gh0Var2.b = gh0Var.b;
                    gh0Var2.a = System.currentTimeMillis();
                    gh0Var2.c();
                }
                i4 i4Var = r9Var.H0;
                if (i4Var != null) {
                    i4Var.b();
                }
                SurfaceView surfaceView = r9Var.D0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                r9Var.W();
                try {
                    org.telegram.messenger.g0.h3(new z5(this, 10));
                } catch (Exception unused) {
                }
                r9Var.n0 = false;
                r9Var.d = false;
                o3 o3Var = r9Var.p1;
                if (o3Var != null) {
                    o3Var.run();
                    r9Var.p1 = null;
                    break;
                }
                break;
            case 1:
                r9 r9Var2 = this.b;
                r9Var2.I = null;
                r9Var2.a0 = 0.0f;
                r9Var2.e0 = 0.0f;
                g9 g9Var = r9Var2.o0;
                j4 currentPeerView = g9Var != null ? g9Var.getCurrentPeerView() : null;
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                r9 r9Var3 = this.b;
                o9 o9Var2 = r9Var3.t0;
                r9Var3.V = 1.0f;
                r9Var3.B();
                r9.y1 = false;
                f9 f9Var2 = r9Var3.w;
                if (f9Var2 != null) {
                    f9Var2.a(true);
                }
                e9 e9Var = r9Var3.s;
                if (e9Var != null) {
                    e9Var.invalidate();
                }
                ImageReceiver imageReceiver3 = o9Var2.b;
                if (imageReceiver3 != null && !r9Var3.d) {
                    imageReceiver3.O0(true, true);
                    o9Var2.b = null;
                }
                ImageReceiver imageReceiver4 = o9Var2.c;
                if (imageReceiver4 != null && !r9Var3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    o9Var2.c.O0(true, true);
                    o9Var2.c = null;
                }
                j4 H2 = r9Var3.H();
                if (H2 != null) {
                    H2.d1(false);
                }
                g1 g1Var = r9Var3.B0;
                if (g1Var != null) {
                    g1Var.v((1.0f - r9Var3.W) * r9Var3.V);
                }
                if (r9Var3.x1) {
                    r9Var3.x1 = false;
                    r9Var3.C();
                    org.telegram.messenger.g0.i3(new o3(r9Var3, 1), 30L);
                } else if (!az.U) {
                    if (r9Var3.v1 == null && r9Var3.w != null) {
                        d7 d7Var2 = new d7(r9Var3.w.getContext(), r9Var3.s);
                        r9Var3.v1 = d7Var2;
                        d7Var2.setAlpha(0.0f);
                        r9Var3.w.addView(r9Var3.v1);
                    }
                    d7 d7Var3 = r9Var3.v1;
                    if (d7Var3 != null) {
                        d7Var3.setOnClickListener(new ai.b(this, 21));
                        r9Var3.v1.animate().alpha(1.0f).setDuration(150L).setListener(new k9(this, 1)).start();
                    }
                    az.G(true);
                }
                r9Var3.d0();
                r9Var3.K0.e();
                break;
        }
    }
}
