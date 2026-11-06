package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class v1 extends b5 {
    private static final v1 zzb;
    private int zzd;
    private h2 zze;
    private long zzf;
    private int zzg;
    private g5 zzh;
    private g5 zzi;
    private g5 zzj;
    private g5 zzk;

    static {
        v1 v1Var = new v1();
        zzb = v1Var;
        b5.e(v1.class, v1Var);
    }

    public v1() {
        b6 b6Var = b6.d;
        this.zzh = b6Var;
        this.zzi = b6Var;
        this.zzj = b6Var;
        this.zzk = b6Var;
    }

    public static u1 l() {
        return (u1) zzb.j();
    }

    public static /* synthetic */ void m(v1 v1Var, h2 h2Var) {
        v1Var.zze = h2Var;
        v1Var.zzd |= 1;
    }

    public static /* synthetic */ void n(v1 v1Var, long j3) {
        v1Var.zzd |= 2;
        v1Var.zzf = j3;
    }

    public static void o(v1 v1Var, ArrayList arrayList) {
        g5 g5Var = v1Var.zzh;
        if (!((r4) g5Var).a) {
            v1Var.zzh = b5.b(g5Var);
        }
        List list = v1Var.zzh;
        Charset charset = h5.a;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
        }
        int size = list.size();
        int size2 = arrayList.size();
        int i7 = 0;
        while (i7 < size2) {
            Object obj = arrayList.get(i7);
            i7++;
            if (obj == null) {
                String k10 = jg.g.k(list.size() - size, "Element at index ", " is null.");
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

    public static void p(v1 v1Var, ArrayList arrayList) {
        g5 g5Var = v1Var.zzi;
        if (!((r4) g5Var).a) {
            v1Var.zzi = b5.b(g5Var);
        }
        List list = v1Var.zzi;
        Charset charset = h5.a;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
        }
        int size = list.size();
        int size2 = arrayList.size();
        int i7 = 0;
        while (i7 < size2) {
            Object obj = arrayList.get(i7);
            i7++;
            if (obj == null) {
                String k10 = jg.g.k(list.size() - size, "Element at index ", " is null.");
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

    public static void q(v1 v1Var, ArrayList arrayList) {
        g5 g5Var = v1Var.zzj;
        if (!((r4) g5Var).a) {
            v1Var.zzj = b5.b(g5Var);
        }
        List list = v1Var.zzj;
        Charset charset = h5.a;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
        }
        int size = list.size();
        int size2 = arrayList.size();
        int i7 = 0;
        while (i7 < size2) {
            Object obj = arrayList.get(i7);
            i7++;
            if (obj == null) {
                String k10 = jg.g.k(list.size() - size, "Element at index ", " is null.");
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

    public static void r(v1 v1Var, ArrayList arrayList) {
        g5 g5Var = v1Var.zzk;
        if (!((r4) g5Var).a) {
            v1Var.zzk = b5.b(g5Var);
        }
        List list = v1Var.zzk;
        Charset charset = h5.a;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
        }
        int size = list.size();
        int size2 = arrayList.size();
        int i7 = 0;
        while (i7 < size2) {
            Object obj = arrayList.get(i7);
            i7++;
            if (obj == null) {
                String k10 = jg.g.k(list.size() - size, "Element at index ", " is null.");
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

    @Override // com.google.android.gms.internal.cast.b5
    public final Object h(int i7, b5 b5Var) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c6(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001ဉ\u0000\u0002စ\u0001\u0003᠌\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", w0.v, "zzh", t1.class, "zzi", r1.class, "zzj", z1.class, "zzk", x1.class});
        }
        if (i10 == 3) {
            return new v1();
        }
        if (i10 == 4) {
            return new u1(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
