package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;

    public /* synthetic */ gf(rn rnVar, int i10) {
        this.a = i10;
        this.b = rnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.f1 f1Var;
        ck ckVar;
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
                rn rnVar = this.b;
                rnVar.A7(false);
                ag.g2 g2Var = new ag.g2((org.telegram.ui.ActionBar.n2) rnVar, 24, true);
                g2Var.setDimBehind(false);
                g2Var.setOnHideListener(new ag(rnVar, 1));
                g2Var.show();
                break;
            case 3:
                rn.P0(this.b);
                break;
            case 4:
                rn.m0(this.b);
                break;
            case 5:
                rn rnVar2 = this.b;
                if (rnVar2.getUserConfig().isPremium()) {
                    rnVar2.Ib = null;
                    rnVar2.Qc(true);
                    org.telegram.ui.Components.mc.a0(rnVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                    rnVar2.getMessagesController().disableAds(true);
                    break;
                } else {
                    rnVar2.showDialog(new ag.g2((org.telegram.ui.ActionBar.n2) rnVar2, 3, true));
                    break;
                }
            case 6:
                ck ckVar2 = this.b.U;
                if (ckVar2 != null) {
                    ckVar2.q0(true);
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
                rn rnVar3 = this.b;
                rnVar3.ma = null;
                rnVar3.la = -1;
                View view = rnVar3.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    break;
                }
                break;
            case 10:
                rn rnVar4 = this.b;
                ArrayList arrayList = rnVar4.q6;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i10);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                rnVar4.h6 = 0;
                rnVar4.getMessagesController().markMentionsAsRead(rnVar4.P5, rnVar4.b());
                rnVar4.i6 = true;
                rnVar4.Kb(false);
                org.telegram.ui.ActionBar.n1 n1Var = rnVar4.M8;
                if (n1Var != null) {
                    n1Var.dismiss();
                    break;
                }
                break;
            case 11:
                rn rnVar5 = this.b;
                ArrayList arrayList2 = rnVar5.q6;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    ((MessageObject) arrayList2.get(i11)).markReactionsAsRead();
                }
                rnVar5.h1 = 0;
                rnVar5.Bc(true);
                rnVar5.getMessagesController().markReactionsAsRead(rnVar5.P5, rnVar5.b());
                org.telegram.ui.ActionBar.n1 n1Var2 = rnVar5.M8;
                if (n1Var2 != null) {
                    n1Var2.dismiss();
                    break;
                }
                break;
            case 12:
                rn rnVar6 = this.b;
                ArrayList arrayList3 = rnVar6.q6;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    ((MessageObject) arrayList3.get(i12)).markPollVotesAsRead();
                }
                rnVar6.i1 = 0;
                rnVar6.Ac(true);
                rnVar6.getMessagesController().markPollVotesAsRead(rnVar6.P5, rnVar6.b());
                org.telegram.ui.ActionBar.n1 n1Var3 = rnVar6.M8;
                if (n1Var3 != null) {
                    n1Var3.dismiss();
                    break;
                }
                break;
            case 13:
                rn.n1(this.b);
                break;
            case 14:
                org.telegram.ui.Components.mc.a0(this.b).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                break;
            case 15:
                this.b.hc(false);
                break;
            case 16:
                rn rnVar7 = this.b;
                rnVar7.C5 = null;
                rnVar7.j8();
                break;
            case 17:
                rn rnVar8 = this.b;
                rnVar8.C5 = null;
                rnVar8.j8();
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
                rn rnVar9 = this.b;
                rnVar9.y4 = null;
                rnVar9.o9();
                rnVar9.r9();
                break;
            case 23:
                rn rnVar10 = this.b;
                gk gkVar = rnVar10.p8;
                if (gkVar != null && gkVar.getParent() != null) {
                    rnVar10.t0.f1();
                    rnVar10.r8.setDrawingReady(false);
                    rnVar10.p8.setTag(null);
                    rnVar10.T0.removeView(rnVar10.p8);
                    break;
                }
                break;
            case 24:
                rn rnVar11 = this.b;
                rnVar11.k9 = false;
                rnVar11.e9(true);
                break;
            case 25:
                rn rnVar12 = this.b;
                org.telegram.ui.ActionBar.f1[] f1VarArr = rnVar12.O8;
                if (f1VarArr != null && f1VarArr.length > 0 && (f1Var = f1VarArr[0]) != null) {
                    f1Var.requestFocus();
                    rnVar12.O8[0].performAccessibilityAction(64, null);
                    rnVar12.O8[0].sendAccessibilityEvent(8);
                    break;
                }
                break;
            case 26:
                rn rnVar13 = this.b;
                if (rnVar13.getParentActivity() != null && rnVar13.fragmentView != null && (ckVar = rnVar13.U) != null && (sendButton = ckVar.getSendButton()) != null && rnVar13.U.getEditField() != null && rnVar13.U.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (rnVar13.c2 == null) {
                        yi yiVar = new yi(4, 0, rnVar13.getParentActivity(), rnVar13.aa, false);
                        rnVar13.c2 = yiVar;
                        yiVar.a();
                        rnVar13.c2.setAlpha(0.0f);
                        rnVar13.c2.setVisibility(4);
                        rnVar13.c2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        rnVar13.T0.addView(rnVar13.c2, h7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    rnVar13.c2.f(sendButton, true);
                    rnVar13.d2 = true;
                    break;
                }
                break;
            case 27:
                rn rnVar14 = this.b;
                if (rnVar14.getParentActivity() != null && rnVar14.fragmentView != null && rnVar14.U != null && rnVar14.Aa == null && rnVar14.getMessagesController().getSendPaidMessagesStars(rnVar14.a()) <= 0 && (sendButton2 = rnVar14.U.getSendButton()) != null && rnVar14.U.getEditField() != null && rnVar14.U.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (rnVar14.e2 == null) {
                        org.telegram.ui.Components.x30 x30Var = new org.telegram.ui.Components.x30(4, rnVar14.getParentActivity(), rnVar14.aa, false);
                        rnVar14.e2 = x30Var;
                        x30Var.a();
                        rnVar14.e2.setAlpha(0.0f);
                        rnVar14.e2.setVisibility(4);
                        rnVar14.e2.setText(LocaleController.getString(R.string.ScheduledHint));
                        rnVar14.T0.addView(rnVar14.e2, h7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    rnVar14.e2.f(sendButton2, true);
                    rnVar14.f2 = true;
                    break;
                }
                break;
            case 28:
                this.b.g8(false, true, 0.0f);
                break;
            default:
                rn rnVar15 = this.b;
                rnVar15.w0.I.clear();
                dm dmVar = rnVar15.w0;
                dmVar.H = false;
                dmVar.O(true);
                rnVar15.Pb(false);
                break;
        }
    }
}
