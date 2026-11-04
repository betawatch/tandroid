package d2;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class x extends f1 {
    public static final String d;
    public static final String e;
    public final boolean b;
    public final boolean c;

    static {
        String str = g2.n0.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public x() {
        this.b = false;
        this.c = false;
    }

    @Override // d2.f1
    public final boolean b() {
        return this.b;
    }

    @Override // d2.f1
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(f1.a, 0);
        bundle.putBoolean(d, this.b);
        bundle.putBoolean(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.c == xVar.c && this.b == xVar.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public x(boolean z10) {
        this.b = true;
        this.c = z10;
    }
}
