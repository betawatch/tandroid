package j$.time.chrono;

import j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class I implements l {
    public static final I BE;
    public static final I BEFORE_BE;
    public static final /* synthetic */ I[] a;

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

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    public static I[] values() {
        return (I[]) a.clone();
    }

    static {
        I i = new I("BEFORE_BE", 0);
        BEFORE_BE = i;
        I i2 = new I("BE", 1);
        BE = i2;
        a = new I[]{i, i2};
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
