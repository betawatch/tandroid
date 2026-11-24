// default package

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class h19 {
    public boolean a;
    public boolean b;
    public long c;
    public boolean d;
    public boolean e;
    public String f;
    public long g;
    public long h;

    public static h19 b(String str) {
        if (str == null) {
            str = "";
        }
        h19 h19Var = new h19();
        if (!str.startsWith("animated_")) {
            h19Var.f = str;
            h19Var.h = str.hashCode();
            return h19Var;
        }
        try {
            long parseLong = Long.parseLong(str.substring(9));
            h19Var.g = parseLong;
            h19Var.h = parseLong;
            return h19Var;
        } catch (Exception unused) {
            h19Var.f = str;
            h19Var.h = str.hashCode();
            return h19Var;
        }
    }

    public static h19 c(TLRPC.TL_availableReaction tL_availableReaction) {
        h19 h19Var = new h19();
        h19Var.f = tL_availableReaction.reaction;
        h19Var.h = r3.hashCode();
        return h19Var;
    }

    public static h19 d(TLRPC.Reaction reaction) {
        h19 h19Var = new h19();
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            h19Var.a = true;
            return h19Var;
        }
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            h19Var.f = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            h19Var.h = r3.hashCode();
            return h19Var;
        }
        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            long j = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
            h19Var.g = j;
            h19Var.h = j;
        }
        return h19Var;
    }

    public static h19 e(TLRPC.TL_availableEffect tL_availableEffect) {
        h19 h19Var = new h19();
        h19Var.b = true;
        long j = tL_availableEffect.id;
        h19Var.c = j;
        h19Var.e = tL_availableEffect.effect_animation_id == 0;
        h19Var.g = tL_availableEffect.effect_sticker_id;
        h19Var.h = j;
        h19Var.d = tL_availableEffect.premium_required;
        h19Var.f = tL_availableEffect.emoticon;
        return h19Var;
    }

    public final h19 a() {
        String V;
        long j = this.g;
        return (j == 0 || (V = k27.V(vl.e(y6c.t0, j), null, null)) == null) ? this : b(V);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h19.class == obj.getClass()) {
            h19 h19Var = (h19) obj;
            if (this.g == h19Var.g && Objects.equals(this.f, h19Var.f)) {
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
        if (j != 0 && (e = vl.e(y6c.t0, j)) != null) {
            return k27.V(e, null, null);
        }
        StringBuilder sb = new StringBuilder("VisibleReaction{");
        sb.append(this.g);
        sb.append(", ");
        return b00.j(sb, this.f, "}");
    }
}
