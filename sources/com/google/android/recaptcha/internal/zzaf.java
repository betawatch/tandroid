package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzaf extends ccb implements eq4 {
    int zza;
    final /* synthetic */ zzaj zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzhk zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaf(zzaj zzajVar, String str, zzhk zzhkVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzajVar;
        this.zzc = str;
        this.zzd = zzhkVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzaf zzafVar = new zzaf(this.zzb, this.zzc, this.zzd, fw2Var);
        zzafVar.zze = obj;
        return zzafVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaf) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        zzxx zzp;
        List list;
        int i = this.zza;
        qse.b(obj);
        if (i == 0) {
            ax2 ax2Var = (ax2) this.zze;
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
                arrayList2.add(ppd.b(ax2Var, new zzae(this.zzd, (zzar) arrayList3.get(i2), str, arrayList, null)));
            }
            bt5[] bt5VarArr = (bt5[]) arrayList2.toArray(new bt5[0]);
            bt5[] bt5VarArr2 = (bt5[]) Arrays.copyOf(bt5VarArr, bt5VarArr.length);
            this.zza = 1;
            Object c = xmd.c(bt5VarArr2, this);
            bx2 bx2Var = bx2.a;
            if (c == bx2Var) {
                return bx2Var;
            }
        }
        zzp = this.zzb.zzp(this.zzc);
        return new ta9(zzp);
    }
}
