package j$.time.chrono;

import j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public final class h0 implements k {
    public static final h0 BE;
    public static final h0 BEFORE_BE;
    public static final /* synthetic */ h0[] a;

    static {
        h0 h0Var = new h0("BEFORE_BE", 0);
        BEFORE_BE = h0Var;
        h0 h0Var2 = new h0("BE", 1);
        BE = h0Var2;
        a = new h0[]{h0Var, h0Var2};
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) a.clone();
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ boolean e(j$.time.temporal.o oVar) {
        return j$.time.a.q(this, oVar);
    }

    @Override // j$.time.chrono.k
    public final int getValue() {
        return ordinal();
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int j(j$.time.temporal.o oVar) {
        return j$.time.a.l(this, (j$.time.temporal.a) oVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        return j$.time.temporal.p.d(this, oVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal n(Temporal temporal) {
        return temporal.c(getValue(), j$.time.temporal.a.ERA);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object r(j$.time.format.a aVar) {
        return j$.time.a.u(this, aVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ long y(j$.time.temporal.o oVar) {
        return j$.time.a.n(this, oVar);
    }
}
