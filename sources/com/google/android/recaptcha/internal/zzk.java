package com.google.android.recaptcha.internal;

import g7.y5;
import hd.c0;
import hd.f0;
import hd.i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import oc.e;
import oc.f;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, this.zze, cVar);
        zzkVar.zzf = obj;
        return zzkVar;
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((c0) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i9 = this.zza;
        y5.b(obj);
        if (i9 == 0) {
            c0 c0Var = (c0) this.zzf;
            ArrayList arrayList = new ArrayList();
            for (zzg zzgVar : this.zzb.zzd()) {
                if (zzgVar.zzi()) {
                    arrayList.add(f0.c(c0Var, new zzj(this.zzd, zzgVar, this.zzc, this.zze, null)));
                }
            }
            i0[] i0VarArr = (i0[]) arrayList.toArray(new i0[0]);
            i0[] i0VarArr2 = (i0[]) Arrays.copyOf(i0VarArr, i0VarArr.length);
            this.zza = 1;
            obj = f0.d(i0VarArr2, this);
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
