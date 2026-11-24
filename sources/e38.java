// default package

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class e38 extends fz8 {
    public static final String c;
    public final float b;

    static {
        String str = g8c.a;
        c = "1";
    }

    public e38(float f) {
        gre.e("percent must be in the range of [0, 100]", f >= 0.0f && f <= 100.0f);
        this.b = f;
    }

    @Override // fz8
    public final boolean b() {
        return this.b != -1.0f;
    }

    @Override // fz8
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(fz8.a, 1);
        bundle.putFloat(c, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e38) {
            return this.b == ((e38) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.b));
    }

    public e38() {
        this.b = -1.0f;
    }
}
