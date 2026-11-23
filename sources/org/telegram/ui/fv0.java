package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class fv0 extends q11 {
    public final /* synthetic */ h11[] f2;
    public final /* synthetic */ ProfileActivity g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv0(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i7, org.telegram.ui.ActionBar.i6 i6Var, int i10, h11[] h11VarArr) {
        super(profileActivity2, activity, true, num, i7, true, i6Var, i10);
        this.g2 = profileActivity;
        this.f2 = h11VarArr;
    }

    @Override // org.telegram.ui.q11
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i7;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i7 = ((org.telegram.ui.ActionBar.g2) this.g2).currentAccount;
        return di.y8.y(i7, false).n(tL_starGiftUnique.id) == null || org.telegram.messenger.mp.g1().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.q11
    public final long getDialogId() {
        return this.g2.a();
    }

    @Override // org.telegram.ui.q11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.EmojiStatus emojiStatus;
        int i7;
        int i10;
        int i11;
        h11[] h11VarArr = this.f2;
        ProfileActivity profileActivity = this.g2;
        if (tL_starGiftUnique != null) {
            i7 = ((org.telegram.ui.ActionBar.g2) profileActivity).currentAccount;
            TL_stars.SavedStarGift n10 = di.y8.y(i7, false).n(tL_starGiftUnique.id);
            if (n10 != null && org.telegram.messenger.mp.g1().getInt("statusgiftpage", 0) < 2) {
                org.telegram.messenger.mp.g1().edit().putInt("statusgiftpage", org.telegram.messenger.mp.g1().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i10 = ((org.telegram.ui.ActionBar.g2) profileActivity).currentAccount;
                i11 = ((org.telegram.ui.ActionBar.g2) profileActivity).currentAccount;
                di.f6 f6Var = new di.f6(context, i10, org.telegram.messenger.i10.i(i11).e(), profileActivity.A0, null);
                f6Var.w2(n10, null);
                f6Var.A2();
                f6Var.show();
                h11 h11Var = h11VarArr[0];
                if (h11Var != null) {
                    profileActivity.T5 = null;
                    h11Var.dismiss();
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
        profileActivity.F = tL_starGiftUnique != null ? Long.valueOf(tL_starGiftUnique.id) : null;
        org.telegram.messenger.mp messagesController = profileActivity.getMessagesController();
        TLRPC.Chat chat = profileActivity.F2;
        messagesController.s5(chat == null ? 0L : -chat.id, emojiStatus, tL_starGiftUnique);
        org.telegram.ui.Components.m5 m5Var = profileActivity.G;
        if (m5Var != null) {
            if (l10 == null && profileActivity.F2 == null) {
                m5Var.g(profileActivity.o4(), true);
            } else if (l10 != null) {
                m5Var.j(l10.longValue(), true);
            } else {
                m5Var.g(null, true);
            }
            profileActivity.G.m(tL_starGiftUnique != null, true);
        }
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = profileActivity.e0;
            ch.p0 p0Var = new ch.p0();
            long longValue = l10.longValue();
            p0Var.g = longValue;
            p0Var.h = longValue;
            oVar.a(p0Var);
        }
        profileActivity.v5();
        profileActivity.x5();
        h11 h11Var2 = h11VarArr[0];
        if (h11Var2 != null) {
            profileActivity.T5 = null;
            h11Var2.dismiss();
        }
    }
}
