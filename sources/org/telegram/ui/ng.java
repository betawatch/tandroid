package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ng implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ ng(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View sendButton;
        org.telegram.ui.ActionBar.b1 b1Var;
        vh.p2 p2Var;
        int i10 = this.a;
        un unVar = this.b;
        switch (i10) {
            case 0:
                unVar.Na();
                break;
            case 1:
                unVar.u9();
                unVar.Xc(0, true);
                break;
            case 2:
                if (unVar.getParentActivity() != null && unVar.fragmentView != null && unVar.Z != null && unVar.Ya == null && unVar.getMessagesController().M1(unVar.a()) <= 0 && (sendButton = unVar.Z.getSendButton()) != null && unVar.Z.getEditField() != null && unVar.Z.getEditField().getText().length() != 0) {
                    int i11 = org.telegram.messenger.uz.a;
                    SharedPreferences.Editor edit = org.telegram.messenger.wp.d1().edit();
                    org.telegram.messenger.uz.N = System.currentTimeMillis();
                    int i12 = org.telegram.messenger.uz.M + 1;
                    org.telegram.messenger.uz.M = i12;
                    edit.putInt("scheduledHintShows", i12);
                    edit.putLong("scheduledHintSeenAt", org.telegram.messenger.uz.N);
                    edit.apply();
                    if (unVar.w2 == null) {
                        org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(4, unVar.getParentActivity(), unVar.xa, false);
                        unVar.w2 = q30Var;
                        q30Var.a();
                        unVar.w2.setAlpha(0.0f);
                        unVar.w2.setVisibility(4);
                        unVar.w2.setText(org.telegram.messenger.dd.L0(2131745866, null));
                        unVar.l1.addView(unVar.w2, w7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    unVar.w2.f(sendButton, true);
                    unVar.x2 = true;
                    break;
                }
                break;
            case 3:
                unVar.s8(false, true, 0.0f);
                break;
            case 4:
                ArrayList arrayList = unVar.K6;
                unVar.dc = System.currentTimeMillis();
                if (unVar.z0 != null && unVar.C0 != null) {
                    int i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i14 = TLObject.FLAG_31;
                    for (int i15 = 0; i15 < unVar.z0.getChildCount(); i15++) {
                        View childAt = unVar.z0.getChildAt(i15);
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                            if (q1Var.getCurrentMessagesGroup() != null) {
                                for (int i16 = 0; i16 < q1Var.getCurrentMessagesGroup().d.size(); i16++) {
                                    int f12 = ((org.telegram.messenger.kj) q1Var.getCurrentMessagesGroup().d.get(i16)).f1();
                                    i13 = Math.min(i13, f12);
                                    i14 = Math.max(i14, f12);
                                }
                            } else if (q1Var.getMessageObject() != null) {
                                int f13 = q1Var.getMessageObject().f1();
                                i13 = Math.min(i13, f13);
                                i14 = Math.max(i14, f13);
                            }
                        }
                    }
                    if (i13 <= i14) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList.get(i17);
                            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) unVar.N6.f(kjVar.d1());
                            if (fjVar != null) {
                                ArrayList arrayList3 = fjVar.d;
                                if (!arrayList2.contains(Long.valueOf(fjVar.a))) {
                                    for (int i18 = 0; i18 < arrayList3.size(); i18++) {
                                        org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) arrayList3.get(i18);
                                        if (kjVar2 != null) {
                                            int f14 = kjVar2.f1();
                                            unVar.getMessagesController().t7.h(kjVar2, f14 >= i13 + (-7) && f14 <= i14 + 7, false);
                                        }
                                    }
                                    arrayList2.add(Long.valueOf(fjVar.a));
                                }
                            } else {
                                int f15 = kjVar.f1();
                                unVar.getMessagesController().t7.h(kjVar, f15 >= i13 + (-7) && f15 <= i14 + 7, false);
                            }
                        }
                    }
                }
                if (unVar.X4 > 0 && unVar.V4 != null) {
                    unVar.getMessagesController().t7.h((org.telegram.messenger.kj) unVar.V4.get(Integer.valueOf(unVar.X4)), true, false);
                }
                unVar.vd();
                break;
            case 5:
                unVar.s8(false, true, 0.0f);
                break;
            case 6:
                un.g1(unVar);
                break;
            case 7:
                unVar.na();
                break;
            case 8:
                unVar.s8(false, true, 0.0f);
                break;
            case 9:
                org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, unVar.getParentActivity(), unVar.xa);
                unVar.Lb = x1Var;
                x1Var.setOnShowListener(new kf(unVar, 1));
                unVar.Lb.setOnCancelListener(unVar.Fa);
                unVar.Lb.r(500L);
                break;
            case 10:
                unVar.s8(false, true, 0.0f);
                break;
            case 11:
                org.telegram.ui.ActionBar.b1[] b1VarArr = unVar.g9;
                if (b1VarArr != null && b1VarArr.length > 0 && (b1Var = b1VarArr[0]) != null) {
                    b1Var.requestFocus();
                    unVar.g9[0].performAccessibilityAction(64, null);
                    unVar.g9[0].sendAccessibilityEvent(8);
                    break;
                }
                break;
            case 12:
                org.telegram.messenger.i0.E2(unVar.Z0);
                break;
            case 13:
                unVar.s8(false, true, 0.0f);
                break;
            case 14:
                unVar.Z6();
                break;
            case 15:
                unVar.M7(true);
                org.telegram.messenger.m5.n(null, 2131743995, org.telegram.ui.Components.cc.a0(unVar), R.raw.chats_infotip, 36);
                break;
            case 16:
                unVar.C0.M.clear();
                fm fmVar = unVar.C0;
                fmVar.L = false;
                fmVar.O(true);
                unVar.nc(false);
                break;
            case 17:
                unVar.a = (unVar.a + 1) % 3;
                break;
            case 18:
                unVar.b = !unVar.b;
                break;
            case 19:
                unVar.C0.M.clear();
                fm fmVar2 = unVar.C0;
                fmVar2.L = false;
                fmVar2.O(true);
                unVar.nc(false);
                break;
            case 20:
                unVar.Ra = false;
                unVar.Tc();
                break;
            case 21:
                unVar.Ec = 0;
                unVar.Fc = false;
                unVar.z0.g1();
                break;
            case 22:
                unVar.F9();
                unVar.H9();
                unVar.D7();
                unVar.F7();
                break;
            case 23:
                unVar.Xc(0, unVar.f6 != 0 && SystemClock.elapsedRealtime() >= unVar.f6 + 150);
                break;
            case 24:
                pk pkVar = unVar.f3;
                if ((pkVar == null || pkVar.getVisibility() != 0) && (p2Var = unVar.K1) != null) {
                    p2Var.u();
                    break;
                }
                break;
            case 25:
                unVar.w7();
                break;
            case 26:
                unVar.m7(false);
                break;
            case 27:
                FrameLayout.LayoutParams e = w7.b6.e(-1, -2, 87);
                e.bottomMargin = unVar.Z.getMeasuredHeight();
                unVar.l1.addView(unVar.M1, e);
                unVar.M1.setTranslationY(-org.telegram.messenger.i0.n);
                unVar.M1.m(0.0f, unVar.Z.getEmojiButton().getX() + org.telegram.messenger.i0.L(22.0f));
                unVar.M1.u();
                break;
            case 28:
                int i19 = un.bd;
                unVar.l7();
                break;
            default:
                int i20 = un.bd;
                unVar.l7();
                break;
        }
    }
}
