package b2;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class z extends g1 {
    public static final String d;
    public static final String e;
    public final boolean b;
    public final boolean c;

    static {
        String str = e2.l0.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public z() {
        this.b = false;
        this.c = false;
    }

    @Override // b2.g1
    public final boolean b() {
        return this.b;
    }

    @Override // b2.g1
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(g1.a, 0);
        bundle.putBoolean(d, this.b);
        bundle.putBoolean(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.c == zVar.c && this.b == zVar.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public z(boolean z10) {
        this.b = true;
        this.c = z10;
    }
}
