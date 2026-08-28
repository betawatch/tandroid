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
        for (int i9 = 0; i9 < 3; i9++) {
            arrayList.add(Objects.requireNonNull(objArr[i9]));
        }
        Collections.unmodifiableList(arrayList);
    }

    public g(k kVar, int i9, int i10, int i11) {
        Objects.requireNonNull(kVar, "chrono");
        this.a = kVar;
        this.b = i9;
        this.c = i10;
        this.d = i11;
    }

    public final String toString() {
        if (this.b == 0 && this.c == 0 && this.d == 0) {
            return this.a.toString() + " P0D";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.a.toString());
        sb2.append(" P");
        int i9 = this.b;
        if (i9 != 0) {
            sb2.append(i9);
            sb2.append('Y');
        }
        int i10 = this.c;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('M');
        }
        int i11 = this.d;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('D');
        }
        return sb2.toString();
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
