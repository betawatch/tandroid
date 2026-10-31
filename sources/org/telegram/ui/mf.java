package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class mf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ mf(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.b1 b1Var;
        int i10 = this.a;
        int i11 = 1;
        un unVar = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.io ioVar = ((org.telegram.ui.Components.io[]) unVar.b0.b)[0];
                org.telegram.ui.ActionBar.u5 u5Var = ioVar.d;
                org.telegram.ui.ActionBar.u5 u5Var2 = ioVar.e;
                unVar.T1 = !unVar.T1;
                u5Var.setPivotX(0.0f);
                u5Var2.setPivotX(0.0f);
                if (unVar.T1) {
                    u5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    u5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    u5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    u5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                org.telegram.messenger.i0.h3(unVar.U1, 6000L);
                break;
            case 1:
                org.telegram.messenger.i0.d0(unVar.z0, new ag.z0(10));
                fm fmVar = unVar.C0;
                if (fmVar != null) {
                    fmVar.O(false);
                    break;
                }
                break;
            case 2:
                unVar.I7(true);
                break;
            case 3:
                unVar.I7(true);
                break;
            case 4:
                unVar.Oc();
                break;
            case 5:
                unVar.I7(false);
                kg.i1 i1Var = new kg.i1((org.telegram.ui.ActionBar.k2) unVar, 24, true);
                i1Var.o0 = false;
                i1Var.H0 = new qe(unVar, 7);
                i1Var.show();
                break;
            case 6:
                un.u1(unVar);
                break;
            case 7:
                if (unVar.getUserConfig().q()) {
                    unVar.hc = null;
                    unVar.ld(true);
                    org.telegram.ui.Components.cc.a0(unVar).c(org.telegram.messenger.cd.L0(2131754488, null)).j();
                    unVar.getMessagesController().o0(true);
                    break;
                } else {
                    unVar.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) unVar, 3, true));
                    break;
                }
            case 8:
                mk mkVar = unVar.Z;
                if (mkVar != null) {
                    mkVar.m0(true);
                    break;
                }
                break;
            case 9:
                un.D0(unVar);
                break;
            case 10:
                unVar.Ja = null;
                unVar.Ia = -1;
                View view = unVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    break;
                }
                break;
            case 11:
                ArrayList arrayList = unVar.K6;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    TLRPC.Message message = ((org.telegram.messenger.jj) arrayList.get(i12)).k;
                    if (message.mentioned && !message.media_unread) {
                        message.media_unread = false;
                    }
                }
                unVar.B6 = 0;
                unVar.getMessagesController().l3(unVar.j6, unVar.b());
                unVar.C6 = true;
                unVar.dc(false);
                org.telegram.ui.ActionBar.k1 k1Var = unVar.e9;
                if (k1Var != null) {
                    k1Var.dismiss();
                    break;
                }
                break;
            case 12:
                ArrayList arrayList2 = unVar.K6;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    ((org.telegram.messenger.jj) arrayList2.get(i13)).h5();
                }
                unVar.z1 = 0;
                unVar.Vc(true);
                unVar.getMessagesController().q3(unVar.j6, unVar.b());
                org.telegram.ui.ActionBar.k1 k1Var2 = unVar.e9;
                if (k1Var2 != null) {
                    k1Var2.dismiss();
                    break;
                }
                break;
            case 13:
                ArrayList arrayList3 = unVar.K6;
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    TLRPC.Message message2 = ((org.telegram.messenger.jj) arrayList3.get(i14)).k;
                    if (message2 != null) {
                        TLRPC.MessageMedia messageMedia = message2.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                            ((TLRPC.TL_messageMediaPoll) messageMedia).results.has_unread_votes = false;
                        }
                    }
                }
                unVar.A1 = 0;
                unVar.Uc(true);
                unVar.getMessagesController().p3(unVar.j6, unVar.b());
                org.telegram.ui.ActionBar.k1 k1Var3 = unVar.e9;
                if (k1Var3 != null) {
                    k1Var3.dismiss();
                    break;
                }
                break;
            case 14:
                un.O0(unVar);
                break;
            case 15:
                unVar.Z.F0();
                break;
            case 16:
                unVar.uc(true);
                unVar.kd(true);
                org.telegram.ui.Components.cc.z(unVar, 4, 0, unVar.xa).j();
                break;
            case 17:
                unVar.o8(false, true, 0.0f);
                break;
            case 18:
                org.telegram.messenger.i0.E2(unVar.X0);
                break;
            case 19:
                org.telegram.ui.Components.cc.a0(unVar).I(R.raw.chats_infotip, org.telegram.messenger.cd.L0(2131753290, null), org.telegram.messenger.cd.L0(2131753291, null)).j();
                break;
            case 20:
                unVar.finishFragment();
                break;
            case 21:
                unVar.Bc(false);
                break;
            case 22:
                unVar.o8(false, true, 0.0f);
                break;
            case 23:
                unVar.O4 = null;
                unVar.A9();
                unVar.C9();
                break;
            case 24:
                unVar.H9 = false;
                unVar.r9(true);
                break;
            case 25:
                org.telegram.ui.ActionBar.b1[] b1VarArr = unVar.g9;
                if (b1VarArr != null && b1VarArr.length > 0 && (b1Var = b1VarArr[0]) != null) {
                    b1Var.requestFocus();
                    unVar.g9[0].performAccessibilityAction(64, null);
                    unVar.g9[0].sendAccessibilityEvent(8);
                    break;
                }
                break;
            case 26:
                unVar.G7 = null;
                org.telegram.ui.Components.j50 j50Var = unVar.p3;
                if (j50Var != null) {
                    org.telegram.ui.Components.g50 cameraContainer = j50Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.g50, Float>) View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.g50, Float>) View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.g50, Float>) property, 0.0f), ObjectAnimator.ofFloat(unVar.p3.getButtonsLayout(), (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(unVar.p3.getPaint(), org.telegram.ui.Components.i6.b, 0), ObjectAnimator.ofFloat(unVar.p3.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                    animatorSet.addListener(new bi(unVar, i11));
                    animatorSet.start();
                    break;
                }
                break;
            case 27:
                unVar.a7();
                break;
            case 28:
                pk pkVar = unVar.H8;
                if (pkVar != null && pkVar.getParent() != null) {
                    unVar.z0.g1();
                    unVar.J8.setDrawingReady(false);
                    unVar.H8.setTag(null);
                    unVar.l1.removeView(unVar.H8);
                    break;
                }
                break;
            default:
                unVar.o8(false, true, 0.0f);
                break;
        }
    }
}
