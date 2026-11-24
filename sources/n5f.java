// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class n5f extends wgf {
    private static final n5f zzb;
    private int zzd;
    private j8f zze;
    private boolean zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private vbf zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private boolean zzs;

    static {
        n5f n5fVar = new n5f();
        zzb = n5fVar;
        wgf.e(n5f.class, n5fVar);
    }

    public static m5f l() {
        return (m5f) zzb.j();
    }

    public static m5f m(n5f n5fVar) {
        vgf j = zzb.j();
        wgf wgfVar = j.a;
        if (!wgfVar.equals(n5fVar)) {
            if (!j.b.g()) {
                wgf wgfVar2 = (wgf) wgfVar.h(4, null);
                rif.c.a(wgfVar2.getClass()).c(wgfVar2, j.b);
                j.b = wgfVar2;
            }
            wgf wgfVar3 = j.b;
            rif.c.a(wgfVar3.getClass()).c(wgfVar3, n5fVar);
        }
        return (m5f) j;
    }

    public static n5f n() {
        return zzb;
    }

    public static /* synthetic */ void o(n5f n5fVar, j8f j8fVar) {
        n5fVar.zze = j8fVar;
        n5fVar.zzd |= 1;
    }

    public static /* synthetic */ void p(n5f n5fVar, boolean z) {
        n5fVar.zzd |= 2;
        n5fVar.zzf = z;
    }

    public static /* synthetic */ void q(n5f n5fVar, long j) {
        n5fVar.zzd |= 4;
        n5fVar.zzg = j;
    }

    public static /* synthetic */ void r(n5f n5fVar, int i) {
        n5fVar.zzd |= 64;
        n5fVar.zzk = i;
    }

    public static /* synthetic */ void s(n5f n5fVar, int i) {
        n5fVar.zzd |= 128;
        n5fVar.zzl = i;
    }

    public static /* synthetic */ void t(n5f n5fVar, int i) {
        n5fVar.zzd |= 1024;
        n5fVar.zzo = i;
    }

    public static /* synthetic */ void u(n5f n5fVar, boolean z) {
        n5fVar.zzd |= 2048;
        n5fVar.zzp = z;
    }

    public static /* synthetic */ void v(n5f n5fVar, int i) {
        n5fVar.zzd |= TLObject.FLAG_12;
        n5fVar.zzq = i;
    }

    public static /* synthetic */ void w(n5f n5fVar, int i) {
        n5fVar.zzd |= TLObject.FLAG_13;
        n5fVar.zzr = i;
    }

    public static /* synthetic */ void x(n5f n5fVar, boolean z) {
        n5fVar.zzd |= TLObject.FLAG_14;
        n5fVar.zzs = z;
    }

    @Override // wgf
    public final Object h(int i, wgf wgfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tif(zzb, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007င\u0006\bင\u0007\tဉ\b\n᠌\t\u000bင\n\fဇ\u000b\rင\f\u000eင\r\u000fဇ\u000e", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", k1f.n, "zzj", f8e.f, "zzk", "zzl", "zzm", "zzn", kg7.r, "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i2 == 3) {
            return new n5f();
        }
        if (i2 == 4) {
            return new m5f(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
