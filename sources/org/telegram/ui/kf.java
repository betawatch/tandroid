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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class kf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ kf(sn snVar, int i10) {
        this.a = i10;
        this.b = snVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.e1 e1Var;
        gk gkVar;
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
                sg.y0 y0Var = new sg.y0((org.telegram.ui.ActionBar.o2) snVar, 24, true);
                y0Var.setDimBehind(false);
                y0Var.setOnHideListener(new oe(snVar, i11));
                y0Var.show();
                break;
            case 3:
                sn.U(snVar);
                break;
            case 4:
                sn.f0(snVar);
                break;
            case 5:
                if (snVar.getUserConfig().isPremium()) {
                    snVar.Zb = null;
                    snVar.Xc(true);
                    org.telegram.ui.Components.xc.a0(snVar).c(LocaleController.getString(R.string.AdHidden)).j();
                    snVar.getMessagesController().disableAds(true);
                    break;
                } else {
                    snVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.o2) snVar, 3, true));
                    break;
                }
            case 6:
                gk gkVar2 = snVar.Y;
                if (gkVar2 != null) {
                    gkVar2.n0(true);
                    break;
                }
                break;
            case 7:
                snVar.Ca = null;
                snVar.Ba = -1;
                View view = snVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    break;
                }
                break;
            case 8:
                ArrayList arrayList = snVar.G6;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i13);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                snVar.x6 = 0;
                snVar.getMessagesController().markMentionsAsRead(snVar.f6, snVar.d());
                snVar.y6 = true;
                snVar.Qb(false);
                org.telegram.ui.ActionBar.m1 m1Var = snVar.c9;
                if (m1Var != null) {
                    m1Var.dismiss();
                    break;
                }
                break;
            case 9:
                ArrayList arrayList2 = snVar.G6;
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    ((MessageObject) arrayList2.get(i14)).markReactionsAsRead();
                }
                snVar.x1 = 0;
                snVar.Ic(true);
                snVar.getMessagesController().markReactionsAsRead(snVar.f6, snVar.d());
                org.telegram.ui.ActionBar.m1 m1Var2 = snVar.c9;
                if (m1Var2 != null) {
                    m1Var2.dismiss();
                    break;
                }
                break;
            case 10:
                ArrayList arrayList3 = snVar.G6;
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    ((MessageObject) arrayList3.get(i15)).markPollVotesAsRead();
                }
                snVar.y1 = 0;
                snVar.Hc(true);
                snVar.getMessagesController().markPollVotesAsRead(snVar.f6, snVar.d());
                org.telegram.ui.ActionBar.m1 m1Var3 = snVar.c9;
                if (m1Var3 != null) {
                    m1Var3.dismiss();
                    break;
                }
                break;
            case 11:
                snVar.Y.F0();
                break;
            case 12:
                org.telegram.ui.Components.xc.a0(snVar).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                break;
            case 13:
                sn.g0(snVar);
                break;
            case 14:
                snVar.j8(false, true, 0.0f);
                break;
            case 15:
                snVar.finishFragment();
                break;
            case 16:
                snVar.j8(false, true, 0.0f);
                break;
            case 17:
                snVar.V6();
                break;
            case 18:
                snVar.S5 = null;
                snVar.m8();
                break;
            case 19:
                snVar.S5 = null;
                snVar.m8();
                break;
            case 20:
                snVar.j8(false, true, 0.0f);
                break;
            case 21:
                jk jkVar = snVar.F8;
                if (jkVar != null && jkVar.getParent() != null) {
                    snVar.x0.g1();
                    snVar.H8.setDrawingReady(false);
                    snVar.F8.setTag(null);
                    snVar.j1.removeView(snVar.F8);
                    break;
                }
                break;
            case 22:
                snVar.O4 = null;
                snVar.t9();
                snVar.w9();
                break;
            case 23:
                org.telegram.ui.ActionBar.e1[] e1VarArr = snVar.e9;
                if (e1VarArr != null && e1VarArr.length > 0 && (e1Var = e1VarArr[0]) != null) {
                    e1Var.requestFocus();
                    snVar.e9[0].performAccessibilityAction(64, null);
                    snVar.e9[0].sendAccessibilityEvent(8);
                    break;
                }
                break;
            case 24:
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(snVar.getParentActivity(), 3, snVar.qa);
                snVar.Cb = c2Var;
                c2Var.setOnShowListener(new hf(snVar, 1));
                snVar.Cb.setOnCancelListener(snVar.ya);
                snVar.Cb.r(500L);
                break;
            case 25:
                snVar.A9 = false;
                snVar.j9(true);
                break;
            case 26:
                snVar.C7 = null;
                org.telegram.ui.Components.s60 s60Var = snVar.n3;
                if (s60Var != null) {
                    org.telegram.ui.Components.p60 cameraContainer = s60Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.p60, Float>) View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.p60, Float>) View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.p60, Float>) property, 0.0f), ObjectAnimator.ofFloat(snVar.n3.getButtonsLayout(), (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(snVar.n3.getPaint(), org.telegram.ui.Components.t6.b, 0), ObjectAnimator.ofFloat(snVar.n3.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                    animatorSet.addListener(new oi(snVar, i12));
                    animatorSet.start();
                    break;
                }
                break;
            case 27:
                if (snVar.getParentActivity() != null && snVar.fragmentView != null && (gkVar = snVar.Y) != null && (sendButton = gkVar.getSendButton()) != null && snVar.Y.getEditField() != null && snVar.Y.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (snVar.s2 == null) {
                        aj ajVar = new aj(4, 0, snVar.getParentActivity(), snVar.qa, false);
                        snVar.s2 = ajVar;
                        ajVar.a();
                        snVar.s2.setAlpha(0.0f);
                        snVar.s2.setVisibility(4);
                        snVar.s2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        snVar.j1.addView(snVar.s2, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    snVar.s2.f(sendButton, true);
                    snVar.t2 = true;
                    break;
                }
                break;
            case 28:
                snVar.A0.M.clear();
                em emVar = snVar.A0;
                emVar.L = false;
                emVar.O(true);
                snVar.Vb(false);
                break;
            default:
                if (snVar.getParentActivity() != null && snVar.fragmentView != null && snVar.Y != null && snVar.Ra == null && snVar.getMessagesController().getSendPaidMessagesStars(snVar.a()) <= 0 && (sendButton2 = snVar.Y.getSendButton()) != null && snVar.Y.getEditField() != null && snVar.Y.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (snVar.u2 == null) {
                        org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(4, snVar.getParentActivity(), snVar.qa, false);
                        snVar.u2 = r40Var;
                        r40Var.a();
                        snVar.u2.setAlpha(0.0f);
                        snVar.u2.setVisibility(4);
                        snVar.u2.setText(LocaleController.getString(R.string.ScheduledHint));
                        snVar.j1.addView(snVar.u2, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    snVar.u2.f(sendButton2, true);
                    snVar.v2 = true;
                    break;
                }
                break;
        }
    }
}
