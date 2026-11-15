package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gz;
import org.telegram.ui.Components.gh0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class r8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i9 b;

    public /* synthetic */ r8(i9 i9Var, int i7) {
        this.a = i7;
        this.b = i9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        b4 z10;
        gh0 gh0Var;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                i9 i9Var = this.b;
                f9 f9Var = i9Var.t0;
                x8 x8Var = i9Var.w;
                if (x8Var != null) {
                    x8Var.a(true);
                }
                i9Var.q();
                i9Var.J0.e();
                w6 w6Var = i9Var.u1;
                if (w6Var != null) {
                    w6Var.b();
                    org.telegram.messenger.g0.E2(i9Var.u1);
                    i9Var.u1 = null;
                }
                ImageReceiver imageReceiver = f9Var.b;
                if (imageReceiver != null) {
                    imageReceiver.O0(true, true);
                    f9Var.b = null;
                }
                ImageReceiver imageReceiver2 = f9Var.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    f9Var.c.O0(true, true);
                }
                if (f9Var.d != null && (z10 = i9Var.z()) != null && (gh0Var = z10.Y0.d) != null) {
                    gh0 gh0Var2 = f9Var.d;
                    gh0Var2.getClass();
                    gh0Var2.c = gh0Var.c;
                    gh0Var2.f = gh0Var.f;
                    gh0Var2.b = gh0Var.b;
                    gh0Var2.a = System.currentTimeMillis();
                    gh0Var2.c();
                }
                a4 a4Var = i9Var.G0;
                if (a4Var != null) {
                    a4Var.b();
                }
                SurfaceView surfaceView = i9Var.D0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                i9Var.O();
                try {
                    org.telegram.messenger.g0.h3(new c1(this, 18));
                } catch (Exception unused) {
                }
                i9Var.n0 = false;
                i9Var.d = false;
                g3 g3Var = i9Var.o1;
                if (g3Var != null) {
                    g3Var.run();
                    i9Var.o1 = null;
                    break;
                }
                break;
            case 1:
                i9 i9Var2 = this.b;
                i9Var2.I = null;
                i9Var2.a0 = 0.0f;
                i9Var2.e0 = 0.0f;
                y8 y8Var = i9Var2.o0;
                b4 currentPeerView = y8Var != null ? y8Var.getCurrentPeerView() : null;
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                i9 i9Var3 = this.b;
                f9 f9Var2 = i9Var3.t0;
                i9Var3.V = 1.0f;
                i9Var3.q();
                i9.x1 = false;
                x8 x8Var2 = i9Var3.w;
                if (x8Var2 != null) {
                    x8Var2.a(true);
                }
                w8 w8Var = i9Var3.s;
                if (w8Var != null) {
                    w8Var.invalidate();
                }
                ImageReceiver imageReceiver3 = f9Var2.b;
                if (imageReceiver3 != null && !i9Var3.d) {
                    imageReceiver3.O0(true, true);
                    f9Var2.b = null;
                }
                ImageReceiver imageReceiver4 = f9Var2.c;
                if (imageReceiver4 != null && !i9Var3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    f9Var2.c.O0(true, true);
                    f9Var2.c = null;
                }
                b4 z11 = i9Var3.z();
                if (z11 != null) {
                    z11.d1(false);
                }
                e1 e1Var = i9Var3.B0;
                if (e1Var != null) {
                    e1Var.v((1.0f - i9Var3.W) * i9Var3.V);
                }
                if (i9Var3.w1) {
                    i9Var3.w1 = false;
                    i9Var3.r();
                    org.telegram.messenger.g0.i3(new g3(i9Var3, 1), 30L);
                } else if (!gz.U) {
                    if (i9Var3.u1 == null && i9Var3.w != null) {
                        w6 w6Var2 = new w6(i9Var3.w.getContext(), i9Var3.s);
                        i9Var3.u1 = w6Var2;
                        w6Var2.setAlpha(0.0f);
                        i9Var3.w.addView(i9Var3.u1);
                    }
                    w6 w6Var3 = i9Var3.u1;
                    if (w6Var3 != null) {
                        w6Var3.setOnClickListener(new ah.d(this, 24));
                        i9Var3.u1.animate().alpha(1.0f).setDuration(150L).setListener(new b9(this, 1)).start();
                    }
                    gz.G(true);
                }
                i9Var3.V();
                i9Var3.J0.e();
                break;
        }
    }
}
