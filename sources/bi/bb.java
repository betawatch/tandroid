package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.ck0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class bb extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb b;

    public /* synthetic */ bb(sb sbVar, int i10) {
        this.a = i10;
        this.b = sbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        q5 t10;
        ck0 ck0Var;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                sb sbVar = this.b;
                pb pbVar = sbVar.s0;
                hb hbVar = sbVar.v;
                if (hbVar != null) {
                    hbVar.a(true);
                }
                sbVar.o();
                sbVar.J0.unlock();
                b9 b9Var = sbVar.u1;
                if (b9Var != null) {
                    b9Var.b();
                    AndroidUtilities.removeFromParent(sbVar.u1);
                    sbVar.u1 = null;
                }
                ImageReceiver imageReceiver = pbVar.b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    pbVar.b = null;
                }
                ImageReceiver imageReceiver2 = pbVar.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    pbVar.c.setVisible(true, true);
                }
                if (pbVar.d != null && (t10 = sbVar.t()) != null && (ck0Var = t10.o1.d) != null) {
                    ck0 ck0Var2 = pbVar.d;
                    ck0Var2.getClass();
                    ck0Var2.c = ck0Var.c;
                    ck0Var2.f = ck0Var.f;
                    ck0Var2.b = ck0Var.b;
                    ck0Var2.a = System.currentTimeMillis();
                    ck0Var2.c();
                }
                p5 p5Var = sbVar.G0;
                if (p5Var != null) {
                    p5Var.b();
                }
                SurfaceView surfaceView = sbVar.C0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                sbVar.I();
                try {
                    AndroidUtilities.runOnUIThread(new la(this, 3));
                } catch (Exception unused) {
                }
                sbVar.m0 = false;
                sbVar.d = false;
                r4 r4Var = sbVar.o1;
                if (r4Var != null) {
                    r4Var.run();
                    sbVar.o1 = null;
                    break;
                }
                break;
            case 1:
                sb sbVar2 = this.b;
                sbVar2.H = null;
                sbVar2.Z = 0.0f;
                sbVar2.d0 = 0.0f;
                ib ibVar = sbVar2.n0;
                q5 currentPeerView = ibVar != null ? ibVar.getCurrentPeerView() : null;
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                sb sbVar3 = this.b;
                pb pbVar2 = sbVar3.s0;
                sbVar3.U = 1.0f;
                sbVar3.o();
                sb.x1 = false;
                hb hbVar2 = sbVar3.v;
                if (hbVar2 != null) {
                    hbVar2.a(true);
                }
                gb gbVar = sbVar3.s;
                if (gbVar != null) {
                    gbVar.invalidate();
                }
                ImageReceiver imageReceiver3 = pbVar2.b;
                if (imageReceiver3 != null && !sbVar3.d) {
                    imageReceiver3.setVisible(true, true);
                    pbVar2.b = null;
                }
                ImageReceiver imageReceiver4 = pbVar2.c;
                if (imageReceiver4 != null && !sbVar3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    pbVar2.c.setVisible(true, true);
                    pbVar2.c = null;
                }
                q5 t11 = sbVar3.t();
                if (t11 != null) {
                    t11.f1(false);
                }
                t1 t1Var = sbVar3.A0;
                if (t1Var != null) {
                    t1Var.v((1.0f - sbVar3.V) * sbVar3.U);
                }
                if (sbVar3.w1) {
                    sbVar3.w1 = false;
                    sbVar3.p();
                    AndroidUtilities.runOnUIThread(new r4(sbVar3, 1), 30L);
                } else if (!SharedConfig.storiesIntroShown) {
                    if (sbVar3.u1 == null && sbVar3.v != null) {
                        b9 b9Var2 = new b9(sbVar3.v.getContext(), sbVar3.s);
                        sbVar3.u1 = b9Var2;
                        b9Var2.setAlpha(0.0f);
                        sbVar3.v.addView(sbVar3.u1);
                    }
                    b9 b9Var3 = sbVar3.u1;
                    if (b9Var3 != null) {
                        b9Var3.setOnClickListener(new ah.g0(this, 6));
                        sbVar3.u1.animate().alpha(1.0f).setDuration(150L).setListener(new lb(this, 1)).start();
                    }
                    SharedConfig.setStoriesIntroShown(true);
                }
                sbVar3.P();
                sbVar3.J0.unlock();
                break;
        }
    }
}
