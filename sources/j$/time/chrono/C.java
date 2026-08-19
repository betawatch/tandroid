package j$.time.chrono;

import j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class C implements l {
    public static final C BEFORE_ROC;
    public static final C ROC;
    public static final /* synthetic */ C[] a;

    @Override // j$.time.temporal.l
    public final /* synthetic */ boolean h(j$.time.temporal.o oVar) {
        return j$.com.android.tools.r8.a.r(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int o(j$.time.temporal.o oVar) {
        return j$.com.android.tools.r8.a.m(this, (j$.time.temporal.a) oVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object r(j$.time.format.a aVar) {
        return j$.com.android.tools.r8.a.v(this, aVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ long u(j$.time.temporal.o oVar) {
        return j$.com.android.tools.r8.a.o(this, oVar);
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) a.clone();
    }

    static {
        C c = new C("BEFORE_ROC", 0);
        BEFORE_ROC = c;
        C c2 = new C("ROC", 1);
        ROC = c2;
        a = new C[]{c, c2};
    }

    @Override // j$.time.chrono.l
    public final int getValue() {
        return ordinal();
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s q(j$.time.temporal.o oVar) {
        return j$.time.temporal.p.d(this, oVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal x(Temporal temporal) {
        return temporal.e(getValue(), j$.time.temporal.a.ERA);
    }
}
