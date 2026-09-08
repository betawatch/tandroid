package com.google.android.gms.internal.cast;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class u1 extends h5 {
    private static final u1 zzb;
    private m5 zzA;
    private m5 zzB;
    private m5 zzC;
    private n3 zzD;
    private int zzE;
    private int zzF;
    private m2 zzG;
    private int zzH;
    private s1 zzI;
    private m5 zzJ;
    private m2 zzK;
    private int zzL;
    private int zzM;
    private int zzN;
    private int zzO;
    private int zzP;
    private int zzQ;
    private u3 zzR;
    private p1 zzS;
    private a2 zzT;
    private h1 zzU;
    private y2 zzV;
    private m3 zzW;
    private a3 zzX;
    private m5 zzY;
    private int zzZ;
    private e3 zzaa;
    private m5 zzab;
    private boolean zzac;
    private boolean zzad;
    private int zzae;
    private j1 zzaf;
    private k3 zzag;
    private v2 zzah;
    private h2 zzai;
    private d3 zzaj;
    private q3 zzak;
    private i2 zzal;
    private int zzam;
    private int zzan;
    private int zzao;
    private m5 zzap;
    private x3 zzaq;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private s2 zzi;
    private i3 zzj;
    private r2 zzk;
    private p2 zzl;
    private r1 zzm;
    private h3 zzn;
    private l1 zzo;
    private t3 zzp;
    private o2 zzr;
    private z0 zzs;
    private int zzv;
    private c3 zzw;
    private m5 zzz;
    private byte zzar = 2;
    private String zzq = "";
    private String zzt = "";
    private String zzu = "";
    private String zzx = "";
    private j5 zzy = i5.d;

    static {
        u1 u1Var = new u1();
        zzb = u1Var;
        h5.e(u1.class, u1Var);
    }

    public u1() {
        h6 h6Var = h6.d;
        this.zzz = h6Var;
        this.zzA = h6Var;
        this.zzB = h6Var;
        this.zzC = h6Var;
        this.zzJ = h6Var;
        this.zzY = h6Var;
        this.zzab = h6Var;
        this.zzap = h6Var;
    }

    public static t1 m() {
        return (t1) zzb.j();
    }

    public static t1 n(u1 u1Var) {
        g5 j3 = zzb.j();
        h5 h5Var = j3.a;
        if (!h5Var.equals(u1Var)) {
            if (!j3.b.g()) {
                h5 h5Var2 = (h5) h5Var.h(4, null);
                g6.c.a(h5Var2.getClass()).d(h5Var2, j3.b);
                j3.b = h5Var2;
            }
            h5 h5Var3 = j3.b;
            g6.c.a(h5Var3.getClass()).d(h5Var3, u1Var);
        }
        return (t1) j3;
    }

    public static /* synthetic */ void o(u1 u1Var, int i10) {
        u1Var.zzd |= TLObject.FLAG_31;
        u1Var.zzQ = i10;
    }

    public static /* synthetic */ void p(u1 u1Var, p1 p1Var) {
        u1Var.zzS = p1Var;
        u1Var.zze |= 2;
    }

    public static /* synthetic */ void q(u1 u1Var, a2 a2Var) {
        u1Var.zzT = a2Var;
        u1Var.zze |= 4;
    }

    public static void r(u1 u1Var, n1 n1Var) {
        m5 m5Var = u1Var.zzY;
        if (!((w4) m5Var).a) {
            u1Var.zzY = h5.b(m5Var);
        }
        u1Var.zzY.add(n1Var);
    }

    public static /* synthetic */ void s(u1 u1Var, j1 j1Var) {
        u1Var.zzaf = j1Var;
        u1Var.zze |= 4096;
    }

    public static /* synthetic */ void t(u1 u1Var, long j3) {
        u1Var.zzd |= 2;
        u1Var.zzg = j3;
    }

    public static /* synthetic */ void u(u1 u1Var, String str) {
        u1Var.zzd |= 2048;
        u1Var.zzq = str;
    }

    public static /* synthetic */ void v(u1 u1Var, String str) {
        str.getClass();
        u1Var.zzd |= 16384;
        u1Var.zzt = str;
    }

    public static /* synthetic */ void w(u1 u1Var, String str) {
        str.getClass();
        u1Var.zzd |= 32768;
        u1Var.zzu = str;
    }

    public static /* synthetic */ void x(u1 u1Var, int i10) {
        u1Var.zzd |= 65536;
        u1Var.zzv = i10;
    }

    public static /* synthetic */ void y(u1 u1Var, String str) {
        u1Var.zzd |= 262144;
        u1Var.zzx = str;
    }

    @Override // com.google.android.gms.internal.cast.h5
    public final Object h(int i10, h5 h5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzar);
        }
        if (i11 == 2) {
            return new i6(zzb, "\u0001@\u0000\u0002\u0001@@\u0000\t\u0001\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဈ\u000e\nဉ\b\u000bဉ\t\fဉ\n\rဈ\u000b\u000eဉ\f\u000fဉ\r\u0010ဉ\u0011\u0011ဈ\u0012\u0012\u0016\u0013\u001b\u0014\u001b\u0015\u001b\u0016\u001b\u0017᠌\u0014\u0018ဉ\u0018\u0019\u001b\u001aဉ\u0019\u001b᠌\u001b\u001cင\u001c\u001dင\u001d\u001eင\u001e\u001fဆ\u001f ဉ !ဉ!\"ဉ##᠌\u0015$ဉ\u0016%ᐉ$&ဉ%'ဉ&(\u001b)᠌'*ဉ(+\u001b,᠌\u001a-ဇ).ဇ*/᠌+0ဉ,1င\u00172ဉ-3ဉ.4ဉ05ဉ16ဉ27᠌38᠌49᠌5:\u001b;ဈ\u000f<ဉ6=ဉ/>ဉ\u0013?ဉ\"@င\u0010", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", b1.u, "zzi", "zzj", "zzk", "zzl", "zzm", "zzt", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzw", "zzx", "zzy", "zzz", t2.class, "zzA", w2.class, "zzB", j2.class, "zzC", o3.class, "zzE", b1.p, "zzI", "zzJ", m2.class, "zzK", "zzM", b1.a, "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzU", "zzF", b1.n, "zzG", "zzV", "zzW", "zzX", "zzY", n1.class, "zzZ", b1.o, "zzaa", "zzab", q1.class, "zzL", b0.T, "zzac", "zzad", "zzae", b0.R, "zzaf", "zzH", "zzag", "zzah", "zzaj", "zzak", "zzal", "zzam", b0.H, "zzan", b1.g, "zzao", b0.G, "zzap", r3.class, "zzu", "zzaq", "zzai", "zzD", "zzT", "zzv"});
        }
        if (i11 == 3) {
            return new u1();
        }
        if (i11 == 4) {
            return new t1(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzar = h5Var == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final p1 l() {
        p1 p1Var = this.zzS;
        return p1Var == null ? p1.n() : p1Var;
    }
}
