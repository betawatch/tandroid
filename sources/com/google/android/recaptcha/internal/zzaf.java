package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class zzaf extends yfb implements is4 {
    int zza;
    final /* synthetic */ zzaj zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzhk zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaf(zzaj zzajVar, String str, zzhk zzhkVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = zzajVar;
        this.zzc = str;
        this.zzd = zzhkVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        zzaf zzafVar = new zzaf(this.zzb, this.zzc, this.zzd, zw2Var);
        zzafVar.zze = obj;
        return zzafVar;
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaf) create((ux2) obj, (zw2) obj2)).invokeSuspend(g9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        zzxx zzp;
        List list;
        int i = this.zza;
        ixe.b(obj);
        if (i == 0) {
            ux2 ux2Var = (ux2) this.zze;
            ArrayList arrayList = new ArrayList();
            zzaj zzajVar = this.zzb;
            String str = this.zzc;
            zzajVar.zzn().put(str, arrayList);
            ArrayList arrayList2 = new ArrayList();
            list = zzajVar.zza;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (((zzar) obj2).zzi()) {
                    arrayList3.add(obj2);
                }
            }
            int size = arrayList3.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(fud.b(ux2Var, new zzae(this.zzd, (zzar) arrayList3.get(i2), str, arrayList, null)));
            }
            ev5[] ev5VarArr = (ev5[]) arrayList2.toArray(new ev5[0]);
            ev5[] ev5VarArr2 = (ev5[]) Arrays.copyOf(ev5VarArr, ev5VarArr.length);
            this.zza = 1;
            Object c = ord.c(ev5VarArr2, this);
            vx2 vx2Var = vx2.a;
            if (c == vx2Var) {
                return vx2Var;
            }
        }
        zzp = this.zzb.zzp(this.zzc);
        return new he9(zzp);
    }
}
