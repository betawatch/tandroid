package m4;

import java.util.List;
import v7.a8;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class s {
    public final e9.i0 a;
    public final int b;
    public final long c;

    public s(long j3, int i10, List list) {
        this.a = e9.i0.v(list);
        this.b = i10;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.a.equals(sVar.a) && this.b == sVar.b && this.c == sVar.c;
    }

    public final int hashCode() {
        return a8.b(this.c) + (((this.a.hashCode() * 31) + this.b) * 31);
    }
}
