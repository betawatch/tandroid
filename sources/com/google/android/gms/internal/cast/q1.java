package com.google.android.gms.internal.cast;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q1 extends c5 {
    private static final q1 zzb;
    private h5 zzA;
    private h5 zzB;
    private h5 zzC;
    private j3 zzD;
    private int zzE;
    private int zzF;
    private i2 zzG;
    private int zzH;
    private o1 zzI;
    private h5 zzJ;
    private i2 zzK;
    private int zzL;
    private int zzM;
    private int zzN;
    private int zzO;
    private int zzP;
    private int zzQ;
    private q3 zzR;
    private l1 zzS;
    private w1 zzT;
    private d1 zzU;
    private u2 zzV;
    private i3 zzW;
    private w2 zzX;
    private h5 zzY;
    private int zzZ;
    private a3 zzaa;
    private h5 zzab;
    private boolean zzac;
    private boolean zzad;
    private int zzae;
    private f1 zzaf;
    private g3 zzag;
    private r2 zzah;
    private d2 zzai;
    private z2 zzaj;
    private m3 zzak;
    private e2 zzal;
    private int zzam;
    private int zzan;
    private int zzao;
    private h5 zzap;
    private t3 zzaq;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private o2 zzi;
    private e3 zzj;
    private n2 zzk;
    private l2 zzl;
    private n1 zzm;
    private d3 zzn;
    private h1 zzo;
    private p3 zzp;
    private k2 zzr;
    private v0 zzs;
    private int zzv;
    private y2 zzw;
    private h5 zzz;
    private byte zzar = 2;
    private String zzq = "";
    private String zzt = "";
    private String zzu = "";
    private String zzx = "";
    private e5 zzy = d5.d;

    static {
        q1 q1Var = new q1();
        zzb = q1Var;
        c5.e(q1.class, q1Var);
    }

    public q1() {
        c6 c6Var = c6.d;
        this.zzz = c6Var;
        this.zzA = c6Var;
        this.zzB = c6Var;
        this.zzC = c6Var;
        this.zzJ = c6Var;
        this.zzY = c6Var;
        this.zzab = c6Var;
        this.zzap = c6Var;
    }

    public static p1 m() {
        return (p1) zzb.j();
    }

    public static p1 n(q1 q1Var) {
        b5 j10 = zzb.j();
        c5 c5Var = j10.a;
        if (!c5Var.equals(q1Var)) {
            if (!j10.b.g()) {
                c5 c5Var2 = (c5) c5Var.h(4, null);
                b6.c.a(c5Var2.getClass()).d(c5Var2, j10.b);
                j10.b = c5Var2;
            }
            c5 c5Var3 = j10.b;
            b6.c.a(c5Var3.getClass()).d(c5Var3, q1Var);
        }
        return (p1) j10;
    }

    public static /* synthetic */ void o(q1 q1Var, int i3) {
        q1Var.zzd |= TLObject.FLAG_31;
        q1Var.zzQ = i3;
    }

    public static /* synthetic */ void p(q1 q1Var, l1 l1Var) {
        q1Var.zzS = l1Var;
        q1Var.zze |= 2;
    }

    public static /* synthetic */ void q(q1 q1Var, w1 w1Var) {
        q1Var.zzT = w1Var;
        q1Var.zze |= 4;
    }

    public static void r(q1 q1Var, j1 j1Var) {
        h5 h5Var = q1Var.zzY;
        if (!((s4) h5Var).a) {
            q1Var.zzY = c5.b(h5Var);
        }
        q1Var.zzY.add(j1Var);
    }

    public static /* synthetic */ void s(q1 q1Var, f1 f1Var) {
        q1Var.zzaf = f1Var;
        q1Var.zze |= TLObject.FLAG_12;
    }

    public static /* synthetic */ void t(q1 q1Var, long j10) {
        q1Var.zzd |= 2;
        q1Var.zzg = j10;
    }

    public static /* synthetic */ void u(q1 q1Var, String str) {
        q1Var.zzd |= 2048;
        q1Var.zzq = str;
    }

    public static /* synthetic */ void v(q1 q1Var, String str) {
        str.getClass();
        q1Var.zzd |= TLObject.FLAG_14;
        q1Var.zzt = str;
    }

    public static /* synthetic */ void w(q1 q1Var, String str) {
        str.getClass();
        q1Var.zzd |= 32768;
        q1Var.zzu = str;
    }

    public static /* synthetic */ void x(q1 q1Var, int i3) {
        q1Var.zzd |= 65536;
        q1Var.zzv = i3;
    }

    public static /* synthetic */ void y(q1 q1Var, String str) {
        q1Var.zzd |= 262144;
        q1Var.zzx = str;
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i3, c5 c5Var) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zzar);
        }
        if (i10 == 2) {
            return new d6(zzb, "\u0001@\u0000\u0002\u0001@@\u0000\t\u0001\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဈ\u000e\nဉ\b\u000bဉ\t\fဉ\n\rဈ\u000b\u000eဉ\f\u000fဉ\r\u0010ဉ\u0011\u0011ဈ\u0012\u0012\u0016\u0013\u001b\u0014\u001b\u0015\u001b\u0016\u001b\u0017᠌\u0014\u0018ဉ\u0018\u0019\u001b\u001aဉ\u0019\u001b᠌\u001b\u001cင\u001c\u001dင\u001d\u001eင\u001e\u001fဆ\u001f ဉ !ဉ!\"ဉ##᠌\u0015$ဉ\u0016%ᐉ$&ဉ%'ဉ&(\u001b)᠌'*ဉ(+\u001b,᠌\u001a-ဇ).ဇ*/᠌+0ဉ,1င\u00172ဉ-3ဉ.4ဉ05ဉ16ဉ27᠌38᠌49᠌5:\u001b;ဈ\u000f<ဉ6=ဉ/>ဉ\u0013?ဉ\"@င\u0010", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", x0.u, "zzi", "zzj", "zzk", "zzl", "zzm", "zzt", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzw", "zzx", "zzy", "zzz", p2.class, "zzA", s2.class, "zzB", f2.class, "zzC", k3.class, "zzE", x0.p, "zzI", "zzJ", i2.class, "zzK", "zzM", x0.a, "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzU", "zzF", x0.n, "zzG", "zzV", "zzW", "zzX", "zzY", j1.class, "zzZ", x0.o, "zzaa", "zzab", m1.class, "zzL", y.U, "zzac", "zzad", "zzae", y.S, "zzaf", "zzH", "zzag", "zzah", "zzaj", "zzak", "zzal", "zzam", y.I, "zzan", x0.g, "zzao", y.H, "zzap", n3.class, "zzu", "zzaq", "zzai", "zzD", "zzT", "zzv"});
        }
        if (i10 == 3) {
            return new q1();
        }
        if (i10 == 4) {
            return new p1(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        this.zzar = c5Var == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final l1 l() {
        l1 l1Var = this.zzS;
        return l1Var == null ? l1.n() : l1Var;
    }
}
