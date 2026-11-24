// default package

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class k39 {
    public boolean a;
    public boolean b;
    public long c;
    public boolean d;
    public boolean e;
    public String f;
    public long g;
    public long h;

    public static k39 b(String str) {
        if (str == null) {
            str = "";
        }
        k39 k39Var = new k39();
        if (!str.startsWith("animated_")) {
            k39Var.f = str;
            k39Var.h = str.hashCode();
            return k39Var;
        }
        try {
            long parseLong = Long.parseLong(str.substring(9));
            k39Var.g = parseLong;
            k39Var.h = parseLong;
            return k39Var;
        } catch (Exception unused) {
            k39Var.f = str;
            k39Var.h = str.hashCode();
            return k39Var;
        }
    }

    public static k39 c(TLRPC.TL_availableReaction tL_availableReaction) {
        k39 k39Var = new k39();
        k39Var.f = tL_availableReaction.reaction;
        k39Var.h = r3.hashCode();
        return k39Var;
    }

    public static k39 d(TLRPC.Reaction reaction) {
        k39 k39Var = new k39();
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            k39Var.a = true;
            return k39Var;
        }
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            k39Var.f = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            k39Var.h = r3.hashCode();
            return k39Var;
        }
        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            long j = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
            k39Var.g = j;
            k39Var.h = j;
        }
        return k39Var;
    }

    public static k39 e(TLRPC.TL_availableEffect tL_availableEffect) {
        k39 k39Var = new k39();
        k39Var.b = true;
        long j = tL_availableEffect.id;
        k39Var.c = j;
        k39Var.e = tL_availableEffect.effect_animation_id == 0;
        k39Var.g = tL_availableEffect.effect_sticker_id;
        k39Var.h = j;
        k39Var.d = tL_availableEffect.premium_required;
        k39Var.f = tL_availableEffect.emoticon;
        return k39Var;
    }

    public final k39 a() {
        String V;
        long j = this.g;
        return (j == 0 || (V = k47.V(vm.e(z8c.t0, j), null, null)) == null) ? this : b(V);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k39.class == obj.getClass()) {
            k39 k39Var = (k39) obj;
            if (this.g == k39Var.g && Objects.equals(this.f, k39Var.f)) {
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
        TLRPC.Document e;
        if (!TextUtils.isEmpty(this.f)) {
            return this.f;
        }
        long j = this.g;
        if (j != 0 && (e = vm.e(z8c.t0, j)) != null) {
            return k47.V(e, null, null);
        }
        StringBuilder sb = new StringBuilder("VisibleReaction{");
        sb.append(this.g);
        sb.append(", ");
        return b10.j(sb, this.f, "}");
    }
}
