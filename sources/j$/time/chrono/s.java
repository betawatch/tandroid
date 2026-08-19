package j$.time.chrono;

import j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class s implements l {
    public static final s BCE;
    public static final s CE;
    public static final /* synthetic */ s[] a;

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

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) a.clone();
    }

    static {
        s sVar = new s("BCE", 0);
        BCE = sVar;
        s sVar2 = new s("CE", 1);
        CE = sVar2;
        a = new s[]{sVar, sVar2};
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
