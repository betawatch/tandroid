package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzn extends ccb implements eq4 {
    int zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzxn zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzn(zzq zzqVar, zzgr zzgrVar, long j, zzxn zzxnVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzqVar;
        this.zzc = zzgrVar;
        this.zzd = j;
        this.zze = zzxnVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzn zznVar = new zzn(this.zzb, this.zzc, this.zzd, this.zze, fw2Var);
        zznVar.zzf = obj;
        return zznVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzn) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        qse.b(obj);
        if (i == 0) {
            ax2 ax2Var = (ax2) this.zzf;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                arrayList.add(ppd.a(ax2Var, new zzm(this.zzc, (zzg) it.next(), this.zzd, this.zze, null)));
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
        List list = (List) obj;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!(((ta9) it2.next()).a instanceof sa9)) {
                    return g5c.a;
                }
            }
        }
        throw new zzcg(zzce.zzb, zzcd.zzY, null, null, 12, null);
    }
}
