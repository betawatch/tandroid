package j$.time.chrono;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes2.dex */
final class g implements Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 57387258289L;
    private final l a;
    final int b;
    final int c;
    final int d;

    static {
        j$.com.android.tools.r8.a.h(new Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    g(l lVar, int i, int i2, int i3) {
        Objects.requireNonNull(lVar, "chrono");
        this.a = lVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final String toString() {
        l lVar = this.a;
        int i = this.d;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 != 0 || i2 != 0 || i != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(((a) lVar).getId());
            sb.append(" P");
            if (i3 != 0) {
                sb.append(i3);
                sb.append('Y');
            }
            if (i2 != 0) {
                sb.append(i2);
                sb.append('M');
            }
            if (i != 0) {
                sb.append(i);
                sb.append('D');
            }
            return sb.toString();
        }
        return ((a) lVar).getId() + " P0D";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.b == gVar.b && this.c == gVar.c && this.d == gVar.d) {
            if (((a) this.a).equals(gVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((a) this.a).hashCode() ^ (Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.c, 8) + this.b));
    }

    protected Object writeReplace() {
        return new E((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.a.getId());
        objectOutput.writeInt(this.b);
        objectOutput.writeInt(this.c);
        objectOutput.writeInt(this.d);
    }
}
