package j$.time.chrono;

import j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class r implements m {
    public static final r AH;
    private static final /* synthetic */ r[] a;

    @Override // j$.time.temporal.m
    public final /* synthetic */ boolean g(j$.time.temporal.p pVar) {
        return h.i(this, pVar);
    }

    @Override // j$.time.chrono.m
    public final int getValue() {
        return 1;
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ int l(j$.time.temporal.p pVar) {
        return h.f(this, (j$.time.temporal.a) pVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ long s(j$.time.temporal.p pVar) {
        return h.g(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ Object w(j$.time.temporal.r rVar) {
        return h.m(this, rVar);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) a.clone();
    }

    static {
        r rVar = new r("AH", 0);
        AH = rVar;
        a = new r[]{rVar};
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.u o(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.ERA) {
            return j$.time.temporal.u.j(1L, 1L);
        }
        return j$.time.temporal.l.d(this, pVar);
    }

    @Override // j$.time.temporal.n
    public final Temporal z(Temporal temporal) {
        return temporal.d(1, j$.time.temporal.a.ERA);
    }
}
