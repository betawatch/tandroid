package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class lx extends w61 {
    public final /* synthetic */ n61[] a2;
    public final /* synthetic */ py b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx(py pyVar, py pyVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.g6 g6Var, n61[] n61VarArr) {
        super(pyVar2, activity, true, num, 0, g6Var);
        this.b2 = pyVar;
        this.a2 = n61VarArr;
    }

    @Override // org.telegram.ui.w61
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i10 = ((org.telegram.ui.ActionBar.p2) this.b2).currentAccount;
        return mh.t7.y(i10, false).n(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.w61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.TL_emojiStatus tL_emojiStatus;
        TLRPC.EmojiStatus emojiStatus;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.g6 g6Var;
        n61[] n61VarArr = this.a2;
        py pyVar = this.b2;
        if (l10 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i10 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                TL_stars.SavedStarGift n10 = mh.t7.y(i10, false).n(tL_starGiftUnique.id);
                if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                    MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i11 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                    i12 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                    long clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    g6Var = ((org.telegram.ui.ActionBar.p2) pyVar).resourceProvider;
                    mh.g5 g5Var = new mh.g5(context, i11, clientUserId, g6Var, null);
                    g5Var.j2(n10, null);
                    g5Var.m2();
                    g5Var.show();
                    n61 n61Var = n61VarArr[0];
                    if (n61Var != null) {
                        pyVar.J0 = null;
                        n61Var.dismiss();
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
                tL_emojiStatus2.document_id = l10.longValue();
                tL_emojiStatus = tL_emojiStatus2;
                if (num != null) {
                    tL_emojiStatus2.flags |= 1;
                    tL_emojiStatus2.until = num.intValue();
                    tL_emojiStatus = tL_emojiStatus2;
                }
            }
            emojiStatus = tL_emojiStatus;
        }
        pyVar.getMessagesController().updateEmojiStatus(emojiStatus, tL_starGiftUnique);
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = pyVar.B3;
            ng.q0 q0Var = new ng.q0();
            long longValue = l10.longValue();
            q0Var.g = longValue;
            q0Var.h = longValue;
            oVar.a(q0Var);
        }
        n61 n61Var2 = n61VarArr[0];
        if (n61Var2 != null) {
            pyVar.J0 = null;
            n61Var2.dismiss();
        }
    }
}
