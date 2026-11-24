// default package

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lpb extends g19 {
    public static final String d;
    public static final String e;
    public final boolean b;
    public final boolean c;

    static {
        String str = hac.a;
        d = "1";
        e = "2";
    }

    public lpb() {
        this.b = false;
        this.c = false;
    }

    @Override // g19
    public final boolean b() {
        return this.b;
    }

    @Override // g19
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(g19.a, 3);
        bundle.putBoolean(d, this.b);
        bundle.putBoolean(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lpb)) {
            return false;
        }
        lpb lpbVar = (lpb) obj;
        return this.c == lpbVar.c && this.b == lpbVar.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public lpb(boolean z) {
        this.b = true;
        this.c = z;
    }
}
