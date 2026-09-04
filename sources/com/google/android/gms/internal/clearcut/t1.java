package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* loaded from: classes.dex */
public final class t1 extends y {
    private static volatile t0 zzbg;
    private static final t1 zzbir;
    private b0 zzbiq = w0.c;

    static {
        t1 t1Var = new t1();
        zzbir = t1Var;
        y.c(t1.class, t1Var);
    }

    public static t1 f() {
        return zzbir;
    }

    public static t1 g(byte[] bArr) {
        y yVar = (y) zzbir.a(4);
        try {
            v0 v0Var = v0.c;
            v0Var.getClass();
            v0Var.a(yVar.getClass()).f(yVar, bArr, 0, bArr.length, new l());
            v0Var.a(yVar.getClass()).b(yVar);
            if (yVar.zzex != 0) {
                throw new RuntimeException();
            }
            boolean z10 = true;
            byte byteValue = ((Byte) yVar.a(1)).byteValue();
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z10 = false;
                } else {
                    z10 = v0Var.a(yVar.getClass()).g(yVar);
                    yVar.a(2);
                }
            }
            if (z10) {
                return (t1) yVar;
            }
            throw new c0(new androidx.car.app.j().getMessage());
        } catch (IOException e7) {
            if (e7.getCause() instanceof c0) {
                throw ((c0) e7.getCause());
            }
            throw new c0(e7.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw c0.a();
        }
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.android.gms.internal.clearcut.t0, java.lang.Object] */
    @Override // com.google.android.gms.internal.clearcut.y
    public final Object a(int i10) {
        t0 t0Var;
        switch (u1.a[i10 - 1]) {
            case 1:
                return new t1();
            case 2:
                return new q1(zzbir);
            case 3:
                return new x0(zzbir, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbiq", s1.class});
            case 4:
                return zzbir;
            case 5:
                t0 t0Var2 = zzbg;
                if (t0Var2 != null) {
                    return t0Var2;
                }
                synchronized (t1.class) {
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

    public final b0 e() {
        return this.zzbiq;
    }
}
