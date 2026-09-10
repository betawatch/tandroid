package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class g3 extends v1 {
    private static final g3 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private k3 zzh;
    private int zzi;

    static {
        g3 g3Var = new g3();
        zzb = g3Var;
        v1.k(g3.class, g3Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.play_billing.t2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.play_billing.v1, java.lang.Object] */
    public static g3 n(byte[] bArr, o1 o1Var) {
        g3 g3Var = zzb;
        int length = bArr.length;
        if (length != 0) {
            ?? r22 = (v1) g3Var.d(4);
            try {
                ?? a2 = q2.c.a(r22.getClass());
                h1 h1Var = new h1();
                o1Var.getClass();
                a2.e(r22, bArr, 0, length, h1Var);
                a2.zzf(r22);
                g3Var = r22;
            } catch (c2 e) {
                throw e;
            } catch (w2 e7) {
                throw new c2(e7.getMessage());
            } catch (IOException e10) {
                if (e10.getCause() instanceof c2) {
                    throw ((c2) e10.getCause());
                }
                throw new c2(e10.getMessage(), e10);
            } catch (IndexOutOfBoundsException unused) {
                throw new c2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        if (g3Var == null || v1.c(g3Var, true)) {
            return g3Var;
        }
        throw new c2(new w2().getMessage());
    }

    public static void p(g3 g3Var, m3 m3Var) {
        g3Var.zzi = m3Var.a;
        g3Var.zzd |= 4;
    }

    public static /* synthetic */ void q(g3 g3Var, k3 k3Var) {
        g3Var.zzh = k3Var;
        g3Var.zzd |= 2;
    }

    public static /* synthetic */ void r(g3 g3Var, v3 v3Var) {
        g3Var.zzf = v3Var;
        g3Var.zze = 7;
    }

    public static /* synthetic */ void s(g3 g3Var, d4 d4Var) {
        g3Var.zzf = d4Var;
        g3Var.zze = 6;
    }

    public static /* synthetic */ void t(g3 g3Var, int i10) {
        g3Var.zzg = i10 - 1;
        g3Var.zzd |= 1;
    }

    public static f3 u() {
        return (f3) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.v1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s2(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", d1.c, "zzh", r3.class, "zzi", d1.e, d4.class, v3.class});
        }
        if (i11 == 3) {
            return new g3();
        }
        if (i11 == 4) {
            return new f3(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }

    public final v3 o() {
        return this.zze == 7 ? (v3) this.zzf : v3.o();
    }
}
