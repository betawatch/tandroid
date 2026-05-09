package j$.time.chrono;

import j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class J implements m {
    public static final J BE;
    public static final J BEFORE_BE;
    private static final /* synthetic */ J[] a;

    @Override // j$.time.temporal.m
    public final /* synthetic */ boolean g(j$.time.temporal.p pVar) {
        return h.i(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ int l(j$.time.temporal.p pVar) {
        return h.f(this, (j$.time.temporal.a) pVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ long r(j$.time.temporal.p pVar) {
        return h.g(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ Object v(j$.time.temporal.r rVar) {
        return h.m(this, rVar);
    }

    public static J valueOf(String str) {
        return (J) Enum.valueOf(J.class, str);
    }

    public static J[] values() {
        return (J[]) a.clone();
    }

    static {
        J j = new J("BEFORE_BE", 0);
        BEFORE_BE = j;
        J j2 = new J("BE", 1);
        BE = j2;
        a = new J[]{j, j2};
    }

    @Override // j$.time.chrono.m
    public final int getValue() {
        return ordinal();
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.u o(j$.time.temporal.p pVar) {
        return j$.time.temporal.l.d(this, pVar);
    }

    @Override // j$.time.temporal.n
    public final Temporal x(Temporal temporal) {
        return temporal.d(getValue(), j$.time.temporal.a.ERA);
    }
}
