package j$.time.chrono;

import j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class D implements m {
    public static final D BEFORE_ROC;
    public static final D ROC;
    private static final /* synthetic */ D[] a;

    @Override // j$.time.temporal.m
    public final /* synthetic */ boolean g(j$.time.temporal.p pVar) {
        return h.i(this, pVar);
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

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) a.clone();
    }

    static {
        D d = new D("BEFORE_ROC", 0);
        BEFORE_ROC = d;
        D d2 = new D("ROC", 1);
        ROC = d2;
        a = new D[]{d, d2};
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
    public final Temporal z(Temporal temporal) {
        return temporal.d(getValue(), j$.time.temporal.a.ERA);
    }
}
