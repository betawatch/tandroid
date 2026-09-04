package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class a2 extends h5 {
    private static final a2 zzb;
    private int zzd;
    private m2 zze;
    private long zzf;
    private int zzg;
    private m5 zzh;
    private m5 zzi;
    private m5 zzj;
    private m5 zzk;

    static {
        a2 a2Var = new a2();
        zzb = a2Var;
        h5.e(a2.class, a2Var);
    }

    public a2() {
        h6 h6Var = h6.d;
        this.zzh = h6Var;
        this.zzi = h6Var;
        this.zzj = h6Var;
        this.zzk = h6Var;
    }

    public static z1 l() {
        return (z1) zzb.j();
    }

    public static /* synthetic */ void m(a2 a2Var, m2 m2Var) {
        a2Var.zze = m2Var;
        a2Var.zzd |= 1;
    }

    public static /* synthetic */ void n(a2 a2Var, long j3) {
        a2Var.zzd |= 2;
        a2Var.zzf = j3;
    }

    public static void o(a2 a2Var, ArrayList arrayList) {
        m5 m5Var = a2Var.zzh;
        if (!((w4) m5Var).a) {
            a2Var.zzh = h5.b(m5Var);
        }
        List list = a2Var.zzh;
        Charset charset = n5.a;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
        }
        int size = list.size();
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj = arrayList.get(i10);
            i10++;
            if (obj == null) {
                String j3 = i2.g.j(list.size() - size, "Element at index ", " is null.");
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(j3);
                    }
                    list.remove(size3);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public static void p(a2 a2Var, ArrayList arrayList) {
        m5 m5Var = a2Var.zzi;
        if (!((w4) m5Var).a) {
            a2Var.zzi = h5.b(m5Var);
        }
        List list = a2Var.zzi;
        Charset charset = n5.a;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
        }
        int size = list.size();
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj = arrayList.get(i10);
            i10++;
            if (obj == null) {
                String j3 = i2.g.j(list.size() - size, "Element at index ", " is null.");
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(j3);
                    }
                    list.remove(size3);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public static void q(a2 a2Var, ArrayList arrayList) {
        m5 m5Var = a2Var.zzj;
        if (!((w4) m5Var).a) {
            a2Var.zzj = h5.b(m5Var);
        }
        List list = a2Var.zzj;
        Charset charset = n5.a;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
        }
        int size = list.size();
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj = arrayList.get(i10);
            i10++;
            if (obj == null) {
                String j3 = i2.g.j(list.size() - size, "Element at index ", " is null.");
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(j3);
                    }
                    list.remove(size3);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public static void r(a2 a2Var, ArrayList arrayList) {
        m5 m5Var = a2Var.zzk;
        if (!((w4) m5Var).a) {
            a2Var.zzk = h5.b(m5Var);
        }
        List list = a2Var.zzk;
        Charset charset = n5.a;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
        }
        int size = list.size();
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj = arrayList.get(i10);
            i10++;
            if (obj == null) {
                String j3 = i2.g.j(list.size() - size, "Element at index ", " is null.");
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(j3);
                    }
                    list.remove(size3);
                }
            } else {
                list.add(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.h5
    public final Object h(int i10, h5 h5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001ဉ\u0000\u0002စ\u0001\u0003᠌\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", b1.v, "zzh", y1.class, "zzi", w1.class, "zzj", e2.class, "zzk", c2.class});
        }
        if (i11 == 3) {
            return new a2();
        }
        if (i11 == 4) {
            return new z1(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
