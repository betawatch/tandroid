package k3;

import j3.o2;
import java.util.Arrays;
import k7.b7;
import o4.v;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class a {
    public final long a;
    public final o2 b;
    public final int c;
    public final v d;
    public final long e;
    public final o2 f;
    public final int g;
    public final v h;
    public final long i;
    public final long j;

    public a(long j10, o2 o2Var, int i10, v vVar, long j11, o2 o2Var2, int i11, v vVar2, long j12, long j13) {
        this.a = j10;
        this.b = o2Var;
        this.c = i10;
        this.d = vVar;
        this.e = j11;
        this.f = o2Var2;
        this.g = i11;
        this.h = vVar2;
        this.i = j12;
        this.j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.a == aVar.a && this.c == aVar.c && this.e == aVar.e && this.g == aVar.g && this.i == aVar.i && this.j == aVar.j && b7.a(this.b, aVar.b) && b7.a(this.d, aVar.d) && b7.a(this.f, aVar.f) && b7.a(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j)});
    }
}
