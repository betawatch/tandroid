package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ jf(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wn wnVar = this.b;
                AndroidUtilities.forEachViews((RecyclerView) wnVar.x0, (Utilities.Callback<View>) new di.e(11));
                hm hmVar = wnVar.A0;
                if (hmVar != null) {
                    hmVar.O(false);
                    break;
                }
                break;
            case 1:
                this.b.J7(true);
                break;
            case 2:
                this.b.J7(true);
                break;
            case 3:
                this.b.Lc();
                break;
            case 4:
                wn wnVar2 = this.b;
                wnVar2.J7(false);
                tg.y0 y0Var = new tg.y0((org.telegram.ui.ActionBar.r2) wnVar2, 24, true);
                y0Var.setDimBehind(false);
                y0Var.setOnHideListener(new pe(wnVar2, 7));
                y0Var.show();
                break;
            case 5:
                wn.y1(this.b);
                break;
            case 6:
                wn wnVar3 = this.b;
                if (wnVar3.getUserConfig().isPremium()) {
                    wnVar3.mc = null;
                    wnVar3.hd(true);
                    org.telegram.ui.Components.wc.b0(wnVar3).c(LocaleController.getString(R.string.AdHidden)).j();
                    wnVar3.getMessagesController().disableAds(true);
                    break;
                } else {
                    wnVar3.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) wnVar3, 3, true));
                    break;
                }
            case 7:
                wn.W(this.b);
                break;
            case 8:
                jk jkVar = this.b.Y;
                if (jkVar != null) {
                    jkVar.m0(true);
                    break;
                }
                break;
            case 9:
                wn wnVar4 = this.b;
                wnVar4.Ga = null;
                wnVar4.Fa = -1;
                View view = wnVar4.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    break;
                }
                break;
            case 10:
                wn wnVar5 = this.b;
                ArrayList arrayList = wnVar5.K6;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i10);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                wnVar5.B6 = 0;
                wnVar5.getMessagesController().markMentionsAsRead(wnVar5.j6, wnVar5.b());
                wnVar5.C6 = true;
                wnVar5.ac(false);
                org.telegram.ui.ActionBar.o1 o1Var = wnVar5.g9;
                if (o1Var != null) {
                    o1Var.dismiss();
                    break;
                }
                break;
            case 11:
                wn wnVar6 = this.b;
                ArrayList arrayList2 = wnVar6.K6;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    ((MessageObject) arrayList2.get(i11)).markReactionsAsRead();
                }
                wnVar6.x1 = 0;
                wnVar6.Sc(true);
                wnVar6.getMessagesController().markReactionsAsRead(wnVar6.j6, wnVar6.b());
                org.telegram.ui.ActionBar.o1 o1Var2 = wnVar6.g9;
                if (o1Var2 != null) {
                    o1Var2.dismiss();
                    break;
                }
                break;
            case 12:
                wn wnVar7 = this.b;
                ArrayList arrayList3 = wnVar7.K6;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    ((MessageObject) arrayList3.get(i12)).markPollVotesAsRead();
                }
                wnVar7.y1 = 0;
                wnVar7.Rc(true);
                wnVar7.getMessagesController().markPollVotesAsRead(wnVar7.j6, wnVar7.b());
                org.telegram.ui.ActionBar.o1 o1Var3 = wnVar7.g9;
                if (o1Var3 != null) {
                    o1Var3.dismiss();
                    break;
                }
                break;
            case 13:
                wn.d0(this.b);
                break;
            case 14:
                this.b.Y.E0();
                break;
            case 15:
                this.b.p8(false, true, 0.0f);
                break;
            case 16:
                this.b.N6(false, false, false);
                break;
            case 17:
                this.b.N6(false, true, false);
                break;
            case 18:
                this.b.N6(true, false, false);
                break;
            case 19:
                org.telegram.ui.Components.wc.b0(this.b).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                break;
            case 20:
                this.b.finishFragment();
                break;
            case 21:
                wn wnVar8 = this.b;
                wnVar8.W5 = null;
                wnVar8.s8();
                break;
            case 22:
                wn wnVar9 = this.b;
                wnVar9.W5 = null;
                wnVar9.s8();
                break;
            case 23:
                AndroidUtilities.removeFromParent(this.b.V0);
                break;
            case 24:
                wn wnVar10 = this.b;
                wnVar10.O4 = null;
                wnVar10.A9();
                wnVar10.C9();
                break;
            case 25:
                this.b.b7();
                break;
            case 26:
                this.b.yc(false);
                break;
            case 27:
                this.b.p8(false, true, 0.0f);
                break;
            case 28:
                wn wnVar11 = this.b;
                mk mkVar = wnVar11.J8;
                if (mkVar != null && mkVar.getParent() != null) {
                    wnVar11.x0.g1();
                    wnVar11.L8.setDrawingReady(false);
                    wnVar11.J8.setTag(null);
                    wnVar11.j1.removeView(wnVar11.J8);
                    break;
                }
                break;
            default:
                wn wnVar12 = this.b;
                wnVar12.E9 = false;
                wnVar12.r9(true);
                break;
        }
    }
}
