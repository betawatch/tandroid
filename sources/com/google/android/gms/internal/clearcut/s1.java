package com.google.android.gms.internal.clearcut;

/* loaded from: classes.dex */
public final class s1 extends z {
    private static volatile u0 zzbg;
    private static final s1 zzbiv;
    private int zzbb;
    private String zzbis = "";
    private long zzbit;
    private long zzbiu;
    private int zzya;

    static {
        s1 s1Var = new s1();
        zzbiv = s1Var;
        z.c(s1.class, s1Var);
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
        return (r1) ((x) zzbiv.a(5));
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.android.gms.internal.clearcut.u0, java.lang.Object] */
    @Override // com.google.android.gms.internal.clearcut.z
    public final Object a(int i7) {
        u0 u0Var;
        switch (u1.a[i7 - 1]) {
            case 1:
                return new s1();
            case 2:
                return new r1(zzbiv);
            case 3:
                return new x0(zzbiv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{"zzbb", "zzya", "zzbis", "zzbit", "zzbiu"});
            case 4:
                return zzbiv;
            case 5:
                u0 u0Var2 = zzbg;
                if (u0Var2 != null) {
                    return u0Var2;
                }
                synchronized (s1.class) {
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
