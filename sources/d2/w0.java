package d2;

import android.os.Bundle;
import b8.zb;
import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class w0 extends f1 {
    public static final String c;
    public final float b;

    static {
        String str = g2.n0.a;
        c = Integer.toString(1, 36);
    }

    public w0() {
        this.b = -1.0f;
    }

    @Override // d2.f1
    public final boolean b() {
        return this.b != -1.0f;
    }

    @Override // d2.f1
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(f1.a, 1);
        bundle.putFloat(c, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w0) {
            return this.b == ((w0) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.b));
    }

    public w0(float f10) {
        zb.e("percent must be in the range of [0, 100]", f10 >= 0.0f && f10 <= 100.0f);
        this.b = f10;
    }
}
