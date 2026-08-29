package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bx extends d61 {
    public final /* synthetic */ u51[] Z1;
    public final /* synthetic */ fy a2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx(fy fyVar, fy fyVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.c6 c6Var, u51[] u51VarArr) {
        super(fyVar2, activity, true, num, 0, c6Var);
        this.a2 = fyVar;
        this.Z1 = u51VarArr;
    }

    @Override // org.telegram.ui.d61
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i10 = ((org.telegram.ui.ActionBar.o2) this.a2).currentAccount;
        return jh.s7.y(i10, false).n(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.d61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.TL_emojiStatus tL_emojiStatus;
        TLRPC.EmojiStatus emojiStatus;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.c6 c6Var;
        u51[] u51VarArr = this.Z1;
        fy fyVar = this.a2;
        if (l10 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i10 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                TL_stars.SavedStarGift n10 = jh.s7.y(i10, false).n(tL_starGiftUnique.id);
                if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                    MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i11 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                    i12 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                    long clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    c6Var = ((org.telegram.ui.ActionBar.o2) fyVar).resourceProvider;
                    jh.h5 h5Var = new jh.h5(context, i11, clientUserId, c6Var, null);
                    h5Var.j2(n10, null);
                    h5Var.m2();
                    h5Var.show();
                    u51 u51Var = u51VarArr[0];
                    if (u51Var != null) {
                        fyVar.I0 = null;
                        u51Var.dismiss();
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
        fyVar.getMessagesController().updateEmojiStatus(emojiStatus, tL_starGiftUnique);
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = fyVar.A3;
            kg.q0 q0Var = new kg.q0();
            long longValue = l10.longValue();
            q0Var.g = longValue;
            q0Var.h = longValue;
            oVar.a(q0Var);
        }
        u51 u51Var2 = u51VarArr[0];
        if (u51Var2 != null) {
            fyVar.I0 = null;
            u51Var2.dismiss();
        }
    }
}
