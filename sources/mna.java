// default package

import j$.util.Objects;
import java.util.Locale;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class mna {
    public final long a;
    public final long b;
    public final int c;

    public mna(long j, int i, long j2) {
        yve.f(j < j2);
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mna.class == obj.getClass()) {
            mna mnaVar = (mna) obj;
            if (this.a == mnaVar.a && this.b == mnaVar.b && this.c == mnaVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        String str = gcc.a;
        Locale locale = Locale.US;
        StringBuilder o = ik8.o(this.a, "Segment: startTimeMs=", ", endTimeMs=");
        o.append(this.b);
        o.append(", speedDivisor=");
        o.append(this.c);
        return o.toString();
    }
}
