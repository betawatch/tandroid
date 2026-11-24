package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzk extends eeb implements fs4 {
    int zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzgr zzd;
    final /* synthetic */ long zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(zzq zzqVar, String str, zzgr zzgrVar, long j, px2 px2Var) {
        super(2, px2Var);
        this.zzb = zzqVar;
        this.zzc = str;
        this.zzd = zzgrVar;
        this.zze = j;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, this.zze, px2Var);
        zzkVar.zzf = obj;
        return zzkVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((ky2) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        tue.b(obj);
        if (i == 0) {
            ky2 ky2Var = (ky2) this.zzf;
            ArrayList arrayList = new ArrayList();
            for (zzg zzgVar : this.zzb.zzd()) {
                if (zzgVar.zzi()) {
                    arrayList.add(srd.a(ky2Var, new zzj(this.zzd, zzgVar, this.zzc, this.zze, null)));
                }
            }
            le3[] le3VarArr = (le3[]) arrayList.toArray(new le3[0]);
            le3[] le3VarArr2 = (le3[]) Arrays.copyOf(le3VarArr, le3VarArr.length);
            this.zza = 1;
            obj = apd.a(le3VarArr2, this);
            ly2 ly2Var = ly2.a;
            if (obj == ly2Var) {
                return ly2Var;
            }
        }
        String str = this.zzc;
        zzxw zzf = zzxx.zzf();
        zzf.zze(str);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            Object obj2 = ((tc9) it.next()).a;
            if (!(obj2 instanceof sc9)) {
                zzf.zzh((zzxx) obj2);
            }
        }
        return (zzxx) zzf.zzk();
    }
}
