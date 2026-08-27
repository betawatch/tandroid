package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import qc.i;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class zzja {
    private final Map zza = new LinkedHashMap();
    private final Set zzb = new LinkedHashSet();

    private final List zzh(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(i.d(list2));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(zza((zzzt) it.next()));
        }
        return arrayList;
    }

    public final Object zza(zzzt zzztVar) {
        int zzS = zzztVar.zzS();
        int i10 = zzS - 1;
        if (zzS == 0) {
            throw null;
        }
        switch (i10) {
            case 0:
                return this.zza.get(Integer.valueOf(zzztVar.zzi()));
            case 1:
                return Boolean.valueOf(zzztVar.zzQ());
            case 2:
                byte[] zzo = zzztVar.zzM().zzo();
                if (zzo.length == 1) {
                    return Byte.valueOf(zzo[0]);
                }
                throw new zzdm(4, 6, null);
            case 3:
                String zzO = zzztVar.zzO();
                if (zzO.length() == 1) {
                    return Character.valueOf(zzO.charAt(0));
                }
                throw new zzdm(4, 6, null);
            case 4:
                int zzj = zzztVar.zzj();
                if (zzj < -32768 || zzj > 32767) {
                    throw new zzdm(4, 6, null);
                }
                return Short.valueOf((short) zzj);
            case 5:
                return Integer.valueOf(zzztVar.zzk());
            case 6:
            case 8:
                throw new zzdm(4, 6, null);
            case 7:
                return Long.valueOf(zzztVar.zzl());
            case 9:
                return Float.valueOf(zzztVar.zzg());
            case 10:
                return Double.valueOf(zzztVar.zzf());
            case 11:
                return zzztVar.zzP();
            case 12:
                return null;
            default:
                throw new zzdm(4, 5, null);
        }
    }

    public final Object zzb(int i10) {
        return this.zza.remove(Integer.valueOf(i10));
    }

    public final void zzc() {
        this.zza.clear();
    }

    public final void zzd(int i10, Object obj) {
        zze(173, obj);
        this.zzb.add(173);
    }

    public final void zze(int i10, Object obj) {
        this.zza.put(Integer.valueOf(i10), obj);
    }

    public final Class[] zzf(List list) {
        List zzh = zzh(list);
        ArrayList arrayList = new ArrayList(i.d(zzh));
        Iterator it = zzh.iterator();
        while (it.hasNext()) {
            arrayList.add(zziy.zza(it.next()));
        }
        return (Class[]) arrayList.toArray(new Class[0]);
    }

    public final Object[] zzg(List list) {
        return zzh(list).toArray(new Object[0]);
    }
}
