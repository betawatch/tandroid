package hg;

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r0 {
    public boolean a;
    public boolean b;
    public long c;
    public boolean d;
    public boolean e;
    public String f;
    public long g;
    public long h;

    public static r0 b(String str) {
        if (str == null) {
            str = "";
        }
        r0 r0Var = new r0();
        if (!str.startsWith("animated_")) {
            r0Var.f = str;
            r0Var.h = str.hashCode();
            return r0Var;
        }
        try {
            long parseLong = Long.parseLong(str.substring(9));
            r0Var.g = parseLong;
            r0Var.h = parseLong;
            return r0Var;
        } catch (Exception unused) {
            r0Var.f = str;
            r0Var.h = str.hashCode();
            return r0Var;
        }
    }

    public static r0 c(TLRPC.TL_availableReaction tL_availableReaction) {
        r0 r0Var = new r0();
        r0Var.f = tL_availableReaction.reaction;
        r0Var.h = r3.hashCode();
        return r0Var;
    }

    public static r0 d(TLRPC.Reaction reaction) {
        r0 r0Var = new r0();
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            r0Var.a = true;
            return r0Var;
        }
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            r0Var.f = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            r0Var.h = r3.hashCode();
            return r0Var;
        }
        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            long j10 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
            r0Var.g = j10;
            r0Var.h = j10;
        }
        return r0Var;
    }

    public static r0 e(TLRPC.TL_availableEffect tL_availableEffect) {
        r0 r0Var = new r0();
        r0Var.b = true;
        long j10 = tL_availableEffect.id;
        r0Var.c = j10;
        r0Var.e = tL_availableEffect.effect_animation_id == 0;
        r0Var.g = tL_availableEffect.effect_sticker_id;
        r0Var.h = j10;
        r0Var.d = tL_availableEffect.premium_required;
        r0Var.f = tL_availableEffect.emoticon;
        return r0Var;
    }

    public final r0 a() {
        String findAnimatedEmojiEmoticon;
        long j10 = this.g;
        return (j10 == 0 || (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(k5.f(UserConfig.selectedAccount, j10), null)) == null) ? this : b(findAnimatedEmojiEmoticon);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r0.class == obj.getClass()) {
            r0 r0Var = (r0) obj;
            if (this.g == r0Var.g && Objects.equals(this.f, r0Var.f)) {
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
        return aa.d.r(sb2, this.f, "}");
    }
}
