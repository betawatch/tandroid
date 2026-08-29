package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class z1 extends f5 {
    private static final z1 zzb;
    private int zzd;
    private l2 zze;
    private long zzf;
    private int zzg;
    private k5 zzh;
    private k5 zzi;
    private k5 zzj;
    private k5 zzk;

    static {
        z1 z1Var = new z1();
        zzb = z1Var;
        f5.e(z1.class, z1Var);
    }

    public z1() {
        f6 f6Var = f6.d;
        this.zzh = f6Var;
        this.zzi = f6Var;
        this.zzj = f6Var;
        this.zzk = f6Var;
    }

    public static y1 l() {
        return (y1) zzb.j();
    }

    public static /* synthetic */ void m(z1 z1Var, l2 l2Var) {
        z1Var.zze = l2Var;
        z1Var.zzd |= 1;
    }

    public static /* synthetic */ void n(z1 z1Var, long j10) {
        z1Var.zzd |= 2;
        z1Var.zzf = j10;
    }

    public static void o(z1 z1Var, ArrayList arrayList) {
        k5 k5Var = z1Var.zzh;
        if (!((u4) k5Var).a) {
            z1Var.zzh = f5.b(k5Var);
        }
        List list = z1Var.zzh;
        Charset charset = l5.a;
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
                String l10 = j7.l1.l(list.size() - size, "Element at index ", " is null.");
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(l10);
                    }
                    list.remove(size3);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public static void p(z1 z1Var, ArrayList arrayList) {
        k5 k5Var = z1Var.zzi;
        if (!((u4) k5Var).a) {
            z1Var.zzi = f5.b(k5Var);
        }
        List list = z1Var.zzi;
        Charset charset = l5.a;
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
                String l10 = j7.l1.l(list.size() - size, "Element at index ", " is null.");
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(l10);
                    }
                    list.remove(size3);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public static void q(z1 z1Var, ArrayList arrayList) {
        k5 k5Var = z1Var.zzj;
        if (!((u4) k5Var).a) {
            z1Var.zzj = f5.b(k5Var);
        }
        List list = z1Var.zzj;
        Charset charset = l5.a;
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
                String l10 = j7.l1.l(list.size() - size, "Element at index ", " is null.");
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(l10);
                    }
                    list.remove(size3);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public static void r(z1 z1Var, ArrayList arrayList) {
        k5 k5Var = z1Var.zzk;
        if (!((u4) k5Var).a) {
            z1Var.zzk = f5.b(k5Var);
        }
        List list = z1Var.zzk;
        Charset charset = l5.a;
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
                String l10 = j7.l1.l(list.size() - size, "Element at index ", " is null.");
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(l10);
                    }
                    list.remove(size3);
                }
            } else {
                list.add(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new g6(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001ဉ\u0000\u0002စ\u0001\u0003᠌\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", a1.v, "zzh", x1.class, "zzi", v1.class, "zzj", d2.class, "zzk", b2.class});
        }
        if (i11 == 3) {
            return new z1();
        }
        if (i11 == 4) {
            return new y1(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
