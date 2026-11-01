package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ms0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ms0(Object obj, int i10) {
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
                ps0 ps0Var = (ps0) obj;
                if (ps0Var.C != null) {
                    ps0Var.C = null;
                    ps0Var.b();
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
                ((mw0) obj).b.P5 = null;
                break;
            case 3:
                xx0 xx0Var = (xx0) obj;
                if (!xx0Var.E) {
                    xx0Var.setVisibility(8);
                    break;
                }
                break;
            case 4:
                ty0 ty0Var = (ty0) obj;
                if (animator.equals(ty0Var.d)) {
                    ty0Var.d = null;
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
                g31 g31Var = ((x11) obj).e;
                g31Var.S0.G = 0.0f;
                g31Var.S0 = null;
                g31Var.h0.invalidate();
                break;
            case 8:
                sg.e0.a();
                g31 g31Var2 = (g31) obj;
                e21 e21Var = g31Var2.h0;
                e21 e21Var2 = g31Var2.h0;
                e21Var.setLayerType(0, null);
                y11 y11Var = g31Var2.f0;
                y11Var.setLayerType(0, null);
                g31Var2.e0.setLayerType(0, null);
                g31Var2.b0.setLayerType(0, null);
                org.telegram.ui.Components.bn bnVar = g31Var2.n0;
                if (bnVar != null) {
                    bnVar.setLayerType(0, null);
                }
                View view = g31Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                y11Var.b();
                g31Var2.d0.m(false);
                org.telegram.messenger.at.e().k(99, 512);
                g31Var2.X1.e();
                org.telegram.messenger.i0.g3(new vv0(org.telegram.messenger.at.e(), 17));
                g31Var2.h();
                g31Var2.E(1.0f);
                for (int i11 = 0; i11 < e21Var2.getChildCount(); i11++) {
                    View childAt = e21Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < g31Var2.d0.b.getChildCount(); i12++) {
                    View childAt2 = g31Var2.d0.b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                g31Var2.d0.b.invalidate();
                g31Var2.k0.invalidate();
                e21Var2.invalidate();
                break;
            case 9:
                ((s61) obj).a0.setVisibility(8);
                break;
            case 10:
                k91 k91Var = ((z81) obj).a;
                if (!k91Var.q1.a()) {
                    k91Var.S1.setVisibility(8);
                    break;
                }
                break;
            case 11:
                super.onAnimationEnd(animator);
                ((ha1) obj).d = null;
                break;
            case 12:
                super.onAnimationEnd(animator);
                ((lb1) obj).setScrollEnabled(true);
                break;
            case 13:
                qc1 qc1Var = (qc1) obj;
                if (animator.equals(qc1Var.d.K)) {
                    qc1Var.d.K = null;
                    break;
                }
                break;
            case 14:
                ed1 ed1Var = (ed1) obj;
                ed1Var.d = null;
                ed1Var.a = null;
                ed1Var.b = false;
                ed1Var.f.c.setAllowDrawCursor(true);
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
                ((ue1) iVar.b).getClass();
                ((ue1) iVar.b).c.setVisibility(4);
                break;
            case 24:
                ((org.telegram.ui.web.z0) obj).s.setVisibility(8);
                break;
            case 25:
                ((ph.i0) obj).b.s1.setVisibility(8);
                break;
            case 26:
                rh.v2 v2Var = (rh.v2) obj;
                v2Var.E = 1.0f;
                v2Var.F = -1;
                rh.u2 u2Var = v2Var.H;
                if (u2Var != null && (z10 = u2Var.l) && z10) {
                    u2Var.l = false;
                    u2Var.b();
                }
                v2Var.G = null;
                break;
            case 27:
                wz wzVar = ((rh.w7) obj).c;
                wzVar.setScaleX(1.0f);
                wzVar.setScaleY(1.0f);
                break;
            case 28:
                ((rh.n) obj).run();
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
                ((xx0) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
