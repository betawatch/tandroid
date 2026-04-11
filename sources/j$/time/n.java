package j$.time;

import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class n implements j$.time.temporal.m, j$.time.temporal.n, Comparable, Serializable {
    private static final long serialVersionUID = -939150713474957432L;
    private final int a;
    private final int b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        n nVar = (n) obj;
        int i = this.a - nVar.a;
        return i == 0 ? this.b - nVar.b : i;
    }

    static {
        j$.time.format.p pVar = new j$.time.format.p();
        pVar.f("--");
        pVar.l(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        pVar.e('-');
        pVar.l(j$.time.temporal.a.DAY_OF_MONTH, 2);
        pVar.w(Locale.getDefault());
    }

    private n(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // j$.time.temporal.m
    public final boolean g(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.MONTH_OF_YEAR || pVar == j$.time.temporal.a.DAY_OF_MONTH : pVar != null && pVar.n(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.u o(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return pVar.k();
        }
        if (pVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return j$.time.temporal.l.d(this, pVar);
        }
        l L = l.L(this.a);
        L.getClass();
        int i = k.a[L.ordinal()];
        return j$.time.temporal.u.k(i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : 28, l.L(r5).K());
    }

    @Override // j$.time.temporal.m
    public final int l(j$.time.temporal.p pVar) {
        return o(pVar).a(s(pVar), pVar);
    }

    @Override // j$.time.temporal.m
    public final long s(j$.time.temporal.p pVar) {
        int i;
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.l(this);
        }
        int i2 = m.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 != 2) {
                throw new j$.time.temporal.t(d.a("Unsupported field: ", pVar));
            }
            i = this.a;
        }
        return i;
    }

    @Override // j$.time.temporal.m
    public final Object w(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.e()) {
            return j$.time.chrono.s.d;
        }
        return j$.time.temporal.l.c(this, rVar);
    }

    @Override // j$.time.temporal.n
    public final Temporal z(Temporal temporal) {
        if (!((j$.time.chrono.a) j$.time.chrono.h.q(temporal)).equals(j$.time.chrono.s.d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        Temporal d = temporal.d(this.a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return d.d(Math.min(d.o(aVar).d(), this.b), aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.a == nVar.a && this.b == nVar.b;
    }

    public final int hashCode() {
        return (this.a << 6) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        int i = this.a;
        sb.append(i < 10 ? "0" : "");
        sb.append(i);
        int i2 = this.b;
        sb.append(i2 < 10 ? "-0" : "-");
        sb.append(i2);
        return sb.toString();
    }

    private Object writeReplace() {
        return new r((byte) 13, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void J(DataOutput dataOutput) {
        dataOutput.writeByte(this.a);
        dataOutput.writeByte(this.b);
    }

    static n I(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        byte readByte2 = objectInput.readByte();
        l L = l.L(readByte);
        Objects.requireNonNull(L, "month");
        j$.time.temporal.a.DAY_OF_MONTH.I(readByte2);
        if (readByte2 > L.K()) {
            throw new c("Illegal value for DayOfMonth field, value " + ((int) readByte2) + " is not valid for month " + L.name());
        }
        return new n(L.getValue(), readByte2);
    }
}
