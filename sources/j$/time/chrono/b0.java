package j$.time.chrono;

import j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class b0 implements k {
    public static final b0 BEFORE_ROC;
    public static final b0 ROC;
    public static final /* synthetic */ b0[] a;

    static {
        b0 b0Var = new b0("BEFORE_ROC", 0);
        BEFORE_ROC = b0Var;
        b0 b0Var2 = new b0("ROC", 1);
        ROC = b0Var2;
        a = new b0[]{b0Var, b0Var2};
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) a.clone();
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
