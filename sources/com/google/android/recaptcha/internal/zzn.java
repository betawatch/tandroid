package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzn extends yfb implements is4 {
    int zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzxn zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzn(zzq zzqVar, zzgr zzgrVar, long j, zzxn zzxnVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = zzqVar;
        this.zzc = zzgrVar;
        this.zzd = j;
        this.zze = zzxnVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        zzn zznVar = new zzn(this.zzb, this.zzc, this.zzd, this.zze, zw2Var);
        zznVar.zzf = obj;
        return zznVar;
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzn) create((ux2) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        ixe.b(obj);
        if (i == 0) {
            ux2 ux2Var = (ux2) this.zzf;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                arrayList.add(fud.a(ux2Var, new zzm(this.zzc, (zzg) it.next(), this.zzd, this.zze, null)));
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
        List list = (List) obj;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!(((he9) it2.next()).a instanceof ge9)) {
                    return f9c.a;
                }
            }
        }
        throw new zzcg(zzce.zzb, zzcd.zzY, null, null, 12, null);
    }
}
