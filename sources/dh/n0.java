package dh;

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.messenger.h10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g5;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n0 {
    public boolean a;
    public boolean b;
    public long c;
    public boolean d;
    public boolean e;
    public String f;
    public long g;
    public long h;

    public static n0 b(String str) {
        if (str == null) {
            str = "";
        }
        n0 n0Var = new n0();
        if (!str.startsWith("animated_")) {
            n0Var.f = str;
            n0Var.h = str.hashCode();
            return n0Var;
        }
        try {
            long parseLong = Long.parseLong(str.substring(9));
            n0Var.g = parseLong;
            n0Var.h = parseLong;
            return n0Var;
        } catch (Exception unused) {
            n0Var.f = str;
            n0Var.h = str.hashCode();
            return n0Var;
        }
    }

    public static n0 c(TLRPC.TL_availableReaction tL_availableReaction) {
        n0 n0Var = new n0();
        n0Var.f = tL_availableReaction.reaction;
        n0Var.h = r3.hashCode();
        return n0Var;
    }

    public static n0 d(TLRPC.Reaction reaction) {
        n0 n0Var = new n0();
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            n0Var.a = true;
            return n0Var;
        }
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            n0Var.f = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            n0Var.h = r3.hashCode();
            return n0Var;
        }
        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            long j10 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
            n0Var.g = j10;
            n0Var.h = j10;
        }
        return n0Var;
    }

    public static n0 e(TLRPC.TL_availableEffect tL_availableEffect) {
        n0 n0Var = new n0();
        n0Var.b = true;
        long j10 = tL_availableEffect.id;
        n0Var.c = j10;
        n0Var.e = tL_availableEffect.effect_animation_id == 0;
        n0Var.g = tL_availableEffect.effect_sticker_id;
        n0Var.h = j10;
        n0Var.d = tL_availableEffect.premium_required;
        n0Var.f = tL_availableEffect.emoticon;
        return n0Var;
    }

    public final n0 a() {
        String V;
        long j10 = this.g;
        return (j10 == 0 || (V = zi.V(g5.e(h10.t0, j10), null, null)) == null) ? this : b(V);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n0.class == obj.getClass()) {
            n0 n0Var = (n0) obj;
            if (this.g == n0Var.g && Objects.equals(this.f, n0Var.f)) {
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
        TLRPC.Document e10;
        if (!TextUtils.isEmpty(this.f)) {
            return this.f;
        }
        long j10 = this.g;
        if (j10 != 0 && (e10 = g5.e(h10.t0, j10)) != null) {
            return zi.V(e10, null, null);
        }
        StringBuilder sb2 = new StringBuilder("VisibleReaction{");
        sb2.append(this.g);
        sb2.append(", ");
        return a1.g.s(sb2, this.f, "}");
    }
}
