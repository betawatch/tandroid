package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ kf(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.g1 g1Var;
        hk hkVar;
        View sendButton;
        switch (this.a) {
            case 0:
                this.b.H7(true);
                break;
            case 1:
                this.b.H7(true);
                break;
            case 2:
                un unVar = this.b;
                unVar.H7(false);
                tg.y0 y0Var = new tg.y0((org.telegram.ui.ActionBar.r2) unVar, 24, true);
                y0Var.setDimBehind(false);
                y0Var.setOnHideListener(new qe(unVar, 2));
                y0Var.show();
                break;
            case 3:
                un.p0(this.b);
                break;
            case 4:
                un.n1(this.b);
                break;
            case 5:
                un unVar2 = this.b;
                if (unVar2.getUserConfig().isPremium()) {
                    unVar2.ic = null;
                    unVar2.dd(true);
                    org.telegram.ui.Components.wc.b0(unVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                    unVar2.getMessagesController().disableAds(true);
                    break;
                } else {
                    unVar2.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) unVar2, 3, true));
                    break;
                }
            case 6:
                hk hkVar2 = this.b.Y;
                if (hkVar2 != null) {
                    hkVar2.n0(true);
                    break;
                }
                break;
            case 7:
                un unVar3 = this.b;
                unVar3.resumeDelayedFragmentAnimation();
                pk pkVar = unVar3.ia;
                AndroidUtilities.cancelRunOnUIThread(pkVar);
                pkVar.run();
                unVar3.getNotificationCenter().runDelayedNotifications();
                break;
            case 8:
                un unVar4 = this.b;
                unVar4.Ca = null;
                unVar4.Ba = -1;
                View view = unVar4.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    break;
                }
                break;
            case 9:
                un unVar5 = this.b;
                ArrayList arrayList = unVar5.G6;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i10);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                unVar5.x6 = 0;
                unVar5.getMessagesController().markMentionsAsRead(unVar5.f6, unVar5.b());
                unVar5.y6 = true;
                unVar5.Wb(false);
                org.telegram.ui.ActionBar.o1 o1Var = unVar5.c9;
                if (o1Var != null) {
                    o1Var.dismiss();
                    break;
                }
                break;
            case 10:
                un unVar6 = this.b;
                ArrayList arrayList2 = unVar6.G6;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    ((MessageObject) arrayList2.get(i11)).markReactionsAsRead();
                }
                unVar6.x1 = 0;
                unVar6.Oc(true);
                unVar6.getMessagesController().markReactionsAsRead(unVar6.f6, unVar6.b());
                org.telegram.ui.ActionBar.o1 o1Var2 = unVar6.c9;
                if (o1Var2 != null) {
                    o1Var2.dismiss();
                    break;
                }
                break;
            case 11:
                un unVar7 = this.b;
                ArrayList arrayList3 = unVar7.G6;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    ((MessageObject) arrayList3.get(i12)).markPollVotesAsRead();
                }
                unVar7.y1 = 0;
                unVar7.Nc(true);
                unVar7.getMessagesController().markPollVotesAsRead(unVar7.f6, unVar7.b());
                org.telegram.ui.ActionBar.o1 o1Var3 = unVar7.c9;
                if (o1Var3 != null) {
                    o1Var3.dismiss();
                    break;
                }
                break;
            case 12:
                this.b.Y.F0();
                break;
            case 13:
                un.x0(this.b);
                break;
            case 14:
                org.telegram.ui.Components.wc.b0(this.b).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                break;
            case 15:
                this.b.L6(false, false, false);
                break;
            case 16:
                this.b.L6(false, true, false);
                break;
            case 17:
                this.b.L6(true, false, false);
                break;
            case 18:
                this.b.finishFragment();
                break;
            case 19:
                this.b.n8(false, true, 0.0f);
                break;
            case 20:
                this.b.n8(false, true, 0.0f);
                break;
            case 21:
                AndroidUtilities.removeFromParent(this.b.V0);
                break;
            case 22:
                this.b.uc(false);
                break;
            case 23:
                this.b.n8(false, true, 0.0f);
                break;
            case 24:
                this.b.Z6();
                break;
            case 25:
                un unVar8 = this.b;
                unVar8.O4 = null;
                unVar8.x9();
                unVar8.z9();
                break;
            case 26:
                un unVar9 = this.b;
                kk kkVar = unVar9.F8;
                if (kkVar != null && kkVar.getParent() != null) {
                    unVar9.x0.g1();
                    unVar9.H8.setDrawingReady(false);
                    unVar9.F8.setTag(null);
                    unVar9.j1.removeView(unVar9.F8);
                    break;
                }
                break;
            case 27:
                un unVar10 = this.b;
                org.telegram.ui.ActionBar.g1[] g1VarArr = unVar10.e9;
                if (g1VarArr != null && g1VarArr.length > 0 && (g1Var = g1VarArr[0]) != null) {
                    g1Var.requestFocus();
                    unVar10.e9[0].performAccessibilityAction(64, null);
                    unVar10.e9[0].sendAccessibilityEvent(8);
                    break;
                }
                break;
            case 28:
                un unVar11 = this.b;
                unVar11.A9 = false;
                unVar11.o9(true);
                break;
            default:
                un unVar12 = this.b;
                if (unVar12.getParentActivity() != null && unVar12.fragmentView != null && (hkVar = unVar12.Y) != null && (sendButton = hkVar.getSendButton()) != null && unVar12.Y.getEditField() != null && unVar12.Y.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (unVar12.s2 == null) {
                        bj bjVar = new bj(4, 0, unVar12.getParentActivity(), unVar12.qa, false);
                        unVar12.s2 = bjVar;
                        bjVar.a();
                        unVar12.s2.setAlpha(0.0f);
                        unVar12.s2.setVisibility(4);
                        unVar12.s2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        unVar12.j1.addView(unVar12.s2, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    unVar12.s2.f(sendButton, true);
                    unVar12.t2 = true;
                    break;
                }
                break;
        }
    }
}
