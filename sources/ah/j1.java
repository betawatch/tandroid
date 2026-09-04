package ah;

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q5;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class j1 {
    public boolean a;
    public boolean b;
    public long c;
    public boolean d;
    public boolean e;
    public String f;
    public long g;
    public long h;

    public static j1 b(String str) {
        if (str == null) {
            str = "";
        }
        j1 j1Var = new j1();
        if (!str.startsWith("animated_")) {
            j1Var.f = str;
            j1Var.h = str.hashCode();
            return j1Var;
        }
        try {
            long parseLong = Long.parseLong(str.substring(9));
            j1Var.g = parseLong;
            j1Var.h = parseLong;
            return j1Var;
        } catch (Exception unused) {
            j1Var.f = str;
            j1Var.h = str.hashCode();
            return j1Var;
        }
    }

    public static j1 c(TLRPC.TL_availableReaction tL_availableReaction) {
        j1 j1Var = new j1();
        j1Var.f = tL_availableReaction.reaction;
        j1Var.h = r3.hashCode();
        return j1Var;
    }

    public static j1 d(TLRPC.Reaction reaction) {
        j1 j1Var = new j1();
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            j1Var.a = true;
            return j1Var;
        }
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            j1Var.f = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            j1Var.h = r3.hashCode();
            return j1Var;
        }
        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            long j3 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
            j1Var.g = j3;
            j1Var.h = j3;
        }
        return j1Var;
    }

    public static j1 e(TLRPC.TL_availableEffect tL_availableEffect) {
        j1 j1Var = new j1();
        j1Var.b = true;
        long j3 = tL_availableEffect.id;
        j1Var.c = j3;
        j1Var.e = tL_availableEffect.effect_animation_id == 0;
        j1Var.g = tL_availableEffect.effect_sticker_id;
        j1Var.h = j3;
        j1Var.d = tL_availableEffect.premium_required;
        j1Var.f = tL_availableEffect.emoticon;
        return j1Var;
    }

    public final j1 a() {
        String findAnimatedEmojiEmoticon;
        long j3 = this.g;
        return (j3 == 0 || (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(q5.f(UserConfig.selectedAccount, j3), null)) == null) ? this : b(findAnimatedEmojiEmoticon);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j1.class == obj.getClass()) {
            j1 j1Var = (j1) obj;
            if (this.g == j1Var.g && Objects.equals(this.f, j1Var.f)) {
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
        long j3 = this.g;
        if (j3 != 0 && (f7 = q5.f(UserConfig.selectedAccount, j3)) != null) {
            return MessageObject.findAnimatedEmojiEmoticon(f7, null);
        }
        StringBuilder sb2 = new StringBuilder("VisibleReaction{");
        sb2.append(this.g);
        sb2.append(", ");
        return a4.a.s(sb2, this.f, "}");
    }
}
