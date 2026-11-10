package e2;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class g1 extends d1 {
    public static final String d;
    public static final String e;
    public final boolean b;
    public final boolean c;

    static {
        String str = h2.m0.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public g1() {
        this.b = false;
        this.c = false;
    }

    @Override // e2.d1
    public final boolean b() {
        return this.b;
    }

    @Override // e2.d1
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.a, 3);
        bundle.putBoolean(d, this.b);
        bundle.putBoolean(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return this.c == g1Var.c && this.b == g1Var.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public g1(boolean z9) {
        this.b = true;
        this.c = z9;
    }
}
