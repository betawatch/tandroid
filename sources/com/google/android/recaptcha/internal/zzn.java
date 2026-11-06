package com.google.android.recaptcha.internal;

import af.b;
import gd.f;
import gd.g;
import gd.k;
import id.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kd.j;
import rd.p;
import zd.b0;
import zd.e0;
import zd.z;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzn zznVar = new zzn(this.zzb, this.zzc, this.zzd, this.zze, cVar);
        zznVar.zzf = obj;
        return zznVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzn) create((z) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.a;
        int i7 = this.zza;
        b.c(obj);
        if (i7 == 0) {
            z zVar = (z) this.zzf;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                arrayList.add(b0.c(zVar, new zzm(this.zzc, (zzg) it.next(), this.zzd, this.zze, null)));
            }
            e0[] e0VarArr = (e0[]) arrayList.toArray(new e0[0]);
            e0[] e0VarArr2 = (e0[]) Arrays.copyOf(e0VarArr, e0VarArr.length);
            this.zza = 1;
            obj = b0.d(e0VarArr2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        List list = (List) obj;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!(((g) it2.next()).a instanceof f)) {
                    return k.a;
                }
            }
        }
        throw new zzcg(zzce.zzb, zzcd.zzY, null, null, 12, null);
    }
}
