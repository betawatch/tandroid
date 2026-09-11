package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.bj0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class ya extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ pb b;

    public /* synthetic */ ya(pb pbVar, int i10) {
        this.a = i10;
        this.b = pbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        o5 t10;
        bj0 bj0Var;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                pb pbVar = this.b;
                mb mbVar = pbVar.s0;
                eb ebVar = pbVar.v;
                if (ebVar != null) {
                    ebVar.a(true);
                }
                pbVar.o();
                pbVar.J0.unlock();
                y8 y8Var = pbVar.u1;
                if (y8Var != null) {
                    y8Var.b();
                    AndroidUtilities.removeFromParent(pbVar.u1);
                    pbVar.u1 = null;
                }
                ImageReceiver imageReceiver = mbVar.b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    mbVar.b = null;
                }
                ImageReceiver imageReceiver2 = mbVar.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    mbVar.c.setVisible(true, true);
                }
                if (mbVar.d != null && (t10 = pbVar.t()) != null && (bj0Var = t10.o1.d) != null) {
                    bj0 bj0Var2 = mbVar.d;
                    bj0Var2.getClass();
                    bj0Var2.c = bj0Var.c;
                    bj0Var2.f = bj0Var.f;
                    bj0Var2.b = bj0Var.b;
                    bj0Var2.a = System.currentTimeMillis();
                    bj0Var2.c();
                }
                n5 n5Var = pbVar.G0;
                if (n5Var != null) {
                    n5Var.b();
                }
                SurfaceView surfaceView = pbVar.C0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                pbVar.I();
                try {
                    AndroidUtilities.runOnUIThread(new oa(this, 2));
                } catch (Exception unused) {
                }
                pbVar.m0 = false;
                pbVar.d = false;
                p4 p4Var = pbVar.o1;
                if (p4Var != null) {
                    p4Var.run();
                    pbVar.o1 = null;
                    break;
                }
                break;
            case 1:
                pb pbVar2 = this.b;
                pbVar2.H = null;
                pbVar2.Z = 0.0f;
                pbVar2.d0 = 0.0f;
                fb fbVar = pbVar2.n0;
                o5 currentPeerView = fbVar != null ? fbVar.getCurrentPeerView() : null;
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                pb pbVar3 = this.b;
                mb mbVar2 = pbVar3.s0;
                pbVar3.U = 1.0f;
                pbVar3.o();
                pb.x1 = false;
                eb ebVar2 = pbVar3.v;
                if (ebVar2 != null) {
                    ebVar2.a(true);
                }
                db dbVar = pbVar3.s;
                if (dbVar != null) {
                    dbVar.invalidate();
                }
                ImageReceiver imageReceiver3 = mbVar2.b;
                if (imageReceiver3 != null && !pbVar3.d) {
                    imageReceiver3.setVisible(true, true);
                    mbVar2.b = null;
                }
                ImageReceiver imageReceiver4 = mbVar2.c;
                if (imageReceiver4 != null && !pbVar3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    mbVar2.c.setVisible(true, true);
                    mbVar2.c = null;
                }
                o5 t11 = pbVar3.t();
                if (t11 != null) {
                    t11.f1(false);
                }
                t1 t1Var = pbVar3.A0;
                if (t1Var != null) {
                    t1Var.v((1.0f - pbVar3.V) * pbVar3.U);
                }
                if (pbVar3.w1) {
                    pbVar3.w1 = false;
                    pbVar3.p();
                    AndroidUtilities.runOnUIThread(new p4(pbVar3, 1), 30L);
                } else if (!SharedConfig.storiesIntroShown) {
                    if (pbVar3.u1 == null && pbVar3.v != null) {
                        y8 y8Var2 = new y8(pbVar3.v.getContext(), pbVar3.s);
                        pbVar3.u1 = y8Var2;
                        y8Var2.setAlpha(0.0f);
                        pbVar3.v.addView(pbVar3.u1);
                    }
                    y8 y8Var3 = pbVar3.u1;
                    if (y8Var3 != null) {
                        y8Var3.setOnClickListener(new ah.h0(this, 6));
                        pbVar3.u1.animate().alpha(1.0f).setDuration(150L).setListener(new ib(this, 1)).start();
                    }
                    SharedConfig.setStoriesIntroShown(true);
                }
                pbVar3.P();
                pbVar3.J0.unlock();
                break;
        }
    }
}
