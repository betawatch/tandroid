// default package

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class eta extends g19 {
    public static final String d;
    public static final String e;
    public final int b;
    public final float c;

    static {
        String str = hac.a;
        d = "1";
        e = "2";
    }

    public eta(int i, float f) {
        boolean z = false;
        jte.e("maxStars must be a positive integer", i > 0);
        if (f >= 0.0f && f <= i) {
            z = true;
        }
        jte.e("starRating is out of range [0, maxStars]", z);
        this.b = i;
        this.c = f;
    }

    @Override // g19
    public final boolean b() {
        return this.c != -1.0f;
    }

    @Override // g19
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(g19.a, 2);
        bundle.putInt(d, this.b);
        bundle.putFloat(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eta)) {
            return false;
        }
        eta etaVar = (eta) obj;
        return this.b == etaVar.b && this.c == etaVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Float.valueOf(this.c));
    }

    public eta(int i) {
        jte.e("maxStars must be a positive integer", i > 0);
        this.b = i;
        this.c = -1.0f;
    }
}
