package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class iz0 extends x61 {
    public final /* synthetic */ n61[] a2;
    public final /* synthetic */ ProfileActivity b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz0(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, n61[] n61VarArr) {
        super(profileActivity2, activity, true, num, i10, true, f6Var, i11);
        this.b2 = profileActivity;
        this.a2 = n61VarArr;
    }

    @Override // org.telegram.ui.x61
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i10 = ((org.telegram.ui.ActionBar.p2) this.b2).currentAccount;
        return lh.t7.y(i10, false).n(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.x61
    public final long getDialogId() {
        return this.b2.a();
    }

    @Override // org.telegram.ui.x61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.EmojiStatus emojiStatus;
        int i10;
        int i11;
        int i12;
        ProfileActivity profileActivity = this.b2;
        org.telegram.ui.Components.j5[] j5VarArr = profileActivity.D;
        n61[] n61VarArr = this.a2;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.p2) profileActivity).currentAccount;
            TL_stars.SavedStarGift n10 = lh.t7.y(i10, false).n(tL_starGiftUnique.id);
            if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i11 = ((org.telegram.ui.ActionBar.p2) profileActivity).currentAccount;
                i12 = ((org.telegram.ui.ActionBar.p2) profileActivity).currentAccount;
                lh.g5 g5Var = new lh.g5(context, i11, UserConfig.getInstance(i12).getClientUserId(), profileActivity.w0, null);
                g5Var.j2(n10, null);
                g5Var.m2();
                g5Var.show();
                n61 n61Var = n61VarArr[0];
                if (n61Var != null) {
                    profileActivity.y5 = null;
                    n61Var.dismiss();
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
        } else if (l10 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = l10.longValue();
            emojiStatus = tL_emojiStatus;
            if (num != null) {
                tL_emojiStatus.flags |= 1;
                tL_emojiStatus.until = num.intValue();
                emojiStatus = tL_emojiStatus;
            }
        }
        profileActivity.C = tL_starGiftUnique != null ? Long.valueOf(tL_starGiftUnique.id) : null;
        MessagesController messagesController = profileActivity.getMessagesController();
        TLRPC.Chat chat = profileActivity.B2;
        messagesController.updateEmojiStatus(chat == null ? 0L : -chat.id, emojiStatus, tL_starGiftUnique);
        for (int i13 = 0; i13 < 2; i13++) {
            org.telegram.ui.Components.j5 j5Var = j5VarArr[i13];
            if (j5Var != null) {
                if (l10 == null && profileActivity.B2 == null) {
                    j5Var.g(profileActivity.Y3(i13), true);
                } else if (l10 != null) {
                    j5Var.j(l10.longValue(), true);
                } else {
                    j5Var.g(null, true);
                }
                j5VarArr[i13].m(tL_starGiftUnique != null, true);
            }
        }
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = profileActivity.a0;
            mg.q0 q0Var = new mg.q0();
            long longValue = l10.longValue();
            q0Var.g = longValue;
            q0Var.h = longValue;
            oVar.a(q0Var);
        }
        profileActivity.X4();
        profileActivity.Z4();
        n61 n61Var2 = n61VarArr[0];
        if (n61Var2 != null) {
            profileActivity.y5 = null;
            n61Var2.dismiss();
        }
    }
}
