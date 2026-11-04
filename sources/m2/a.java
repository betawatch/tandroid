package m2;

import android.os.Build;
import g9.g2;
import j$.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a {
    public static final a d;
    public final int a;
    public final int b;
    public final g9.t0 c;

    static {
        a aVar;
        if (Build.VERSION.SDK_INT >= 33) {
            g9.s0 s0Var = new g9.s0(4);
            for (int i3 = 1; i3 <= 10; i3++) {
                s0Var.c(Integer.valueOf(g2.n0.t(i3)));
            }
            aVar = new a(2, s0Var.g());
        } else {
            aVar = new a(2, 10);
        }
        d = aVar;
    }

    public a(int i3, Set set) {
        this.a = i3;
        g9.t0 q10 = g9.t0.q(set);
        this.c = q10;
        g2 it = q10.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 = Math.max(i10, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.b = i10;
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
        int i3 = ((this.a * 31) + this.b) * 31;
        g9.t0 t0Var = this.c;
        return i3 + (t0Var == null ? 0 : t0Var.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
    }

    public a(int i3, int i10) {
        this.a = i3;
        this.b = i10;
        this.c = null;
    }
}
