// default package

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class fva extends s29 {
    public static final String d;
    public static final String e;
    public final int b;
    public final float c;

    static {
        String str = gcc.a;
        d = "1";
        e = "2";
    }

    public fva(int i, float f) {
        boolean z = false;
        yve.e("maxStars must be a positive integer", i > 0);
        if (f >= 0.0f && f <= i) {
            z = true;
        }
        yve.e("starRating is out of range [0, maxStars]", z);
        this.b = i;
        this.c = f;
    }

    @Override // s29
    public final boolean b() {
        return this.c != -1.0f;
    }

    @Override // s29
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(s29.a, 2);
        bundle.putInt(d, this.b);
        bundle.putFloat(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fva)) {
            return false;
        }
        fva fvaVar = (fva) obj;
        return this.b == fvaVar.b && this.c == fvaVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Float.valueOf(this.c));
    }

    public fva(int i) {
        yve.e("maxStars must be a positive integer", i > 0);
        this.b = i;
        this.c = -1.0f;
    }
}
