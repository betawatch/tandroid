package e2;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class w extends d1 {
    public static final String d;
    public static final String e;
    public final boolean b;
    public final boolean c;

    static {
        String str = h2.m0.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public w() {
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
        bundle.putInt(d1.a, 0);
        bundle.putBoolean(d, this.b);
        bundle.putBoolean(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.c == wVar.c && this.b == wVar.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public w(boolean z9) {
        this.b = true;
        this.c = z9;
    }
}
