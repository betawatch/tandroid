// default package

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class g58 extends g19 {
    public static final String c;
    public final float b;

    static {
        String str = hac.a;
        c = "1";
    }

    public g58(float f) {
        jte.e("percent must be in the range of [0, 100]", f >= 0.0f && f <= 100.0f);
        this.b = f;
    }

    @Override // g19
    public final boolean b() {
        return this.b != -1.0f;
    }

    @Override // g19
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(g19.a, 1);
        bundle.putFloat(c, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g58) {
            return this.b == ((g58) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.b));
    }

    public g58() {
        this.b = -1.0f;
    }
}
