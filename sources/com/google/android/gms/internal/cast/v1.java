package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class v1 extends c5 {
    private static final v1 zzb;
    private int zzd;
    private h2 zze;
    private long zzf;
    private int zzg;
    private h5 zzh;
    private h5 zzi;
    private h5 zzj;
    private h5 zzk;

    static {
        v1 v1Var = new v1();
        zzb = v1Var;
        c5.e(v1.class, v1Var);
    }

    public v1() {
        c6 c6Var = c6.d;
        this.zzh = c6Var;
        this.zzi = c6Var;
        this.zzj = c6Var;
        this.zzk = c6Var;
    }

    public static u1 l() {
        return (u1) zzb.j();
    }

    public static /* synthetic */ void m(v1 v1Var, h2 h2Var) {
        v1Var.zze = h2Var;
        v1Var.zzd |= 1;
    }

    public static /* synthetic */ void n(v1 v1Var, long j10) {
        v1Var.zzd |= 2;
        v1Var.zzf = j10;
    }

    public static void o(v1 v1Var, ArrayList arrayList) {
        h5 h5Var = v1Var.zzh;
        if (!((r4) h5Var).a) {
            v1Var.zzh = c5.b(h5Var);
        }
        List list = v1Var.zzh;
        Charset charset = i5.a;
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
                String j10 = ic.a.j(list.size() - size, "Element at index ", " is null.");
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

    public static void p(v1 v1Var, ArrayList arrayList) {
        h5 h5Var = v1Var.zzi;
        if (!((r4) h5Var).a) {
            v1Var.zzi = c5.b(h5Var);
        }
        List list = v1Var.zzi;
        Charset charset = i5.a;
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
                String j10 = ic.a.j(list.size() - size, "Element at index ", " is null.");
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

    public static void q(v1 v1Var, ArrayList arrayList) {
        h5 h5Var = v1Var.zzj;
        if (!((r4) h5Var).a) {
            v1Var.zzj = c5.b(h5Var);
        }
        List list = v1Var.zzj;
        Charset charset = i5.a;
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
                String j10 = ic.a.j(list.size() - size, "Element at index ", " is null.");
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

    public static void r(v1 v1Var, ArrayList arrayList) {
        h5 h5Var = v1Var.zzk;
        if (!((r4) h5Var).a) {
            v1Var.zzk = c5.b(h5Var);
        }
        List list = v1Var.zzk;
        Charset charset = i5.a;
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
                String j10 = ic.a.j(list.size() - size, "Element at index ", " is null.");
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
    public final Object h(int i10, c5 c5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new d6(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001ဉ\u0000\u0002စ\u0001\u0003᠌\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", w0.v, "zzh", t1.class, "zzi", r1.class, "zzj", z1.class, "zzk", x1.class});
        }
        if (i11 == 3) {
            return new v1();
        }
        if (i11 == 4) {
            return new u1(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
