package j$.time.zone;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class a implements Comparable, Serializable {
    private final LocalDateTime a;
    private final ZoneOffset b;
    private final ZoneOffset c;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a aVar = (a) obj;
        return this.a.toInstant(this.b).compareTo(aVar.a.toInstant(aVar.b));
    }

    a(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = zoneOffset2;
    }

    a(long j, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.a = LocalDateTime.t(j, 0, zoneOffset);
        this.b = zoneOffset;
        this.c = zoneOffset2;
    }

    public final long k() {
        return this.a.v(this.b);
    }

    public final LocalDateTime g() {
        return this.a;
    }

    public final ZoneOffset j() {
        return this.b;
    }

    public final ZoneOffset i() {
        return this.c;
    }

    public final LocalDateTime f() {
        return this.a.u(this.c.getTotalSeconds() - this.b.getTotalSeconds());
    }

    public final j$.time.d h() {
        return j$.time.d.i(this.c.getTotalSeconds() - this.b.getTotalSeconds());
    }

    public final boolean m() {
        return this.c.getTotalSeconds() > this.b.getTotalSeconds();
    }

    final List l() {
        return m() ? Collections.emptyList() : Arrays.asList(this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c);
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ Integer.rotateLeft(this.c.hashCode(), 16);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(m() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.a);
        sb.append(this.b);
        sb.append(" to ");
        sb.append(this.c);
        sb.append(']');
        return sb.toString();
    }
}
