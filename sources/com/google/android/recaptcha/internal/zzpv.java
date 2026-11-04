package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzpv;
import com.google.android.recaptcha.internal.zzpw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class zzpv<MessageType extends zzpw<MessageType, BuilderType>, BuilderType extends zzpv<MessageType, BuilderType>> implements zztr {
    public static void zzd(Iterable iterable, List list) {
        byte[] bArr = zzsv.zzb;
        iterable.getClass();
        if (iterable instanceof zzte) {
            List zza = ((zzte) iterable).zza();
            zzte zzteVar = (zzte) list;
            int size = list.size();
            for (Object obj : zza) {
                if (obj == null) {
                    String j10 = p1.j(zzteVar.size() - size, "Element at index ", " is null.");
                    int size2 = zzteVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(j10);
                        }
                        zzteVar.remove(size2);
                    }
                } else if (obj instanceof zzqm) {
                    zzteVar.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr2 = (byte[]) obj;
                    zzqm.zzl(bArr2, 0, bArr2.length);
                    zzteVar.zzb();
                } else {
                    zzteVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzub) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            } else if (list instanceof zzud) {
                ((zzud) list).zzf(list.size() + size3);
            }
        }
        int size4 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    zze(list, size4);
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size5 = list2.size();
        for (int i3 = 0; i3 < size5; i3++) {
            Object obj3 = list2.get(i3);
            if (obj3 == null) {
                zze(list, size4);
            }
            list.add(obj3);
        }
    }

    private static void zze(List list, int i3) {
        String j10 = p1.j(list.size() - i3, "Element at index ", " is null.");
        int size = list.size();
        while (true) {
            size--;
            if (size < i3) {
                throw new NullPointerException(j10);
            }
            list.remove(size);
        }
    }

    @Override // 
    public abstract zzpv zza();

    public abstract zzpv zzb(zzpw zzpwVar);

    @Override // com.google.android.recaptcha.internal.zztr
    public final /* bridge */ /* synthetic */ zztr zzc(zzts zztsVar) {
        if (zzm().getClass().isInstance(zztsVar)) {
            return zzb((zzpw) zztsVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
