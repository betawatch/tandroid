package com.google.android.gms.internal.cast;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s1 extends f5 {
    private static final s1 zzb;
    private k5 zzA;
    private k5 zzB;
    private k5 zzC;
    private l3 zzD;
    private int zzE;
    private int zzF;
    private k2 zzG;
    private int zzH;
    private q1 zzI;
    private k5 zzJ;
    private k2 zzK;
    private int zzL;
    private int zzM;
    private int zzN;
    private int zzO;
    private int zzP;
    private int zzQ;
    private s3 zzR;
    private n1 zzS;
    private y1 zzT;
    private f1 zzU;
    private w2 zzV;
    private k3 zzW;
    private y2 zzX;
    private k5 zzY;
    private int zzZ;
    private c3 zzaa;
    private k5 zzab;
    private boolean zzac;
    private boolean zzad;
    private int zzae;
    private h1 zzaf;
    private i3 zzag;
    private t2 zzah;
    private f2 zzai;
    private b3 zzaj;
    private o3 zzak;
    private g2 zzal;
    private int zzam;
    private int zzan;
    private int zzao;
    private k5 zzap;
    private v3 zzaq;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private q2 zzi;
    private g3 zzj;
    private p2 zzk;
    private n2 zzl;
    private p1 zzm;
    private f3 zzn;
    private j1 zzo;
    private r3 zzp;
    private m2 zzr;
    private x0 zzs;
    private int zzv;
    private a3 zzw;
    private k5 zzz;
    private byte zzar = 2;
    private String zzq = "";
    private String zzt = "";
    private String zzu = "";
    private String zzx = "";
    private h5 zzy = g5.d;

    static {
        s1 s1Var = new s1();
        zzb = s1Var;
        f5.e(s1.class, s1Var);
    }

    public s1() {
        f6 f6Var = f6.d;
        this.zzz = f6Var;
        this.zzA = f6Var;
        this.zzB = f6Var;
        this.zzC = f6Var;
        this.zzJ = f6Var;
        this.zzY = f6Var;
        this.zzab = f6Var;
        this.zzap = f6Var;
    }

    public static r1 m() {
        return (r1) zzb.j();
    }

    public static r1 n(s1 s1Var) {
        e5 j10 = zzb.j();
        f5 f5Var = j10.a;
        if (!f5Var.equals(s1Var)) {
            if (!j10.b.g()) {
                f5 f5Var2 = (f5) f5Var.h(4, null);
                e6.c.a(f5Var2.getClass()).d(f5Var2, j10.b);
                j10.b = f5Var2;
            }
            f5 f5Var3 = j10.b;
            e6.c.a(f5Var3.getClass()).d(f5Var3, s1Var);
        }
        return (r1) j10;
    }

    public static /* synthetic */ void o(s1 s1Var, int i9) {
        s1Var.zzd |= TLObject.FLAG_31;
        s1Var.zzQ = i9;
    }

    public static /* synthetic */ void p(s1 s1Var, n1 n1Var) {
        s1Var.zzS = n1Var;
        s1Var.zze |= 2;
    }

    public static /* synthetic */ void q(s1 s1Var, y1 y1Var) {
        s1Var.zzT = y1Var;
        s1Var.zze |= 4;
    }

    public static void r(s1 s1Var, l1 l1Var) {
        k5 k5Var = s1Var.zzY;
        if (!((u4) k5Var).a) {
            s1Var.zzY = f5.b(k5Var);
        }
        s1Var.zzY.add(l1Var);
    }

    public static /* synthetic */ void s(s1 s1Var, h1 h1Var) {
        s1Var.zzaf = h1Var;
        s1Var.zze |= 4096;
    }

    public static /* synthetic */ void t(s1 s1Var, long j10) {
        s1Var.zzd |= 2;
        s1Var.zzg = j10;
    }

    public static /* synthetic */ void u(s1 s1Var, String str) {
        s1Var.zzd |= 2048;
        s1Var.zzq = str;
    }

    public static /* synthetic */ void v(s1 s1Var, String str) {
        str.getClass();
        s1Var.zzd |= 16384;
        s1Var.zzt = str;
    }

    public static /* synthetic */ void w(s1 s1Var, String str) {
        str.getClass();
        s1Var.zzd |= 32768;
        s1Var.zzu = str;
    }

    public static /* synthetic */ void x(s1 s1Var, int i9) {
        s1Var.zzd |= 65536;
        s1Var.zzv = i9;
    }

    public static /* synthetic */ void y(s1 s1Var, String str) {
        s1Var.zzd |= 262144;
        s1Var.zzx = str;
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i9, f5 f5Var) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zzar);
        }
        if (i10 == 2) {
            return new g6(zzb, "\u0001@\u0000\u0002\u0001@@\u0000\t\u0001\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဈ\u000e\nဉ\b\u000bဉ\t\fဉ\n\rဈ\u000b\u000eဉ\f\u000fဉ\r\u0010ဉ\u0011\u0011ဈ\u0012\u0012\u0016\u0013\u001b\u0014\u001b\u0015\u001b\u0016\u001b\u0017᠌\u0014\u0018ဉ\u0018\u0019\u001b\u001aဉ\u0019\u001b᠌\u001b\u001cင\u001c\u001dင\u001d\u001eင\u001e\u001fဆ\u001f ဉ !ဉ!\"ဉ##᠌\u0015$ဉ\u0016%ᐉ$&ဉ%'ဉ&(\u001b)᠌'*ဉ(+\u001b,᠌\u001a-ဇ).ဇ*/᠌+0ဉ,1င\u00172ဉ-3ဉ.4ဉ05ဉ16ဉ27᠌38᠌49᠌5:\u001b;ဈ\u000f<ဉ6=ဉ/>ဉ\u0013?ဉ\"@င\u0010", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", z0.u, "zzi", "zzj", "zzk", "zzl", "zzm", "zzt", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzw", "zzx", "zzy", "zzz", r2.class, "zzA", u2.class, "zzB", h2.class, "zzC", m3.class, "zzE", z0.p, "zzI", "zzJ", k2.class, "zzK", "zzM", z0.a, "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzU", "zzF", z0.n, "zzG", "zzV", "zzW", "zzX", "zzY", l1.class, "zzZ", z0.o, "zzaa", "zzab", o1.class, "zzL", a0.P, "zzac", "zzad", "zzae", a0.N, "zzaf", "zzH", "zzag", "zzah", "zzaj", "zzak", "zzal", "zzam", a0.D, "zzan", z0.g, "zzao", a0.C, "zzap", p3.class, "zzu", "zzaq", "zzai", "zzD", "zzT", "zzv"});
        }
        if (i10 == 3) {
            return new s1();
        }
        if (i10 == 4) {
            return new r1(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        this.zzar = f5Var == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final n1 l() {
        n1 n1Var = this.zzS;
        return n1Var == null ? n1.n() : n1Var;
    }
}
