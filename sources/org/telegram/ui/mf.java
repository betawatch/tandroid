package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ mf(sn snVar, int i10) {
        this.a = i10;
        this.b = snVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.e1 e1Var;
        hk hkVar;
        View sendButton;
        View sendButton2;
        int i10 = this.a;
        int i11 = 2;
        int i12 = 0;
        sn snVar = this.b;
        switch (i10) {
            case 0:
                snVar.D7(true);
                break;
            case 1:
                snVar.D7(true);
                break;
            case 2:
                snVar.D7(false);
                sg.x0 x0Var = new sg.x0((org.telegram.ui.ActionBar.n2) snVar, 24, true);
                x0Var.setDimBehind(false);
                x0Var.setOnHideListener(new qe(snVar, i11));
                x0Var.show();
                break;
            case 3:
                sn.U(snVar);
                break;
            case 4:
                sn.f0(snVar);
                break;
            case 5:
                if (snVar.getUserConfig().isPremium()) {
                    snVar.Mb = null;
                    snVar.Uc(true);
                    org.telegram.ui.Components.xc.a0(snVar).c(LocaleController.getString(R.string.AdHidden)).j();
                    snVar.getMessagesController().disableAds(true);
                    break;
                } else {
                    snVar.showDialog(new sg.x0((org.telegram.ui.ActionBar.n2) snVar, 3, true));
                    break;
                }
            case 6:
                hk hkVar2 = snVar.Y;
                if (hkVar2 != null) {
                    hkVar2.o0(true);
                    break;
                }
                break;
            case 7:
                snVar.qa = null;
                snVar.pa = -1;
                View view = snVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    break;
                }
                break;
            case 8:
                ArrayList arrayList = snVar.u6;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i13);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                snVar.l6 = 0;
                snVar.getMessagesController().markMentionsAsRead(snVar.T5, snVar.d());
                snVar.m6 = true;
                snVar.Ob(false);
                org.telegram.ui.ActionBar.m1 m1Var = snVar.Q8;
                if (m1Var != null) {
                    m1Var.dismiss();
                    break;
                }
                break;
            case 9:
                ArrayList arrayList2 = snVar.u6;
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    ((MessageObject) arrayList2.get(i14)).markReactionsAsRead();
                }
                snVar.l1 = 0;
                snVar.Fc(true);
                snVar.getMessagesController().markReactionsAsRead(snVar.T5, snVar.d());
                org.telegram.ui.ActionBar.m1 m1Var2 = snVar.Q8;
                if (m1Var2 != null) {
                    m1Var2.dismiss();
                    break;
                }
                break;
            case 10:
                ArrayList arrayList3 = snVar.u6;
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    ((MessageObject) arrayList3.get(i15)).markPollVotesAsRead();
                }
                snVar.m1 = 0;
                snVar.Ec(true);
                snVar.getMessagesController().markPollVotesAsRead(snVar.T5, snVar.d());
                org.telegram.ui.ActionBar.m1 m1Var3 = snVar.Q8;
                if (m1Var3 != null) {
                    m1Var3.dismiss();
                    break;
                }
                break;
            case 11:
                snVar.Y.F0();
                break;
            case 12:
                sn.g0(snVar);
                break;
            case 13:
                snVar.j8(false, true, 0.0f);
                break;
            case 14:
                org.telegram.ui.Components.xc.a0(snVar).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                break;
            case 15:
                snVar.j8(false, true, 0.0f);
                break;
            case 16:
                snVar.G5 = null;
                snVar.m8();
                break;
            case 17:
                snVar.G5 = null;
                snVar.m8();
                break;
            case 18:
                snVar.finishFragment();
                break;
            case 19:
                snVar.j8(false, true, 0.0f);
                break;
            case 20:
                snVar.C4 = null;
                snVar.t9();
                snVar.w9();
                break;
            case 21:
                snVar.V6();
                break;
            case 22:
                org.telegram.ui.ActionBar.e1[] e1VarArr = snVar.S8;
                if (e1VarArr != null && e1VarArr.length > 0 && (e1Var = e1VarArr[0]) != null) {
                    e1Var.requestFocus();
                    snVar.S8[0].performAccessibilityAction(64, null);
                    snVar.S8[0].sendAccessibilityEvent(8);
                    break;
                }
                break;
            case 23:
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(snVar.getParentActivity(), 3, snVar.ea);
                snVar.pb = b2Var;
                b2Var.setOnShowListener(new kf(snVar, 1));
                snVar.pb.setOnCancelListener(snVar.ma);
                snVar.pb.q(500L);
                break;
            case 24:
                kk kkVar = snVar.t8;
                if (kkVar != null && kkVar.getParent() != null) {
                    snVar.x0.f1();
                    snVar.v8.setDrawingReady(false);
                    snVar.t8.setTag(null);
                    snVar.X0.removeView(snVar.t8);
                    break;
                }
                break;
            case 25:
                snVar.o9 = false;
                snVar.j9(true);
                break;
            case 26:
                snVar.q7 = null;
                org.telegram.ui.Components.r60 r60Var = snVar.b3;
                if (r60Var != null) {
                    org.telegram.ui.Components.o60 cameraContainer = r60Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.o60, Float>) View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.o60, Float>) View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.o60, Float>) property, 0.0f), ObjectAnimator.ofFloat(snVar.b3.getButtonsLayout(), (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(snVar.b3.getPaint(), org.telegram.ui.Components.t6.b, 0), ObjectAnimator.ofFloat(snVar.b3.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                    animatorSet.addListener(new qi(snVar, i12));
                    animatorSet.start();
                    break;
                }
                break;
            case 27:
                if (snVar.getParentActivity() != null && snVar.fragmentView != null && (hkVar = snVar.Y) != null && (sendButton = hkVar.getSendButton()) != null && snVar.Y.getEditField() != null && snVar.Y.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (snVar.g2 == null) {
                        cj cjVar = new cj(4, 0, snVar.getParentActivity(), snVar.ea, false);
                        snVar.g2 = cjVar;
                        cjVar.a();
                        snVar.g2.setAlpha(0.0f);
                        snVar.g2.setVisibility(4);
                        snVar.g2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        snVar.X0.addView(snVar.g2, w7.z5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
                    }
                    snVar.g2.f(sendButton, true);
                    snVar.h2 = true;
                    break;
                }
                break;
            case 28:
                snVar.A0.M.clear();
                fm fmVar = snVar.A0;
                fmVar.L = false;
                fmVar.O(true);
                snVar.Tb(false);
                break;
            default:
                if (snVar.getParentActivity() != null && snVar.fragmentView != null && snVar.Y != null && snVar.Fa == null && snVar.getMessagesController().getSendPaidMessagesStars(snVar.a()) <= 0 && (sendButton2 = snVar.Y.getSendButton()) != null && snVar.Y.getEditField() != null && snVar.Y.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (snVar.i2 == null) {
                        org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(4, snVar.getParentActivity(), snVar.ea, false);
                        snVar.i2 = r40Var;
                        r40Var.a();
                        snVar.i2.setAlpha(0.0f);
                        snVar.i2.setVisibility(4);
                        snVar.i2.setText(LocaleController.getString(R.string.ScheduledHint));
                        snVar.X0.addView(snVar.i2, w7.z5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
                    }
                    snVar.i2.f(sendButton2, true);
                    snVar.j2 = true;
                    break;
                }
                break;
        }
    }
}
