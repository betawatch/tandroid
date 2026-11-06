package n2;

import android.os.Build;
import h9.h2;
import j$.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class a {
    public static final a d;
    public final int a;
    public final int b;
    public final h9.t0 c;

    static {
        a aVar;
        if (Build.VERSION.SDK_INT >= 33) {
            h9.s0 s0Var = new h9.s0(4);
            for (int i7 = 1; i7 <= 10; i7++) {
                s0Var.c(Integer.valueOf(h2.m0.t(i7)));
            }
            aVar = new a(2, s0Var.g());
        } else {
            aVar = new a(2, 10);
        }
        d = aVar;
    }

    public a(int i7, Set set) {
        this.a = i7;
        h9.t0 q10 = h9.t0.q(set);
        this.c = q10;
        h2 it = q10.iterator();
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
        int i7 = ((this.a * 31) + this.b) * 31;
        h9.t0 t0Var = this.c;
        return i7 + (t0Var == null ? 0 : t0Var.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
    }

    public a(int i7, int i10) {
        this.a = i7;
        this.b = i10;
        this.c = null;
    }
}
