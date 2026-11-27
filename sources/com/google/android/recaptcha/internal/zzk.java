package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzk extends yfb implements is4 {
    int zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzgr zzd;
    final /* synthetic */ long zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(zzq zzqVar, String str, zzgr zzgrVar, long j, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = zzqVar;
        this.zzc = str;
        this.zzd = zzgrVar;
        this.zze = j;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, this.zze, zw2Var);
        zzkVar.zzf = obj;
        return zzkVar;
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((ux2) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        ixe.b(obj);
        if (i == 0) {
            ux2 ux2Var = (ux2) this.zzf;
            ArrayList arrayList = new ArrayList();
            for (zzg zzgVar : this.zzb.zzd()) {
                if (zzgVar.zzi()) {
                    arrayList.add(fud.a(ux2Var, new zzj(this.zzd, zzgVar, this.zzc, this.zze, null)));
                }
            }
            rd3[] rd3VarArr = (rd3[]) arrayList.toArray(new rd3[0]);
            rd3[] rd3VarArr2 = (rd3[]) Arrays.copyOf(rd3VarArr, rd3VarArr.length);
            this.zza = 1;
            obj = ord.a(rd3VarArr2, this);
            vx2 vx2Var = vx2.a;
            if (obj == vx2Var) {
                return vx2Var;
            }
        }
        String str = this.zzc;
        zzxw zzf = zzxx.zzf();
        zzf.zze(str);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            Object obj2 = ((he9) it.next()).a;
            if (!(obj2 instanceof ge9)) {
                zzf.zzh((zzxx) obj2);
            }
        }
        return (zzxx) zzf.zzk();
    }
}
