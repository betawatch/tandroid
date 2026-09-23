package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class pf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ pf(xn xnVar, int i10) {
        this.a = i10;
        this.b = xnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.f1 f1Var;
        jk jkVar;
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
                xn xnVar = this.b;
                xnVar.A7(false);
                rg.x0 x0Var = new rg.x0((org.telegram.ui.ActionBar.n2) xnVar, 24, true);
                x0Var.setDimBehind(false);
                x0Var.setOnHideListener(new hg(xnVar, 1));
                x0Var.show();
                break;
            case 3:
                xn.P0(this.b);
                break;
            case 4:
                xn.n0(this.b);
                break;
            case 5:
                xn xnVar2 = this.b;
                if (xnVar2.getUserConfig().isPremium()) {
                    xnVar2.Lb = null;
                    xnVar2.Qc(true);
                    org.telegram.ui.Components.xc.a0(xnVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                    xnVar2.getMessagesController().disableAds(true);
                    break;
                } else {
                    xnVar2.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) xnVar2, 3, true));
                    break;
                }
            case 6:
                jk jkVar2 = this.b.Y;
                if (jkVar2 != null) {
                    jkVar2.r0(true);
                    break;
                }
                break;
            case 7:
                AndroidUtilities.removeFromParent(this.b.K0);
                break;
            case 8:
                this.b.Y.I0();
                break;
            case 9:
                xn xnVar3 = this.b;
                xnVar3.qa = null;
                xnVar3.pa = -1;
                View view = xnVar3.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    break;
                }
                break;
            case 10:
                xn xnVar4 = this.b;
                ArrayList arrayList = xnVar4.u6;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i10);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                xnVar4.l6 = 0;
                xnVar4.getMessagesController().markMentionsAsRead(xnVar4.T5, xnVar4.d());
                xnVar4.m6 = true;
                xnVar4.Kb(false);
                org.telegram.ui.ActionBar.n1 n1Var = xnVar4.Q8;
                if (n1Var != null) {
                    n1Var.dismiss();
                    break;
                }
                break;
            case 11:
                xn xnVar5 = this.b;
                ArrayList arrayList2 = xnVar5.u6;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    ((MessageObject) arrayList2.get(i11)).markReactionsAsRead();
                }
                xnVar5.l1 = 0;
                xnVar5.Bc(true);
                xnVar5.getMessagesController().markReactionsAsRead(xnVar5.T5, xnVar5.d());
                org.telegram.ui.ActionBar.n1 n1Var2 = xnVar5.Q8;
                if (n1Var2 != null) {
                    n1Var2.dismiss();
                    break;
                }
                break;
            case 12:
                xn xnVar6 = this.b;
                ArrayList arrayList3 = xnVar6.u6;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    ((MessageObject) arrayList3.get(i12)).markPollVotesAsRead();
                }
                xnVar6.m1 = 0;
                xnVar6.Ac(true);
                xnVar6.getMessagesController().markPollVotesAsRead(xnVar6.T5, xnVar6.d());
                org.telegram.ui.ActionBar.n1 n1Var3 = xnVar6.Q8;
                if (n1Var3 != null) {
                    n1Var3.dismiss();
                    break;
                }
                break;
            case 13:
                xn.n1(this.b);
                break;
            case 14:
                org.telegram.ui.Components.xc.a0(this.b).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                break;
            case 15:
                this.b.hc(false);
                break;
            case 16:
                xn xnVar7 = this.b;
                xnVar7.G5 = null;
                xnVar7.j8();
                break;
            case 17:
                xn xnVar8 = this.b;
                xnVar8.G5 = null;
                xnVar8.j8();
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
                AndroidUtilities.removeFromParent(this.b.L0);
                break;
            case 22:
                xn xnVar9 = this.b;
                xnVar9.C4 = null;
                xnVar9.o9();
                xnVar9.r9();
                break;
            case 23:
                xn xnVar10 = this.b;
                nk nkVar = xnVar10.t8;
                if (nkVar != null && nkVar.getParent() != null) {
                    xnVar10.x0.f1();
                    xnVar10.v8.setDrawingReady(false);
                    xnVar10.t8.setTag(null);
                    xnVar10.X0.removeView(xnVar10.t8);
                    break;
                }
                break;
            case 24:
                xn xnVar11 = this.b;
                xnVar11.o9 = false;
                xnVar11.e9(true);
                break;
            case 25:
                xn xnVar12 = this.b;
                org.telegram.ui.ActionBar.f1[] f1VarArr = xnVar12.S8;
                if (f1VarArr != null && f1VarArr.length > 0 && (f1Var = f1VarArr[0]) != null) {
                    f1Var.requestFocus();
                    xnVar12.S8[0].performAccessibilityAction(64, null);
                    xnVar12.S8[0].sendAccessibilityEvent(8);
                    break;
                }
                break;
            case 26:
                xn xnVar13 = this.b;
                if (xnVar13.getParentActivity() != null && xnVar13.fragmentView != null && (jkVar = xnVar13.Y) != null && (sendButton = jkVar.getSendButton()) != null && xnVar13.Y.getEditField() != null && xnVar13.Y.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (xnVar13.g2 == null) {
                        fj fjVar = new fj(4, 0, xnVar13.getParentActivity(), xnVar13.ea, false);
                        xnVar13.g2 = fjVar;
                        fjVar.a();
                        xnVar13.g2.setAlpha(0.0f);
                        xnVar13.g2.setVisibility(4);
                        xnVar13.g2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        xnVar13.X0.addView(xnVar13.g2, w7.x5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    xnVar13.g2.f(sendButton, true);
                    xnVar13.h2 = true;
                    break;
                }
                break;
            case 27:
                xn xnVar14 = this.b;
                if (xnVar14.getParentActivity() != null && xnVar14.fragmentView != null && xnVar14.Y != null && xnVar14.Ea == null && xnVar14.getMessagesController().getSendPaidMessagesStars(xnVar14.a()) <= 0 && (sendButton2 = xnVar14.Y.getSendButton()) != null && xnVar14.Y.getEditField() != null && xnVar14.Y.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (xnVar14.i2 == null) {
                        org.telegram.ui.Components.j40 j40Var = new org.telegram.ui.Components.j40(4, xnVar14.getParentActivity(), xnVar14.ea, false);
                        xnVar14.i2 = j40Var;
                        j40Var.a();
                        xnVar14.i2.setAlpha(0.0f);
                        xnVar14.i2.setVisibility(4);
                        xnVar14.i2.setText(LocaleController.getString(R.string.ScheduledHint));
                        xnVar14.X0.addView(xnVar14.i2, w7.x5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    xnVar14.i2.f(sendButton2, true);
                    xnVar14.j2 = true;
                    break;
                }
                break;
            case 28:
                this.b.g8(false, true, 0.0f);
                break;
            default:
                xn xnVar15 = this.b;
                xnVar15.A0.M.clear();
                km kmVar = xnVar15.A0;
                kmVar.L = false;
                kmVar.O(true);
                xnVar15.Pb(false);
                break;
        }
    }
}
