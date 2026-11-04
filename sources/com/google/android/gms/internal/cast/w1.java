package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class w1 extends c5 {
    private static final w1 zzb;
    private int zzd;
    private i2 zze;
    private long zzf;
    private int zzg;
    private h5 zzh;
    private h5 zzi;
    private h5 zzj;
    private h5 zzk;

    static {
        w1 w1Var = new w1();
        zzb = w1Var;
        c5.e(w1.class, w1Var);
    }

    public w1() {
        c6 c6Var = c6.d;
        this.zzh = c6Var;
        this.zzi = c6Var;
        this.zzj = c6Var;
        this.zzk = c6Var;
    }

    public static v1 l() {
        return (v1) zzb.j();
    }

    public static /* synthetic */ void m(w1 w1Var, i2 i2Var) {
        w1Var.zze = i2Var;
        w1Var.zzd |= 1;
    }

    public static /* synthetic */ void n(w1 w1Var, long j10) {
        w1Var.zzd |= 2;
        w1Var.zzf = j10;
    }

    public static void o(w1 w1Var, ArrayList arrayList) {
        h5 h5Var = w1Var.zzh;
        if (!((s4) h5Var).a) {
            w1Var.zzh = c5.b(h5Var);
        }
        List list = w1Var.zzh;
        Charset charset = i5.a;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
        }
        int size = list.size();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj = arrayList.get(i3);
            i3++;
            if (obj == null) {
                String j10 = k2.p1.j(list.size() - size, "Element at index ", " is null.");
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(j10);
                    }
                    list.remove(size3);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public static void p(w1 w1Var, ArrayList arrayList) {
        h5 h5Var = w1Var.zzi;
        if (!((s4) h5Var).a) {
            w1Var.zzi = c5.b(h5Var);
        }
        List list = w1Var.zzi;
        Charset charset = i5.a;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
        }
        int size = list.size();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj = arrayList.get(i3);
            i3++;
            if (obj == null) {
                String j10 = k2.p1.j(list.size() - size, "Element at index ", " is null.");
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(j10);
                    }
                    list.remove(size3);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public static void q(w1 w1Var, ArrayList arrayList) {
        h5 h5Var = w1Var.zzj;
        if (!((s4) h5Var).a) {
            w1Var.zzj = c5.b(h5Var);
        }
        List list = w1Var.zzj;
        Charset charset = i5.a;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
        }
        int size = list.size();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj = arrayList.get(i3);
            i3++;
            if (obj == null) {
                String j10 = k2.p1.j(list.size() - size, "Element at index ", " is null.");
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(j10);
                    }
                    list.remove(size3);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public static void r(w1 w1Var, ArrayList arrayList) {
        h5 h5Var = w1Var.zzk;
        if (!((s4) h5Var).a) {
            w1Var.zzk = c5.b(h5Var);
        }
        List list = w1Var.zzk;
        Charset charset = i5.a;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
        }
        int size = list.size();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj = arrayList.get(i3);
            i3++;
            if (obj == null) {
                String j10 = k2.p1.j(list.size() - size, "Element at index ", " is null.");
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(j10);
                    }
                    list.remove(size3);
                }
            } else {
                list.add(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i3, c5 c5Var) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new d6(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001ဉ\u0000\u0002စ\u0001\u0003᠌\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", x0.v, "zzh", u1.class, "zzi", s1.class, "zzj", a2.class, "zzk", y1.class});
        }
        if (i10 == 3) {
            return new w1();
        }
        if (i10 == 4) {
            return new v1(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
