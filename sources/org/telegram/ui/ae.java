package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ae implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;

    public /* synthetic */ ae(cn cnVar, int i7) {
        this.a = i7;
        this.b = cnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sj sjVar;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ij messageObject;
        int i7 = this.a;
        int i10 = 5;
        cn cnVar = this.b;
        switch (i7) {
            case 0:
                cnVar.b6 = null;
                if (cnVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, cnVar.getParentActivity(), cnVar.za);
                    boolean T = org.telegram.messenger.t3.T(cnVar.e);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    if (!T || cnVar.e.megagroup) {
                        u1Var.T = org.telegram.messenger.id.M0(2131749083, null);
                        u1Var.R = org.telegram.messenger.id.M0(2131749082, null);
                    } else {
                        u1Var.T = org.telegram.messenger.id.M0(2131749085, null);
                        u1Var.R = org.telegram.messenger.id.M0(2131749084, null);
                    }
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131749081, null), new fe(cnVar, 2));
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new fe(cnVar, 3));
                    cnVar.showDialog(u1Var);
                    break;
                }
                break;
            case 1:
                cnVar.n7();
                break;
            case 2:
                cn.m0(cnVar);
                break;
            case 3:
                org.telegram.messenger.g0.E2(cnVar.Y0);
                break;
            case 4:
                cnVar.Qa(null, cnVar.G8);
                cnVar.G8 = null;
                break;
            case 5:
                if (!org.telegram.ui.ActionBar.f2.hasSheets(cnVar) && (sjVar = cnVar.Z) != null) {
                    sjVar.setFieldFocused(true);
                    cnVar.Z.H0();
                    break;
                }
                break;
            case 6:
                cnVar.Cd();
                cnVar.L9();
                org.telegram.messenger.g0.d0(cnVar.z0, new ne(cnVar, i10));
                cnVar.J7();
                kj kjVar = cnVar.l3;
                if (kjVar != null) {
                    kjVar.setTranslationX(cnVar.m9() / 2.0f);
                }
                ij ijVar = cnVar.m3;
                if (ijVar != null) {
                    ijVar.setTranslationX(cnVar.m9() / 2.0f);
                }
                FrameLayout frameLayout = cnVar.e1;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(cnVar.m9() / 2.0f);
                }
                cnVar.h7();
                cnVar.I7();
                break;
            case 7:
                w81 f02 = w81.f0(-cnVar.j6, 0L);
                f02.D = cnVar;
                cnVar.presentFragment(f02);
                break;
            case 8:
                cnVar.Hc(true);
                break;
            case 9:
                cnVar.x1.d(true);
                break;
            case 10:
                cnVar.resumeDelayedFragmentAnimation();
                zj zjVar = cnVar.ra;
                org.telegram.messenger.g0.r(zjVar);
                zjVar.run();
                cnVar.getNotificationCenter().o();
                break;
            case 11:
                cnVar.getNotificationCenter().j(cnVar.aa);
                break;
            case 12:
                int childCount = cnVar.z0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = cnVar.z0.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                        if (q1Var2.getMessageObject().D == 4) {
                            q1Var2.G1();
                        }
                    }
                }
                break;
            case 13:
                cnVar.dc = true;
                cnVar.ed(true);
                break;
            case 14:
                jk jkVar = cnVar.zb;
                if (jkVar != null) {
                    jkVar.requestLayout();
                    break;
                }
                break;
            case 15:
                cn.U0(cnVar);
                break;
            case 16:
                TLRPC.UserFull userFull = cnVar.q8;
                cnVar.Nb(userFull != null ? userFull.theme : null);
                break;
            case 17:
                cn.r0(cnVar);
                break;
            case 18:
                cnVar.b8 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                cnVar.d8 = false;
                cnVar.e8 = 0L;
                cnVar.f8 = null;
                cnVar.g8 = null;
                cnVar.h8 = null;
                cnVar.i8 = -1;
                cnVar.c8 = false;
                cnVar.Fd(false);
                cnVar.k8 = null;
                break;
            case 19:
                ae aeVar = new ae(cnVar, 10);
                if (org.telegram.utils.twidget.n0.z()) {
                    aeVar.run();
                    break;
                } else {
                    org.telegram.ui.Components.et etVar = new org.telegram.ui.Components.et(aeVar, 26);
                    org.telegram.utils.twidget.n0.h.add(etVar);
                    org.telegram.messenger.g0.i3(etVar, 150L);
                    break;
                }
            case 20:
                cnVar.bc(false, true);
                break;
            case 21:
                cn.e0(cnVar);
                break;
            case 22:
                cnVar.o7();
                break;
            case 23:
                cnVar.Z.H0();
                break;
            case 24:
                cn cnVar2 = this.b;
                int i12 = cnVar2.Sb;
                if (i12 != 0) {
                    cnVar2.l(i12, cnVar2.Tb, cnVar2.Ub, cnVar2.Vb, cnVar2.Wb, cnVar2.Xb);
                    cnVar2.Sb = 0;
                    break;
                }
                break;
            case 25:
                if (!cnVar.z3 && cnVar.z0 != null && cnVar.getParentActivity() != null && cnVar.fragmentView != null) {
                    org.telegram.ui.Components.zo zoVar = cnVar.J2;
                    if (zoVar == null || !zoVar.V) {
                        if (zoVar == null) {
                            ql qlVar = cnVar.l1;
                            int indexOfChild = qlVar.indexOfChild(cnVar.T);
                            if (indexOfChild != -1) {
                                org.telegram.ui.Components.zo zoVar2 = new org.telegram.ui.Components.zo(cnVar.getParentActivity());
                                cnVar.J2 = zoVar2;
                                zoVar2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                cnVar.J2.l(cnVar.K);
                                qlVar.addView(cnVar.J2, indexOfChild + 1, c8.ha.e(-1, org.telegram.messenger.qs.g2, 55));
                            }
                        }
                        int childCount2 = cnVar.z0.getChildCount();
                        for (int i13 = 0; i13 < childCount2; i13++) {
                            View childAt2 = cnVar.z0.getChildAt(i13);
                            if ((childAt2 instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt2).getMessageObject()) != null && messageObject.P3() && messageObject.q4()) {
                                org.telegram.ui.Components.zo zoVar3 = cnVar.J2;
                                int[] iArr = (int[]) zoVar3.Y0;
                                if (zoVar3.getParent() instanceof View) {
                                    q1Var.getLocationInWindow(iArr);
                                    int i14 = iArr[0];
                                    int i15 = iArr[1];
                                    ((View) zoVar3.getParent()).getLocationInWindow(iArr);
                                    float f10 = i15 - iArr[1];
                                    if (f10 > org.telegram.messenger.g0.L(80.0f)) {
                                        for (org.telegram.ui.Components.ah0 ah0Var : (org.telegram.ui.Components.ah0[]) zoVar3.X0) {
                                            ah0Var.N(0, false, false);
                                            ah0Var.start();
                                        }
                                        zoVar3.x(org.telegram.messenger.g0.L(5.0f) + q1Var.getChecksX() + (i14 - iArr[0]), f10 + q1Var.getChecksY() + org.telegram.messenger.g0.L(6.0f), true);
                                        cnVar.getMessagesController().k4(0L, "NEWCOMER_TICKS");
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 26:
                cn.G0(cnVar);
                break;
            case 27:
                sj sjVar2 = cnVar.Z;
                if (sjVar2 != null && cnVar.Qb != 5) {
                    sjVar2.H0();
                    break;
                }
                break;
            case 28:
                org.telegram.messenger.g0.d0(cnVar.z0, new di.e(11));
                ll llVar = cnVar.C0;
                if (llVar != null) {
                    llVar.O(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.zn znVar = ((org.telegram.ui.Components.zn[]) cnVar.b0.b)[0];
                org.telegram.ui.ActionBar.l5 l5Var = znVar.d;
                org.telegram.ui.ActionBar.l5 l5Var2 = znVar.e;
                cnVar.T1 = !cnVar.T1;
                l5Var.setPivotX(0.0f);
                l5Var2.setPivotX(0.0f);
                if (cnVar.T1) {
                    l5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    l5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    l5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    l5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                org.telegram.messenger.g0.i3(cnVar.U1, 6000L);
                break;
        }
    }
}
