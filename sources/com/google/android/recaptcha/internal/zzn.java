package com.google.android.recaptcha.internal;

import ae.d0;
import ae.g0;
import ae.j0;
import hd.e;
import hd.f;
import hd.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jd.c;
import kd.a;
import ld.j;
import sd.p;
import v7.a8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
final class zzn extends j implements p {
    int zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzxn zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzn(zzq zzqVar, zzgr zzgrVar, long j3, zzxn zzxnVar, c cVar) {
        super(2, cVar);
        this.zzb = zzqVar;
        this.zzc = zzgrVar;
        this.zzd = j3;
        this.zze = zzxnVar;
    }

    @Override // ld.a
    public final c create(Object obj, c cVar) {
        zzn zznVar = new zzn(this.zzb, this.zzc, this.zzd, this.zze, cVar);
        zznVar.zzf = obj;
        return zznVar;
    }

    @Override // sd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzn) create((d0) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // ld.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        a8.b(obj);
        if (i10 == 0) {
            d0 d0Var = (d0) this.zzf;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                arrayList.add(g0.c(d0Var, new zzm(this.zzc, (zzg) it.next(), this.zzd, this.zze, null)));
            }
            j0[] j0VarArr = (j0[]) arrayList.toArray(new j0[0]);
            j0[] j0VarArr2 = (j0[]) Arrays.copyOf(j0VarArr, j0VarArr.length);
            this.zza = 1;
            obj = g0.d(j0VarArr2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        List list = (List) obj;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!(((f) it2.next()).a instanceof e)) {
                    return i.a;
                }
            }
        }
        throw new zzcg(zzce.zzb, zzcd.zzY, null, null, 12, null);
    }
}
