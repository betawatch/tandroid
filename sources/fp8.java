// default package

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fp8 extends vz9 {
    public final /* synthetic */ mz9[] f2;
    public final /* synthetic */ ProfileActivity g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp8(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i, ylb ylbVar, int i2, mz9[] mz9VarArr) {
        super(profileActivity2, activity, true, num, i, true, ylbVar, i2);
        this.g2 = profileActivity;
        this.f2 = mz9VarArr;
    }

    @Override // vz9
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i = ((d) this.g2).currentAccount;
        return jva.v(i, false).k(tL_starGiftUnique.id) == null || oc7.d1().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // vz9
    public final long getDialogId() {
        return this.g2.a();
    }

    @Override // vz9
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.EmojiStatus emojiStatus;
        int i;
        int i2;
        int i3;
        mz9[] mz9VarArr = this.f2;
        ProfileActivity profileActivity = this.g2;
        if (tL_starGiftUnique != null) {
            i = ((d) profileActivity).currentAccount;
            TL_stars.SavedStarGift k = jva.v(i, false).k(tL_starGiftUnique.id);
            if (k != null && oc7.d1().getInt("statusgiftpage", 0) < 2) {
                oc7.d1().edit().putInt("statusgiftpage", oc7.d1().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i2 = ((d) profileActivity).currentAccount;
                i3 = ((d) profileActivity).currentAccount;
                wsa wsaVar = new wsa(context, i2, z8c.h(i3).e(), profileActivity.A0, null);
                wsaVar.n2(k, null);
                wsaVar.s2();
                wsaVar.show();
                mz9 mz9Var = mz9VarArr[0];
                if (mz9Var != null) {
                    profileActivity.Y5 = null;
                    mz9Var.dismiss();
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
        oc7 messagesController = profileActivity.getMessagesController();
        TLRPC.Chat chat = profileActivity.F2;
        messagesController.o5(chat == null ? 0L : -chat.id, emojiStatus, tL_starGiftUnique);
        tm tmVar = profileActivity.G;
        if (tmVar != null) {
            if (l != null) {
                tmVar.j(l.longValue(), true);
            } else if (profileActivity.F2 == null) {
                tmVar.g(profileActivity.j2(), true);
            } else {
                tmVar.g(null, true);
            }
            profileActivity.G.m(tL_starGiftUnique != null, true);
        }
        if (l != null) {
            yn ynVar = profileActivity.e0;
            k39 k39Var = new k39();
            long longValue = l.longValue();
            k39Var.g = longValue;
            k39Var.h = longValue;
            ynVar.a(k39Var);
        }
        profileActivity.P3();
        profileActivity.R3();
        mz9 mz9Var2 = mz9VarArr[0];
        if (mz9Var2 != null) {
            profileActivity.Y5 = null;
            mz9Var2.dismiss();
        }
    }
}
