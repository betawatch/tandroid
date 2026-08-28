package i3;

import g7.c0;
import h3.r2;
import j4.d0;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a {
    public final long a;
    public final r2 b;
    public final int c;
    public final d0 d;
    public final long e;
    public final r2 f;
    public final int g;
    public final d0 h;
    public final long i;
    public final long j;

    public a(long j10, r2 r2Var, int i9, d0 d0Var, long j11, r2 r2Var2, int i10, d0 d0Var2, long j12, long j13) {
        this.a = j10;
        this.b = r2Var;
        this.c = i9;
        this.d = d0Var;
        this.e = j11;
        this.f = r2Var2;
        this.g = i10;
        this.h = d0Var2;
        this.i = j12;
        this.j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.a == aVar.a && this.c == aVar.c && this.e == aVar.e && this.g == aVar.g && this.i == aVar.i && this.j == aVar.j && c0.a(this.b, aVar.b) && c0.a(this.d, aVar.d) && c0.a(this.f, aVar.f) && c0.a(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j)});
    }
}
