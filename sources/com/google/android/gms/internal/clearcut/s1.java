package com.google.android.gms.internal.clearcut;

/* loaded from: classes.dex */
public final class s1 extends y {
    private static volatile t0 zzbg;
    private static final s1 zzbiv;
    private int zzbb;
    private String zzbis = "";
    private long zzbit;
    private long zzbiu;
    private int zzya;

    static {
        s1 s1Var = new s1();
        zzbiv = s1Var;
        y.c(s1.class, s1Var);
    }

    public static void f(s1 s1Var, long j3) {
        s1Var.zzbb |= 4;
        s1Var.zzbit = j3;
    }

    public static void g(s1 s1Var, String str) {
        s1Var.getClass();
        str.getClass();
        s1Var.zzbb |= 2;
        s1Var.zzbis = str;
    }

    public static void h(s1 s1Var, long j3) {
        s1Var.zzbb |= 8;
        s1Var.zzbiu = j3;
    }

    public static r1 m() {
        return (r1) ((w) zzbiv.a(5));
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.android.gms.internal.clearcut.t0, java.lang.Object] */
    @Override // com.google.android.gms.internal.clearcut.y
    public final Object a(int i10) {
        t0 t0Var;
        switch (u1.a[i10 - 1]) {
            case 1:
                return new s1();
            case 2:
                return new r1(zzbiv);
            case 3:
                return new x0(zzbiv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{"zzbb", "zzya", "zzbis", "zzbit", "zzbiu"});
            case 4:
                return zzbiv;
            case 5:
                t0 t0Var2 = zzbg;
                if (t0Var2 != null) {
                    return t0Var2;
                }
                synchronized (s1.class) {
                    try {
                        t0 t0Var3 = zzbg;
                        t0Var = t0Var3;
                        if (t0Var3 == null) {
                            ?? xVar = new x();
                            zzbg = xVar;
                            t0Var = xVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return t0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final int e() {
        return this.zzya;
    }

    public final boolean i() {
        return (this.zzbb & 1) == 1;
    }

    public final String j() {
        return this.zzbis;
    }

    public final long k() {
        return this.zzbit;
    }

    public final long l() {
        return this.zzbiu;
    }
}
