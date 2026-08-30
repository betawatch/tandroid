package com.google.android.gms.internal.clearcut;

/* loaded from: classes.dex */
public final class t1 extends z {
    private static volatile u0 zzbg;
    private static final t1 zzbiv;
    private int zzbb;
    private String zzbis = "";
    private long zzbit;
    private long zzbiu;
    private int zzya;

    static {
        t1 t1Var = new t1();
        zzbiv = t1Var;
        z.c(t1.class, t1Var);
    }

    public static void f(t1 t1Var, long j10) {
        t1Var.zzbb |= 4;
        t1Var.zzbit = j10;
    }

    public static void g(t1 t1Var, String str) {
        t1Var.getClass();
        str.getClass();
        t1Var.zzbb |= 2;
        t1Var.zzbis = str;
    }

    public static void h(t1 t1Var, long j10) {
        t1Var.zzbb |= 8;
        t1Var.zzbiu = j10;
    }

    public static s1 m() {
        return (s1) ((x) zzbiv.a(5));
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.android.gms.internal.clearcut.u0, java.lang.Object] */
    @Override // com.google.android.gms.internal.clearcut.z
    public final Object a(int i10) {
        u0 u0Var;
        switch (v1.a[i10 - 1]) {
            case 1:
                return new t1();
            case 2:
                return new s1(zzbiv);
            case 3:
                return new x0(zzbiv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{"zzbb", "zzya", "zzbis", "zzbit", "zzbiu"});
            case 4:
                return zzbiv;
            case 5:
                u0 u0Var2 = zzbg;
                if (u0Var2 != null) {
                    return u0Var2;
                }
                synchronized (t1.class) {
                    try {
                        u0 u0Var3 = zzbg;
                        u0Var = u0Var3;
                        if (u0Var3 == null) {
                            ?? yVar = new y();
                            zzbg = yVar;
                            u0Var = yVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return u0Var;
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
