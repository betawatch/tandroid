package k3;

import i7.o6;
import j3.r2;
import java.util.Arrays;
import l4.c0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a {
    public final long a;
    public final r2 b;
    public final int c;
    public final c0 d;
    public final long e;
    public final r2 f;
    public final int g;
    public final c0 h;
    public final long i;
    public final long j;

    public a(long j10, r2 r2Var, int i10, c0 c0Var, long j11, r2 r2Var2, int i11, c0 c0Var2, long j12, long j13) {
        this.a = j10;
        this.b = r2Var;
        this.c = i10;
        this.d = c0Var;
        this.e = j11;
        this.f = r2Var2;
        this.g = i11;
        this.h = c0Var2;
        this.i = j12;
        this.j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.a == aVar.a && this.c == aVar.c && this.e == aVar.e && this.g == aVar.g && this.i == aVar.i && this.j == aVar.j && o6.a(this.b, aVar.b) && o6.a(this.d, aVar.d) && o6.a(this.f, aVar.f) && o6.a(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j)});
    }
}
