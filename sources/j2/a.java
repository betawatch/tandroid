package j2;

import b2.k1;
import j$.util.Objects;
import u2.f0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a {
    public final long a;
    public final k1 b;
    public final int c;
    public final f0 d;
    public final long e;
    public final k1 f;
    public final int g;
    public final f0 h;
    public final long i;
    public final long j;

    public a(long j3, k1 k1Var, int i10, f0 f0Var, long j10, k1 k1Var2, int i11, f0 f0Var2, long j11, long j12) {
        this.a = j3;
        this.b = k1Var;
        this.c = i10;
        this.d = f0Var;
        this.e = j10;
        this.f = k1Var2;
        this.g = i11;
        this.h = f0Var2;
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
