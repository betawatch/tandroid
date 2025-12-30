package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* loaded from: classes.dex */
public final class zzaj extends zzg {
    private final List zza;
    private zzqm zzb;
    private final Map zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public zzaj() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ zzaj(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this.zza = CollectionsKt.listOf((Object[]) new zzar[]{new zzav(), new zzad(), new zzx(), new zzz(), new zzba(null, null, 3, null)});
        this.zzc = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzxx zzp(String str) {
        Map emptyMap;
        List list = (List) this.zzc.remove(str);
        if (list != null) {
            List<zzat> list2 = list;
            emptyMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
            for (zzat zzatVar : list2) {
                emptyMap.put(Integer.valueOf(zzatVar.zzb()), zzatVar);
            }
        } else {
            emptyMap = MapsKt.emptyMap();
        }
        zzyo zzr = zzr(emptyMap, str);
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
                throw new NoWhenBranchMatchedException();
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
        ArrayList<zzar> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((zzar) obj).zzi()) {
                arrayList.add(obj);
            }
        }
        for (zzar zzarVar : arrayList) {
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
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList2.add(zzq((zzat) it.next()));
        }
        zzf.zze(arrayList2);
        return (zzyo) zzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzg
    protected final Object zza(String str, Continuation continuation) {
        return zzp(str);
    }

    @Override // com.google.android.recaptcha.internal.zzg
    protected final Object zzb(String str, Continuation continuation) {
        return new zzhg(new zzag(this, str, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    protected final Object zzd(zzxn zzxnVar, Continuation continuation) {
        return new zzhg(new zzai(zzxnVar, this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    protected final void zzh(zzyg zzygVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzar) it.next()).zzh(zzygVar);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzg
    protected final int zzj() {
        return 35;
    }

    @Override // com.google.android.recaptcha.internal.zzg
    protected final int zzk() {
        return 34;
    }

    public final Map zzn() {
        return this.zzc;
    }
}
