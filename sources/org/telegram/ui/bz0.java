package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class bz0 extends b61 {
    public final /* synthetic */ s51[] e2;
    public final /* synthetic */ ProfileActivity f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz0(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11, s51[] s51VarArr) {
        super(profileActivity2, activity, true, num, i10, true, g6Var, i11);
        this.f2 = profileActivity;
        this.e2 = s51VarArr;
    }

    @Override // org.telegram.ui.b61
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i10 = ((org.telegram.ui.ActionBar.o2) this.f2).currentAccount;
        return ai.ha.y(i10, false).n(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.b61
    public final long getDialogId() {
        return this.f2.a();
    }

    @Override // org.telegram.ui.b61
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.EmojiStatus emojiStatus;
        int i10;
        int i11;
        int i12;
        ProfileActivity profileActivity = this.f2;
        org.telegram.ui.Components.p5[] p5VarArr = profileActivity.G;
        s51[] s51VarArr = this.e2;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
            TL_stars.SavedStarGift n10 = ai.ha.y(i10, false).n(tL_starGiftUnique.id);
            if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i11 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                i12 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                ai.l7 l7Var = new ai.l7(context, i11, UserConfig.getInstance(i12).getClientUserId(), profileActivity.A0, null);
                l7Var.L2(n10, null);
                l7Var.P2();
                l7Var.show();
                s51 s51Var = s51VarArr[0];
                if (s51Var != null) {
                    profileActivity.D5 = null;
                    s51Var.dismiss();
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
        TLRPC.Chat chat = profileActivity.F2;
        messagesController.updateEmojiStatus(chat == null ? 0L : -chat.id, emojiStatus, tL_starGiftUnique);
        for (int i13 = 0; i13 < 2; i13++) {
            org.telegram.ui.Components.p5 p5Var = p5VarArr[i13];
            if (p5Var != null) {
                if (l4 == null && profileActivity.F2 == null) {
                    p5Var.g(profileActivity.a4(i13), true);
                } else if (l4 != null) {
                    p5Var.j(l4.longValue(), true);
                } else {
                    p5Var.g(null, true);
                }
                p5VarArr[i13].m(tL_starGiftUnique != null, true);
            }
        }
        if (l4 != null) {
            org.telegram.ui.Cells.o oVar = profileActivity.e0;
            ah.i1 i1Var = new ah.i1();
            long longValue = l4.longValue();
            i1Var.g = longValue;
            i1Var.h = longValue;
            oVar.a(i1Var);
        }
        profileActivity.b5();
        profileActivity.d5();
        s51 s51Var2 = s51VarArr[0];
        if (s51Var2 != null) {
            profileActivity.D5 = null;
            s51Var2.dismiss();
        }
    }
}
