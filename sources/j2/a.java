package j2;

import b2.p1;
import j$.util.Objects;
import u2.g0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class a {
    public final long a;
    public final p1 b;
    public final int c;
    public final g0 d;
    public final long e;
    public final p1 f;
    public final int g;
    public final g0 h;
    public final long i;
    public final long j;

    public a(long j10, p1 p1Var, int i10, g0 g0Var, long j11, p1 p1Var2, int i11, g0 g0Var2, long j12, long j13) {
        this.a = j10;
        this.b = p1Var;
        this.c = i10;
        this.d = g0Var;
        this.e = j11;
        this.f = p1Var2;
        this.g = i11;
        this.h = g0Var2;
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
