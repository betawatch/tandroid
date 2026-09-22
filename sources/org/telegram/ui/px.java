package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class px extends h71 {
    public final /* synthetic */ y61[] d2;
    public final /* synthetic */ uy e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px(uy uyVar, uy uyVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.e6 e6Var, y61[] y61VarArr) {
        super(uyVar2, activity, true, num, 0, e6Var);
        this.e2 = uyVar;
        this.d2 = y61VarArr;
    }

    @Override // org.telegram.ui.h71
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i10 = ((org.telegram.ui.ActionBar.n2) this.e2).currentAccount;
        return yh.u5.y(i10, false).n(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.h71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.TL_emojiStatus tL_emojiStatus;
        TLRPC.EmojiStatus emojiStatus;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.e6 e6Var;
        y61[] y61VarArr = this.d2;
        uy uyVar = this.e2;
        if (l4 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i10 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                TL_stars.SavedStarGift n10 = yh.u5.y(i10, false).n(tL_starGiftUnique.id);
                if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                    MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i11 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                    i12 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                    long clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    e6Var = ((org.telegram.ui.ActionBar.n2) uyVar).resourceProvider;
                    yh.z3 z3Var = new yh.z3(context, i11, clientUserId, e6Var, null);
                    z3Var.j2(n10, null);
                    z3Var.m2();
                    z3Var.show();
                    y61 y61Var = y61VarArr[0];
                    if (y61Var != null) {
                        uyVar.M0 = null;
                        y61Var.dismiss();
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
        uyVar.getMessagesController().updateEmojiStatus(emojiStatus, tL_starGiftUnique);
        if (l4 != null) {
            org.telegram.ui.Cells.o oVar = uyVar.E3;
            zg.p0 p0Var = new zg.p0();
            long longValue = l4.longValue();
            p0Var.g = longValue;
            p0Var.h = longValue;
            oVar.a(p0Var);
        }
        y61 y61Var2 = y61VarArr[0];
        if (y61Var2 != null) {
            uyVar.M0 = null;
            y61Var2.dismiss();
        }
    }
}
