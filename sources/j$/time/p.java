package j$.time;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class p implements j$.time.temporal.m, j$.time.temporal.p, Comparable, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;
    private final j a;
    private final ZoneOffset b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        p pVar = (p) obj;
        ZoneOffset zoneOffset = pVar.b;
        boolean equals = this.b.equals(zoneOffset);
        j jVar = pVar.a;
        j jVar2 = this.a;
        if (equals) {
            return jVar2.compareTo(jVar);
        }
        int compare = Long.compare(jVar2.R() - (r1.getTotalSeconds() * 1000000000), jVar.R() - (pVar.b.getTotalSeconds() * 1000000000));
        return compare == 0 ? jVar2.compareTo(jVar) : compare;
    }

    static {
        j jVar = j.e;
        ZoneOffset zoneOffset = ZoneOffset.g;
        jVar.getClass();
        B(jVar, zoneOffset);
        j jVar2 = j.f;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        jVar2.getClass();
        B(jVar2, zoneOffset2);
    }

    public static p B(j jVar, ZoneOffset zoneOffset) {
        return new p(jVar, zoneOffset);
    }

    private p(j jVar, ZoneOffset zoneOffset) {
        this.a = (j) Objects.requireNonNull(jVar, "time");
        this.b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    private p E(j jVar, ZoneOffset zoneOffset) {
        return (this.a == jVar && this.b.equals(zoneOffset)) ? this : new p(jVar, zoneOffset);
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) rVar).C() || rVar == j$.time.temporal.a.OFFSET_SECONDS : rVar != null && rVar.l(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) rVar).i();
            }
            j jVar = this.a;
            jVar.getClass();
            return j$.time.temporal.n.d(jVar, rVar);
        }
        return rVar.r(this);
    }

    @Override // j$.time.temporal.o
    public final int j(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return this.b.getTotalSeconds();
            }
            return this.a.r(rVar);
        }
        return rVar.j(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m l(LocalDate localDate) {
        localDate.getClass();
        return (p) j$.time.chrono.h.a(localDate, this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
            j jVar = this.a;
            if (rVar == aVar) {
                return E(jVar, ZoneOffset.I(((j$.time.temporal.a) rVar).v(j)));
            }
            return E(jVar.d(j, rVar), this.b);
        }
        return (p) rVar.m(this, j);
    }

    @Override // j$.time.temporal.m
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final p e(long j, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            return E(this.a.e(j, uVar), this.b);
        }
        return (p) uVar.i(this, j);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m i(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j, bVar);
    }

    @Override // j$.time.temporal.o
    public final Object u(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.h() || tVar == j$.time.temporal.n.j()) {
            return this.b;
        }
        if (((tVar == j$.time.temporal.n.k()) || (tVar == j$.time.temporal.n.e())) || tVar == j$.time.temporal.n.f()) {
            return null;
        }
        if (tVar == j$.time.temporal.n.g()) {
            return this.a;
        }
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.NANOS;
        }
        return tVar.a(this);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m v(j$.time.temporal.m mVar) {
        return mVar.d(this.a.R(), j$.time.temporal.a.NANO_OF_DAY).d(this.b.getTotalSeconds(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.a.equals(pVar.a) && this.b.equals(pVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a.toString() + this.b.toString();
    }

    private Object writeReplace() {
        return new q((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        this.a.V(objectOutput);
        this.b.L(objectOutput);
    }

    static p D(ObjectInput objectInput) {
        return new p(j.Q(objectInput), ZoneOffset.K(objectInput));
    }
}
