package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class px extends g71 {
    public final /* synthetic */ x61[] d2;
    public final /* synthetic */ uy e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px(uy uyVar, uy uyVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.e6 e6Var, x61[] x61VarArr) {
        super(uyVar2, activity, true, num, 0, e6Var);
        this.e2 = uyVar;
        this.d2 = x61VarArr;
    }

    @Override // org.telegram.ui.g71
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i10 = ((org.telegram.ui.ActionBar.n2) this.e2).currentAccount;
        return yh.t5.y(i10, false).n(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.g71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.TL_emojiStatus tL_emojiStatus;
        TLRPC.EmojiStatus emojiStatus;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.e6 e6Var;
        x61[] x61VarArr = this.d2;
        uy uyVar = this.e2;
        if (l4 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i10 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                TL_stars.SavedStarGift n10 = yh.t5.y(i10, false).n(tL_starGiftUnique.id);
                if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                    MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i11 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                    i12 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                    long clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    e6Var = ((org.telegram.ui.ActionBar.n2) uyVar).resourceProvider;
                    yh.y3 y3Var = new yh.y3(context, i11, clientUserId, e6Var, null);
                    y3Var.j2(n10, null);
                    y3Var.m2();
                    y3Var.show();
                    x61 x61Var = x61VarArr[0];
                    if (x61Var != null) {
                        uyVar.M0 = null;
                        x61Var.dismiss();
                        return;
                    }
                    return;
                }
                TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.id;
                tL_emojiStatus = tL_inputEmojiStatusCollectible;
                if (num != null) {
                    tL_inputEmojiStatusCollectible.flags |= 1;
                    tL_inputEmojiStatusCollectible.until = num.intValue();
                    tL_emojiStatus = tL_inputEmojiStatusCollectible;
                }
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus2 = new TLRPC.TL_emojiStatus();
                tL_emojiStatus2.document_id = l4.longValue();
                tL_emojiStatus = tL_emojiStatus2;
                if (num != null) {
                    tL_emojiStatus2.flags |= 1;
                    tL_emojiStatus2.until = num.intValue();
                    tL_emojiStatus = tL_emojiStatus2;
                }
            }
            emojiStatus = tL_emojiStatus;
        }
        uyVar.getMessagesController().updateEmojiStatus(emojiStatus, tL_starGiftUnique);
        if (l4 != null) {
            org.telegram.ui.Cells.o oVar = uyVar.E3;
            zg.o0 o0Var = new zg.o0();
            long longValue = l4.longValue();
            o0Var.g = longValue;
            o0Var.h = longValue;
            oVar.a(o0Var);
        }
        x61 x61Var2 = x61VarArr[0];
        if (x61Var2 != null) {
            uyVar.M0 = null;
            x61Var2.dismiss();
        }
    }
}
