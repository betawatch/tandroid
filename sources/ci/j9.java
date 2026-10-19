package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.yj0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class j9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ aa b;

    public /* synthetic */ j9(aa aaVar, int i10) {
        this.a = i10;
        this.b = aaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        q4 t10;
        yj0 yj0Var;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                aa aaVar = this.b;
                x9 x9Var = aaVar.s0;
                p9 p9Var = aaVar.v;
                if (p9Var != null) {
                    p9Var.a(true);
                }
                aaVar.o();
                aaVar.J0.unlock();
                m7 m7Var = aaVar.u1;
                if (m7Var != null) {
                    m7Var.b();
                    AndroidUtilities.removeFromParent(aaVar.u1);
                    aaVar.u1 = null;
                }
                ImageReceiver imageReceiver = x9Var.b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    x9Var.b = null;
                }
                ImageReceiver imageReceiver2 = x9Var.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    x9Var.c.setVisible(true, true);
                }
                if (x9Var.d != null && (t10 = aaVar.t()) != null && (yj0Var = t10.o1.d) != null) {
                    yj0 yj0Var2 = x9Var.d;
                    yj0Var2.getClass();
                    yj0Var2.c = yj0Var.c;
                    yj0Var2.f = yj0Var.f;
                    yj0Var2.b = yj0Var.b;
                    yj0Var2.a = System.currentTimeMillis();
                    yj0Var2.c();
                }
                p4 p4Var = aaVar.G0;
                if (p4Var != null) {
                    p4Var.b();
                }
                SurfaceView surfaceView = aaVar.C0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                aaVar.I();
                try {
                    AndroidUtilities.runOnUIThread(new androidx.fragment.app.d(this, 26));
                } catch (Exception unused) {
                }
                aaVar.m0 = false;
                aaVar.d = false;
                t3 t3Var = aaVar.o1;
                if (t3Var != null) {
                    t3Var.run();
                    aaVar.o1 = null;
                    break;
                }
                break;
            case 1:
                aa aaVar2 = this.b;
                aaVar2.H = null;
                aaVar2.Z = 0.0f;
                aaVar2.d0 = 0.0f;
                q9 q9Var = aaVar2.n0;
                q4 currentPeerView = q9Var != null ? q9Var.getCurrentPeerView() : null;
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                aa aaVar3 = this.b;
                x9 x9Var2 = aaVar3.s0;
                aaVar3.U = 1.0f;
                aaVar3.o();
                aa.x1 = false;
                p9 p9Var2 = aaVar3.v;
                if (p9Var2 != null) {
                    p9Var2.a(true);
                }
                o9 o9Var = aaVar3.s;
                if (o9Var != null) {
                    o9Var.invalidate();
                }
                ImageReceiver imageReceiver3 = x9Var2.b;
                if (imageReceiver3 != null && !aaVar3.d) {
                    imageReceiver3.setVisible(true, true);
                    x9Var2.b = null;
                }
                ImageReceiver imageReceiver4 = x9Var2.c;
                if (imageReceiver4 != null && !aaVar3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    x9Var2.c.setVisible(true, true);
                    x9Var2.c = null;
                }
                q4 t11 = aaVar3.t();
                if (t11 != null) {
                    t11.f1(false);
                }
                h1 h1Var = aaVar3.A0;
                if (h1Var != null) {
                    h1Var.v((1.0f - aaVar3.V) * aaVar3.U);
                }
                if (aaVar3.w1) {
                    aaVar3.w1 = false;
                    aaVar3.p();
                    AndroidUtilities.runOnUIThread(new t3(aaVar3, 1), 30L);
                } else if (!SharedConfig.storiesIntroShown) {
                    if (aaVar3.u1 == null && aaVar3.v != null) {
                        m7 m7Var2 = new m7(aaVar3.v.getContext(), aaVar3.s);
                        aaVar3.u1 = m7Var2;
                        m7Var2.setAlpha(0.0f);
                        aaVar3.v.addView(aaVar3.u1);
                    }
                    m7 m7Var3 = aaVar3.u1;
                    if (m7Var3 != null) {
                        m7Var3.setOnClickListener(new ah.g0(this, 16));
                        aaVar3.u1.animate().alpha(1.0f).setDuration(150L).setListener(new t9(this, 1)).start();
                    }
                    SharedConfig.setStoriesIntroShown(true);
                }
                aaVar3.P();
                aaVar3.J0.unlock();
                break;
        }
    }
}
