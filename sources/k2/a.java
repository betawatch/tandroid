package k2;

import android.os.Build;
import e9.m2;
import j$.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class a {
    public static final a d;
    public final int a;
    public final int b;
    public final e9.y0 c;

    static {
        a aVar;
        if (Build.VERSION.SDK_INT >= 33) {
            e9.x0 x0Var = new e9.x0(4);
            for (int i10 = 1; i10 <= 10; i10++) {
                x0Var.c(Integer.valueOf(e2.m0.t(i10)));
            }
            aVar = new a(2, x0Var.g());
        } else {
            aVar = new a(2, 10);
        }
        d = aVar;
    }

    public a(int i10, Set set) {
        this.a = i10;
        e9.y0 u10 = e9.y0.u(set);
        this.c = u10;
        m2 it = u10.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 = Math.max(i11, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && Objects.equals(this.c, aVar.c);
    }

    public final int hashCode() {
        int i10 = ((this.a * 31) + this.b) * 31;
        e9.y0 y0Var = this.c;
        return i10 + (y0Var == null ? 0 : y0Var.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
    }

    public a(int i10, int i11) {
        this.a = i10;
        this.b = i11;
        this.c = null;
    }
}
