package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class x1 extends d5 {
    private static final x1 zzb;
    private int zzd;
    private j2 zze;
    private long zzf;
    private int zzg;
    private i5 zzh;
    private i5 zzi;
    private i5 zzj;
    private i5 zzk;

    static {
        x1 x1Var = new x1();
        zzb = x1Var;
        d5.e(x1.class, x1Var);
    }

    public x1() {
        d6 d6Var = d6.d;
        this.zzh = d6Var;
        this.zzi = d6Var;
        this.zzj = d6Var;
        this.zzk = d6Var;
    }

    public static w1 l() {
        return (w1) zzb.j();
    }

    public static /* synthetic */ void m(x1 x1Var, j2 j2Var) {
        x1Var.zze = j2Var;
        x1Var.zzd |= 1;
    }

    public static /* synthetic */ void n(x1 x1Var, long j10) {
        x1Var.zzd |= 2;
        x1Var.zzf = j10;
    }

    public static void o(x1 x1Var, ArrayList arrayList) {
        i5 i5Var = x1Var.zzh;
        if (!((t4) i5Var).a) {
            x1Var.zzh = d5.b(i5Var);
        }
        List list = x1Var.zzh;
        Charset charset = j5.a;
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
                String k10 = l.d.k(list.size() - size, "Element at index ", " is null.");
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

    public static void p(x1 x1Var, ArrayList arrayList) {
        i5 i5Var = x1Var.zzi;
        if (!((t4) i5Var).a) {
            x1Var.zzi = d5.b(i5Var);
        }
        List list = x1Var.zzi;
        Charset charset = j5.a;
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
                String k10 = l.d.k(list.size() - size, "Element at index ", " is null.");
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

    public static void q(x1 x1Var, ArrayList arrayList) {
        i5 i5Var = x1Var.zzj;
        if (!((t4) i5Var).a) {
            x1Var.zzj = d5.b(i5Var);
        }
        List list = x1Var.zzj;
        Charset charset = j5.a;
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
                String k10 = l.d.k(list.size() - size, "Element at index ", " is null.");
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

    public static void r(x1 x1Var, ArrayList arrayList) {
        i5 i5Var = x1Var.zzk;
        if (!((t4) i5Var).a) {
            x1Var.zzk = d5.b(i5Var);
        }
        List list = x1Var.zzk;
        Charset charset = j5.a;
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
                String k10 = l.d.k(list.size() - size, "Element at index ", " is null.");
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

    @Override // com.google.android.gms.internal.cast.d5
    public final Object h(int i10, d5 d5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new e6(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001ဉ\u0000\u0002စ\u0001\u0003᠌\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", y0.v, "zzh", v1.class, "zzi", t1.class, "zzj", b2.class, "zzk", z1.class});
        }
        if (i11 == 3) {
            return new x1();
        }
        if (i11 == 4) {
            return new w1(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
