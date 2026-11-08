package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class gv0 extends q11 {
    public final /* synthetic */ h11[] e2;
    public final /* synthetic */ ProfileActivity f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv0(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i7, org.telegram.ui.ActionBar.f6 f6Var, int i10, h11[] h11VarArr) {
        super(profileActivity2, activity, true, num, i7, true, f6Var, i10);
        this.f2 = profileActivity;
        this.e2 = h11VarArr;
    }

    @Override // org.telegram.ui.q11
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i7;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i7 = ((org.telegram.ui.ActionBar.f2) this.f2).currentAccount;
        return bi.ea.y(i7, false).n(tL_starGiftUnique.id) == null || org.telegram.messenger.qp.e1().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.q11
    public final long getDialogId() {
        return this.f2.a();
    }

    @Override // org.telegram.ui.q11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.EmojiStatus emojiStatus;
        int i7;
        int i10;
        int i11;
        h11[] h11VarArr = this.e2;
        ProfileActivity profileActivity = this.f2;
        if (tL_starGiftUnique != null) {
            i7 = ((org.telegram.ui.ActionBar.f2) profileActivity).currentAccount;
            TL_stars.SavedStarGift n10 = bi.ea.y(i7, false).n(tL_starGiftUnique.id);
            if (n10 != null && org.telegram.messenger.qp.e1().getInt("statusgiftpage", 0) < 2) {
                org.telegram.messenger.qp.e1().edit().putInt("statusgiftpage", org.telegram.messenger.qp.e1().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i10 = ((org.telegram.ui.ActionBar.f2) profileActivity).currentAccount;
                i11 = ((org.telegram.ui.ActionBar.f2) profileActivity).currentAccount;
                bi.k7 k7Var = new bi.k7(context, i10, org.telegram.messenger.p10.i(i11).e(), profileActivity.z0, null);
                k7Var.j2(n10, null);
                k7Var.n2();
                k7Var.show();
                h11 h11Var = h11VarArr[0];
                if (h11Var != null) {
                    profileActivity.N5 = null;
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
        profileActivity.E = tL_starGiftUnique != null ? Long.valueOf(tL_starGiftUnique.id) : null;
        org.telegram.messenger.qp messagesController = profileActivity.getMessagesController();
        TLRPC.Chat chat = profileActivity.D2;
        messagesController.g5(chat == null ? 0L : -chat.id, emojiStatus, tL_starGiftUnique);
        org.telegram.ui.Components.g5 g5Var = profileActivity.F;
        if (g5Var != null) {
            if (l10 == null && profileActivity.D2 == null) {
                g5Var.g(profileActivity.o4(), true);
            } else if (l10 != null) {
                g5Var.j(l10.longValue(), true);
            } else {
                g5Var.g(null, true);
            }
            profileActivity.F.m(tL_starGiftUnique != null, true);
        }
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = profileActivity.d0;
            ch.o0 o0Var = new ch.o0();
            long longValue = l10.longValue();
            o0Var.g = longValue;
            o0Var.h = longValue;
            oVar.a(o0Var);
        }
        profileActivity.s5();
        profileActivity.u5();
        h11 h11Var2 = h11VarArr[0];
        if (h11Var2 != null) {
            profileActivity.N5 = null;
            h11Var2.dismiss();
        }
    }
}
