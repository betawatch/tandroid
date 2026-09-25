package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class of implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ of(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jk jkVar;
        View sendButton;
        org.telegram.ui.ActionBar.e1 e1Var;
        int i10 = this.a;
        int i11 = 0;
        int i12 = 1;
        wn wnVar = this.b;
        switch (i10) {
            case 0:
                wnVar.A7(true);
                break;
            case 1:
                wnVar.A7(true);
                break;
            case 2:
                wnVar.A7(false);
                rg.x0 x0Var = new rg.x0((org.telegram.ui.ActionBar.m2) wnVar, 24, true);
                x0Var.setDimBehind(false);
                x0Var.setOnHideListener(new gg(wnVar, i12));
                x0Var.show();
                break;
            case 3:
                wn.L0(wnVar);
                break;
            case 4:
                wn.T0(wnVar);
                break;
            case 5:
                if (wnVar.getUserConfig().isPremium()) {
                    wnVar.Lb = null;
                    wnVar.Qc(true);
                    org.telegram.ui.Components.xc.a0(wnVar).c(LocaleController.getString(R.string.AdHidden)).j();
                    wnVar.getMessagesController().disableAds(true);
                    break;
                } else {
                    wnVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.m2) wnVar, 3, true));
                    break;
                }
            case 6:
                jk jkVar2 = wnVar.Y;
                if (jkVar2 != null) {
                    jkVar2.q0(true);
                    break;
                }
                break;
            case 7:
                wnVar.Y.H0();
                break;
            case 8:
                wnVar.qa = null;
                wnVar.pa = -1;
                View view = wnVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    break;
                }
                break;
            case 9:
                ArrayList arrayList = wnVar.u6;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i13);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                wnVar.l6 = 0;
                wnVar.getMessagesController().markMentionsAsRead(wnVar.T5, wnVar.d());
                wnVar.m6 = true;
                wnVar.Kb(false);
                org.telegram.ui.ActionBar.m1 m1Var = wnVar.Q8;
                if (m1Var != null) {
                    m1Var.dismiss();
                    break;
                }
                break;
            case 10:
                ArrayList arrayList2 = wnVar.u6;
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    ((MessageObject) arrayList2.get(i14)).markReactionsAsRead();
                }
                wnVar.l1 = 0;
                wnVar.Bc(true);
                wnVar.getMessagesController().markReactionsAsRead(wnVar.T5, wnVar.d());
                org.telegram.ui.ActionBar.m1 m1Var2 = wnVar.Q8;
                if (m1Var2 != null) {
                    m1Var2.dismiss();
                    break;
                }
                break;
            case 11:
                ArrayList arrayList3 = wnVar.u6;
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    ((MessageObject) arrayList3.get(i15)).markPollVotesAsRead();
                }
                wnVar.m1 = 0;
                wnVar.Ac(true);
                wnVar.getMessagesController().markPollVotesAsRead(wnVar.T5, wnVar.d());
                org.telegram.ui.ActionBar.m1 m1Var3 = wnVar.Q8;
                if (m1Var3 != null) {
                    m1Var3.dismiss();
                    break;
                }
                break;
            case 12:
                wn.q0(wnVar);
                break;
            case 13:
                org.telegram.ui.Components.xc.a0(wnVar).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                break;
            case 14:
                wnVar.g8(false, true, 0.0f);
                break;
            case 15:
                wnVar.hc(false);
                break;
            case 16:
                AndroidUtilities.removeFromParent(wnVar.L0);
                break;
            case 17:
                wnVar.C4 = null;
                wnVar.o9();
                wnVar.r9();
                break;
            case 18:
                wnVar.S6();
                break;
            case 19:
                wnVar.finishFragment();
                break;
            case 20:
                wnVar.o9 = false;
                wnVar.e9(true);
                break;
            case 21:
                nk nkVar = wnVar.t8;
                if (nkVar != null && nkVar.getParent() != null) {
                    wnVar.x0.f1();
                    wnVar.v8.setDrawingReady(false);
                    wnVar.t8.setTag(null);
                    wnVar.X0.removeView(wnVar.t8);
                    break;
                }
                break;
            case 22:
                wnVar.q7 = null;
                org.telegram.ui.Components.h60 h60Var = wnVar.b3;
                if (h60Var != null) {
                    org.telegram.ui.Components.e60 cameraContainer = h60Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.e60, Float>) View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.e60, Float>) View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.e60, Float>) property, 0.0f), ObjectAnimator.ofFloat(wnVar.b3.getButtonsLayout(), (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(wnVar.b3.getPaint(), org.telegram.ui.Components.s6.b, 0), ObjectAnimator.ofFloat(wnVar.b3.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                    animatorSet.addListener(new ui(wnVar, i11));
                    animatorSet.start();
                    break;
                }
                break;
            case 23:
                wnVar.G5 = null;
                wnVar.j8();
                break;
            case 24:
                wnVar.G5 = null;
                wnVar.j8();
                break;
            case 25:
                if (wnVar.getParentActivity() != null && wnVar.fragmentView != null && (jkVar = wnVar.Y) != null && (sendButton = jkVar.getSendButton()) != null && wnVar.Y.getEditField() != null && wnVar.Y.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (wnVar.g2 == null) {
                        fj fjVar = new fj(4, 0, wnVar.getParentActivity(), wnVar.ea, false);
                        wnVar.g2 = fjVar;
                        fjVar.a();
                        wnVar.g2.setAlpha(0.0f);
                        wnVar.g2.setVisibility(4);
                        wnVar.g2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        wnVar.X0.addView(wnVar.g2, w7.y5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    wnVar.g2.f(sendButton, true);
                    wnVar.h2 = true;
                    break;
                }
                break;
            case 26:
                org.telegram.ui.ActionBar.e1[] e1VarArr = wnVar.S8;
                if (e1VarArr != null && e1VarArr.length > 0 && (e1Var = e1VarArr[0]) != null) {
                    e1Var.requestFocus();
                    wnVar.S8[0].performAccessibilityAction(64, null);
                    wnVar.S8[0].sendAccessibilityEvent(8);
                    break;
                }
                break;
            case 27:
                wnVar.g8(false, true, 0.0f);
                break;
            case 28:
                wnVar.A0.M.clear();
                jm jmVar = wnVar.A0;
                jmVar.L = false;
                jmVar.O(true);
                wnVar.Pb(false);
                break;
            default:
                AndroidUtilities.removeFromParent(wnVar.J0);
                break;
        }
    }
}
