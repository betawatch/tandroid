package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ lf(xn xnVar, int i10) {
        this.a = i10;
        this.b = xnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.g1 g1Var;
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
                fg.n1 n1Var = new fg.n1((org.telegram.ui.ActionBar.p2) xnVar, 24, true);
                n1Var.setDimBehind(false);
                n1Var.setOnHideListener(new dg(xnVar, 1));
                n1Var.show();
                break;
            case 3:
                xn.P0(this.b);
                break;
            case 4:
                xn.m0(this.b);
                break;
            case 5:
                xn xnVar2 = this.b;
                if (xnVar2.getUserConfig().isPremium()) {
                    xnVar2.Jb = null;
                    xnVar2.Qc(true);
                    org.telegram.ui.Components.qc.a0(xnVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                    xnVar2.getMessagesController().disableAds(true);
                    break;
                } else {
                    xnVar2.showDialog(new fg.n1((org.telegram.ui.ActionBar.p2) xnVar2, 3, true));
                    break;
                }
            case 6:
                jk jkVar2 = this.b.V;
                if (jkVar2 != null) {
                    jkVar2.q0(true);
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
                xn xnVar3 = this.b;
                xnVar3.na = null;
                xnVar3.ma = -1;
                View view = xnVar3.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    break;
                }
                break;
            case 10:
                xn xnVar4 = this.b;
                ArrayList arrayList = xnVar4.r6;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i10);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                xnVar4.i6 = 0;
                xnVar4.getMessagesController().markMentionsAsRead(xnVar4.Q5, xnVar4.b());
                xnVar4.j6 = true;
                xnVar4.Kb(false);
                org.telegram.ui.ActionBar.p1 p1Var = xnVar4.N8;
                if (p1Var != null) {
                    p1Var.dismiss();
                    break;
                }
                break;
            case 11:
                xn xnVar5 = this.b;
                ArrayList arrayList2 = xnVar5.r6;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    ((MessageObject) arrayList2.get(i11)).markReactionsAsRead();
                }
                xnVar5.i1 = 0;
                xnVar5.Bc(true);
                xnVar5.getMessagesController().markReactionsAsRead(xnVar5.Q5, xnVar5.b());
                org.telegram.ui.ActionBar.p1 p1Var2 = xnVar5.N8;
                if (p1Var2 != null) {
                    p1Var2.dismiss();
                    break;
                }
                break;
            case 12:
                xn xnVar6 = this.b;
                ArrayList arrayList3 = xnVar6.r6;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    ((MessageObject) arrayList3.get(i12)).markPollVotesAsRead();
                }
                xnVar6.j1 = 0;
                xnVar6.Ac(true);
                xnVar6.getMessagesController().markPollVotesAsRead(xnVar6.Q5, xnVar6.b());
                org.telegram.ui.ActionBar.p1 p1Var3 = xnVar6.N8;
                if (p1Var3 != null) {
                    p1Var3.dismiss();
                    break;
                }
                break;
            case 13:
                xn.n1(this.b);
                break;
            case 14:
                org.telegram.ui.Components.qc.a0(this.b).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                break;
            case 15:
                this.b.hc(false);
                break;
            case 16:
                xn xnVar7 = this.b;
                xnVar7.D5 = null;
                xnVar7.j8();
                break;
            case 17:
                xn xnVar8 = this.b;
                xnVar8.D5 = null;
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
                AndroidUtilities.removeFromParent(this.b.I0);
                break;
            case 22:
                xn xnVar9 = this.b;
                xnVar9.z4 = null;
                xnVar9.o9();
                xnVar9.r9();
                break;
            case 23:
                xn xnVar10 = this.b;
                nk nkVar = xnVar10.q8;
                if (nkVar != null && nkVar.getParent() != null) {
                    xnVar10.u0.f1();
                    xnVar10.s8.setDrawingReady(false);
                    xnVar10.q8.setTag(null);
                    xnVar10.U0.removeView(xnVar10.q8);
                    break;
                }
                break;
            case 24:
                xn xnVar11 = this.b;
                xnVar11.l9 = false;
                xnVar11.e9(true);
                break;
            case 25:
                xn xnVar12 = this.b;
                org.telegram.ui.ActionBar.g1[] g1VarArr = xnVar12.P8;
                if (g1VarArr != null && g1VarArr.length > 0 && (g1Var = g1VarArr[0]) != null) {
                    g1Var.requestFocus();
                    xnVar12.P8[0].performAccessibilityAction(64, null);
                    xnVar12.P8[0].sendAccessibilityEvent(8);
                    break;
                }
                break;
            case 26:
                xn xnVar13 = this.b;
                if (xnVar13.getParentActivity() != null && xnVar13.fragmentView != null && (jkVar = xnVar13.V) != null && (sendButton = jkVar.getSendButton()) != null && xnVar13.V.getEditField() != null && xnVar13.V.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (xnVar13.d2 == null) {
                        ej ejVar = new ej(4, 0, xnVar13.getParentActivity(), xnVar13.ba, false);
                        xnVar13.d2 = ejVar;
                        ejVar.a();
                        xnVar13.d2.setAlpha(0.0f);
                        xnVar13.d2.setVisibility(4);
                        xnVar13.d2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        xnVar13.U0.addView(xnVar13.d2, k7.c6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    xnVar13.d2.f(sendButton, true);
                    xnVar13.e2 = true;
                    break;
                }
                break;
            case 27:
                xn xnVar14 = this.b;
                if (xnVar14.getParentActivity() != null && xnVar14.fragmentView != null && xnVar14.V != null && xnVar14.Ba == null && xnVar14.getMessagesController().getSendPaidMessagesStars(xnVar14.a()) <= 0 && (sendButton2 = xnVar14.V.getSendButton()) != null && xnVar14.V.getEditField() != null && xnVar14.V.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (xnVar14.f2 == null) {
                        org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40(4, xnVar14.getParentActivity(), xnVar14.ba, false);
                        xnVar14.f2 = m40Var;
                        m40Var.a();
                        xnVar14.f2.setAlpha(0.0f);
                        xnVar14.f2.setVisibility(4);
                        xnVar14.f2.setText(LocaleController.getString(R.string.ScheduledHint));
                        xnVar14.U0.addView(xnVar14.f2, k7.c6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    xnVar14.f2.f(sendButton2, true);
                    xnVar14.g2 = true;
                    break;
                }
                break;
            case 28:
                this.b.g8(false, true, 0.0f);
                break;
            default:
                xn xnVar15 = this.b;
                xnVar15.x0.J.clear();
                jm jmVar = xnVar15.x0;
                jmVar.I = false;
                jmVar.O(true);
                xnVar15.Pb(false);
                break;
        }
    }
}
