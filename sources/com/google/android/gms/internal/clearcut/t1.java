package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* loaded from: classes.dex */
public final class t1 extends z {
    private static volatile u0 zzbg;
    private static final t1 zzbir;
    private c0 zzbiq = w0.c;

    static {
        t1 t1Var = new t1();
        zzbir = t1Var;
        z.c(t1.class, t1Var);
    }

    public static t1 f() {
        return zzbir;
    }

    public static t1 g(byte[] bArr) {
        z zVar = (z) zzbir.a(4);
        try {
            v0 v0Var = v0.c;
            v0Var.getClass();
            v0Var.a(zVar.getClass()).f(zVar, bArr, 0, bArr.length, new m());
            v0Var.a(zVar.getClass()).b(zVar);
            if (zVar.zzex != 0) {
                throw new RuntimeException();
            }
            boolean z9 = true;
            byte byteValue = ((Byte) zVar.a(1)).byteValue();
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z9 = false;
                } else {
                    z9 = v0Var.a(zVar.getClass()).g(zVar);
                    zVar.a(2);
                }
            }
            if (z9) {
                return (t1) zVar;
            }
            throw new d0(new androidx.car.app.j().getMessage());
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
    public final Object a(int i7) {
        u0 u0Var;
        switch (u1.a[i7 - 1]) {
            case 1:
                return new t1();
            case 2:
                return new q1(zzbir);
            case 3:
                return new x0(zzbir, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbiq", s1.class});
            case 4:
                return zzbir;
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

    public final c0 e() {
        return this.zzbiq;
    }
}
