package ig;

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k5;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class q0 {
    public boolean a;
    public boolean b;
    public long c;
    public boolean d;
    public boolean e;
    public String f;
    public long g;
    public long h;

    public static q0 b(String str) {
        if (str == null) {
            str = "";
        }
        q0 q0Var = new q0();
        if (!str.startsWith("animated_")) {
            q0Var.f = str;
            q0Var.h = str.hashCode();
            return q0Var;
        }
        try {
            long parseLong = Long.parseLong(str.substring(9));
            q0Var.g = parseLong;
            q0Var.h = parseLong;
            return q0Var;
        } catch (Exception unused) {
            q0Var.f = str;
            q0Var.h = str.hashCode();
            return q0Var;
        }
    }

    public static q0 c(TLRPC.TL_availableReaction tL_availableReaction) {
        q0 q0Var = new q0();
        q0Var.f = tL_availableReaction.reaction;
        q0Var.h = r3.hashCode();
        return q0Var;
    }

    public static q0 d(TLRPC.Reaction reaction) {
        q0 q0Var = new q0();
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            q0Var.a = true;
            return q0Var;
        }
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            q0Var.f = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            q0Var.h = r3.hashCode();
            return q0Var;
        }
        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            long j10 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
            q0Var.g = j10;
            q0Var.h = j10;
        }
        return q0Var;
    }

    public static q0 e(TLRPC.TL_availableEffect tL_availableEffect) {
        q0 q0Var = new q0();
        q0Var.b = true;
        long j10 = tL_availableEffect.id;
        q0Var.c = j10;
        q0Var.e = tL_availableEffect.effect_animation_id == 0;
        q0Var.g = tL_availableEffect.effect_sticker_id;
        q0Var.h = j10;
        q0Var.d = tL_availableEffect.premium_required;
        q0Var.f = tL_availableEffect.emoticon;
        return q0Var;
    }

    public final q0 a() {
        String findAnimatedEmojiEmoticon;
        long j10 = this.g;
        return (j10 == 0 || (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(k5.f(UserConfig.selectedAccount, j10), null)) == null) ? this : b(findAnimatedEmojiEmoticon);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q0.class == obj.getClass()) {
            q0 q0Var = (q0) obj;
            if (this.g == q0Var.g && Objects.equals(this.f, q0Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(TLRPC.Reaction reaction) {
        return reaction instanceof TLRPC.TL_reactionEmoji ? TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, this.f) : (reaction instanceof TLRPC.TL_reactionCustomEmoji) && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == this.g;
    }

    public final TLRPC.Reaction g() {
        if (this.a) {
            return new TLRPC.TL_reactionPaid();
        }
        if (this.f != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = this.f;
            return tL_reactionEmoji;
        }
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
        tL_reactionCustomEmoji.document_id = this.g;
        return tL_reactionCustomEmoji;
    }

    public final int hashCode() {
        return Objects.hash(this.f, Long.valueOf(this.g));
    }

    public final String toString() {
        TLRPC.Document f10;
        if (!TextUtils.isEmpty(this.f)) {
            return this.f;
        }
        long j10 = this.g;
        if (j10 != 0 && (f10 = k5.f(UserConfig.selectedAccount, j10)) != null) {
            return MessageObject.findAnimatedEmojiEmoticon(f10, null);
        }
        StringBuilder sb2 = new StringBuilder("VisibleReaction{");
        sb2.append(this.g);
        sb2.append(", ");
        return a9.p.p(sb2, this.f, "}");
    }
}
