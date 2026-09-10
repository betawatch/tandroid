package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import j$.util.Objects;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class mv0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mv0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 23:
                ((r0.m0) this.b).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                rv0 rv0Var = (rv0) obj;
                if (rv0Var.C != null) {
                    rv0Var.C = null;
                    rv0Var.b();
                    break;
                }
                break;
            case 1:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.Y;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Y = null;
                    break;
                }
                break;
            case 2:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.d0.removeView(premiumPreviewFragment.r0);
                premiumPreviewFragment.r0 = null;
                super.onAnimationEnd(animator);
                break;
            case 3:
                ((ProfileActivity) ((org.telegram.ui.Components.vv0) obj).c).D5 = null;
                break;
            case 4:
                g11 g11Var = (g11) obj;
                if (!g11Var.E) {
                    g11Var.setVisibility(8);
                    break;
                }
                break;
            case 5:
                c21 c21Var = (c21) obj;
                if (animator.equals(c21Var.c)) {
                    c21Var.c = null;
                    break;
                }
                break;
            case 6:
                j31 j31Var = (j31) obj;
                bi.gd gdVar = j31Var.O;
                if (gdVar != null) {
                    if (gdVar.getParent() != null) {
                        ((ViewGroup) j31Var.O.getParent()).removeView(j31Var.O);
                    }
                    j31Var.O = null;
                }
                j31Var.N = null;
                super.onAnimationEnd(animator);
                break;
            case 7:
                ((c51) obj).d.a0.k0 = 1.0f;
                break;
            case 8:
                SecretMediaViewer secretMediaViewer = ((c51) obj).d;
                secretMediaViewer.a0.setVisibility(4);
                secretMediaViewer.a0.k0 = 1.0f;
                break;
            case 9:
                l71 l71Var = ((b61) obj).e;
                l71Var.S0.G = 0.0f;
                l71Var.S0 = null;
                l71Var.h0.invalidate();
                break;
            case 10:
                yg.f0.a();
                l71 l71Var2 = (l71) obj;
                i61 i61Var = l71Var2.h0;
                i61 i61Var2 = l71Var2.h0;
                i61Var.setLayerType(0, null);
                c61 c61Var = l71Var2.f0;
                c61Var.setLayerType(0, null);
                l71Var2.e0.setLayerType(0, null);
                l71Var2.b0.setLayerType(0, null);
                org.telegram.ui.Components.qn qnVar = l71Var2.n0;
                if (qnVar != null) {
                    qnVar.setLayerType(0, null);
                }
                View view = l71Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                c61Var.b();
                l71Var2.d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                l71Var2.W1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new k01(globalInstance, 13));
                l71Var2.h();
                l71Var2.E(1.0f);
                for (int i11 = 0; i11 < i61Var2.getChildCount(); i11++) {
                    View childAt = i61Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < l71Var2.d0.b.getChildCount(); i12++) {
                    View childAt2 = l71Var2.d0.b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                l71Var2.d0.b.invalidate();
                l71Var2.k0.invalidate();
                i61Var2.invalidate();
                break;
            case 11:
                ((fb1) obj).b0.setVisibility(8);
                break;
            case 12:
                ae1 ae1Var = ((od1) obj).a;
                if (!ae1Var.p1.a()) {
                    ae1Var.R1.setVisibility(8);
                    break;
                }
                break;
            case 13:
                super.onAnimationEnd(animator);
                ((cf1) obj).a = null;
                break;
            case 14:
                super.onAnimationEnd(animator);
                ((gg1) obj).setScrollEnabled(true);
                break;
            case 15:
                lh1 lh1Var = (lh1) obj;
                if (animator.equals(lh1Var.e.K)) {
                    lh1Var.e.K = null;
                    break;
                }
                break;
            case 16:
                di1 di1Var = (di1) obj;
                di1Var.d = null;
                di1Var.a = null;
                di1Var.b = false;
                di1Var.f.c.setAllowDrawCursor(true);
                break;
            case 17:
                ki.i iVar = (ki.i) obj;
                ((tj1) iVar.b).getClass();
                ((tj1) iVar.b).c.setVisibility(4);
                break;
            case 18:
                ((org.telegram.ui.web.c1) obj).s.setVisibility(8);
                break;
            case 19:
                super.onAnimationEnd(animator);
                pg.l0 l0Var = (pg.l0) obj;
                ImageView imageView = l0Var.c;
                l0Var.c = l0Var.d;
                l0Var.d = imageView;
                imageView.bringToFront();
                l0Var.d.setVisibility(8);
                l0Var.h = null;
                break;
            case 20:
                pg.r1 r1Var = (pg.r1) obj;
                if (animator == r1Var.r) {
                    r1Var.f = r1Var.h;
                    r1Var.h = -1;
                    r1Var.r = null;
                    break;
                }
                break;
            case 21:
                qg.s0 s0Var = (qg.s0) obj;
                s0Var.n = s0Var.h ? 1.0f : 0.0f;
                s0Var.e();
                break;
            case 22:
                qg.a2 a2Var = (qg.a2) ((bi.h0) obj).b;
                a2Var.F = true;
                a2Var.invalidate();
                break;
            case 23:
                ((r0.m0) obj).c();
                break;
            case 24:
                super.onAnimationEnd(animator);
                rg.f fVar = (rg.f) ((rg.c) obj).b;
                fVar.b.d = 0.0f;
                fVar.T = null;
                fVar.h(fVar.I);
                break;
            case 25:
                sg.b bVar = (sg.b) obj;
                bVar.b = 1.0f;
                bVar.invalidate();
                break;
            case 26:
                uh.h hVar = (uh.h) obj;
                Iterator it = hVar.h.iterator();
                while (it.hasNext()) {
                    uh.c cVar = (uh.c) it.next();
                    if (hVar.c.size() < hVar.d) {
                        hVar.c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable2 = hVar.q;
                if (runnable2 != null) {
                    runnable2.run();
                    hVar.q = null;
                }
                hVar.r = null;
                hVar.invalidateSelf();
                break;
            case 27:
                ((wh.i0) obj).b.w.setVisibility(8);
                break;
            case 28:
                xh.q2 q2Var = (xh.q2) obj;
                q2Var.E = 1.0f;
                q2Var.F = -1;
                xh.p2 p2Var = q2Var.H;
                if (p2Var != null && (z10 = p2Var.l) && z10) {
                    p2Var.l = false;
                    p2Var.b();
                }
                q2Var.G = null;
                break;
            default:
                u00 u00Var = ((xh.n7) obj).c;
                u00Var.setScaleX(1.0f);
                u00Var.setScaleY(1.0f);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 4:
                ((g11) this.b).setVisibility(0);
                break;
            case 23:
                ((r0.m0) this.b).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public mv0(r0.m0 m0Var, View view) {
        this.a = 23;
        this.b = m0Var;
    }
}
