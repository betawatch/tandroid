package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* loaded from: classes.dex */
public final class u1 extends z {
    private static volatile u0 zzbg;
    private static final u1 zzbir;
    private c0 zzbiq = x0.c;

    static {
        u1 u1Var = new u1();
        zzbir = u1Var;
        z.c(u1.class, u1Var);
    }

    public static u1 f() {
        return zzbir;
    }

    public static u1 g(byte[] bArr) {
        z zVar = (z) zzbir.a(4);
        try {
            w0 w0Var = w0.c;
            w0Var.getClass();
            w0Var.a(zVar.getClass()).f(zVar, bArr, 0, bArr.length, new m());
            w0Var.a(zVar.getClass()).b(zVar);
            if (zVar.zzex != 0) {
                throw new RuntimeException();
            }
            boolean z10 = true;
            byte byteValue = ((Byte) zVar.a(1)).byteValue();
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z10 = false;
                } else {
                    z10 = w0Var.a(zVar.getClass()).g(zVar);
                    zVar.a(2);
                }
            }
            if (z10) {
                return (u1) zVar;
            }
            throw new d0(new androidx.car.app.j().getMessage());
        } catch (IOException e) {
            if (e.getCause() instanceof d0) {
                throw ((d0) e.getCause());
            }
            throw new d0(e.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw d0.a();
        }
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.android.gms.internal.clearcut.u0, java.lang.Object] */
    @Override // com.google.android.gms.internal.clearcut.z
    public final Object a(int i10) {
        u0 u0Var;
        switch (v1.a[i10 - 1]) {
            case 1:
                return new u1();
            case 2:
                return new r1(zzbir);
            case 3:
                return new y0(zzbir, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbiq", t1.class});
            case 4:
                return zzbir;
            case 5:
                u0 u0Var2 = zzbg;
                if (u0Var2 != null) {
                    return u0Var2;
                }
                synchronized (u1.class) {
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

    public final c0 e() {
        return this.zzbiq;
    }
}
