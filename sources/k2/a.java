package k2;

import android.os.Build;
import f9.g2;
import j$.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a {
    public static final a d;
    public final int a;
    public final int b;
    public final f9.t0 c;

    static {
        a aVar;
        if (Build.VERSION.SDK_INT >= 33) {
            f9.s0 s0Var = new f9.s0(4);
            for (int i10 = 1; i10 <= 10; i10++) {
                s0Var.c(Integer.valueOf(e2.n0.t(i10)));
            }
            aVar = new a(2, s0Var.g());
        } else {
            aVar = new a(2, 10);
        }
        d = aVar;
    }

    public a(int i10, Set set) {
        this.a = i10;
        f9.t0 u10 = f9.t0.u(set);
        this.c = u10;
        g2 it = u10.iterator();
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
        f9.t0 t0Var = this.c;
        return i10 + (t0Var == null ? 0 : t0Var.hashCode());
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
