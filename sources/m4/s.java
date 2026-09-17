package m4;

import java.util.List;
import v7.y7;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
        return y7.b(this.c) + (((this.a.hashCode() * 31) + this.b) * 31);
    }
}
