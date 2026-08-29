package com.google.android.recaptcha.internal;

import bd.p;
import i7.c7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import jd.c0;
import jd.e0;
import jd.h0;
import qc.e;
import qc.f;
import sc.c;
import uc.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
final class zzk extends i implements p {
    int zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzgr zzd;
    final /* synthetic */ long zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(zzq zzqVar, String str, zzgr zzgrVar, long j10, c cVar) {
        super(2, cVar);
        this.zzb = zzqVar;
        this.zzc = str;
        this.zzd = zzgrVar;
        this.zze = j10;
    }

    @Override // uc.a
    public final c create(Object obj, c cVar) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, this.zze, cVar);
        zzkVar.zzf = obj;
        return zzkVar;
    }

    @Override // bd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((c0) obj, (c) obj2)).invokeSuspend(qc.i.a);
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        tc.a aVar = tc.a.a;
        int i10 = this.zza;
        c7.b(obj);
        if (i10 == 0) {
            c0 c0Var = (c0) this.zzf;
            ArrayList arrayList = new ArrayList();
            for (zzg zzgVar : this.zzb.zzd()) {
                if (zzgVar.zzi()) {
                    arrayList.add(e0.c(c0Var, new zzj(this.zzd, zzgVar, this.zzc, this.zze, null)));
                }
            }
            h0[] h0VarArr = (h0[]) arrayList.toArray(new h0[0]);
            h0[] h0VarArr2 = (h0[]) Arrays.copyOf(h0VarArr, h0VarArr.length);
            this.zza = 1;
            obj = e0.d(h0VarArr2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        String str = this.zzc;
        zzxw zzf = zzxx.zzf();
        zzf.zze(str);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            Object obj2 = ((f) it.next()).a;
            if (!(obj2 instanceof e)) {
                zzf.zzh((zzxx) obj2);
            }
        }
        return (zzxx) zzf.zzk();
    }
}
