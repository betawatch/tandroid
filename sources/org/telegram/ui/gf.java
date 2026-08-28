package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ gf(qn qnVar, int i9) {
        this.a = i9;
        this.b = qnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.g1 g1Var;
        ak akVar;
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
                qn qnVar = this.b;
                qnVar.A7(false);
                zf.x0 x0Var = new zf.x0((org.telegram.ui.ActionBar.o2) qnVar, 24, true);
                x0Var.setDimBehind(false);
                x0Var.setOnHideListener(new zf(qnVar, 1));
                x0Var.show();
                break;
            case 3:
                qn.P0(this.b);
                break;
            case 4:
                qn.l0(this.b);
                break;
            case 5:
                qn qnVar2 = this.b;
                if (qnVar2.getUserConfig().isPremium()) {
                    qnVar2.Ib = null;
                    qnVar2.Qc(true);
                    org.telegram.ui.Components.oc.a0(qnVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                    qnVar2.getMessagesController().disableAds(true);
                    break;
                } else {
                    qnVar2.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) qnVar2, 3, true));
                    break;
                }
            case 6:
                ak akVar2 = this.b.U;
                if (akVar2 != null) {
                    akVar2.p0(true);
                    break;
                }
                break;
            case 7:
                AndroidUtilities.removeFromParent(this.b.G0);
                break;
            case 8:
                this.b.U.G0();
                break;
            case 9:
                qn qnVar3 = this.b;
                qnVar3.ma = null;
                qnVar3.la = -1;
                View view = qnVar3.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    break;
                }
                break;
            case 10:
                qn qnVar4 = this.b;
                ArrayList arrayList = qnVar4.q6;
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i9);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                qnVar4.h6 = 0;
                qnVar4.getMessagesController().markMentionsAsRead(qnVar4.P5, qnVar4.b());
                qnVar4.i6 = true;
                qnVar4.Kb(false);
                org.telegram.ui.ActionBar.o1 o1Var = qnVar4.M8;
                if (o1Var != null) {
                    o1Var.dismiss();
                    break;
                }
                break;
            case 11:
                qn qnVar5 = this.b;
                ArrayList arrayList2 = qnVar5.q6;
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    ((MessageObject) arrayList2.get(i10)).markReactionsAsRead();
                }
                qnVar5.h1 = 0;
                qnVar5.Bc(true);
                qnVar5.getMessagesController().markReactionsAsRead(qnVar5.P5, qnVar5.b());
                org.telegram.ui.ActionBar.o1 o1Var2 = qnVar5.M8;
                if (o1Var2 != null) {
                    o1Var2.dismiss();
                    break;
                }
                break;
            case 12:
                qn qnVar6 = this.b;
                ArrayList arrayList3 = qnVar6.q6;
                for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                    ((MessageObject) arrayList3.get(i11)).markPollVotesAsRead();
                }
                qnVar6.i1 = 0;
                qnVar6.Ac(true);
                qnVar6.getMessagesController().markPollVotesAsRead(qnVar6.P5, qnVar6.b());
                org.telegram.ui.ActionBar.o1 o1Var3 = qnVar6.M8;
                if (o1Var3 != null) {
                    o1Var3.dismiss();
                    break;
                }
                break;
            case 13:
                qn.n1(this.b);
                break;
            case 14:
                org.telegram.ui.Components.oc.a0(this.b).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                break;
            case 15:
                this.b.hc(false);
                break;
            case 16:
                qn qnVar7 = this.b;
                qnVar7.C5 = null;
                qnVar7.j8();
                break;
            case 17:
                qn qnVar8 = this.b;
                qnVar8.C5 = null;
                qnVar8.j8();
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
                qn qnVar9 = this.b;
                qnVar9.y4 = null;
                qnVar9.o9();
                qnVar9.r9();
                break;
            case 23:
                qn qnVar10 = this.b;
                ek ekVar = qnVar10.p8;
                if (ekVar != null && ekVar.getParent() != null) {
                    qnVar10.t0.f1();
                    qnVar10.r8.setDrawingReady(false);
                    qnVar10.p8.setTag(null);
                    qnVar10.T0.removeView(qnVar10.p8);
                    break;
                }
                break;
            case 24:
                qn qnVar11 = this.b;
                qnVar11.k9 = false;
                qnVar11.e9(true);
                break;
            case 25:
                qn qnVar12 = this.b;
                org.telegram.ui.ActionBar.g1[] g1VarArr = qnVar12.O8;
                if (g1VarArr != null && g1VarArr.length > 0 && (g1Var = g1VarArr[0]) != null) {
                    g1Var.requestFocus();
                    qnVar12.O8[0].performAccessibilityAction(64, null);
                    qnVar12.O8[0].sendAccessibilityEvent(8);
                    break;
                }
                break;
            case 26:
                qn qnVar13 = this.b;
                if (qnVar13.getParentActivity() != null && qnVar13.fragmentView != null && (akVar = qnVar13.U) != null && (sendButton = akVar.getSendButton()) != null && qnVar13.U.getEditField() != null && qnVar13.U.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (qnVar13.c2 == null) {
                        wi wiVar = new wi(4, 0, qnVar13.getParentActivity(), qnVar13.aa, false);
                        qnVar13.c2 = wiVar;
                        wiVar.a();
                        qnVar13.c2.setAlpha(0.0f);
                        qnVar13.c2.setVisibility(4);
                        qnVar13.c2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        qnVar13.T0.addView(qnVar13.c2, g7.e6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    qnVar13.c2.f(sendButton, true);
                    qnVar13.d2 = true;
                    break;
                }
                break;
            case 27:
                qn qnVar14 = this.b;
                if (qnVar14.getParentActivity() != null && qnVar14.fragmentView != null && qnVar14.U != null && qnVar14.Aa == null && qnVar14.getMessagesController().getSendPaidMessagesStars(qnVar14.a()) <= 0 && (sendButton2 = qnVar14.U.getSendButton()) != null && qnVar14.U.getEditField() != null && qnVar14.U.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (qnVar14.e2 == null) {
                        org.telegram.ui.Components.s30 s30Var = new org.telegram.ui.Components.s30(4, qnVar14.getParentActivity(), qnVar14.aa, false);
                        qnVar14.e2 = s30Var;
                        s30Var.a();
                        qnVar14.e2.setAlpha(0.0f);
                        qnVar14.e2.setVisibility(4);
                        qnVar14.e2.setText(LocaleController.getString(R.string.ScheduledHint));
                        qnVar14.T0.addView(qnVar14.e2, g7.e6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    qnVar14.e2.f(sendButton2, true);
                    qnVar14.f2 = true;
                    break;
                }
                break;
            case 28:
                this.b.g8(false, true, 0.0f);
                break;
            default:
                qn qnVar15 = this.b;
                qnVar15.w0.I.clear();
                bm bmVar = qnVar15.w0;
                bmVar.H = false;
                bmVar.O(true);
                qnVar15.Pb(false);
                break;
        }
    }
}
