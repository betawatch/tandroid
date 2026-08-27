package com.google.android.gms.internal.cast;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class r1 extends d5 {
    private static final r1 zzb;
    private i5 zzA;
    private i5 zzB;
    private i5 zzC;
    private k3 zzD;
    private int zzE;
    private int zzF;
    private j2 zzG;
    private int zzH;
    private p1 zzI;
    private i5 zzJ;
    private j2 zzK;
    private int zzL;
    private int zzM;
    private int zzN;
    private int zzO;
    private int zzP;
    private int zzQ;
    private r3 zzR;
    private m1 zzS;
    private x1 zzT;
    private e1 zzU;
    private v2 zzV;
    private j3 zzW;
    private x2 zzX;
    private i5 zzY;
    private int zzZ;
    private b3 zzaa;
    private i5 zzab;
    private boolean zzac;
    private boolean zzad;
    private int zzae;
    private g1 zzaf;
    private h3 zzag;
    private s2 zzah;
    private e2 zzai;
    private a3 zzaj;
    private n3 zzak;
    private f2 zzal;
    private int zzam;
    private int zzan;
    private int zzao;
    private i5 zzap;
    private u3 zzaq;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private p2 zzi;
    private f3 zzj;
    private o2 zzk;
    private m2 zzl;
    private o1 zzm;
    private e3 zzn;
    private i1 zzo;
    private q3 zzp;
    private l2 zzr;
    private w0 zzs;
    private int zzv;
    private z2 zzw;
    private i5 zzz;
    private byte zzar = 2;
    private String zzq = "";
    private String zzt = "";
    private String zzu = "";
    private String zzx = "";
    private f5 zzy = e5.d;

    static {
        r1 r1Var = new r1();
        zzb = r1Var;
        d5.e(r1.class, r1Var);
    }

    public r1() {
        d6 d6Var = d6.d;
        this.zzz = d6Var;
        this.zzA = d6Var;
        this.zzB = d6Var;
        this.zzC = d6Var;
        this.zzJ = d6Var;
        this.zzY = d6Var;
        this.zzab = d6Var;
        this.zzap = d6Var;
    }

    public static q1 m() {
        return (q1) zzb.j();
    }

    public static q1 n(r1 r1Var) {
        c5 j10 = zzb.j();
        d5 d5Var = j10.a;
        if (!d5Var.equals(r1Var)) {
            if (!j10.b.g()) {
                d5 d5Var2 = (d5) d5Var.h(4, null);
                c6.c.a(d5Var2.getClass()).d(d5Var2, j10.b);
                j10.b = d5Var2;
            }
            d5 d5Var3 = j10.b;
            c6.c.a(d5Var3.getClass()).d(d5Var3, r1Var);
        }
        return (q1) j10;
    }

    public static /* synthetic */ void o(r1 r1Var, int i10) {
        r1Var.zzd |= TLObject.FLAG_31;
        r1Var.zzQ = i10;
    }

    public static /* synthetic */ void p(r1 r1Var, m1 m1Var) {
        r1Var.zzS = m1Var;
        r1Var.zze |= 2;
    }

    public static /* synthetic */ void q(r1 r1Var, x1 x1Var) {
        r1Var.zzT = x1Var;
        r1Var.zze |= 4;
    }

    public static void r(r1 r1Var, k1 k1Var) {
        i5 i5Var = r1Var.zzY;
        if (!((s4) i5Var).a) {
            r1Var.zzY = d5.b(i5Var);
        }
        r1Var.zzY.add(k1Var);
    }

    public static /* synthetic */ void s(r1 r1Var, g1 g1Var) {
        r1Var.zzaf = g1Var;
        r1Var.zze |= 4096;
    }

    public static /* synthetic */ void t(r1 r1Var, long j10) {
        r1Var.zzd |= 2;
        r1Var.zzg = j10;
    }

    public static /* synthetic */ void u(r1 r1Var, String str) {
        r1Var.zzd |= 2048;
        r1Var.zzq = str;
    }

    public static /* synthetic */ void v(r1 r1Var, String str) {
        str.getClass();
        r1Var.zzd |= 16384;
        r1Var.zzt = str;
    }

    public static /* synthetic */ void w(r1 r1Var, String str) {
        str.getClass();
        r1Var.zzd |= 32768;
        r1Var.zzu = str;
    }

    public static /* synthetic */ void x(r1 r1Var, int i10) {
        r1Var.zzd |= 65536;
        r1Var.zzv = i10;
    }

    public static /* synthetic */ void y(r1 r1Var, String str) {
        r1Var.zzd |= 262144;
        r1Var.zzx = str;
    }

    @Override // com.google.android.gms.internal.cast.d5
    public final Object h(int i10, d5 d5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzar);
        }
        if (i11 == 2) {
            return new e6(zzb, "\u0001@\u0000\u0002\u0001@@\u0000\t\u0001\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဈ\u000e\nဉ\b\u000bဉ\t\fဉ\n\rဈ\u000b\u000eဉ\f\u000fဉ\r\u0010ဉ\u0011\u0011ဈ\u0012\u0012\u0016\u0013\u001b\u0014\u001b\u0015\u001b\u0016\u001b\u0017᠌\u0014\u0018ဉ\u0018\u0019\u001b\u001aဉ\u0019\u001b᠌\u001b\u001cင\u001c\u001dင\u001d\u001eင\u001e\u001fဆ\u001f ဉ !ဉ!\"ဉ##᠌\u0015$ဉ\u0016%ᐉ$&ဉ%'ဉ&(\u001b)᠌'*ဉ(+\u001b,᠌\u001a-ဇ).ဇ*/᠌+0ဉ,1င\u00172ဉ-3ဉ.4ဉ05ဉ16ဉ27᠌38᠌49᠌5:\u001b;ဈ\u000f<ဉ6=ဉ/>ဉ\u0013?ဉ\"@င\u0010", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", y0.u, "zzi", "zzj", "zzk", "zzl", "zzm", "zzt", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzw", "zzx", "zzy", "zzz", q2.class, "zzA", t2.class, "zzB", g2.class, "zzC", l3.class, "zzE", y0.p, "zzI", "zzJ", j2.class, "zzK", "zzM", y0.a, "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzU", "zzF", y0.n, "zzG", "zzV", "zzW", "zzX", "zzY", k1.class, "zzZ", y0.o, "zzaa", "zzab", n1.class, "zzL", z.P, "zzac", "zzad", "zzae", z.N, "zzaf", "zzH", "zzag", "zzah", "zzaj", "zzak", "zzal", "zzam", z.D, "zzan", y0.g, "zzao", z.C, "zzap", o3.class, "zzu", "zzaq", "zzai", "zzD", "zzT", "zzv"});
        }
        if (i11 == 3) {
            return new r1();
        }
        if (i11 == 4) {
            return new q1(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzar = d5Var == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final m1 l() {
        m1 m1Var = this.zzS;
        return m1Var == null ? m1.n() : m1Var;
    }
}
