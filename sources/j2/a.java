package j2;

import b2.k1;
import j$.util.Objects;
import u2.g0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class a {
    public final long a;
    public final k1 b;
    public final int c;
    public final g0 d;
    public final long e;
    public final k1 f;
    public final int g;
    public final g0 h;
    public final long i;
    public final long j;

    public a(long j3, k1 k1Var, int i10, g0 g0Var, long j10, k1 k1Var2, int i11, g0 g0Var2, long j11, long j12) {
        this.a = j3;
        this.b = k1Var;
        this.c = i10;
        this.d = g0Var;
        this.e = j10;
        this.f = k1Var2;
        this.g = i11;
        this.h = g0Var2;
        this.i = j11;
        this.j = j12;
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
