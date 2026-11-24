// default package

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class dra extends fz8 {
    public static final String d;
    public static final String e;
    public final int b;
    public final float c;

    static {
        String str = g8c.a;
        d = "1";
        e = "2";
    }

    public dra(int i, float f) {
        boolean z = false;
        gre.e("maxStars must be a positive integer", i > 0);
        if (f >= 0.0f && f <= i) {
            z = true;
        }
        gre.e("starRating is out of range [0, maxStars]", z);
        this.b = i;
        this.c = f;
    }

    @Override // fz8
    public final boolean b() {
        return this.c != -1.0f;
    }

    @Override // fz8
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(fz8.a, 2);
        bundle.putInt(d, this.b);
        bundle.putFloat(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dra)) {
            return false;
        }
        dra draVar = (dra) obj;
        return this.b == draVar.b && this.c == draVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Float.valueOf(this.c));
    }

    public dra(int i) {
        gre.e("maxStars must be a positive integer", i > 0);
        this.b = i;
        this.c = -1.0f;
    }
}
