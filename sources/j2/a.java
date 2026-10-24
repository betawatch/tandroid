package j2;

import b2.o1;
import j$.util.Objects;
import u2.h0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class a {
    public final long a;
    public final o1 b;
    public final int c;
    public final h0 d;
    public final long e;
    public final o1 f;
    public final int g;
    public final h0 h;
    public final long i;
    public final long j;

    public a(long j10, o1 o1Var, int i10, h0 h0Var, long j11, o1 o1Var2, int i11, h0 h0Var2, long j12, long j13) {
        this.a = j10;
        this.b = o1Var;
        this.c = i10;
        this.d = h0Var;
        this.e = j11;
        this.f = o1Var2;
        this.g = i11;
        this.h = h0Var2;
        this.i = j12;
        this.j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.a == aVar.a && this.c == aVar.c && this.e == aVar.e && this.g == aVar.g && this.i == aVar.i && this.j == aVar.j && Objects.equals(this.b, aVar.b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f, aVar.f) && Objects.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
    }
}
