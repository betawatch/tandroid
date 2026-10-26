package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ez0 extends c61 {
    public final /* synthetic */ t51[] e2;
    public final /* synthetic */ ProfileActivity f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez0(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.u6 u6Var, int i11, t51[] t51VarArr) {
        super(profileActivity2, activity, true, num, i10, true, u6Var, i11);
        this.f2 = profileActivity;
        this.e2 = t51VarArr;
    }

    @Override // org.telegram.ui.c61
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i10 = ((org.telegram.ui.ActionBar.r2) this.f2).currentAccount;
        return bi.ca.y(i10, false).n(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.c61
    public final long getDialogId() {
        return this.f2.a();
    }

    @Override // org.telegram.ui.c61
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.EmojiStatus emojiStatus;
        int i10;
        int i11;
        int i12;
        t51[] t51VarArr = this.e2;
        ProfileActivity profileActivity = this.f2;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.r2) profileActivity).currentAccount;
            TL_stars.SavedStarGift n10 = bi.ca.y(i10, false).n(tL_starGiftUnique.id);
            if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i11 = ((org.telegram.ui.ActionBar.r2) profileActivity).currentAccount;
                i12 = ((org.telegram.ui.ActionBar.r2) profileActivity).currentAccount;
                bi.h7 h7Var = new bi.h7(context, i11, UserConfig.getInstance(i12).getClientUserId(), profileActivity.z0, null);
                h7Var.L2(n10, null);
                h7Var.P2();
                h7Var.show();
                t51 t51Var = t51VarArr[0];
                if (t51Var != null) {
                    profileActivity.H5 = null;
                    t51Var.dismiss();
                    return;
                }
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.id;
            emojiStatus = tL_inputEmojiStatusCollectible;
            if (num != null) {
                tL_inputEmojiStatusCollectible.flags |= 1;
                tL_inputEmojiStatusCollectible.until = num.intValue();
                emojiStatus = tL_inputEmojiStatusCollectible;
            }
        } else if (l4 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = l4.longValue();
            emojiStatus = tL_emojiStatus;
            if (num != null) {
                tL_emojiStatus.flags |= 1;
                tL_emojiStatus.until = num.intValue();
                emojiStatus = tL_emojiStatus;
            }
        }
        profileActivity.E = tL_starGiftUnique != null ? Long.valueOf(tL_starGiftUnique.id) : null;
        MessagesController messagesController = profileActivity.getMessagesController();
        TLRPC.Chat chat = profileActivity.E2;
        messagesController.updateEmojiStatus(chat == null ? 0L : -chat.id, emojiStatus, tL_starGiftUnique);
        org.telegram.ui.Components.r5 r5Var = profileActivity.F;
        if (r5Var != null) {
            if (l4 == null && profileActivity.E2 == null) {
                r5Var.g(profileActivity.g4(), true);
            } else if (l4 != null) {
                r5Var.j(l4.longValue(), true);
            } else {
                r5Var.g(null, true);
            }
            profileActivity.F.m(tL_starGiftUnique != null, true);
        }
        if (l4 != null) {
            org.telegram.ui.Cells.o oVar = profileActivity.d0;
            bh.x0 x0Var = new bh.x0();
            long longValue = l4.longValue();
            x0Var.g = longValue;
            x0Var.h = longValue;
            oVar.a(x0Var);
        }
        profileActivity.j5();
        profileActivity.l5();
        t51 t51Var2 = t51VarArr[0];
        if (t51Var2 != null) {
            profileActivity.H5 = null;
            t51Var2.dismiss();
        }
    }
}
