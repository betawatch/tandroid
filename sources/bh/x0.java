package bh;

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t5;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class x0 {
    public boolean a;
    public boolean b;
    public long c;
    public boolean d;
    public boolean e;
    public String f;
    public long g;
    public long h;

    public static x0 b(String str) {
        if (str == null) {
            str = "";
        }
        x0 x0Var = new x0();
        if (!str.startsWith("animated_")) {
            x0Var.f = str;
            x0Var.h = str.hashCode();
            return x0Var;
        }
        try {
            long parseLong = Long.parseLong(str.substring(9));
            x0Var.g = parseLong;
            x0Var.h = parseLong;
            return x0Var;
        } catch (Exception unused) {
            x0Var.f = str;
            x0Var.h = str.hashCode();
            return x0Var;
        }
    }

    public static x0 c(TLRPC.TL_availableReaction tL_availableReaction) {
        x0 x0Var = new x0();
        x0Var.f = tL_availableReaction.reaction;
        x0Var.h = r3.hashCode();
        return x0Var;
    }

    public static x0 d(TLRPC.Reaction reaction) {
        x0 x0Var = new x0();
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            x0Var.a = true;
            return x0Var;
        }
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            x0Var.f = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            x0Var.h = r3.hashCode();
            return x0Var;
        }
        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            long j10 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
            x0Var.g = j10;
            x0Var.h = j10;
        }
        return x0Var;
    }

    public static x0 e(TLRPC.TL_availableEffect tL_availableEffect) {
        x0 x0Var = new x0();
        x0Var.b = true;
        long j10 = tL_availableEffect.id;
        x0Var.c = j10;
        x0Var.e = tL_availableEffect.effect_animation_id == 0;
        x0Var.g = tL_availableEffect.effect_sticker_id;
        x0Var.h = j10;
        x0Var.d = tL_availableEffect.premium_required;
        x0Var.f = tL_availableEffect.emoticon;
        return x0Var;
    }

    public final x0 a() {
        String findAnimatedEmojiEmoticon;
        long j10 = this.g;
        return (j10 == 0 || (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(t5.f(UserConfig.selectedAccount, j10), null)) == null) ? this : b(findAnimatedEmojiEmoticon);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x0.class == obj.getClass()) {
            x0 x0Var = (x0) obj;
            if (this.g == x0Var.g && Objects.equals(this.f, x0Var.f)) {
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
        TLRPC.Document f7;
        if (!TextUtils.isEmpty(this.f)) {
            return this.f;
        }
        long j10 = this.g;
        if (j10 != 0 && (f7 = t5.f(UserConfig.selectedAccount, j10)) != null) {
            return MessageObject.findAnimatedEmojiEmoticon(f7, null);
        }
        StringBuilder sb2 = new StringBuilder("VisibleReaction{");
        sb2.append(this.g);
        sb2.append(", ");
        return a1.g.s(sb2, this.f, "}");
    }
}
