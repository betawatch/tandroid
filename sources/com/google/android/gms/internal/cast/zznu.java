package com.google.android.gms.internal.cast;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zznu extends zztp implements zzuy {
    private static final zznu zzb;
    private int zzd;
    private zzok zze;
    private long zzf;
    private int zzg;
    private zztx zzh = zztp.zzA();
    private zztx zzi = zztp.zzA();
    private zztx zzj = zztp.zzA();
    private zztx zzk = zztp.zzA();

    static {
        zznu zznuVar = new zznu();
        zzb = zznuVar;
        zztp.zzH(zznu.class, zznuVar);
    }

    private zznu() {
    }

    public static zznt zza() {
        return (zznt) zzb.zzv();
    }

    static /* synthetic */ void zzd(zznu zznuVar, zzok zzokVar) {
        zzokVar.getClass();
        zznuVar.zze = zzokVar;
        zznuVar.zzd |= 1;
    }

    static /* synthetic */ void zze(zznu zznuVar, long j) {
        zznuVar.zzd |= 2;
        zznuVar.zzf = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void zzf(zznu zznuVar, Iterable iterable) {
        zztx zztxVar = zznuVar.zzh;
        if (!zztxVar.zzc()) {
            zznuVar.zzh = zztp.zzB(zztxVar);
        }
        List list = zznuVar.zzh;
        byte[] bArr = zzty.zzd;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size = list.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size) + " is null.";
                int size2 = list.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(str);
                    }
                    list.remove(size2);
                }
            } else {
                list.add(obj);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void zzg(zznu zznuVar, Iterable iterable) {
        zztx zztxVar = zznuVar.zzi;
        if (!zztxVar.zzc()) {
            zznuVar.zzi = zztp.zzB(zztxVar);
        }
        List list = zznuVar.zzi;
        byte[] bArr = zzty.zzd;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size = list.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size) + " is null.";
                int size2 = list.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(str);
                    }
                    list.remove(size2);
                }
            } else {
                list.add(obj);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void zzh(zznu zznuVar, Iterable iterable) {
        zztx zztxVar = zznuVar.zzj;
        if (!zztxVar.zzc()) {
            zznuVar.zzj = zztp.zzB(zztxVar);
        }
        List list = zznuVar.zzj;
        byte[] bArr = zzty.zzd;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size = list.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size) + " is null.";
                int size2 = list.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(str);
                    }
                    list.remove(size2);
                }
            } else {
                list.add(obj);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void zzi(zznu zznuVar, Iterable iterable) {
        zztx zztxVar = zznuVar.zzk;
        if (!zztxVar.zzc()) {
            zznuVar.zzk = zztp.zzB(zztxVar);
        }
        List list = zznuVar.zzk;
        byte[] bArr = zzty.zzd;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size = list.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size) + " is null.";
                int size2 = list.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(str);
                    }
                    list.remove(size2);
                }
            } else {
                list.add(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.zztp
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zztp.zzE(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001ဉ\u0000\u0002စ\u0001\u0003᠌\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", zzlq.zza(), "zzh", zzns.class, "zzi", zznq.class, "zzj", zzny.class, "zzk", zznw.class});
        }
        if (i2 == 3) {
            return new zznu();
        }
        zzms zzmsVar = null;
        if (i2 == 4) {
            return new zznt(zzmsVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
