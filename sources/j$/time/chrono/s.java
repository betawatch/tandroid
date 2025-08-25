package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalDateTime;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class s extends a implements Serializable {
    public static final s d = new s();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // j$.time.chrono.l
    public final m z(int i) {
        if (i == 0) {
            return t.BCE;
        }
        if (i == 1) {
            return t.CE;
        }
        throw new j$.time.c("Invalid era: " + i);
    }

    private s() {
    }

    @Override // j$.time.chrono.l
    public final String getId() {
        return "ISO";
    }

    @Override // j$.time.chrono.l
    public final String q() {
        return "iso8601";
    }

    @Override // j$.time.chrono.l
    public final b k(j$.time.temporal.o oVar) {
        return LocalDate.D(oVar);
    }

    @Override // j$.time.chrono.a, j$.time.chrono.l
    public final ChronoLocalDateTime n(LocalDateTime localDateTime) {
        return LocalDateTime.C(localDateTime);
    }

    public static boolean l(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    Object writeReplace() {
        return new E((byte) 1, this);
    }
}
