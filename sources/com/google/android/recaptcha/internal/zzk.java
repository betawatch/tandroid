package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
final class zzk extends ccb implements eq4 {
    int zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzgr zzd;
    final /* synthetic */ long zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(zzq zzqVar, String str, zzgr zzgrVar, long j, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzqVar;
        this.zzc = str;
        this.zzd = zzgrVar;
        this.zze = j;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, this.zze, fw2Var);
        zzkVar.zzf = obj;
        return zzkVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        qse.b(obj);
        if (i == 0) {
            ax2 ax2Var = (ax2) this.zzf;
            ArrayList arrayList = new ArrayList();
            for (zzg zzgVar : this.zzb.zzd()) {
                if (zzgVar.zzi()) {
                    arrayList.add(ppd.a(ax2Var, new zzj(this.zzd, zzgVar, this.zzc, this.zze, null)));
                }
            }
            zc3[] zc3VarArr = (zc3[]) arrayList.toArray(new zc3[0]);
            zc3[] zc3VarArr2 = (zc3[]) Arrays.copyOf(zc3VarArr, zc3VarArr.length);
            this.zza = 1;
            obj = xmd.a(zc3VarArr2, this);
            bx2 bx2Var = bx2.a;
            if (obj == bx2Var) {
                return bx2Var;
            }
        }
        String str = this.zzc;
        zzxw zzf = zzxx.zzf();
        zzf.zze(str);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            Object obj2 = ((ta9) it.next()).a;
            if (!(obj2 instanceof sa9)) {
                zzf.zzh((zzxx) obj2);
            }
        }
        return (zzxx) zzf.zzk();
    }
}
