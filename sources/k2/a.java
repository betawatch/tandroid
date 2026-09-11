package k2;

import android.os.Build;
import e9.o1;
import j$.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class a {
    public static final a d;
    public final int a;
    public final int b;
    public final e9.m0 c;

    static {
        a aVar;
        if (Build.VERSION.SDK_INT >= 33) {
            e9.l0 l0Var = new e9.l0(4);
            for (int i10 = 1; i10 <= 10; i10++) {
                l0Var.b(Integer.valueOf(e2.d0.s(i10)));
            }
            aVar = new a(2, l0Var.i());
        } else {
            aVar = new a(2, 10);
        }
        d = aVar;
    }

    public a(int i10, Set set) {
        this.a = i10;
        e9.m0 v = e9.m0.v(set);
        this.c = v;
        o1 it = v.iterator();
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
        e9.m0 m0Var = this.c;
        return i10 + (m0Var == null ? 0 : m0Var.hashCode());
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
