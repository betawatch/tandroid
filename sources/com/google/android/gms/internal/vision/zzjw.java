package com.google.android.gms.internal.vision;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class zzjw extends zzju {
    private static final Class zza = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    private zzjw() {
        super();
    }

    @Override // com.google.android.gms.internal.vision.zzju
    final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzma.zzf(obj, j);
        if (list instanceof zzjv) {
            unmodifiableList = ((zzjv) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzkw) && (list instanceof zzjl)) {
                zzjl zzjlVar = (zzjl) list;
                if (zzjlVar.zza()) {
                    zzjlVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        zzma.zza(obj, j, unmodifiableList);
    }

    private static List zza(Object obj, long j, int i) {
        List arrayList;
        List zzc = zzc(obj, j);
        if (zzc.isEmpty()) {
            if (zzc instanceof zzjv) {
                arrayList = new zzjs(i);
            } else if ((zzc instanceof zzkw) && (zzc instanceof zzjl)) {
                arrayList = ((zzjl) zzc).zza(i);
            } else {
                arrayList = new ArrayList(i);
            }
            zzma.zza(obj, j, arrayList);
            return arrayList;
        }
        if (zza.isAssignableFrom(zzc.getClass())) {
            ArrayList arrayList2 = new ArrayList(zzc.size() + i);
            arrayList2.addAll(zzc);
            zzma.zza(obj, j, arrayList2);
            return arrayList2;
        }
        if (zzc instanceof zzlz) {
            zzjs zzjsVar = new zzjs(zzc.size() + i);
            zzjsVar.addAll((zzlz) zzc);
            zzma.zza(obj, j, zzjsVar);
            return zzjsVar;
        }
        if ((zzc instanceof zzkw) && (zzc instanceof zzjl)) {
            zzjl zzjlVar = (zzjl) zzc;
            if (!zzjlVar.zza()) {
                zzjl zza2 = zzjlVar.zza(zzc.size() + i);
                zzma.zza(obj, j, zza2);
                return zza2;
            }
        }
        return zzc;
    }

    @Override // com.google.android.gms.internal.vision.zzju
    final void zza(Object obj, Object obj2, long j) {
        List zzc = zzc(obj2, j);
        List zza2 = zza(obj, j, zzc.size());
        int size = zza2.size();
        int size2 = zzc.size();
        if (size > 0 && size2 > 0) {
            zza2.addAll(zzc);
        }
        if (size > 0) {
            zzc = zza2;
        }
        zzma.zza(obj, j, zzc);
    }

    private static List zzc(Object obj, long j) {
        return (List) zzma.zzf(obj, j);
    }
}
