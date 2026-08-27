package i3;

import h3.s2;
import h7.e0;
import j4.c0;
import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a {
    public final long a;
    public final s2 b;
    public final int c;
    public final c0 d;
    public final long e;
    public final s2 f;
    public final int g;
    public final c0 h;
    public final long i;
    public final long j;

    public a(long j10, s2 s2Var, int i10, c0 c0Var, long j11, s2 s2Var2, int i11, c0 c0Var2, long j12, long j13) {
        this.a = j10;
        this.b = s2Var;
        this.c = i10;
        this.d = c0Var;
        this.e = j11;
        this.f = s2Var2;
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
            if (this.a == aVar.a && this.c == aVar.c && this.e == aVar.e && this.g == aVar.g && this.i == aVar.i && this.j == aVar.j && e0.a(this.b, aVar.b) && e0.a(this.d, aVar.d) && e0.a(this.f, aVar.f) && e0.a(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j)});
    }
}
