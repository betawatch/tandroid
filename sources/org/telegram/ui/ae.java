package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ae implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ ae(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qj qjVar;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ij messageObject;
        int i7 = this.a;
        int i10 = 5;
        an anVar = this.b;
        switch (i7) {
            case 0:
                anVar.b6 = null;
                if (anVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.xa);
                    boolean T = org.telegram.messenger.t3.T(anVar.e);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    if (!T || anVar.e.megagroup) {
                        u1Var.T = org.telegram.messenger.hd.M0(2131749082, null);
                        u1Var.R = org.telegram.messenger.hd.M0(2131749081, null);
                    } else {
                        u1Var.T = org.telegram.messenger.hd.M0(2131749084, null);
                        u1Var.R = org.telegram.messenger.hd.M0(2131749083, null);
                    }
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131749080, null), new fe(anVar, 2));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new fe(anVar, 3));
                    anVar.showDialog(u1Var);
                    break;
                }
                break;
            case 1:
                anVar.m7();
                break;
            case 2:
                an.l0(anVar);
                break;
            case 3:
                org.telegram.messenger.g0.E2(anVar.Y0);
                break;
            case 4:
                anVar.Oa(null, anVar.G8);
                anVar.G8 = null;
                break;
            case 5:
                if (!org.telegram.ui.ActionBar.f2.hasSheets(anVar) && (qjVar = anVar.Z) != null) {
                    qjVar.setFieldFocused(true);
                    anVar.Z.H0();
                    break;
                }
                break;
            case 6:
                anVar.zd();
                anVar.K9();
                org.telegram.messenger.g0.d0(anVar.z0, new ne(anVar, i10));
                anVar.I7();
                ij ijVar = anVar.l3;
                if (ijVar != null) {
                    ijVar.setTranslationX(anVar.l9() / 2.0f);
                }
                gj gjVar = anVar.m3;
                if (gjVar != null) {
                    gjVar.setTranslationX(anVar.l9() / 2.0f);
                }
                FrameLayout frameLayout = anVar.e1;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(anVar.l9() / 2.0f);
                }
                anVar.g7();
                anVar.H7();
                break;
            case 7:
                u81 f02 = u81.f0(-anVar.j6, 0L);
                f02.D = anVar;
                anVar.presentFragment(f02);
                break;
            case 8:
                anVar.Ec(true);
                break;
            case 9:
                anVar.x1.d(true);
                break;
            case 10:
                anVar.resumeDelayedFragmentAnimation();
                xj xjVar = anVar.pa;
                org.telegram.messenger.g0.r(xjVar);
                xjVar.run();
                anVar.getNotificationCenter().o();
                break;
            case 11:
                anVar.getNotificationCenter().j(anVar.Y9);
                break;
            case 12:
                int childCount = anVar.z0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = anVar.z0.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                        if (q1Var2.getMessageObject().D == 4) {
                            q1Var2.G1();
                        }
                    }
                }
                break;
            case 13:
                anVar.bc = true;
                anVar.bd(true);
                break;
            case 14:
                hk hkVar = anVar.xb;
                if (hkVar != null) {
                    hkVar.requestLayout();
                    break;
                }
                break;
            case 15:
                an.S0(anVar);
                break;
            case 16:
                TLRPC.UserFull userFull = anVar.q8;
                anVar.Kb(userFull != null ? userFull.theme : null);
                break;
            case 17:
                an.p0(anVar);
                break;
            case 18:
                anVar.b8 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                anVar.d8 = false;
                anVar.e8 = 0L;
                anVar.f8 = null;
                anVar.g8 = null;
                anVar.h8 = null;
                anVar.i8 = -1;
                anVar.c8 = false;
                anVar.Cd(false);
                anVar.k8 = null;
                break;
            case 19:
                ae aeVar = new ae(anVar, 10);
                if (org.telegram.utils.twidget.p.x()) {
                    aeVar.run();
                    break;
                } else {
                    org.telegram.ui.Components.dt dtVar = new org.telegram.ui.Components.dt(aeVar, 26);
                    org.telegram.utils.twidget.p.h.add(dtVar);
                    org.telegram.messenger.g0.i3(dtVar, 150L);
                    break;
                }
            case 20:
                anVar.Yb(false, true);
                break;
            case 21:
                an.d0(anVar);
                break;
            case 22:
                anVar.n7();
                break;
            case 23:
                anVar.Z.H0();
                break;
            case 24:
                an anVar2 = this.b;
                int i12 = anVar2.Qb;
                if (i12 != 0) {
                    anVar2.l(i12, anVar2.Rb, anVar2.Sb, anVar2.Tb, anVar2.Ub, anVar2.Vb);
                    anVar2.Qb = 0;
                    break;
                }
                break;
            case 25:
                if (!anVar.z3 && anVar.z0 != null && anVar.getParentActivity() != null && anVar.fragmentView != null) {
                    org.telegram.ui.Components.zo zoVar = anVar.J2;
                    if (zoVar == null || !zoVar.V) {
                        if (zoVar == null) {
                            ol olVar = anVar.l1;
                            int indexOfChild = olVar.indexOfChild(anVar.T);
                            if (indexOfChild != -1) {
                                org.telegram.ui.Components.zo zoVar2 = new org.telegram.ui.Components.zo(anVar.getParentActivity());
                                anVar.J2 = zoVar2;
                                zoVar2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                anVar.J2.l(anVar.K);
                                olVar.addView(anVar.J2, indexOfChild + 1, c8.ha.e(-1, org.telegram.messenger.qs.g2, 55));
                            }
                        }
                        int childCount2 = anVar.z0.getChildCount();
                        for (int i13 = 0; i13 < childCount2; i13++) {
                            View childAt2 = anVar.z0.getChildAt(i13);
                            if ((childAt2 instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt2).getMessageObject()) != null && messageObject.Q3() && messageObject.r4()) {
                                org.telegram.ui.Components.zo zoVar3 = anVar.J2;
                                int[] iArr = (int[]) zoVar3.Y0;
                                if (zoVar3.getParent() instanceof View) {
                                    q1Var.getLocationInWindow(iArr);
                                    int i14 = iArr[0];
                                    int i15 = iArr[1];
                                    ((View) zoVar3.getParent()).getLocationInWindow(iArr);
                                    float f10 = i15 - iArr[1];
                                    if (f10 > org.telegram.messenger.g0.L(80.0f)) {
                                        for (org.telegram.ui.Components.zg0 zg0Var : (org.telegram.ui.Components.zg0[]) zoVar3.X0) {
                                            zg0Var.N(0, false, false);
                                            zg0Var.start();
                                        }
                                        zoVar3.x(org.telegram.messenger.g0.L(5.0f) + q1Var.getChecksX() + (i14 - iArr[0]), f10 + q1Var.getChecksY() + org.telegram.messenger.g0.L(6.0f), true);
                                        anVar.getMessagesController().k4(0L, "NEWCOMER_TICKS");
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
                an.C0(anVar);
                break;
            case 27:
                qj qjVar2 = anVar.Z;
                if (qjVar2 != null && anVar.Ob != 5) {
                    qjVar2.H0();
                    break;
                }
                break;
            case 28:
                org.telegram.messenger.g0.d0(anVar.z0, new di.e(11));
                jl jlVar = anVar.C0;
                if (jlVar != null) {
                    jlVar.O(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.zn znVar = ((org.telegram.ui.Components.zn[]) anVar.b0.b)[0];
                org.telegram.ui.ActionBar.k5 k5Var = znVar.d;
                org.telegram.ui.ActionBar.k5 k5Var2 = znVar.e;
                anVar.T1 = !anVar.T1;
                k5Var.setPivotX(0.0f);
                k5Var2.setPivotX(0.0f);
                if (anVar.T1) {
                    k5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    k5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    k5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    k5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                org.telegram.messenger.g0.i3(anVar.U1, 6000L);
                break;
        }
    }
}
