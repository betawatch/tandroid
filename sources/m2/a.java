package m2;

import e2.l1;
import j$.util.Objects;
import x2.f0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class a {
    public final long a;
    public final l1 b;
    public final int c;
    public final f0 d;
    public final long e;
    public final l1 f;
    public final int g;
    public final f0 h;
    public final long i;
    public final long j;

    public a(long j3, l1 l1Var, int i7, f0 f0Var, long j10, l1 l1Var2, int i10, f0 f0Var2, long j11, long j12) {
        this.a = j3;
        this.b = l1Var;
        this.c = i7;
        this.d = f0Var;
        this.e = j10;
        this.f = l1Var2;
        this.g = i10;
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
