package com.google.android.gms.internal.cast;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class p1 extends b5 {
    private static final p1 zzb;
    private g5 zzA;
    private g5 zzB;
    private g5 zzC;
    private i3 zzD;
    private int zzE;
    private int zzF;
    private h2 zzG;
    private int zzH;
    private n1 zzI;
    private g5 zzJ;
    private h2 zzK;
    private int zzL;
    private int zzM;
    private int zzN;
    private int zzO;
    private int zzP;
    private int zzQ;
    private p3 zzR;
    private k1 zzS;
    private v1 zzT;
    private c1 zzU;
    private t2 zzV;
    private h3 zzW;
    private v2 zzX;
    private g5 zzY;
    private int zzZ;
    private z2 zzaa;
    private g5 zzab;
    private boolean zzac;
    private boolean zzad;
    private int zzae;
    private e1 zzaf;
    private f3 zzag;
    private q2 zzah;
    private c2 zzai;
    private y2 zzaj;
    private l3 zzak;
    private d2 zzal;
    private int zzam;
    private int zzan;
    private int zzao;
    private g5 zzap;
    private s3 zzaq;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private n2 zzi;
    private d3 zzj;
    private m2 zzk;
    private k2 zzl;
    private m1 zzm;
    private c3 zzn;
    private g1 zzo;
    private o3 zzp;
    private j2 zzr;
    private u0 zzs;
    private int zzv;
    private x2 zzw;
    private g5 zzz;
    private byte zzar = 2;
    private String zzq = "";
    private String zzt = "";
    private String zzu = "";
    private String zzx = "";
    private d5 zzy = c5.d;

    static {
        p1 p1Var = new p1();
        zzb = p1Var;
        b5.e(p1.class, p1Var);
    }

    public p1() {
        b6 b6Var = b6.d;
        this.zzz = b6Var;
        this.zzA = b6Var;
        this.zzB = b6Var;
        this.zzC = b6Var;
        this.zzJ = b6Var;
        this.zzY = b6Var;
        this.zzab = b6Var;
        this.zzap = b6Var;
    }

    public static o1 m() {
        return (o1) zzb.j();
    }

    public static o1 n(p1 p1Var) {
        a5 j3 = zzb.j();
        b5 b5Var = j3.a;
        if (!b5Var.equals(p1Var)) {
            if (!j3.b.g()) {
                b5 b5Var2 = (b5) b5Var.h(4, null);
                a6.c.a(b5Var2.getClass()).d(b5Var2, j3.b);
                j3.b = b5Var2;
            }
            b5 b5Var3 = j3.b;
            a6.c.a(b5Var3.getClass()).d(b5Var3, p1Var);
        }
        return (o1) j3;
    }

    public static /* synthetic */ void o(p1 p1Var, int i7) {
        p1Var.zzd |= TLObject.FLAG_31;
        p1Var.zzQ = i7;
    }

    public static /* synthetic */ void p(p1 p1Var, k1 k1Var) {
        p1Var.zzS = k1Var;
        p1Var.zze |= 2;
    }

    public static /* synthetic */ void q(p1 p1Var, v1 v1Var) {
        p1Var.zzT = v1Var;
        p1Var.zze |= 4;
    }

    public static void r(p1 p1Var, i1 i1Var) {
        g5 g5Var = p1Var.zzY;
        if (!((r4) g5Var).a) {
            p1Var.zzY = b5.b(g5Var);
        }
        p1Var.zzY.add(i1Var);
    }

    public static /* synthetic */ void s(p1 p1Var, e1 e1Var) {
        p1Var.zzaf = e1Var;
        p1Var.zze |= TLObject.FLAG_12;
    }

    public static /* synthetic */ void t(p1 p1Var, long j3) {
        p1Var.zzd |= 2;
        p1Var.zzg = j3;
    }

    public static /* synthetic */ void u(p1 p1Var, String str) {
        p1Var.zzd |= 2048;
        p1Var.zzq = str;
    }

    public static /* synthetic */ void v(p1 p1Var, String str) {
        str.getClass();
        p1Var.zzd |= TLObject.FLAG_14;
        p1Var.zzt = str;
    }

    public static /* synthetic */ void w(p1 p1Var, String str) {
        str.getClass();
        p1Var.zzd |= 32768;
        p1Var.zzu = str;
    }

    public static /* synthetic */ void x(p1 p1Var, int i7) {
        p1Var.zzd |= 65536;
        p1Var.zzv = i7;
    }

    public static /* synthetic */ void y(p1 p1Var, String str) {
        p1Var.zzd |= 262144;
        p1Var.zzx = str;
    }

    @Override // com.google.android.gms.internal.cast.b5
    public final Object h(int i7, b5 b5Var) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zzar);
        }
        if (i10 == 2) {
            return new c6(zzb, "\u0001@\u0000\u0002\u0001@@\u0000\t\u0001\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဈ\u000e\nဉ\b\u000bဉ\t\fဉ\n\rဈ\u000b\u000eဉ\f\u000fဉ\r\u0010ဉ\u0011\u0011ဈ\u0012\u0012\u0016\u0013\u001b\u0014\u001b\u0015\u001b\u0016\u001b\u0017᠌\u0014\u0018ဉ\u0018\u0019\u001b\u001aဉ\u0019\u001b᠌\u001b\u001cင\u001c\u001dင\u001d\u001eင\u001e\u001fဆ\u001f ဉ !ဉ!\"ဉ##᠌\u0015$ဉ\u0016%ᐉ$&ဉ%'ဉ&(\u001b)᠌'*ဉ(+\u001b,᠌\u001a-ဇ).ဇ*/᠌+0ဉ,1င\u00172ဉ-3ဉ.4ဉ05ဉ16ဉ27᠌38᠌49᠌5:\u001b;ဈ\u000f<ဉ6=ဉ/>ဉ\u0013?ဉ\"@င\u0010", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", w0.u, "zzi", "zzj", "zzk", "zzl", "zzm", "zzt", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzw", "zzx", "zzy", "zzz", o2.class, "zzA", r2.class, "zzB", e2.class, "zzC", j3.class, "zzE", w0.p, "zzI", "zzJ", h2.class, "zzK", "zzM", w0.a, "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzU", "zzF", w0.n, "zzG", "zzV", "zzW", "zzX", "zzY", i1.class, "zzZ", w0.o, "zzaa", "zzab", l1.class, "zzL", x.T, "zzac", "zzad", "zzae", x.R, "zzaf", "zzH", "zzag", "zzah", "zzaj", "zzak", "zzal", "zzam", x.H, "zzan", w0.g, "zzao", x.G, "zzap", m3.class, "zzu", "zzaq", "zzai", "zzD", "zzT", "zzv"});
        }
        if (i10 == 3) {
            return new p1();
        }
        if (i10 == 4) {
            return new o1(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        this.zzar = b5Var == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final k1 l() {
        k1 k1Var = this.zzS;
        return k1Var == null ? k1.n() : k1Var;
    }
}
