package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.mj0;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class sb extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ jc b;

    public /* synthetic */ sb(jc jcVar, int i10) {
        this.a = i10;
        this.b = jcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        f6 t10;
        mj0 mj0Var;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                jc jcVar = this.b;
                gc gcVar = jcVar.s0;
                yb ybVar = jcVar.v;
                if (ybVar != null) {
                    ybVar.a(true);
                }
                jcVar.o();
                jcVar.J0.unlock();
                p9 p9Var = jcVar.u1;
                if (p9Var != null) {
                    p9Var.b();
                    AndroidUtilities.removeFromParent(jcVar.u1);
                    jcVar.u1 = null;
                }
                ImageReceiver imageReceiver = gcVar.b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    gcVar.b = null;
                }
                ImageReceiver imageReceiver2 = gcVar.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    gcVar.c.setVisible(true, true);
                }
                if (gcVar.d != null && (t10 = jcVar.t()) != null && (mj0Var = t10.o1.d) != null) {
                    mj0 mj0Var2 = gcVar.d;
                    mj0Var2.getClass();
                    mj0Var2.c = mj0Var.c;
                    mj0Var2.f = mj0Var.f;
                    mj0Var2.b = mj0Var.b;
                    mj0Var2.a = System.currentTimeMillis();
                    mj0Var2.c();
                }
                e6 e6Var = jcVar.G0;
                if (e6Var != null) {
                    e6Var.b();
                }
                SurfaceView surfaceView = jcVar.C0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                jcVar.I();
                try {
                    AndroidUtilities.runOnUIThread(new a3.d(this, 22));
                } catch (Exception unused) {
                }
                jcVar.m0 = false;
                jcVar.d = false;
                e5 e5Var = jcVar.o1;
                if (e5Var != null) {
                    e5Var.run();
                    jcVar.o1 = null;
                    break;
                }
                break;
            case 1:
                jc jcVar2 = this.b;
                jcVar2.H = null;
                jcVar2.Z = 0.0f;
                jcVar2.d0 = 0.0f;
                zb zbVar = jcVar2.n0;
                f6 currentPeerView = zbVar != null ? zbVar.getCurrentPeerView() : null;
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                jc jcVar3 = this.b;
                gc gcVar2 = jcVar3.s0;
                jcVar3.U = 1.0f;
                jcVar3.o();
                jc.x1 = false;
                yb ybVar2 = jcVar3.v;
                if (ybVar2 != null) {
                    ybVar2.a(true);
                }
                xb xbVar = jcVar3.s;
                if (xbVar != null) {
                    xbVar.invalidate();
                }
                ImageReceiver imageReceiver3 = gcVar2.b;
                if (imageReceiver3 != null && !jcVar3.d) {
                    imageReceiver3.setVisible(true, true);
                    gcVar2.b = null;
                }
                ImageReceiver imageReceiver4 = gcVar2.c;
                if (imageReceiver4 != null && !jcVar3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    gcVar2.c.setVisible(true, true);
                    gcVar2.c = null;
                }
                f6 t11 = jcVar3.t();
                if (t11 != null) {
                    t11.f1(false);
                }
                d2 d2Var = jcVar3.A0;
                if (d2Var != null) {
                    d2Var.v((1.0f - jcVar3.V) * jcVar3.U);
                }
                if (jcVar3.w1) {
                    jcVar3.w1 = false;
                    jcVar3.p();
                    AndroidUtilities.runOnUIThread(new e5(jcVar3, 1), 30L);
                } else if (!SharedConfig.storiesIntroShown) {
                    if (jcVar3.u1 == null && jcVar3.v != null) {
                        p9 p9Var2 = new p9(jcVar3.v.getContext(), jcVar3.s);
                        jcVar3.u1 = p9Var2;
                        p9Var2.setAlpha(0.0f);
                        jcVar3.v.addView(jcVar3.u1);
                    }
                    p9 p9Var3 = jcVar3.u1;
                    if (p9Var3 != null) {
                        p9Var3.setOnClickListener(new v0(this, 4));
                        jcVar3.u1.animate().alpha(1.0f).setDuration(150L).setListener(new cc(this, 1)).start();
                    }
                    SharedConfig.setStoriesIntroShown(true);
                }
                jcVar3.P();
                jcVar3.J0.unlock();
                break;
        }
    }
}
