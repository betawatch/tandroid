package com.google.android.gms.internal.cast;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class zzuh extends zzul {
    private static final Class zza = DesugarCollections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ zzuh(zzug zzugVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.cast.zzul
    final void zza(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzwj.zzf(obj, j);
        if (list instanceof zzuf) {
            unmodifiableList = ((zzuf) list).zzd();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzve) && (list instanceof zztx)) {
                zztx zztxVar = (zztx) list;
                if (zztxVar.zzc()) {
                    zztxVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        zzwj.zzs(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.cast.zzul
    final void zzb(Object obj, Object obj2, long j) {
        zzue zzueVar;
        List list = (List) zzwj.zzf(obj2, j);
        int size = list.size();
        List list2 = (List) zzwj.zzf(obj, j);
        if (list2.isEmpty()) {
            list2 = list2 instanceof zzuf ? new zzue(size) : ((list2 instanceof zzve) && (list2 instanceof zztx)) ? ((zztx) list2).zzg(size) : new ArrayList(size);
            zzwj.zzs(obj, j, list2);
        } else {
            if (zza.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                zzwj.zzs(obj, j, arrayList);
                zzueVar = arrayList;
            } else if (list2 instanceof zzwe) {
                zzue zzueVar2 = new zzue(list2.size() + size);
                zzueVar2.addAll(zzueVar2.size(), (zzwe) list2);
                zzwj.zzs(obj, j, zzueVar2);
                zzueVar = zzueVar2;
            } else if ((list2 instanceof zzve) && (list2 instanceof zztx)) {
                zztx zztxVar = (zztx) list2;
                if (!zztxVar.zzc()) {
                    list2 = zztxVar.zzg(list2.size() + size);
                    zzwj.zzs(obj, j, list2);
                }
            }
            list2 = zzueVar;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        zzwj.zzs(obj, j, list);
    }
}
