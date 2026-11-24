// default package

import java.io.IOException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class gje extends f4e {
    private static final gje zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private gle zzh;
    private int zzi;

    static {
        gje gjeVar = new gje();
        zzb = gjeVar;
        f4e.k(gje.class, gjeVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [cde] */
    /* JADX WARN: Type inference failed for: r2v1, types: [f4e, java.lang.Object] */
    public static gje n(byte[] bArr, qzd qzdVar) {
        gje gjeVar = zzb;
        int length = bArr.length;
        if (length != 0) {
            ?? r2 = (f4e) gjeVar.d(4);
            try {
                ?? a = kce.c.a(r2.getClass());
                nl6 nl6Var = new nl6();
                qzdVar.getClass();
                a.a(r2, bArr, 0, length, nl6Var);
                a.zzf(r2);
                gjeVar = r2;
            } catch (IOException e) {
                if (e.getCause() instanceof w5e) {
                    throw ((w5e) e.getCause());
                }
                throw new w5e(e.getMessage(), e);
            } catch (IndexOutOfBoundsException unused) {
                i2d.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            } catch (w5e e2) {
                throw e2;
            } catch (wfe e3) {
                i2d.g(e3.getMessage());
                return null;
            }
        }
        if (gjeVar == null || f4e.c(gjeVar, true)) {
            return gjeVar;
        }
        i2d.g(new wfe().getMessage());
        return null;
    }

    public static void p(gje gjeVar, fme fmeVar) {
        gjeVar.zzi = fmeVar.a;
        gjeVar.zzd |= 4;
    }

    public static /* synthetic */ void q(gje gjeVar, gle gleVar) {
        gjeVar.zzh = gleVar;
        gjeVar.zzd |= 2;
    }

    public static /* synthetic */ void r(gje gjeVar, hqe hqeVar) {
        gjeVar.zzf = hqeVar;
        gjeVar.zze = 7;
    }

    public static /* synthetic */ void s(gje gjeVar, gte gteVar) {
        gjeVar.zzf = gteVar;
        gjeVar.zze = 6;
    }

    public static /* synthetic */ void t(gje gjeVar, int i) {
        gjeVar.zzg = i - 1;
        gjeVar.zzd |= 1;
    }

    public static uie u() {
        return (uie) zzb.f();
    }

    @Override // f4e
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wce(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", btd.c, "zzh", ooe.class, "zzi", btd.e, gte.class, hqe.class});
        }
        if (i2 == 3) {
            return new gje();
        }
        if (i2 == 4) {
            return new uie(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final hqe o() {
        return this.zze == 7 ? (hqe) this.zzf : hqe.o();
    }
}
