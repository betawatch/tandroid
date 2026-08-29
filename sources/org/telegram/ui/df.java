package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class df implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;

    public /* synthetic */ df(tn tnVar, int i10) {
        this.a = i10;
        this.b = tnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.g1 g1Var;
        dk dkVar;
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
                tn tnVar = this.b;
                tnVar.A7(false);
                cg.p1 p1Var = new cg.p1((org.telegram.ui.ActionBar.o2) tnVar, 24, true);
                p1Var.setDimBehind(false);
                p1Var.setOnHideListener(new xf(tnVar, 1));
                p1Var.show();
                break;
            case 3:
                tn.P0(this.b);
                break;
            case 4:
                tn.m0(this.b);
                break;
            case 5:
                tn tnVar2 = this.b;
                if (tnVar2.getUserConfig().isPremium()) {
                    tnVar2.Ib = null;
                    tnVar2.Qc(true);
                    org.telegram.ui.Components.tc.a0(tnVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                    tnVar2.getMessagesController().disableAds(true);
                    break;
                } else {
                    tnVar2.showDialog(new cg.p1((org.telegram.ui.ActionBar.o2) tnVar2, 3, true));
                    break;
                }
            case 6:
                dk dkVar2 = this.b.U;
                if (dkVar2 != null) {
                    dkVar2.q0(true);
                    break;
                }
                break;
            case 7:
                AndroidUtilities.removeFromParent(this.b.G0);
                break;
            case 8:
                this.b.U.H0();
                break;
            case 9:
                tn tnVar3 = this.b;
                tnVar3.ma = null;
                tnVar3.la = -1;
                View view = tnVar3.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    break;
                }
                break;
            case 10:
                tn tnVar4 = this.b;
                ArrayList arrayList = tnVar4.q6;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i10);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                tnVar4.h6 = 0;
                tnVar4.getMessagesController().markMentionsAsRead(tnVar4.P5, tnVar4.b());
                tnVar4.i6 = true;
                tnVar4.Kb(false);
                org.telegram.ui.ActionBar.o1 o1Var = tnVar4.M8;
                if (o1Var != null) {
                    o1Var.dismiss();
                    break;
                }
                break;
            case 11:
                tn tnVar5 = this.b;
                ArrayList arrayList2 = tnVar5.q6;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    ((MessageObject) arrayList2.get(i11)).markReactionsAsRead();
                }
                tnVar5.h1 = 0;
                tnVar5.Bc(true);
                tnVar5.getMessagesController().markReactionsAsRead(tnVar5.P5, tnVar5.b());
                org.telegram.ui.ActionBar.o1 o1Var2 = tnVar5.M8;
                if (o1Var2 != null) {
                    o1Var2.dismiss();
                    break;
                }
                break;
            case 12:
                tn tnVar6 = this.b;
                ArrayList arrayList3 = tnVar6.q6;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    ((MessageObject) arrayList3.get(i12)).markPollVotesAsRead();
                }
                tnVar6.i1 = 0;
                tnVar6.Ac(true);
                tnVar6.getMessagesController().markPollVotesAsRead(tnVar6.P5, tnVar6.b());
                org.telegram.ui.ActionBar.o1 o1Var3 = tnVar6.M8;
                if (o1Var3 != null) {
                    o1Var3.dismiss();
                    break;
                }
                break;
            case 13:
                tn.n1(this.b);
                break;
            case 14:
                org.telegram.ui.Components.tc.a0(this.b).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                break;
            case 15:
                this.b.hc(false);
                break;
            case 16:
                tn tnVar7 = this.b;
                tnVar7.C5 = null;
                tnVar7.j8();
                break;
            case 17:
                tn tnVar8 = this.b;
                tnVar8.C5 = null;
                tnVar8.j8();
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
                AndroidUtilities.removeFromParent(this.b.H0);
                break;
            case 22:
                tn tnVar9 = this.b;
                tnVar9.y4 = null;
                tnVar9.o9();
                tnVar9.r9();
                break;
            case 23:
                tn tnVar10 = this.b;
                hk hkVar = tnVar10.p8;
                if (hkVar != null && hkVar.getParent() != null) {
                    tnVar10.t0.f1();
                    tnVar10.r8.setDrawingReady(false);
                    tnVar10.p8.setTag(null);
                    tnVar10.T0.removeView(tnVar10.p8);
                    break;
                }
                break;
            case 24:
                tn tnVar11 = this.b;
                tnVar11.k9 = false;
                tnVar11.e9(true);
                break;
            case 25:
                tn tnVar12 = this.b;
                org.telegram.ui.ActionBar.g1[] g1VarArr = tnVar12.O8;
                if (g1VarArr != null && g1VarArr.length > 0 && (g1Var = g1VarArr[0]) != null) {
                    g1Var.requestFocus();
                    tnVar12.O8[0].performAccessibilityAction(64, null);
                    tnVar12.O8[0].sendAccessibilityEvent(8);
                    break;
                }
                break;
            case 26:
                tn tnVar13 = this.b;
                if (tnVar13.getParentActivity() != null && tnVar13.fragmentView != null && (dkVar = tnVar13.U) != null && (sendButton = dkVar.getSendButton()) != null && tnVar13.U.getEditField() != null && tnVar13.U.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (tnVar13.c2 == null) {
                        zi ziVar = new zi(4, 0, tnVar13.getParentActivity(), tnVar13.aa, false);
                        tnVar13.c2 = ziVar;
                        ziVar.a();
                        tnVar13.c2.setAlpha(0.0f);
                        tnVar13.c2.setVisibility(4);
                        tnVar13.c2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        tnVar13.T0.addView(tnVar13.c2, i7.f6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    tnVar13.c2.f(sendButton, true);
                    tnVar13.d2 = true;
                    break;
                }
                break;
            case 27:
                tn tnVar14 = this.b;
                if (tnVar14.getParentActivity() != null && tnVar14.fragmentView != null && tnVar14.U != null && tnVar14.Aa == null && tnVar14.getMessagesController().getSendPaidMessagesStars(tnVar14.a()) <= 0 && (sendButton2 = tnVar14.U.getSendButton()) != null && tnVar14.U.getEditField() != null && tnVar14.U.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (tnVar14.e2 == null) {
                        org.telegram.ui.Components.g40 g40Var = new org.telegram.ui.Components.g40(4, tnVar14.getParentActivity(), tnVar14.aa, false);
                        tnVar14.e2 = g40Var;
                        g40Var.a();
                        tnVar14.e2.setAlpha(0.0f);
                        tnVar14.e2.setVisibility(4);
                        tnVar14.e2.setText(LocaleController.getString(R.string.ScheduledHint));
                        tnVar14.T0.addView(tnVar14.e2, i7.f6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    tnVar14.e2.f(sendButton2, true);
                    tnVar14.f2 = true;
                    break;
                }
                break;
            case 28:
                this.b.g8(false, true, 0.0f);
                break;
            default:
                tn tnVar15 = this.b;
                tnVar15.w0.I.clear();
                em emVar = tnVar15.w0;
                emVar.H = false;
                emVar.O(true);
                tnVar15.Pb(false);
                break;
        }
    }
}
