package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* loaded from: classes.dex */
public final class s1 extends y {
    private static volatile t0 zzbg;
    private static final s1 zzbir;
    private b0 zzbiq = v0.c;

    static {
        s1 s1Var = new s1();
        zzbir = s1Var;
        y.c(s1.class, s1Var);
    }

    public static s1 f() {
        return zzbir;
    }

    public static s1 g(byte[] bArr) {
        y yVar = (y) zzbir.a(4);
        try {
            u0 u0Var = u0.c;
            u0Var.getClass();
            u0Var.a(yVar.getClass()).f(yVar, bArr, 0, bArr.length, new l());
            u0Var.a(yVar.getClass()).b(yVar);
            if (yVar.zzex != 0) {
                throw new RuntimeException();
            }
            boolean z10 = true;
            byte byteValue = ((Byte) yVar.a(1)).byteValue();
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z10 = false;
                } else {
                    z10 = u0Var.a(yVar.getClass()).g(yVar);
                    yVar.a(2);
                }
            }
            if (z10) {
                return (s1) yVar;
            }
            throw new c0(new androidx.car.app.j().getMessage());
        } catch (IOException e10) {
            if (e10.getCause() instanceof c0) {
                throw ((c0) e10.getCause());
            }
            throw new c0(e10.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw c0.a();
        }
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.android.gms.internal.clearcut.t0, java.lang.Object] */
    @Override // com.google.android.gms.internal.clearcut.y
    public final Object a(int i7) {
        t0 t0Var;
        switch (t1.a[i7 - 1]) {
            case 1:
                return new s1();
            case 2:
                return new p1(zzbir);
            case 3:
                return new w0(zzbir, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbiq", r1.class});
            case 4:
                return zzbir;
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

    public final b0 e() {
        return this.zzbiq;
    }
}
