package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class cx extends a61 {
    public final /* synthetic */ r51[] Z1;
    public final /* synthetic */ gy a2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx(gy gyVar, gy gyVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.c6 c6Var, r51[] r51VarArr) {
        super(gyVar2, activity, true, num, 0, c6Var);
        this.a2 = gyVar;
        this.Z1 = r51VarArr;
    }

    @Override // org.telegram.ui.a61
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i10 = ((org.telegram.ui.ActionBar.n2) this.a2).currentAccount;
        return hh.u7.y(i10, false).n(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.a61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.TL_emojiStatus tL_emojiStatus;
        TLRPC.EmojiStatus emojiStatus;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.c6 c6Var;
        r51[] r51VarArr = this.Z1;
        gy gyVar = this.a2;
        if (l10 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i10 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                TL_stars.SavedStarGift n10 = hh.u7.y(i10, false).n(tL_starGiftUnique.id);
                if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                    MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i11 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                    i12 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                    long clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    c6Var = ((org.telegram.ui.ActionBar.n2) gyVar).resourceProvider;
                    hh.i5 i5Var = new hh.i5(context, i11, clientUserId, c6Var, null);
                    i5Var.j2(n10, null);
                    i5Var.m2();
                    i5Var.show();
                    r51 r51Var = r51VarArr[0];
                    if (r51Var != null) {
                        gyVar.I0 = null;
                        r51Var.dismiss();
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
        gyVar.getMessagesController().updateEmojiStatus(emojiStatus, tL_starGiftUnique);
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = gyVar.A3;
            ig.q0 q0Var = new ig.q0();
            long longValue = l10.longValue();
            q0Var.g = longValue;
            q0Var.h = longValue;
            oVar.a(q0Var);
        }
        r51 r51Var2 = r51VarArr[0];
        if (r51Var2 != null) {
            gyVar.I0 = null;
            r51Var2.dismiss();
        }
    }
}
