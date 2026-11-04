package com.google.android.recaptcha.internal;

import b8.ib;
import dd.f;
import dd.g;
import dd.k;
import fd.c;
import hd.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import od.p;
import wd.b0;
import wd.e0;
import wd.z;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
final class zzk extends j implements p {
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

    @Override // hd.a
    public final c create(Object obj, c cVar) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, this.zze, cVar);
        zzkVar.zzf = obj;
        return zzkVar;
    }

    @Override // od.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((z) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        gd.a aVar = gd.a.a;
        int i3 = this.zza;
        ib.b(obj);
        if (i3 == 0) {
            z zVar = (z) this.zzf;
            ArrayList arrayList = new ArrayList();
            for (zzg zzgVar : this.zzb.zzd()) {
                if (zzgVar.zzi()) {
                    arrayList.add(b0.c(zVar, new zzj(this.zzd, zzgVar, this.zzc, this.zze, null)));
                }
            }
            e0[] e0VarArr = (e0[]) arrayList.toArray(new e0[0]);
            e0[] e0VarArr2 = (e0[]) Arrays.copyOf(e0VarArr, e0VarArr.length);
            this.zza = 1;
            obj = b0.d(e0VarArr2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        String str = this.zzc;
        zzxw zzf = zzxx.zzf();
        zzf.zze(str);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            Object obj2 = ((g) it.next()).a;
            if (!(obj2 instanceof f)) {
                zzf.zzh((zzxx) obj2);
            }
        }
        return (zzxx) zzf.zzk();
    }
}
