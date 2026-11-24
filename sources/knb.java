// default package

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class knb extends fz8 {
    public static final String d;
    public static final String e;
    public final boolean b;
    public final boolean c;

    static {
        String str = g8c.a;
        d = "1";
        e = "2";
    }

    public knb() {
        this.b = false;
        this.c = false;
    }

    @Override // fz8
    public final boolean b() {
        return this.b;
    }

    @Override // fz8
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(fz8.a, 3);
        bundle.putBoolean(d, this.b);
        bundle.putBoolean(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof knb)) {
            return false;
        }
        knb knbVar = (knb) obj;
        return this.c == knbVar.c && this.b == knbVar.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public knb(boolean z) {
        this.b = true;
        this.c = z;
    }
}
