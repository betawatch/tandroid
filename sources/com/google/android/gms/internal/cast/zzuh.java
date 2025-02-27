package com.google.android.gms.internal.cast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class zzuh extends zzul {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

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
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzwj.zzs(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0094 A[ADDED_TO_REGION] */
    @Override // com.google.android.gms.internal.cast.zzul
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzb(Object obj, Object obj2, long j) {
        zzue zzueVar;
        int size;
        List list = (List) zzwj.zzf(obj2, j);
        int size2 = list.size();
        List list2 = (List) zzwj.zzf(obj, j);
        if (!list2.isEmpty()) {
            if (zza.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size2);
                arrayList.addAll(list2);
                zzueVar = arrayList;
            } else {
                if (!(list2 instanceof zzwe)) {
                    if ((list2 instanceof zzve) && (list2 instanceof zztx)) {
                        zztx zztxVar = (zztx) list2;
                        if (!zztxVar.zzc()) {
                            list2 = zztxVar.zzg(list2.size() + size2);
                        }
                    }
                    size = list2.size();
                    int size3 = list.size();
                    if (size > 0 && size3 > 0) {
                        list2.addAll(list);
                    }
                    if (size > 0) {
                        list = list2;
                    }
                    zzwj.zzs(obj, j, list);
                }
                zzue zzueVar2 = new zzue(list2.size() + size2);
                zzueVar2.addAll(zzueVar2.size(), (zzwe) list2);
                zzueVar = zzueVar2;
            }
            zzwj.zzs(obj, j, zzueVar);
            list2 = zzueVar;
            size = list2.size();
            int size32 = list.size();
            if (size > 0) {
                list2.addAll(list);
            }
            if (size > 0) {
            }
            zzwj.zzs(obj, j, list);
        }
        list2 = list2 instanceof zzuf ? new zzue(size2) : ((list2 instanceof zzve) && (list2 instanceof zztx)) ? ((zztx) list2).zzg(size2) : new ArrayList(size2);
        zzwj.zzs(obj, j, list2);
        size = list2.size();
        int size322 = list.size();
        if (size > 0) {
        }
        if (size > 0) {
        }
        zzwj.zzs(obj, j, list);
    }
}
