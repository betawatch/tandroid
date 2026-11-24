// default package

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class en8 extends tx9 {
    public final /* synthetic */ kx9[] f2;
    public final /* synthetic */ ProfileActivity g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en8(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i, wjb wjbVar, int i2, kx9[] kx9VarArr) {
        super(profileActivity2, activity, true, num, i, true, wjbVar, i2);
        this.g2 = profileActivity;
        this.f2 = kx9VarArr;
    }

    @Override // tx9
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i = ((d) this.g2).currentAccount;
        return gta.v(i, false).k(tL_starGiftUnique.id) == null || na7.c1().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // tx9
    public final long getDialogId() {
        return this.g2.a();
    }

    @Override // tx9
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.EmojiStatus emojiStatus;
        int i;
        int i2;
        int i3;
        kx9[] kx9VarArr = this.f2;
        ProfileActivity profileActivity = this.g2;
        if (tL_starGiftUnique != null) {
            i = ((d) profileActivity).currentAccount;
            TL_stars.SavedStarGift k = gta.v(i, false).k(tL_starGiftUnique.id);
            if (k != null && na7.c1().getInt("statusgiftpage", 0) < 2) {
                na7.c1().edit().putInt("statusgiftpage", na7.c1().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i2 = ((d) profileActivity).currentAccount;
                i3 = ((d) profileActivity).currentAccount;
                vqa vqaVar = new vqa(context, i2, y6c.h(i3).e(), profileActivity.A0, null);
                vqaVar.n2(k, null);
                vqaVar.s2();
                vqaVar.show();
                kx9 kx9Var = kx9VarArr[0];
                if (kx9Var != null) {
                    profileActivity.T5 = null;
                    kx9Var.dismiss();
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
        } else if (l == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = l.longValue();
            emojiStatus = tL_emojiStatus;
            if (num != null) {
                tL_emojiStatus.flags |= 1;
                tL_emojiStatus.until = num.intValue();
                emojiStatus = tL_emojiStatus;
            }
        }
        profileActivity.F = tL_starGiftUnique != null ? Long.valueOf(tL_starGiftUnique.id) : null;
        na7 messagesController = profileActivity.getMessagesController();
        TLRPC.Chat chat = profileActivity.F2;
        messagesController.l5(chat == null ? 0L : -chat.id, emojiStatus, tL_starGiftUnique);
        tl tlVar = profileActivity.G;
        if (tlVar != null) {
            if (l != null) {
                tlVar.j(l.longValue(), true);
            } else if (profileActivity.F2 == null) {
                tlVar.g(profileActivity.h2(), true);
            } else {
                tlVar.g(null, true);
            }
            profileActivity.G.m(tL_starGiftUnique != null, true);
        }
        if (l != null) {
            ym ymVar = profileActivity.e0;
            h19 h19Var = new h19();
            long longValue = l.longValue();
            h19Var.g = longValue;
            h19Var.h = longValue;
            ymVar.a(h19Var);
        }
        profileActivity.L3();
        profileActivity.N3();
        kx9 kx9Var2 = kx9VarArr[0];
        if (kx9Var2 != null) {
            profileActivity.T5 = null;
            kx9Var2.dismiss();
        }
    }
}
