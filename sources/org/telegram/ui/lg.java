package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class lg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ lg(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mk mkVar;
        View sendButton;
        View sendButton2;
        vh.p2 p2Var;
        int i10 = this.a;
        un unVar = this.b;
        switch (i10) {
            case 0:
                mk mkVar2 = unVar.Z;
                if (mkVar2 != null && unVar.Yc != null) {
                    if (mkVar2.q0()) {
                        unVar.Z.i0(false);
                        org.telegram.messenger.i0.J3(unVar.Yc.a);
                        ((fe.b) unVar.Yc.b.b).a(false, true);
                        break;
                    } else {
                        unVar.Z.T0(false, false, false);
                        unVar.Z.q1();
                        ((fe.b) unVar.Yc.b.b).a(true, true);
                        break;
                    }
                }
                break;
            case 1:
                if (unVar.getParentActivity() != null && unVar.fragmentView != null && (mkVar = unVar.Z) != null && (sendButton = mkVar.getSendButton()) != null && unVar.Z.getEditField() != null && unVar.Z.getEditField().getText().length() >= 5) {
                    int i11 = org.telegram.messenger.tz.a;
                    SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
                    org.telegram.messenger.tz.L = System.currentTimeMillis();
                    int i12 = org.telegram.messenger.tz.K + 1;
                    org.telegram.messenger.tz.K = i12;
                    edit.putInt("scheduledOrNoSoundHintShows", i12);
                    edit.putLong("scheduledOrNoSoundHintSeenAt", org.telegram.messenger.tz.L);
                    edit.apply();
                    if (unVar.u2 == null) {
                        ij ijVar = new ij(4, 0, unVar.getParentActivity(), unVar.xa, false);
                        unVar.u2 = ijVar;
                        ijVar.a();
                        unVar.u2.setAlpha(0.0f);
                        unVar.u2.setVisibility(4);
                        unVar.u2.setText(org.telegram.messenger.cd.L0(2131745864, null));
                        unVar.l1.addView(unVar.u2, w7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    unVar.u2.f(sendButton, true);
                    unVar.v2 = true;
                    break;
                }
                break;
            case 2:
                unVar.Ia();
                break;
            case 3:
                unVar.p9();
                unVar.Sc(0, true);
                break;
            case 4:
                unVar.o8(false, true, 0.0f);
                break;
            case 5:
                if (unVar.getParentActivity() != null && unVar.fragmentView != null && unVar.Z != null && unVar.Ya == null && unVar.getMessagesController().M1(unVar.a()) <= 0 && (sendButton2 = unVar.Z.getSendButton()) != null && unVar.Z.getEditField() != null && unVar.Z.getEditField().getText().length() != 0) {
                    int i13 = org.telegram.messenger.tz.a;
                    SharedPreferences.Editor edit2 = org.telegram.messenger.vp.d1().edit();
                    org.telegram.messenger.tz.N = System.currentTimeMillis();
                    int i14 = org.telegram.messenger.tz.M + 1;
                    org.telegram.messenger.tz.M = i14;
                    edit2.putInt("scheduledHintShows", i14);
                    edit2.putLong("scheduledHintSeenAt", org.telegram.messenger.tz.N);
                    edit2.apply();
                    if (unVar.w2 == null) {
                        org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(4, unVar.getParentActivity(), unVar.xa, false);
                        unVar.w2 = q30Var;
                        q30Var.a();
                        unVar.w2.setAlpha(0.0f);
                        unVar.w2.setVisibility(4);
                        unVar.w2.setText(org.telegram.messenger.cd.L0(2131745866, null));
                        unVar.l1.addView(unVar.w2, w7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    unVar.w2.f(sendButton2, true);
                    unVar.x2 = true;
                    break;
                }
                break;
            case 6:
                unVar.W5 = null;
                unVar.s8();
                break;
            case 7:
                unVar.W5 = null;
                unVar.s8();
                break;
            case 8:
                ArrayList arrayList = unVar.K6;
                unVar.cc = System.currentTimeMillis();
                if (unVar.z0 != null && unVar.C0 != null) {
                    int i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i16 = TLObject.FLAG_31;
                    for (int i17 = 0; i17 < unVar.z0.getChildCount(); i17++) {
                        View childAt = unVar.z0.getChildAt(i17);
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                            if (q1Var.getCurrentMessagesGroup() != null) {
                                for (int i18 = 0; i18 < q1Var.getCurrentMessagesGroup().d.size(); i18++) {
                                    int f12 = ((org.telegram.messenger.jj) q1Var.getCurrentMessagesGroup().d.get(i18)).f1();
                                    i15 = Math.min(i15, f12);
                                    i16 = Math.max(i16, f12);
                                }
                            } else if (q1Var.getMessageObject() != null) {
                                int f13 = q1Var.getMessageObject().f1();
                                i15 = Math.min(i15, f13);
                                i16 = Math.max(i16, f13);
                            }
                        }
                    }
                    if (i15 <= i16) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i19 = 0; i19 < arrayList.size(); i19++) {
                            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(i19);
                            org.telegram.messenger.ej ejVar = (org.telegram.messenger.ej) unVar.N6.f(jjVar.d1());
                            if (ejVar != null) {
                                ArrayList arrayList3 = ejVar.d;
                                if (!arrayList2.contains(Long.valueOf(ejVar.a))) {
                                    for (int i20 = 0; i20 < arrayList3.size(); i20++) {
                                        org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) arrayList3.get(i20);
                                        if (jjVar2 != null) {
                                            int f14 = jjVar2.f1();
                                            unVar.getMessagesController().t7.h(jjVar2, f14 >= i15 + (-7) && f14 <= i16 + 7, false);
                                        }
                                    }
                                    arrayList2.add(Long.valueOf(ejVar.a));
                                }
                            } else {
                                int f15 = jjVar.f1();
                                unVar.getMessagesController().t7.h(jjVar, f15 >= i15 + (-7) && f15 <= i16 + 7, false);
                            }
                        }
                    }
                }
                if (unVar.X4 > 0 && unVar.V4 != null) {
                    unVar.getMessagesController().t7.h((org.telegram.messenger.jj) unVar.V4.get(Integer.valueOf(unVar.X4)), true, false);
                }
                unVar.qd();
                break;
            case 9:
                unVar.o8(false, true, 0.0f);
                break;
            case 10:
                unVar.ia();
                break;
            case 11:
                un.i1(unVar);
                break;
            case 12:
                unVar.o8(false, true, 0.0f);
                break;
            case 13:
                org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, unVar.getParentActivity(), unVar.xa);
                unVar.Kb = x1Var;
                x1Var.setOnShowListener(new lf(unVar, 1));
                unVar.Kb.setOnCancelListener(unVar.Fa);
                unVar.Kb.r(500L);
                break;
            case 14:
                org.telegram.messenger.i0.E2(unVar.Z0);
                break;
            case 15:
                unVar.I7(true);
                org.telegram.messenger.m5.n(null, 2131743995, org.telegram.ui.Components.cc.a0(unVar), R.raw.chats_infotip, 36);
                break;
            case 16:
                unVar.V6();
                break;
            case 17:
                unVar.C0.M.clear();
                fm fmVar = unVar.C0;
                fmVar.L = false;
                fmVar.O(true);
                unVar.ic(false);
                break;
            case 18:
                unVar.a = (unVar.a + 1) % 3;
                break;
            case 19:
                unVar.b = !unVar.b;
                break;
            case 20:
                unVar.C0.M.clear();
                fm fmVar2 = unVar.C0;
                fmVar2.L = false;
                fmVar2.O(true);
                unVar.ic(false);
                break;
            case 21:
                unVar.Ra = false;
                unVar.Oc();
                break;
            case 22:
                unVar.Dc = 0;
                unVar.Ec = false;
                unVar.z0.g1();
                break;
            case 23:
                unVar.A9();
                unVar.C9();
                unVar.z7();
                unVar.B7();
                break;
            case 24:
                unVar.Sc(0, unVar.f6 != 0 && SystemClock.elapsedRealtime() >= unVar.f6 + 150);
                break;
            case 25:
                pk pkVar = unVar.f3;
                if ((pkVar == null || pkVar.getVisibility() != 0) && (p2Var = unVar.K1) != null) {
                    p2Var.u();
                    break;
                }
                break;
            case 26:
                unVar.s7();
                break;
            case 27:
                unVar.i7(false);
                break;
            case 28:
                FrameLayout.LayoutParams e = w7.b6.e(-1, -2, 87);
                e.bottomMargin = unVar.Z.getMeasuredHeight();
                unVar.l1.addView(unVar.M1, e);
                unVar.M1.setTranslationY(-org.telegram.messenger.i0.n);
                unVar.M1.m(0.0f, unVar.Z.getEmojiButton().getX() + org.telegram.messenger.i0.L(22.0f));
                unVar.M1.u();
                break;
            default:
                int i21 = un.ad;
                unVar.h7();
                break;
        }
    }
}
