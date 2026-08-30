package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class g implements Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 57387258289L;
    public final k a;
    public final int b;
    public final int c;
    public final int d;

    static {
        Object[] objArr = {ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS};
        ArrayList arrayList = new ArrayList(3);
        for (int i10 = 0; i10 < 3; i10++) {
            arrayList.add(Objects.requireNonNull(objArr[i10]));
        }
        Collections.unmodifiableList(arrayList);
    }

    public g(k kVar, int i10, int i11, int i12) {
        Objects.requireNonNull(kVar, "chrono");
        this.a = kVar;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    public final String toString() {
        if (this.b == 0 && this.c == 0 && this.d == 0) {
            return this.a.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.toString());
        sb.append(" P");
        int i10 = this.b;
        if (i10 != 0) {
            sb.append(i10);
            sb.append('Y');
        }
        int i11 = this.c;
        if (i11 != 0) {
            sb.append(i11);
            sb.append('M');
        }
        int i12 = this.d;
        if (i12 != 0) {
            sb.append(i12);
            sb.append('D');
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.b == gVar.b && this.c == gVar.c && this.d == gVar.d && this.a.equals(gVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.c, 8) + this.b)) ^ this.a.hashCode();
    }

    public Object writeReplace() {
        return new d0((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
