package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f3 extends u1 {
    private static final f3 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private j3 zzh;
    private int zzi;

    static {
        f3 f3Var = new f3();
        zzb = f3Var;
        u1.k(f3.class, f3Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.play_billing.s2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.play_billing.u1, java.lang.Object] */
    public static f3 n(byte[] bArr, n1 n1Var) {
        f3 f3Var = zzb;
        int length = bArr.length;
        if (length != 0) {
            ?? r22 = (u1) f3Var.d(4);
            try {
                ?? a2 = p2.c.a(r22.getClass());
                ag.j1 j1Var = new ag.j1();
                n1Var.getClass();
                a2.b(r22, bArr, 0, length, j1Var);
                a2.zzf(r22);
                f3Var = r22;
            } catch (b2 e9) {
                throw e9;
            } catch (v2 e10) {
                throw new b2(e10.getMessage());
            } catch (IOException e11) {
                if (e11.getCause() instanceof b2) {
                    throw ((b2) e11.getCause());
                }
                throw new b2(e11.getMessage(), e11);
            } catch (IndexOutOfBoundsException unused) {
                throw new b2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        if (f3Var == null || u1.c(f3Var, true)) {
            return f3Var;
        }
        throw new b2(new v2().getMessage());
    }

    public static void p(f3 f3Var, l3 l3Var) {
        f3Var.zzi = l3Var.a;
        f3Var.zzd |= 4;
    }

    public static /* synthetic */ void q(f3 f3Var, j3 j3Var) {
        f3Var.zzh = j3Var;
        f3Var.zzd |= 2;
    }

    public static /* synthetic */ void r(f3 f3Var, u3 u3Var) {
        f3Var.zzf = u3Var;
        f3Var.zze = 7;
    }

    public static /* synthetic */ void s(f3 f3Var, c4 c4Var) {
        f3Var.zzf = c4Var;
        f3Var.zze = 6;
    }

    public static /* synthetic */ void t(f3 f3Var, int i10) {
        f3Var.zzg = i10 - 1;
        f3Var.zzd |= 1;
    }

    public static e3 u() {
        return (e3) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.u1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r2(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", d1.c, "zzh", q3.class, "zzi", d1.e, c4.class, u3.class});
        }
        if (i11 == 3) {
            return new f3();
        }
        if (i11 == 4) {
            return new e3(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }

    public final u3 o() {
        return this.zze == 7 ? (u3) this.zzf : u3.o();
    }
}
