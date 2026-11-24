package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzn extends eeb implements fs4 {
    int zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzxn zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzn(zzq zzqVar, zzgr zzgrVar, long j, zzxn zzxnVar, px2 px2Var) {
        super(2, px2Var);
        this.zzb = zzqVar;
        this.zzc = zzgrVar;
        this.zzd = j;
        this.zze = zzxnVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzn zznVar = new zzn(this.zzb, this.zzc, this.zzd, this.zze, px2Var);
        zznVar.zzf = obj;
        return zznVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzn) create((ky2) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        tue.b(obj);
        if (i == 0) {
            ky2 ky2Var = (ky2) this.zzf;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                arrayList.add(srd.a(ky2Var, new zzm(this.zzc, (zzg) it.next(), this.zzd, this.zze, null)));
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
        List list = (List) obj;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!(((tc9) it2.next()).a instanceof sc9)) {
                    return g7c.a;
                }
            }
        }
        throw new zzcg(zzce.zzb, zzcd.zzY, null, null, 12, null);
    }
}
