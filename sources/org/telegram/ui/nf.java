package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ nf(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.g1 g1Var;
        lk lkVar;
        View sendButton;
        View sendButton2;
        switch (this.a) {
            case 0:
                this.b.A7(true);
                break;
            case 1:
                this.b.A7(true);
                break;
            case 2:
                zn znVar = this.b;
                znVar.A7(false);
                eg.o1 o1Var = new eg.o1((org.telegram.ui.ActionBar.p2) znVar, 24, true);
                o1Var.setDimBehind(false);
                o1Var.setOnHideListener(new fg(znVar, 1));
                o1Var.show();
                break;
            case 3:
                zn.P0(this.b);
                break;
            case 4:
                zn.m0(this.b);
                break;
            case 5:
                zn znVar2 = this.b;
                if (znVar2.getUserConfig().isPremium()) {
                    znVar2.Jb = null;
                    znVar2.Qc(true);
                    org.telegram.ui.Components.qc.a0(znVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                    znVar2.getMessagesController().disableAds(true);
                    break;
                } else {
                    znVar2.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) znVar2, 3, true));
                    break;
                }
            case 6:
                lk lkVar2 = this.b.V;
                if (lkVar2 != null) {
                    lkVar2.q0(true);
                    break;
                }
                break;
            case 7:
                AndroidUtilities.removeFromParent(this.b.H0);
                break;
            case 8:
                this.b.V.H0();
                break;
            case 9:
                zn znVar3 = this.b;
                znVar3.na = null;
                znVar3.ma = -1;
                View view = znVar3.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    break;
                }
                break;
            case 10:
                zn znVar4 = this.b;
                ArrayList arrayList = znVar4.r6;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i10);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                znVar4.i6 = 0;
                znVar4.getMessagesController().markMentionsAsRead(znVar4.Q5, znVar4.d());
                znVar4.j6 = true;
                znVar4.Kb(false);
                org.telegram.ui.ActionBar.p1 p1Var = znVar4.N8;
                if (p1Var != null) {
                    p1Var.dismiss();
                    break;
                }
                break;
            case 11:
                zn znVar5 = this.b;
                ArrayList arrayList2 = znVar5.r6;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    ((MessageObject) arrayList2.get(i11)).markReactionsAsRead();
                }
                znVar5.i1 = 0;
                znVar5.Bc(true);
                znVar5.getMessagesController().markReactionsAsRead(znVar5.Q5, znVar5.d());
                org.telegram.ui.ActionBar.p1 p1Var2 = znVar5.N8;
                if (p1Var2 != null) {
                    p1Var2.dismiss();
                    break;
                }
                break;
            case 12:
                zn znVar6 = this.b;
                ArrayList arrayList3 = znVar6.r6;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    ((MessageObject) arrayList3.get(i12)).markPollVotesAsRead();
                }
                znVar6.j1 = 0;
                znVar6.Ac(true);
                znVar6.getMessagesController().markPollVotesAsRead(znVar6.Q5, znVar6.d());
                org.telegram.ui.ActionBar.p1 p1Var3 = znVar6.N8;
                if (p1Var3 != null) {
                    p1Var3.dismiss();
                    break;
                }
                break;
            case 13:
                zn.n1(this.b);
                break;
            case 14:
                org.telegram.ui.Components.qc.a0(this.b).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                break;
            case 15:
                this.b.hc(false);
                break;
            case 16:
                zn znVar7 = this.b;
                znVar7.D5 = null;
                znVar7.j8();
                break;
            case 17:
                zn znVar8 = this.b;
                znVar8.D5 = null;
                znVar8.j8();
                break;
            case 18:
                this.b.S6();
                break;
            case 19:
                this.b.finishFragment();
                break;
            case 20:
                this.b.g8(false, true, 0.0f);
                break;
            case 21:
                AndroidUtilities.removeFromParent(this.b.I0);
                break;
            case 22:
                zn znVar9 = this.b;
                znVar9.z4 = null;
                znVar9.o9();
                znVar9.r9();
                break;
            case 23:
                zn znVar10 = this.b;
                pk pkVar = znVar10.q8;
                if (pkVar != null && pkVar.getParent() != null) {
                    znVar10.u0.e1();
                    znVar10.s8.setDrawingReady(false);
                    znVar10.q8.setTag(null);
                    znVar10.U0.removeView(znVar10.q8);
                    break;
                }
                break;
            case 24:
                zn znVar11 = this.b;
                znVar11.l9 = false;
                znVar11.e9(true);
                break;
            case 25:
                zn znVar12 = this.b;
                org.telegram.ui.ActionBar.g1[] g1VarArr = znVar12.P8;
                if (g1VarArr != null && g1VarArr.length > 0 && (g1Var = g1VarArr[0]) != null) {
                    g1Var.requestFocus();
                    znVar12.P8[0].performAccessibilityAction(64, null);
                    znVar12.P8[0].sendAccessibilityEvent(8);
                    break;
                }
                break;
            case 26:
                zn znVar13 = this.b;
                if (znVar13.getParentActivity() != null && znVar13.fragmentView != null && (lkVar = znVar13.V) != null && (sendButton = lkVar.getSendButton()) != null && znVar13.V.getEditField() != null && znVar13.V.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (znVar13.d2 == null) {
                        gj gjVar = new gj(4, 0, znVar13.getParentActivity(), znVar13.ba, false);
                        znVar13.d2 = gjVar;
                        gjVar.a();
                        znVar13.d2.setAlpha(0.0f);
                        znVar13.d2.setVisibility(4);
                        znVar13.d2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        znVar13.U0.addView(znVar13.d2, k7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    znVar13.d2.f(sendButton, true);
                    znVar13.e2 = true;
                    break;
                }
                break;
            case 27:
                zn znVar14 = this.b;
                if (znVar14.getParentActivity() != null && znVar14.fragmentView != null && znVar14.V != null && znVar14.Ba == null && znVar14.getMessagesController().getSendPaidMessagesStars(znVar14.a()) <= 0 && (sendButton2 = znVar14.V.getSendButton()) != null && znVar14.V.getEditField() != null && znVar14.V.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (znVar14.f2 == null) {
                        org.telegram.ui.Components.l40 l40Var = new org.telegram.ui.Components.l40(4, znVar14.getParentActivity(), znVar14.ba, false);
                        znVar14.f2 = l40Var;
                        l40Var.a();
                        znVar14.f2.setAlpha(0.0f);
                        znVar14.f2.setVisibility(4);
                        znVar14.f2.setText(LocaleController.getString(R.string.ScheduledHint));
                        znVar14.U0.addView(znVar14.f2, k7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    znVar14.f2.f(sendButton2, true);
                    znVar14.g2 = true;
                    break;
                }
                break;
            case 28:
                this.b.g8(false, true, 0.0f);
                break;
            default:
                zn znVar15 = this.b;
                znVar15.x0.J.clear();
                lm lmVar = znVar15.x0;
                lmVar.I = false;
                lmVar.O(true);
                znVar15.Pb(false);
                break;
        }
    }
}
