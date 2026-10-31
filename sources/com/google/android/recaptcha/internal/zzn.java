package com.google.android.recaptcha.internal;

import ad.f;
import ad.g;
import cd.c;
import dd.a;
import ed.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l9.b;
import ld.p;
import td.c0;
import td.e0;
import td.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
final class zzn extends j implements p {
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

    @Override // ed.a
    public final c create(Object obj, c cVar) {
        zzn zznVar = new zzn(this.zzb, this.zzc, this.zzd, this.zze, cVar);
        zznVar.zzf = obj;
        return zznVar;
    }

    @Override // ld.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzn) create((c0) obj, (c) obj2)).invokeSuspend(ad.j.a);
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        b.b(obj);
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
                if (!(((g) it2.next()).a instanceof f)) {
                    return ad.j.a;
                }
            }
        }
        throw new zzcg(zzce.zzb, zzcd.zzY, null, null, 12, null);
    }
}
