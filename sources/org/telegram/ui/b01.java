package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class b01 extends r71 {
    public final /* synthetic */ i71[] d2;
    public final /* synthetic */ ProfileActivity e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b01(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, i71[] i71VarArr) {
        super(profileActivity2, activity, true, num, i10, true, c6Var, i11);
        this.e2 = profileActivity;
        this.d2 = i71VarArr;
    }

    @Override // org.telegram.ui.r71
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i10 = ((org.telegram.ui.ActionBar.m2) this.e2).currentAccount;
        return zh.n5.y(i10, false).n(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.r71
    public final long getDialogId() {
        return this.e2.a();
    }

    @Override // org.telegram.ui.r71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.EmojiStatus emojiStatus;
        int i10;
        int i11;
        int i12;
        ProfileActivity profileActivity = this.e2;
        org.telegram.ui.Components.q5[] q5VarArr = profileActivity.G;
        i71[] i71VarArr = this.d2;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.m2) profileActivity).currentAccount;
            TL_stars.SavedStarGift n10 = zh.n5.y(i10, false).n(tL_starGiftUnique.id);
            if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i11 = ((org.telegram.ui.ActionBar.m2) profileActivity).currentAccount;
                i12 = ((org.telegram.ui.ActionBar.m2) profileActivity).currentAccount;
                zh.r3 r3Var = new zh.r3(context, i11, UserConfig.getInstance(i12).getClientUserId(), profileActivity.z0, null);
                r3Var.l2(n10, null);
                r3Var.o2();
                r3Var.show();
                i71 i71Var = i71VarArr[0];
                if (i71Var != null) {
                    profileActivity.B5 = null;
                    i71Var.dismiss();
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
        profileActivity.F = tL_starGiftUnique != null ? Long.valueOf(tL_starGiftUnique.id) : null;
        MessagesController messagesController = profileActivity.getMessagesController();
        TLRPC.Chat chat = profileActivity.E2;
        messagesController.updateEmojiStatus(chat == null ? 0L : -chat.id, emojiStatus, tL_starGiftUnique);
        for (int i13 = 0; i13 < 2; i13++) {
            org.telegram.ui.Components.q5 q5Var = q5VarArr[i13];
            if (q5Var != null) {
                if (l4 == null && profileActivity.E2 == null) {
                    q5Var.g(profileActivity.Y3(i13), true);
                } else if (l4 != null) {
                    q5Var.j(l4.longValue(), true);
                } else {
                    q5Var.g(null, true);
                }
                q5VarArr[i13].m(tL_starGiftUnique != null, true);
            }
        }
        if (l4 != null) {
            org.telegram.ui.Cells.o oVar = profileActivity.d0;
            ah.i1 i1Var = new ah.i1();
            long longValue = l4.longValue();
            i1Var.g = longValue;
            i1Var.h = longValue;
            oVar.a(i1Var);
        }
        profileActivity.X4();
        profileActivity.Z4();
        i71 i71Var2 = i71VarArr[0];
        if (i71Var2 != null) {
            profileActivity.B5 = null;
            i71Var2.dismiss();
        }
    }
}
