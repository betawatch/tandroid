package com.google.android.gms.internal.cast;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class t1 extends f5 {
    private static final t1 zzb;
    private k5 zzA;
    private k5 zzB;
    private k5 zzC;
    private m3 zzD;
    private int zzE;
    private int zzF;
    private l2 zzG;
    private int zzH;
    private r1 zzI;
    private k5 zzJ;
    private l2 zzK;
    private int zzL;
    private int zzM;
    private int zzN;
    private int zzO;
    private int zzP;
    private int zzQ;
    private t3 zzR;
    private o1 zzS;
    private z1 zzT;
    private g1 zzU;
    private x2 zzV;
    private l3 zzW;
    private z2 zzX;
    private k5 zzY;
    private int zzZ;
    private d3 zzaa;
    private k5 zzab;
    private boolean zzac;
    private boolean zzad;
    private int zzae;
    private i1 zzaf;
    private j3 zzag;
    private u2 zzah;
    private g2 zzai;
    private c3 zzaj;
    private p3 zzak;
    private h2 zzal;
    private int zzam;
    private int zzan;
    private int zzao;
    private k5 zzap;
    private w3 zzaq;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private r2 zzi;
    private h3 zzj;
    private q2 zzk;
    private o2 zzl;
    private q1 zzm;
    private g3 zzn;
    private k1 zzo;
    private s3 zzp;
    private n2 zzr;
    private y0 zzs;
    private int zzv;
    private b3 zzw;
    private k5 zzz;
    private byte zzar = 2;
    private String zzq = "";
    private String zzt = "";
    private String zzu = "";
    private String zzx = "";
    private h5 zzy = g5.d;

    static {
        t1 t1Var = new t1();
        zzb = t1Var;
        f5.e(t1.class, t1Var);
    }

    public t1() {
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

    public static s1 m() {
        return (s1) zzb.j();
    }

    public static s1 n(t1 t1Var) {
        e5 j10 = zzb.j();
        f5 f5Var = j10.a;
        if (!f5Var.equals(t1Var)) {
            if (!j10.b.g()) {
                f5 f5Var2 = (f5) f5Var.h(4, null);
                e6.c.a(f5Var2.getClass()).d(f5Var2, j10.b);
                j10.b = f5Var2;
            }
            f5 f5Var3 = j10.b;
            e6.c.a(f5Var3.getClass()).d(f5Var3, t1Var);
        }
        return (s1) j10;
    }

    public static /* synthetic */ void o(t1 t1Var, int i10) {
        t1Var.zzd |= TLObject.FLAG_31;
        t1Var.zzQ = i10;
    }

    public static /* synthetic */ void p(t1 t1Var, o1 o1Var) {
        t1Var.zzS = o1Var;
        t1Var.zze |= 2;
    }

    public static /* synthetic */ void q(t1 t1Var, z1 z1Var) {
        t1Var.zzT = z1Var;
        t1Var.zze |= 4;
    }

    public static void r(t1 t1Var, m1 m1Var) {
        k5 k5Var = t1Var.zzY;
        if (!((u4) k5Var).a) {
            t1Var.zzY = f5.b(k5Var);
        }
        t1Var.zzY.add(m1Var);
    }

    public static /* synthetic */ void s(t1 t1Var, i1 i1Var) {
        t1Var.zzaf = i1Var;
        t1Var.zze |= 4096;
    }

    public static /* synthetic */ void t(t1 t1Var, long j10) {
        t1Var.zzd |= 2;
        t1Var.zzg = j10;
    }

    public static /* synthetic */ void u(t1 t1Var, String str) {
        t1Var.zzd |= 2048;
        t1Var.zzq = str;
    }

    public static /* synthetic */ void v(t1 t1Var, String str) {
        str.getClass();
        t1Var.zzd |= 16384;
        t1Var.zzt = str;
    }

    public static /* synthetic */ void w(t1 t1Var, String str) {
        str.getClass();
        t1Var.zzd |= 32768;
        t1Var.zzu = str;
    }

    public static /* synthetic */ void x(t1 t1Var, int i10) {
        t1Var.zzd |= 65536;
        t1Var.zzv = i10;
    }

    public static /* synthetic */ void y(t1 t1Var, String str) {
        t1Var.zzd |= 262144;
        t1Var.zzx = str;
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzar);
        }
        if (i11 == 2) {
            return new g6(zzb, "\u0001@\u0000\u0002\u0001@@\u0000\t\u0001\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဈ\u000e\nဉ\b\u000bဉ\t\fဉ\n\rဈ\u000b\u000eဉ\f\u000fဉ\r\u0010ဉ\u0011\u0011ဈ\u0012\u0012\u0016\u0013\u001b\u0014\u001b\u0015\u001b\u0016\u001b\u0017᠌\u0014\u0018ဉ\u0018\u0019\u001b\u001aဉ\u0019\u001b᠌\u001b\u001cင\u001c\u001dင\u001d\u001eင\u001e\u001fဆ\u001f ဉ !ဉ!\"ဉ##᠌\u0015$ဉ\u0016%ᐉ$&ဉ%'ဉ&(\u001b)᠌'*ဉ(+\u001b,᠌\u001a-ဇ).ဇ*/᠌+0ဉ,1င\u00172ဉ-3ဉ.4ဉ05ဉ16ဉ27᠌38᠌49᠌5:\u001b;ဈ\u000f<ဉ6=ဉ/>ဉ\u0013?ဉ\"@င\u0010", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", a1.u, "zzi", "zzj", "zzk", "zzl", "zzm", "zzt", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzw", "zzx", "zzy", "zzz", s2.class, "zzA", v2.class, "zzB", i2.class, "zzC", n3.class, "zzE", a1.p, "zzI", "zzJ", l2.class, "zzK", "zzM", a1.a, "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzU", "zzF", a1.n, "zzG", "zzV", "zzW", "zzX", "zzY", m1.class, "zzZ", a1.o, "zzaa", "zzab", p1.class, "zzL", a0.P, "zzac", "zzad", "zzae", a0.N, "zzaf", "zzH", "zzag", "zzah", "zzaj", "zzak", "zzal", "zzam", a0.D, "zzan", a1.g, "zzao", a0.C, "zzap", q3.class, "zzu", "zzaq", "zzai", "zzD", "zzT", "zzv"});
        }
        if (i11 == 3) {
            return new t1();
        }
        if (i11 == 4) {
            return new s1(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzar = f5Var == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final o1 l() {
        o1 o1Var = this.zzS;
        return o1Var == null ? o1.n() : o1Var;
    }
}
