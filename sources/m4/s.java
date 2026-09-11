package m4;

import java.util.List;
import v7.y7;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
