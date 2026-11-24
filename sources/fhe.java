// default package

import java.io.IOException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class fhe extends c2e {
    private static final fhe zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private fje zzh;
    private int zzi;

    static {
        fhe fheVar = new fhe();
        zzb = fheVar;
        c2e.k(fhe.class, fheVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [bbe] */
    /* JADX WARN: Type inference failed for: r2v1, types: [c2e, java.lang.Object] */
    public static fhe n(byte[] bArr, nxd nxdVar) {
        fhe fheVar = zzb;
        int length = bArr.length;
        if (length != 0) {
            ?? r2 = (c2e) fheVar.d(4);
            try {
                ?? a = jae.c.a(r2.getClass());
                kj6 kj6Var = new kj6();
                nxdVar.getClass();
                a.a(r2, bArr, 0, length, kj6Var);
                a.zzf(r2);
                fheVar = r2;
            } catch (IOException e) {
                if (e.getCause() instanceof t3e) {
                    throw ((t3e) e.getCause());
                }
                throw new t3e(e.getMessage(), e);
            } catch (IndexOutOfBoundsException unused) {
                fvc.h("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            } catch (t3e e2) {
                throw e2;
            } catch (vde e3) {
                fvc.h(e3.getMessage());
                return null;
            }
        }
        if (fheVar == null || c2e.c(fheVar, true)) {
            return fheVar;
        }
        fvc.h(new vde().getMessage());
        return null;
    }

    public static void p(fhe fheVar, dke dkeVar) {
        fheVar.zzi = dkeVar.a;
        fheVar.zzd |= 4;
    }

    public static /* synthetic */ void q(fhe fheVar, fje fjeVar) {
        fheVar.zzh = fjeVar;
        fheVar.zzd |= 2;
    }

    public static /* synthetic */ void r(fhe fheVar, eoe eoeVar) {
        fheVar.zzf = eoeVar;
        fheVar.zze = 7;
    }

    public static /* synthetic */ void s(fhe fheVar, dre dreVar) {
        fheVar.zzf = dreVar;
        fheVar.zze = 6;
    }

    public static /* synthetic */ void t(fhe fheVar, int i) {
        fheVar.zzg = i - 1;
        fheVar.zzd |= 1;
    }

    public static tge u() {
        return (tge) zzb.f();
    }

    @Override // c2e
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vae(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", yqd.c, "zzh", lme.class, "zzi", yqd.e, dre.class, eoe.class});
        }
        if (i2 == 3) {
            return new fhe();
        }
        if (i2 == 4) {
            return new tge(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final eoe o() {
        return this.zze == 7 ? (eoe) this.zzf : eoe.o();
    }
}
