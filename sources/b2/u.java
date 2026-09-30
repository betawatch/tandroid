package b2;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class u extends c1 {
    public static final String d;
    public static final String e;
    public final boolean b;
    public final boolean c;

    static {
        String str = e2.d0.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public u() {
        this.b = false;
        this.c = false;
    }

    @Override // b2.c1
    public final boolean b() {
        return this.b;
    }

    @Override // b2.c1
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.a, 0);
        bundle.putBoolean(d, this.b);
        bundle.putBoolean(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.c == uVar.c && this.b == uVar.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public u(boolean z10) {
        this.b = true;
        this.c = z10;
    }
}
