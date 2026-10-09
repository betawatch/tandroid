package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.gk0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class tb extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc b;

    public /* synthetic */ tb(kc kcVar, int i10) {
        this.a = i10;
        this.b = kcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        f6 t10;
        gk0 gk0Var;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                kc kcVar = this.b;
                hc hcVar = kcVar.s0;
                zb zbVar = kcVar.v;
                if (zbVar != null) {
                    zbVar.a(true);
                }
                kcVar.o();
                kcVar.J0.unlock();
                q9 q9Var = kcVar.u1;
                if (q9Var != null) {
                    q9Var.b();
                    AndroidUtilities.removeFromParent(kcVar.u1);
                    kcVar.u1 = null;
                }
                ImageReceiver imageReceiver = hcVar.b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    hcVar.b = null;
                }
                ImageReceiver imageReceiver2 = hcVar.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    hcVar.c.setVisible(true, true);
                }
                if (hcVar.d != null && (t10 = kcVar.t()) != null && (gk0Var = t10.o1.d) != null) {
                    gk0 gk0Var2 = hcVar.d;
                    gk0Var2.getClass();
                    gk0Var2.c = gk0Var.c;
                    gk0Var2.f = gk0Var.f;
                    gk0Var2.b = gk0Var.b;
                    gk0Var2.a = System.currentTimeMillis();
                    gk0Var2.c();
                }
                e6 e6Var = kcVar.G0;
                if (e6Var != null) {
                    e6Var.b();
                }
                SurfaceView surfaceView = kcVar.C0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                kcVar.I();
                try {
                    AndroidUtilities.runOnUIThread(new a3.d(this, 22));
                } catch (Exception unused) {
                }
                kcVar.m0 = false;
                kcVar.d = false;
                e5 e5Var = kcVar.o1;
                if (e5Var != null) {
                    e5Var.run();
                    kcVar.o1 = null;
                    break;
                }
                break;
            case 1:
                kc kcVar2 = this.b;
                kcVar2.H = null;
                kcVar2.Z = 0.0f;
                kcVar2.d0 = 0.0f;
                ac acVar = kcVar2.n0;
                f6 currentPeerView = acVar != null ? acVar.getCurrentPeerView() : null;
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                kc kcVar3 = this.b;
                hc hcVar2 = kcVar3.s0;
                kcVar3.U = 1.0f;
                kcVar3.o();
                kc.x1 = false;
                zb zbVar2 = kcVar3.v;
                if (zbVar2 != null) {
                    zbVar2.a(true);
                }
                yb ybVar = kcVar3.s;
                if (ybVar != null) {
                    ybVar.invalidate();
                }
                ImageReceiver imageReceiver3 = hcVar2.b;
                if (imageReceiver3 != null && !kcVar3.d) {
                    imageReceiver3.setVisible(true, true);
                    hcVar2.b = null;
                }
                ImageReceiver imageReceiver4 = hcVar2.c;
                if (imageReceiver4 != null && !kcVar3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    hcVar2.c.setVisible(true, true);
                    hcVar2.c = null;
                }
                f6 t11 = kcVar3.t();
                if (t11 != null) {
                    t11.f1(false);
                }
                d2 d2Var = kcVar3.A0;
                if (d2Var != null) {
                    d2Var.v((1.0f - kcVar3.V) * kcVar3.U);
                }
                if (kcVar3.w1) {
                    kcVar3.w1 = false;
                    kcVar3.p();
                    AndroidUtilities.runOnUIThread(new e5(kcVar3, 1), 30L);
                } else if (!SharedConfig.storiesIntroShown) {
                    if (kcVar3.u1 == null && kcVar3.v != null) {
                        q9 q9Var2 = new q9(kcVar3.v.getContext(), kcVar3.s);
                        kcVar3.u1 = q9Var2;
                        q9Var2.setAlpha(0.0f);
                        kcVar3.v.addView(kcVar3.u1);
                    }
                    q9 q9Var3 = kcVar3.u1;
                    if (q9Var3 != null) {
                        q9Var3.setOnClickListener(new v0(this, 4));
                        kcVar3.u1.animate().alpha(1.0f).setDuration(150L).setListener(new dc(this, 1)).start();
                    }
                    SharedConfig.setStoriesIntroShown(true);
                }
                kcVar3.P();
                kcVar3.J0.unlock();
                break;
        }
    }
}
