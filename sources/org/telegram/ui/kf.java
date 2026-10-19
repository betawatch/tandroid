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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class kf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ kf(qn qnVar, int i10) {
        this.a = i10;
        this.b = qnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.e1 e1Var;
        fk fkVar;
        View sendButton;
        View sendButton2;
        int i10 = this.a;
        int i11 = 2;
        int i12 = 0;
        qn qnVar = this.b;
        switch (i10) {
            case 0:
                qnVar.D7(true);
                break;
            case 1:
                qnVar.D7(true);
                break;
            case 2:
                qnVar.D7(false);
                sg.y0 y0Var = new sg.y0((org.telegram.ui.ActionBar.n2) qnVar, 24, true);
                y0Var.setDimBehind(false);
                y0Var.setOnHideListener(new oe(qnVar, i11));
                y0Var.show();
                break;
            case 3:
                qn.U(qnVar);
                break;
            case 4:
                qn.f0(qnVar);
                break;
            case 5:
                if (qnVar.getUserConfig().isPremium()) {
                    qnVar.Mb = null;
                    qnVar.Uc(true);
                    org.telegram.ui.Components.xc.a0(qnVar).c(LocaleController.getString(R.string.AdHidden)).j();
                    qnVar.getMessagesController().disableAds(true);
                    break;
                } else {
                    qnVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) qnVar, 3, true));
                    break;
                }
            case 6:
                fk fkVar2 = qnVar.Y;
                if (fkVar2 != null) {
                    fkVar2.o0(true);
                    break;
                }
                break;
            case 7:
                qnVar.qa = null;
                qnVar.pa = -1;
                View view = qnVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    break;
                }
                break;
            case 8:
                ArrayList arrayList = qnVar.u6;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i13);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                qnVar.l6 = 0;
                qnVar.getMessagesController().markMentionsAsRead(qnVar.T5, qnVar.d());
                qnVar.m6 = true;
                qnVar.Ob(false);
                org.telegram.ui.ActionBar.m1 m1Var = qnVar.Q8;
                if (m1Var != null) {
                    m1Var.dismiss();
                    break;
                }
                break;
            case 9:
                ArrayList arrayList2 = qnVar.u6;
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    ((MessageObject) arrayList2.get(i14)).markReactionsAsRead();
                }
                qnVar.l1 = 0;
                qnVar.Fc(true);
                qnVar.getMessagesController().markReactionsAsRead(qnVar.T5, qnVar.d());
                org.telegram.ui.ActionBar.m1 m1Var2 = qnVar.Q8;
                if (m1Var2 != null) {
                    m1Var2.dismiss();
                    break;
                }
                break;
            case 10:
                ArrayList arrayList3 = qnVar.u6;
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    ((MessageObject) arrayList3.get(i15)).markPollVotesAsRead();
                }
                qnVar.m1 = 0;
                qnVar.Ec(true);
                qnVar.getMessagesController().markPollVotesAsRead(qnVar.T5, qnVar.d());
                org.telegram.ui.ActionBar.m1 m1Var3 = qnVar.Q8;
                if (m1Var3 != null) {
                    m1Var3.dismiss();
                    break;
                }
                break;
            case 11:
                qnVar.Y.F0();
                break;
            case 12:
                qn.g0(qnVar);
                break;
            case 13:
                qnVar.j8(false, true, 0.0f);
                break;
            case 14:
                org.telegram.ui.Components.xc.a0(qnVar).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                break;
            case 15:
                qnVar.j8(false, true, 0.0f);
                break;
            case 16:
                qnVar.G5 = null;
                qnVar.m8();
                break;
            case 17:
                qnVar.G5 = null;
                qnVar.m8();
                break;
            case 18:
                qnVar.finishFragment();
                break;
            case 19:
                qnVar.j8(false, true, 0.0f);
                break;
            case 20:
                qnVar.C4 = null;
                qnVar.t9();
                qnVar.w9();
                break;
            case 21:
                qnVar.V6();
                break;
            case 22:
                org.telegram.ui.ActionBar.e1[] e1VarArr = qnVar.S8;
                if (e1VarArr != null && e1VarArr.length > 0 && (e1Var = e1VarArr[0]) != null) {
                    e1Var.requestFocus();
                    qnVar.S8[0].performAccessibilityAction(64, null);
                    qnVar.S8[0].sendAccessibilityEvent(8);
                    break;
                }
                break;
            case 23:
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(qnVar.getParentActivity(), 3, qnVar.ea);
                qnVar.pb = b2Var;
                b2Var.setOnShowListener(new hf(qnVar, 1));
                qnVar.pb.setOnCancelListener(qnVar.ma);
                qnVar.pb.r(500L);
                break;
            case 24:
                ik ikVar = qnVar.t8;
                if (ikVar != null && ikVar.getParent() != null) {
                    qnVar.x0.f1();
                    qnVar.v8.setDrawingReady(false);
                    qnVar.t8.setTag(null);
                    qnVar.X0.removeView(qnVar.t8);
                    break;
                }
                break;
            case 25:
                qnVar.o9 = false;
                qnVar.j9(true);
                break;
            case 26:
                qnVar.q7 = null;
                org.telegram.ui.Components.r60 r60Var = qnVar.b3;
                if (r60Var != null) {
                    org.telegram.ui.Components.o60 cameraContainer = r60Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.o60, Float>) View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.o60, Float>) View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.o60, Float>) property, 0.0f), ObjectAnimator.ofFloat(qnVar.b3.getButtonsLayout(), (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(qnVar.b3.getPaint(), org.telegram.ui.Components.t6.b, 0), ObjectAnimator.ofFloat(qnVar.b3.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                    animatorSet.addListener(new oi(qnVar, i12));
                    animatorSet.start();
                    break;
                }
                break;
            case 27:
                if (qnVar.getParentActivity() != null && qnVar.fragmentView != null && (fkVar = qnVar.Y) != null && (sendButton = fkVar.getSendButton()) != null && qnVar.Y.getEditField() != null && qnVar.Y.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (qnVar.g2 == null) {
                        aj ajVar = new aj(4, 0, qnVar.getParentActivity(), qnVar.ea, false);
                        qnVar.g2 = ajVar;
                        ajVar.a();
                        qnVar.g2.setAlpha(0.0f);
                        qnVar.g2.setVisibility(4);
                        qnVar.g2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        qnVar.X0.addView(qnVar.g2, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    qnVar.g2.f(sendButton, true);
                    qnVar.h2 = true;
                    break;
                }
                break;
            case 28:
                qnVar.A0.M.clear();
                dm dmVar = qnVar.A0;
                dmVar.L = false;
                dmVar.O(true);
                qnVar.Tb(false);
                break;
            default:
                if (qnVar.getParentActivity() != null && qnVar.fragmentView != null && qnVar.Y != null && qnVar.Fa == null && qnVar.getMessagesController().getSendPaidMessagesStars(qnVar.a()) <= 0 && (sendButton2 = qnVar.Y.getSendButton()) != null && qnVar.Y.getEditField() != null && qnVar.Y.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (qnVar.i2 == null) {
                        org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(4, qnVar.getParentActivity(), qnVar.ea, false);
                        qnVar.i2 = r40Var;
                        r40Var.a();
                        qnVar.i2.setAlpha(0.0f);
                        qnVar.i2.setVisibility(4);
                        qnVar.i2.setText(LocaleController.getString(R.string.ScheduledHint));
                        qnVar.X0.addView(qnVar.i2, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    qnVar.i2.f(sendButton2, true);
                    qnVar.j2 = true;
                    break;
                }
                break;
        }
    }
}
