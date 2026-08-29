package com.google.android.recaptcha.internal;

import a6.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f;
import rc.h;
import rc.i;
import rc.p;
import rc.r;
import sc.c;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class zzaj extends zzg {
    private final List zza;
    private zzqm zzb;
    private final Map zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public zzaj() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzxx zzp(String str) {
        Map map;
        List list = (List) this.zzc.remove(str);
        if (list != null) {
            List<zzat> list2 = list;
            int a2 = r.a(i.d(list2));
            if (a2 < 16) {
                a2 = 16;
            }
            map = new LinkedHashMap(a2);
            for (zzat zzatVar : list2) {
                map.put(Integer.valueOf(zzatVar.zzb()), zzatVar);
            }
        } else {
            map = p.a;
        }
        zzyo zzr = zzr(map, str);
        zzxw zzf = zzxx.zzf();
        zzf.zze(str);
        zzxq zzf2 = zzxr.zzf();
        byte[] zzd = zzr.zzd();
        zzf2.zze(zzpp.zzh().zzi(zzd, 0, zzd.length));
        zzf.zzq(zzf2);
        return (zzxx) zzf.zzk();
    }

    private final zzym zzq(zzat zzatVar) {
        zzqm zzqmVar;
        zzyk zzf = zzym.zzf();
        zzf.zzq(3);
        if (zzatVar instanceof zzal) {
            zzyx zza = ((zzal) zzatVar).zza();
            zzqm zzqmVar2 = this.zzb;
            zzqmVar = zzqmVar2 != null ? zzqmVar2 : null;
            byte[] zzd = zza.zzd();
            zzf.zzf(zzdn.zza(zzpp.zzh().zzi(zzd, 0, zzd.length), zzqmVar));
        } else {
            if (!(zzatVar instanceof zzak)) {
                throw new b();
            }
            zzyt zza2 = ((zzak) zzatVar).zza();
            zzqm zzqmVar3 = this.zzb;
            zzqmVar = zzqmVar3 != null ? zzqmVar3 : null;
            byte[] zzd2 = zza2.zzd();
            zzf.zze(zzdn.zza(zzpp.zzh().zzi(zzd2, 0, zzd2.length), zzqmVar));
        }
        return (zzym) zzf.zzk();
    }

    private final zzyo zzr(Map map, String str) {
        zzyn zzf = zzyo.zzf();
        zzf.zzq(str);
        List list = this.zza;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((zzar) obj).zzi()) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            zzar zzarVar = (zzar) obj2;
            if (!map.containsKey(Integer.valueOf(zzarVar.zza()))) {
                int zza = zzarVar.zza();
                zzys zzf2 = zzyt.zzf();
                zzf2.zzf(zza);
                zzf2.zzr(13);
                zzf2.zzq(27);
                zzf.zzf(zzq(new zzak(zza, (zzyt) zzf2.zzk())));
            }
        }
        Collection values = map.values();
        ArrayList arrayList2 = new ArrayList(i.d(values));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList2.add(zzq((zzat) it.next()));
        }
        zzf.zze(arrayList2);
        return (zzyo) zzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zza(String str, c cVar) {
        return zzp(str);
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzb(String str, c cVar) {
        return new zzhg(new zzag(this, str, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzd(zzxn zzxnVar, c cVar) {
        return new zzhg(new zzai(zzxnVar, this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final void zzh(zzyg zzygVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzar) it.next()).zzh(zzygVar);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final int zzj() {
        return 35;
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final int zzk() {
        return 34;
    }

    public final Map zzn() {
        return this.zzc;
    }

    public /* synthetic */ zzaj(List list, int i10, f fVar) {
        this.zza = h.c(new zzav(), new zzad(), new zzx(), new zzz(), new zzba(null, null, 3, null));
        this.zzc = new LinkedHashMap();
    }
}
