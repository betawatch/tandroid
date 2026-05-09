package j$.time.chrono;

import j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class t implements m {
    public static final t BCE;
    public static final t CE;
    private static final /* synthetic */ t[] a;

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

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) a.clone();
    }

    static {
        t tVar = new t("BCE", 0);
        BCE = tVar;
        t tVar2 = new t("CE", 1);
        CE = tVar2;
        a = new t[]{tVar, tVar2};
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
