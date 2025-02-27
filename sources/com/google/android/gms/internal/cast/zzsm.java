package com.google.android.gms.internal.cast;

import java.util.Comparator;

/* loaded from: classes.dex */
final class zzsm implements Comparator {
    zzsm() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzsu zzsuVar = (zzsu) obj;
        zzsu zzsuVar2 = (zzsu) obj2;
        zzsl zzslVar = new zzsl(zzsuVar);
        zzsl zzslVar2 = new zzsl(zzsuVar2);
        while (zzslVar.hasNext() && zzslVar2.hasNext()) {
            int compareTo = Integer.valueOf(zzslVar.zza() & 255).compareTo(Integer.valueOf(zzslVar2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzsuVar.zzd()).compareTo(Integer.valueOf(zzsuVar2.zzd()));
    }
}
