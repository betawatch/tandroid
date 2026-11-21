package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bz;
import org.telegram.ui.Components.sh0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class o8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f9 b;

    public /* synthetic */ o8(f9 f9Var, int i7) {
        this.a = i7;
        this.b = f9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        z3 z10;
        sh0 sh0Var;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                f9 f9Var = this.b;
                c9 c9Var = f9Var.t0;
                u8 u8Var = f9Var.w;
                if (u8Var != null) {
                    u8Var.a(true);
                }
                f9Var.q();
                f9Var.J0.e();
                t6 t6Var = f9Var.u1;
                if (t6Var != null) {
                    t6Var.b();
                    org.telegram.messenger.g0.E2(f9Var.u1);
                    f9Var.u1 = null;
                }
                ImageReceiver imageReceiver = c9Var.b;
                if (imageReceiver != null) {
                    imageReceiver.O0(true, true);
                    c9Var.b = null;
                }
                ImageReceiver imageReceiver2 = c9Var.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    c9Var.c.O0(true, true);
                }
                if (c9Var.d != null && (z10 = f9Var.z()) != null && (sh0Var = z10.Y0.d) != null) {
                    sh0 sh0Var2 = c9Var.d;
                    sh0Var2.getClass();
                    sh0Var2.c = sh0Var.c;
                    sh0Var2.f = sh0Var.f;
                    sh0Var2.b = sh0Var.b;
                    sh0Var2.a = System.currentTimeMillis();
                    sh0Var2.c();
                }
                y3 y3Var = f9Var.G0;
                if (y3Var != null) {
                    y3Var.b();
                }
                SurfaceView surfaceView = f9Var.D0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                f9Var.O();
                try {
                    org.telegram.messenger.g0.g3(new f2.a(this, 22));
                } catch (Exception unused) {
                }
                f9Var.n0 = false;
                f9Var.d = false;
                e3 e3Var = f9Var.o1;
                if (e3Var != null) {
                    e3Var.run();
                    f9Var.o1 = null;
                    break;
                }
                break;
            case 1:
                f9 f9Var2 = this.b;
                f9Var2.I = null;
                f9Var2.a0 = 0.0f;
                f9Var2.e0 = 0.0f;
                v8 v8Var = f9Var2.o0;
                z3 currentPeerView = v8Var != null ? v8Var.getCurrentPeerView() : null;
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                f9 f9Var3 = this.b;
                c9 c9Var2 = f9Var3.t0;
                f9Var3.V = 1.0f;
                f9Var3.q();
                f9.x1 = false;
                u8 u8Var2 = f9Var3.w;
                if (u8Var2 != null) {
                    u8Var2.a(true);
                }
                t8 t8Var = f9Var3.s;
                if (t8Var != null) {
                    t8Var.invalidate();
                }
                ImageReceiver imageReceiver3 = c9Var2.b;
                if (imageReceiver3 != null && !f9Var3.d) {
                    imageReceiver3.O0(true, true);
                    c9Var2.b = null;
                }
                ImageReceiver imageReceiver4 = c9Var2.c;
                if (imageReceiver4 != null && !f9Var3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    c9Var2.c.O0(true, true);
                    c9Var2.c = null;
                }
                z3 z11 = f9Var3.z();
                if (z11 != null) {
                    z11.d1(false);
                }
                c1 c1Var = f9Var3.B0;
                if (c1Var != null) {
                    c1Var.v((1.0f - f9Var3.W) * f9Var3.V);
                }
                if (f9Var3.w1) {
                    f9Var3.w1 = false;
                    f9Var3.r();
                    org.telegram.messenger.g0.h3(new e3(f9Var3, 1), 30L);
                } else if (!bz.U) {
                    if (f9Var3.u1 == null && f9Var3.w != null) {
                        t6 t6Var2 = new t6(f9Var3.w.getContext(), f9Var3.s);
                        f9Var3.u1 = t6Var2;
                        t6Var2.setAlpha(0.0f);
                        f9Var3.w.addView(f9Var3.u1);
                    }
                    t6 t6Var3 = f9Var3.u1;
                    if (t6Var3 != null) {
                        t6Var3.setOnClickListener(new ah.d(this, 25));
                        f9Var3.u1.animate().alpha(1.0f).setDuration(150L).setListener(new y8(this, 1)).start();
                    }
                    bz.G(true);
                }
                f9Var3.V();
                f9Var3.J0.e();
                break;
        }
    }
}
