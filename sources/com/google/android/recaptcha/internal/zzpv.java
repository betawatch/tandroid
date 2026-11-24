package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzpv;
import com.google.android.recaptcha.internal.zzpw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
                    String n = tb4.n(zzteVar.size() - size, "Element at index ", " is null.");
                    int size2 = zzteVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            fvc.f(n);
                            return;
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
        for (int i = 0; i < size5; i++) {
            Object obj3 = list2.get(i);
            if (obj3 == null) {
                zze(list, size4);
            }
            list.add(obj3);
        }
    }

    private static void zze(List list, int i) {
        String n = tb4.n(list.size() - i, "Element at index ", " is null.");
        int size = list.size();
        while (true) {
            size--;
            if (size < i) {
                throw new NullPointerException(n);
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
        w26.j("mergeFrom(MessageLite) can only merge messages of the same type.");
        return null;
    }
}
