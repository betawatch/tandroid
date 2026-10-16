package b2;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class z extends h1 {
    public static final String d;
    public static final String e;
    public final boolean b;
    public final boolean c;

    static {
        String str = e2.m0.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public z() {
        this.b = false;
        this.c = false;
    }

    @Override // b2.h1
    public final boolean b() {
        return this.b;
    }

    @Override // b2.h1
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(h1.a, 0);
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
