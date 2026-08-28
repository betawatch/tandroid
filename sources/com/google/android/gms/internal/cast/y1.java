package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class y1 extends f5 {
    private static final y1 zzb;
    private int zzd;
    private k2 zze;
    private long zzf;
    private int zzg;
    private k5 zzh;
    private k5 zzi;
    private k5 zzj;
    private k5 zzk;

    static {
        y1 y1Var = new y1();
        zzb = y1Var;
        f5.e(y1.class, y1Var);
    }

    public y1() {
        f6 f6Var = f6.d;
        this.zzh = f6Var;
        this.zzi = f6Var;
        this.zzj = f6Var;
        this.zzk = f6Var;
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
        k5 k5Var = y1Var.zzh;
        if (!((u4) k5Var).a) {
            y1Var.zzh = f5.b(k5Var);
        }
        List list = y1Var.zzh;
        Charset charset = l5.a;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
        }
        int size = list.size();
        int size2 = arrayList.size();
        int i9 = 0;
        while (i9 < size2) {
            Object obj = arrayList.get(i9);
            i9++;
            if (obj == null) {
                String m10 = j3.r0.m(list.size() - size, "Element at index ", " is null.");
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(m10);
                    }
                    list.remove(size3);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public static void p(y1 y1Var, ArrayList arrayList) {
        k5 k5Var = y1Var.zzi;
        if (!((u4) k5Var).a) {
            y1Var.zzi = f5.b(k5Var);
        }
        List list = y1Var.zzi;
        Charset charset = l5.a;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
        }
        int size = list.size();
        int size2 = arrayList.size();
        int i9 = 0;
        while (i9 < size2) {
            Object obj = arrayList.get(i9);
            i9++;
            if (obj == null) {
                String m10 = j3.r0.m(list.size() - size, "Element at index ", " is null.");
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(m10);
                    }
                    list.remove(size3);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public static void q(y1 y1Var, ArrayList arrayList) {
        k5 k5Var = y1Var.zzj;
        if (!((u4) k5Var).a) {
            y1Var.zzj = f5.b(k5Var);
        }
        List list = y1Var.zzj;
        Charset charset = l5.a;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
        }
        int size = list.size();
        int size2 = arrayList.size();
        int i9 = 0;
        while (i9 < size2) {
            Object obj = arrayList.get(i9);
            i9++;
            if (obj == null) {
                String m10 = j3.r0.m(list.size() - size, "Element at index ", " is null.");
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(m10);
                    }
                    list.remove(size3);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public static void r(y1 y1Var, ArrayList arrayList) {
        k5 k5Var = y1Var.zzk;
        if (!((u4) k5Var).a) {
            y1Var.zzk = f5.b(k5Var);
        }
        List list = y1Var.zzk;
        Charset charset = l5.a;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
        }
        int size = list.size();
        int size2 = arrayList.size();
        int i9 = 0;
        while (i9 < size2) {
            Object obj = arrayList.get(i9);
            i9++;
            if (obj == null) {
                String m10 = j3.r0.m(list.size() - size, "Element at index ", " is null.");
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(m10);
                    }
                    list.remove(size3);
                }
            } else {
                list.add(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i9, f5 f5Var) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001ဉ\u0000\u0002စ\u0001\u0003᠌\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", z0.v, "zzh", w1.class, "zzi", u1.class, "zzj", c2.class, "zzk", a2.class});
        }
        if (i10 == 3) {
            return new y1();
        }
        if (i10 == 4) {
            return new x1(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
