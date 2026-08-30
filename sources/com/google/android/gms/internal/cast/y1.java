package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class y1 extends e5 {
    private static final y1 zzb;
    private int zzd;
    private k2 zze;
    private long zzf;
    private int zzg;
    private j5 zzh;
    private j5 zzi;
    private j5 zzj;
    private j5 zzk;

    static {
        y1 y1Var = new y1();
        zzb = y1Var;
        e5.e(y1.class, y1Var);
    }

    public y1() {
        e6 e6Var = e6.d;
        this.zzh = e6Var;
        this.zzi = e6Var;
        this.zzj = e6Var;
        this.zzk = e6Var;
    }

    public static x1 l() {
        return (x1) zzb.j();
    }

    public static /* synthetic */ void m(y1 y1Var, k2 k2Var) {
        y1Var.zze = k2Var;
        y1Var.zzd |= 1;
    }

    public static /* synthetic */ void n(y1 y1Var, long j10) {
        y1Var.zzd |= 2;
        y1Var.zzf = j10;
    }

    public static void o(y1 y1Var, ArrayList arrayList) {
        j5 j5Var = y1Var.zzh;
        if (!((u4) j5Var).a) {
            y1Var.zzh = e5.b(j5Var);
        }
        List list = y1Var.zzh;
        Charset charset = k5.a;
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
                String k10 = kh.a2.k(list.size() - size, "Element at index ", " is null.");
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(k10);
                    }
                    list.remove(size3);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public static void p(y1 y1Var, ArrayList arrayList) {
        j5 j5Var = y1Var.zzi;
        if (!((u4) j5Var).a) {
            y1Var.zzi = e5.b(j5Var);
        }
        List list = y1Var.zzi;
        Charset charset = k5.a;
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
                String k10 = kh.a2.k(list.size() - size, "Element at index ", " is null.");
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(k10);
                    }
                    list.remove(size3);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public static void q(y1 y1Var, ArrayList arrayList) {
        j5 j5Var = y1Var.zzj;
        if (!((u4) j5Var).a) {
            y1Var.zzj = e5.b(j5Var);
        }
        List list = y1Var.zzj;
        Charset charset = k5.a;
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
                String k10 = kh.a2.k(list.size() - size, "Element at index ", " is null.");
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(k10);
                    }
                    list.remove(size3);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public static void r(y1 y1Var, ArrayList arrayList) {
        j5 j5Var = y1Var.zzk;
        if (!((u4) j5Var).a) {
            y1Var.zzk = e5.b(j5Var);
        }
        List list = y1Var.zzk;
        Charset charset = k5.a;
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
                String k10 = kh.a2.k(list.size() - size, "Element at index ", " is null.");
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(k10);
                    }
                    list.remove(size3);
                }
            } else {
                list.add(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.e5
    public final Object h(int i10, e5 e5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new f6(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001ဉ\u0000\u0002စ\u0001\u0003᠌\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", z0.v, "zzh", w1.class, "zzi", u1.class, "zzj", c2.class, "zzk", a2.class});
        }
        if (i11 == 3) {
            return new y1();
        }
        if (i11 == 4) {
            return new x1(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
