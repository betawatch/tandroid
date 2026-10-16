package ah;

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.s5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class i1 {
    public boolean a;
    public boolean b;
    public long c;
    public boolean d;
    public boolean e;
    public String f;
    public long g;
    public long h;

    public static i1 b(String str) {
        if (str == null) {
            str = "";
        }
        i1 i1Var = new i1();
        if (!str.startsWith("animated_")) {
            i1Var.f = str;
            i1Var.h = str.hashCode();
            return i1Var;
        }
        try {
            long parseLong = Long.parseLong(str.substring(9));
            i1Var.g = parseLong;
            i1Var.h = parseLong;
            return i1Var;
        } catch (Exception unused) {
            i1Var.f = str;
            i1Var.h = str.hashCode();
            return i1Var;
        }
    }

    public static i1 c(TLRPC.TL_availableReaction tL_availableReaction) {
        i1 i1Var = new i1();
        i1Var.f = tL_availableReaction.reaction;
        i1Var.h = r3.hashCode();
        return i1Var;
    }

    public static i1 d(TLRPC.Reaction reaction) {
        i1 i1Var = new i1();
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            i1Var.a = true;
            return i1Var;
        }
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            i1Var.f = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            i1Var.h = r3.hashCode();
            return i1Var;
        }
        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            long j10 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
            i1Var.g = j10;
            i1Var.h = j10;
        }
        return i1Var;
    }

    public static i1 e(TLRPC.TL_availableEffect tL_availableEffect) {
        i1 i1Var = new i1();
        i1Var.b = true;
        long j10 = tL_availableEffect.id;
        i1Var.c = j10;
        i1Var.e = tL_availableEffect.effect_animation_id == 0;
        i1Var.g = tL_availableEffect.effect_sticker_id;
        i1Var.h = j10;
        i1Var.d = tL_availableEffect.premium_required;
        i1Var.f = tL_availableEffect.emoticon;
        return i1Var;
    }

    public final i1 a() {
        String findAnimatedEmojiEmoticon;
        long j10 = this.g;
        return (j10 == 0 || (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(s5.f(UserConfig.selectedAccount, j10), null)) == null) ? this : b(findAnimatedEmojiEmoticon);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i1.class == obj.getClass()) {
            i1 i1Var = (i1) obj;
            if (this.g == i1Var.g && Objects.equals(this.f, i1Var.f)) {
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
        if (j10 != 0 && (f7 = s5.f(UserConfig.selectedAccount, j10)) != null) {
            return MessageObject.findAnimatedEmojiEmoticon(f7, null);
        }
        StringBuilder sb2 = new StringBuilder("VisibleReaction{");
        sb2.append(this.g);
        sb2.append(", ");
        return a1.g.s(sb2, this.f, "}");
    }
}
