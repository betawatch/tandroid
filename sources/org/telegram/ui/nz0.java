package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class nz0 extends z61 {
    public final /* synthetic */ q61[] d2;
    public final /* synthetic */ ProfileActivity e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz0(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, q61[] q61VarArr) {
        super(profileActivity2, activity, true, num, i10, true, d6Var, i11);
        this.e2 = profileActivity;
        this.d2 = q61VarArr;
    }

    @Override // org.telegram.ui.z61
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i10 = ((org.telegram.ui.ActionBar.n2) this.e2).currentAccount;
        return yh.t5.y(i10, false).n(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.z61
    public final long getDialogId() {
        return this.e2.a();
    }

    @Override // org.telegram.ui.z61
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.EmojiStatus emojiStatus;
        int i10;
        int i11;
        int i12;
        ProfileActivity profileActivity = this.e2;
        org.telegram.ui.Components.o5[] o5VarArr = profileActivity.G;
        q61[] q61VarArr = this.d2;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount;
            TL_stars.SavedStarGift n10 = yh.t5.y(i10, false).n(tL_starGiftUnique.id);
            if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i11 = ((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount;
                i12 = ((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount;
                yh.y3 y3Var = new yh.y3(context, i11, UserConfig.getInstance(i12).getClientUserId(), profileActivity.z0, null);
                y3Var.j2(n10, null);
                y3Var.m2();
                y3Var.show();
                q61 q61Var = q61VarArr[0];
                if (q61Var != null) {
                    profileActivity.B5 = null;
                    q61Var.dismiss();
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
            org.telegram.ui.Components.o5 o5Var = o5VarArr[i13];
            if (o5Var != null) {
                if (l4 == null && profileActivity.E2 == null) {
                    o5Var.g(profileActivity.Y3(i13), true);
                } else if (l4 != null) {
                    o5Var.j(l4.longValue(), true);
                } else {
                    o5Var.g(null, true);
                }
                o5VarArr[i13].m(tL_starGiftUnique != null, true);
            }
        }
        if (l4 != null) {
            org.telegram.ui.Cells.o oVar = profileActivity.d0;
            zg.p0 p0Var = new zg.p0();
            long longValue = l4.longValue();
            p0Var.g = longValue;
            p0Var.h = longValue;
            oVar.a(p0Var);
        }
        profileActivity.X4();
        profileActivity.Z4();
        q61 q61Var2 = q61VarArr[0];
        if (q61Var2 != null) {
            profileActivity.B5 = null;
            q61Var2.dismiss();
        }
    }
}
