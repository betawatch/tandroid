package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class af implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;

    public /* synthetic */ af(bn bnVar, int i7) {
        this.a = i7;
        this.b = bnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 0;
        bn bnVar = this.b;
        switch (i7) {
            case 0:
                bnVar.P7(true);
                break;
            case 1:
                bnVar.P7(true);
                break;
            case 2:
                org.telegram.messenger.g0.d0(bnVar.A0, new fi.e(11));
                kl klVar = bnVar.D0;
                if (klVar != null) {
                    klVar.O(true);
                    break;
                }
                break;
            case 3:
                org.telegram.messenger.g0.d0(bnVar.A0, new fi.e(10));
                kl klVar2 = bnVar.D0;
                if (klVar2 != null) {
                    klVar2.O(false);
                    break;
                }
                break;
            case 4:
                bnVar.P7(false);
                ug.y0 y0Var = new ug.y0((org.telegram.ui.ActionBar.g2) bnVar, 24, true);
                y0Var.p0 = false;
                y0Var.I0 = new ke(bnVar, 7);
                y0Var.show();
                break;
            case 5:
                bnVar.cd();
                break;
            case 6:
                bn.A0(bnVar);
                break;
            case 7:
                if (bnVar.getUserConfig().q()) {
                    bnVar.qc = null;
                    bnVar.zd(true);
                    org.telegram.ui.Components.lc.b0(bnVar).c(org.telegram.messenger.hd.N0(2131754485, null)).j();
                    bnVar.getMessagesController().p0(true);
                    break;
                } else {
                    bnVar.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) bnVar, 3, true));
                    break;
                }
            case 8:
                rj rjVar = bnVar.a0;
                if (rjVar != null) {
                    rjVar.O0(true);
                    break;
                }
                break;
            case 9:
                bnVar.Na = null;
                bnVar.Ma = -1;
                View view = bnVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    break;
                }
                break;
            case 10:
                ArrayList arrayList = bnVar.M6;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    TLRPC.Message message = ((org.telegram.messenger.gj) arrayList.get(i11)).k;
                    if (message.mentioned && !message.media_unread) {
                        message.media_unread = false;
                    }
                }
                bnVar.D6 = 0;
                bnVar.getMessagesController().v3(bnVar.l6, bnVar.d());
                bnVar.E6 = true;
                bnVar.rc(false);
                org.telegram.ui.ActionBar.g1 g1Var = bnVar.g9;
                if (g1Var != null) {
                    g1Var.dismiss();
                    break;
                }
                break;
            case 11:
                ArrayList arrayList2 = bnVar.M6;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    ((org.telegram.messenger.gj) arrayList2.get(i12)).h5();
                }
                bnVar.A1 = 0;
                bnVar.jd(true);
                bnVar.getMessagesController().A3(bnVar.l6, bnVar.d());
                org.telegram.ui.ActionBar.g1 g1Var2 = bnVar.g9;
                if (g1Var2 != null) {
                    g1Var2.dismiss();
                    break;
                }
                break;
            case 12:
                ArrayList arrayList3 = bnVar.M6;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    TLRPC.Message message2 = ((org.telegram.messenger.gj) arrayList3.get(i13)).k;
                    if (message2 != null) {
                        TLRPC.MessageMedia messageMedia = message2.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                            ((TLRPC.TL_messageMediaPoll) messageMedia).results.has_unread_votes = false;
                        }
                    }
                }
                bnVar.B1 = 0;
                bnVar.id(true);
                bnVar.getMessagesController().z3(bnVar.l6, bnVar.d());
                org.telegram.ui.ActionBar.g1 g1Var3 = bnVar.g9;
                if (g1Var3 != null) {
                    g1Var3.dismiss();
                    break;
                }
                break;
            case 13:
                bn.Z(bnVar);
                break;
            case 14:
                bn.D1(bnVar);
                break;
            case 15:
                bnVar.x8(false, true, 0.0f);
                break;
            case 16:
                bnVar.Ic(true);
                bnVar.yd(true);
                org.telegram.ui.Components.lc.z(bnVar, 4, 0, bnVar.Ba).j();
                break;
            case 17:
                org.telegram.messenger.g0.E2(bnVar.Y0);
                break;
            case 18:
                bnVar.a0.i1();
                break;
            case 19:
                bnVar.Q4 = null;
                bnVar.M9();
                bnVar.O9();
                break;
            case 20:
                org.telegram.ui.Components.lc.b0(bnVar).I(R.raw.chats_infotip, org.telegram.messenger.hd.N0(2131753287, null), org.telegram.messenger.hd.N0(2131753288, null)).j();
                break;
            case 21:
                bnVar.Pc(false);
                break;
            case 22:
                bnVar.Lb = null;
                break;
            case 23:
                bnVar.L9 = false;
                bnVar.D9(true);
                break;
            case 24:
                bnVar.I7 = null;
                org.telegram.ui.Components.h50 h50Var = bnVar.q3;
                if (h50Var != null) {
                    org.telegram.ui.Components.e50 cameraContainer = h50Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.e50, Float>) View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.e50, Float>) View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.e50, Float>) property, 0.0f), ObjectAnimator.ofFloat(bnVar.q3.getButtonsLayout(), (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(bnVar.q3.getPaint(), org.telegram.ui.Components.r6.b, 0), ObjectAnimator.ofFloat(bnVar.q3.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                    animatorSet.addListener(new ei(bnVar, i10));
                    animatorSet.start();
                    break;
                }
                break;
            case 25:
                bnVar.h7();
                break;
            case 26:
                rj rjVar2 = bnVar.a0;
                if (rjVar2 != null && bnVar.kd != null) {
                    if (rjVar2.S0()) {
                        bnVar.a0.K0(false);
                        org.telegram.messenger.g0.I3(bnVar.kd.a);
                        ((te.a) bnVar.kd.b.b).a(false, true);
                        break;
                    } else {
                        bnVar.a0.x1(false, false, false);
                        bnVar.a0.W1();
                        ((te.a) bnVar.kd.b.b).a(true, true);
                        break;
                    }
                }
                break;
            case 27:
                bnVar.Va();
                break;
            case 28:
                uj ujVar = bnVar.J8;
                if (ujVar != null && ujVar.getParent() != null) {
                    bnVar.A0.g1();
                    bnVar.L8.setDrawingReady(false);
                    bnVar.J8.setTag(null);
                    bnVar.m1.removeView(bnVar.J8);
                    break;
                }
                break;
            default:
                bnVar.B9();
                bnVar.gd(0, true);
                break;
        }
    }
}
