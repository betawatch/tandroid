package com.google.android.recaptcha.internal;

import gd.e;
import gd.f;
import gd.i;
import id.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jd.a;
import kd.j;
import rd.p;
import v7.u7;
import zd.c0;
import zd.e0;
import zd.h0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        return ((zzn) create((c0) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        u7.b(obj);
        if (i10 == 0) {
            c0 c0Var = (c0) this.zzf;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                arrayList.add(e0.c(c0Var, new zzm(this.zzc, (zzg) it.next(), this.zzd, this.zze, null)));
            }
            h0[] h0VarArr = (h0[]) arrayList.toArray(new h0[0]);
            h0[] h0VarArr2 = (h0[]) Arrays.copyOf(h0VarArr, h0VarArr.length);
            this.zza = 1;
            obj = e0.d(h0VarArr2, this);
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
