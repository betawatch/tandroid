package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ns0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ns0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                qs0 qs0Var = (qs0) obj;
                if (qs0Var.C != null) {
                    qs0Var.C = null;
                    qs0Var.b();
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
                ((nw0) obj).b.O5 = null;
                break;
            case 3:
                yx0 yx0Var = (yx0) obj;
                if (!yx0Var.E) {
                    yx0Var.setVisibility(8);
                    break;
                }
                break;
            case 4:
                uy0 uy0Var = (uy0) obj;
                if (animator.equals(uy0Var.d)) {
                    uy0Var.d = null;
                    break;
                }
                break;
            case 5:
                ((v01) obj).d.Y.k0 = 1.0f;
                break;
            case 6:
                SecretMediaViewer secretMediaViewer = ((v01) obj).d;
                secretMediaViewer.Y.setVisibility(4);
                secretMediaViewer.Y.k0 = 1.0f;
                break;
            case 7:
                i31 i31Var = ((z11) obj).e;
                i31Var.S0.G = 0.0f;
                i31Var.S0 = null;
                i31Var.h0.invalidate();
                break;
            case 8:
                sg.e0.a();
                i31 i31Var2 = (i31) obj;
                g21 g21Var = i31Var2.h0;
                g21 g21Var2 = i31Var2.h0;
                g21Var.setLayerType(0, null);
                a21 a21Var = i31Var2.f0;
                a21Var.setLayerType(0, null);
                i31Var2.e0.setLayerType(0, null);
                i31Var2.b0.setLayerType(0, null);
                org.telegram.ui.Components.bn bnVar = i31Var2.n0;
                if (bnVar != null) {
                    bnVar.setLayerType(0, null);
                }
                View view = i31Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                a21Var.b();
                i31Var2.d0.m(false);
                org.telegram.messenger.zs.e().k(99, 512);
                i31Var2.X1.e();
                org.telegram.messenger.i0.g3(new wv0(org.telegram.messenger.zs.e(), 17));
                i31Var2.h();
                i31Var2.E(1.0f);
                for (int i11 = 0; i11 < g21Var2.getChildCount(); i11++) {
                    View childAt = g21Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < i31Var2.d0.b.getChildCount(); i12++) {
                    View childAt2 = i31Var2.d0.b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                i31Var2.d0.b.invalidate();
                i31Var2.k0.invalidate();
                g21Var2.invalidate();
                break;
            case 9:
                ((u61) obj).a0.setVisibility(8);
                break;
            case 10:
                m91 m91Var = ((b91) obj).a;
                if (!m91Var.q1.a()) {
                    m91Var.S1.setVisibility(8);
                    break;
                }
                break;
            case 11:
                super.onAnimationEnd(animator);
                ((ja1) obj).d = null;
                break;
            case 12:
                super.onAnimationEnd(animator);
                ((nb1) obj).setScrollEnabled(true);
                break;
            case 13:
                sc1 sc1Var = (sc1) obj;
                if (animator.equals(sc1Var.d.K)) {
                    sc1Var.d.K = null;
                    break;
                }
                break;
            case 14:
                gd1 gd1Var = (gd1) obj;
                gd1Var.d = null;
                gd1Var.a = null;
                gd1Var.b = false;
                gd1Var.f.c.setAllowDrawCursor(true);
                break;
            case 15:
                ((org.telegram.ui.Wallet.w3) obj).K = null;
                break;
            case 16:
                ((org.telegram.ui.Wallet.d4) obj).f();
                break;
            case 17:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) obj;
                if (b6Var.J0 == animator) {
                    b6Var.J0 = null;
                    break;
                }
                break;
            case 18:
                org.telegram.ui.Wallet.z5 z5Var = (org.telegram.ui.Wallet.z5) obj;
                z5Var.h = false;
                z5Var.n = null;
                z5Var.b.setLayerType(0, null);
                break;
            case 19:
                org.telegram.ui.Wallet.g6 g6Var = (org.telegram.ui.Wallet.g6) obj;
                g6Var.N = 0.0f;
                g6Var.O = 0.0f;
                g6Var.b0 = null;
                break;
            case 20:
                org.telegram.ui.Wallet.a7 a7Var = (org.telegram.ui.Wallet.a7) obj;
                a7Var.I = null;
                a7Var.i0 = 1.0f;
                a7Var.h0 = 0.0f;
                a7Var.g0 = 0.0f;
                a7Var.e();
                break;
            case 21:
                org.telegram.ui.Wallet.y8 y8Var = (org.telegram.ui.Wallet.y8) obj;
                EditTextBoldCursor editTextBoldCursor = y8Var.b;
                if (y8Var.s == animator) {
                    y8Var.s = null;
                    y8Var.a.setVisibility(y8Var.y ? 4 : 0);
                    editTextBoldCursor.setVisibility(y8Var.y ? 0 : 4);
                    if (y8Var.y && !y8Var.D) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.i0.J3(editTextBoldCursor);
                        break;
                    }
                }
                break;
            case 22:
                org.telegram.ui.Wallet.q9 q9Var = (org.telegram.ui.Wallet.q9) obj;
                q9Var.n = null;
                q9Var.d.setVisibility(q9Var.x ? 4 : 0);
                q9Var.f.setVisibility(q9Var.y ? 0 : 4);
                break;
            case 23:
                ji.i iVar = (ji.i) obj;
                ((we1) iVar.b).getClass();
                ((we1) iVar.b).c.setVisibility(4);
                break;
            case 24:
                ((org.telegram.ui.web.z0) obj).s.setVisibility(8);
                break;
            case 25:
                ((ph.i0) obj).b.s1.setVisibility(8);
                break;
            case 26:
                rh.u2 u2Var = (rh.u2) obj;
                u2Var.E = 1.0f;
                u2Var.F = -1;
                rh.t2 t2Var = u2Var.H;
                if (t2Var != null && (z10 = t2Var.l) && z10) {
                    t2Var.l = false;
                    t2Var.b();
                }
                u2Var.G = null;
                break;
            case 27:
                xz xzVar = ((rh.w7) obj).c;
                xzVar.setScaleX(1.0f);
                xzVar.setScaleY(1.0f);
                break;
            case 28:
                ((rh.o) obj).run();
                break;
            default:
                ((sg.o) obj).w.setVisibility(4);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 3:
                ((yx0) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
