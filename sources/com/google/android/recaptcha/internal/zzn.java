package com.google.android.recaptcha.internal;

import ad.p;
import h7.k6;
import id.c0;
import id.f0;
import id.i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import pc.e;
import pc.f;
import rc.c;
import tc.i;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
final class zzn extends i implements p {
    int zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzxn zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzn(zzq zzqVar, zzgr zzgrVar, long j10, zzxn zzxnVar, c cVar) {
        super(2, cVar);
        this.zzb = zzqVar;
        this.zzc = zzgrVar;
        this.zzd = j10;
        this.zze = zzxnVar;
    }

    @Override // tc.a
    public final c create(Object obj, c cVar) {
        zzn zznVar = new zzn(this.zzb, this.zzc, this.zzd, this.zze, cVar);
        zznVar.zzf = obj;
        return zznVar;
    }

    @Override // ad.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzn) create((c0) obj, (c) obj2)).invokeSuspend(pc.i.a);
    }

    @Override // tc.a
    public final Object invokeSuspend(Object obj) {
        sc.a aVar = sc.a.a;
        int i10 = this.zza;
        k6.b(obj);
        if (i10 == 0) {
            c0 c0Var = (c0) this.zzf;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                arrayList.add(f0.c(c0Var, new zzm(this.zzc, (zzg) it.next(), this.zzd, this.zze, null)));
            }
            i0[] i0VarArr = (i0[]) arrayList.toArray(new i0[0]);
            i0[] i0VarArr2 = (i0[]) Arrays.copyOf(i0VarArr, i0VarArr.length);
            this.zza = 1;
            obj = f0.d(i0VarArr2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        List list = (List) obj;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!(((f) it2.next()).a instanceof e)) {
                    return pc.i.a;
                }
            }
        }
        throw new zzcg(zzce.zzb, zzcd.zzY, null, null, 12, null);
    }
}
