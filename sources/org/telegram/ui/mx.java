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
public final class mx extends z61 {
    public final /* synthetic */ q61[] d2;
    public final /* synthetic */ ry e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx(ry ryVar, ry ryVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.d6 d6Var, q61[] q61VarArr) {
        super(ryVar2, activity, true, num, 0, d6Var);
        this.e2 = ryVar;
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.z61
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.TL_emojiStatus tL_emojiStatus;
        TLRPC.EmojiStatus emojiStatus;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.d6 d6Var;
        q61[] q61VarArr = this.d2;
        ry ryVar = this.e2;
        if (l4 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i10 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
                TL_stars.SavedStarGift n10 = yh.t5.y(i10, false).n(tL_starGiftUnique.id);
                if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                    MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i11 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
                    i12 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
                    long clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    d6Var = ((org.telegram.ui.ActionBar.n2) ryVar).resourceProvider;
                    yh.y3 y3Var = new yh.y3(context, i11, clientUserId, d6Var, null);
                    y3Var.j2(n10, null);
                    y3Var.m2();
                    y3Var.show();
                    q61 q61Var = q61VarArr[0];
                    if (q61Var != null) {
                        ryVar.M0 = null;
                        q61Var.dismiss();
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
                tL_emojiStatus2.document_id = l4.longValue();
                tL_emojiStatus = tL_emojiStatus2;
                if (num != null) {
                    tL_emojiStatus2.flags |= 1;
                    tL_emojiStatus2.until = num.intValue();
                    tL_emojiStatus = tL_emojiStatus2;
                }
            }
            emojiStatus = tL_emojiStatus;
        }
        ryVar.getMessagesController().updateEmojiStatus(emojiStatus, tL_starGiftUnique);
        if (l4 != null) {
            org.telegram.ui.Cells.o oVar = ryVar.E3;
            zg.p0 p0Var = new zg.p0();
            long longValue = l4.longValue();
            p0Var.g = longValue;
            p0Var.h = longValue;
            oVar.a(p0Var);
        }
        q61 q61Var2 = q61VarArr[0];
        if (q61Var2 != null) {
            ryVar.M0 = null;
            q61Var2.dismiss();
        }
    }
}
