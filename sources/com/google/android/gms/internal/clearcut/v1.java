package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* loaded from: classes.dex */
public final class v1 extends z {
    private static volatile u0 zzbg;
    private static final v1 zzbir;
    private c0 zzbiq = x0.c;

    static {
        v1 v1Var = new v1();
        zzbir = v1Var;
        z.c(v1.class, v1Var);
    }

    public static v1 f() {
        return zzbir;
    }

    public static v1 g(byte[] bArr) {
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
                return (v1) zVar;
            }
            throw new d0(new a6.b().getMessage());
        } catch (IOException e10) {
            if (e10.getCause() instanceof d0) {
                throw ((d0) e10.getCause());
            }
            throw new d0(e10.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw d0.a();
        }
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.android.gms.internal.clearcut.u0, java.lang.Object] */
    @Override // com.google.android.gms.internal.clearcut.z
    public final Object a(int i10) {
        u0 u0Var;
        switch (w1.a[i10 - 1]) {
            case 1:
                return new v1();
            case 2:
                return new s1(zzbir);
            case 3:
                return new y0(zzbir, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbiq", u1.class});
            case 4:
                return zzbir;
            case 5:
                u0 u0Var2 = zzbg;
                if (u0Var2 != null) {
                    return u0Var2;
                }
                synchronized (v1.class) {
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
