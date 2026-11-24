package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzaf extends eeb implements fs4 {
    int zza;
    final /* synthetic */ zzaj zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzhk zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaf(zzaj zzajVar, String str, zzhk zzhkVar, px2 px2Var) {
        super(2, px2Var);
        this.zzb = zzajVar;
        this.zzc = str;
        this.zzd = zzhkVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzaf zzafVar = new zzaf(this.zzb, this.zzc, this.zzd, px2Var);
        zzafVar.zze = obj;
        return zzafVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaf) create((ky2) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        zzxx zzp;
        List list;
        int i = this.zza;
        tue.b(obj);
        if (i == 0) {
            ky2 ky2Var = (ky2) this.zze;
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
                arrayList2.add(srd.b(ky2Var, new zzae(this.zzd, (zzar) arrayList3.get(i2), str, arrayList, null)));
            }
            av5[] av5VarArr = (av5[]) arrayList2.toArray(new av5[0]);
            av5[] av5VarArr2 = (av5[]) Arrays.copyOf(av5VarArr, av5VarArr.length);
            this.zza = 1;
            Object c = apd.c(av5VarArr2, this);
            ly2 ly2Var = ly2.a;
            if (c == ly2Var) {
                return ly2Var;
            }
        }
        zzp = this.zzb.zzp(this.zzc);
        return new tc9(zzp);
    }
}
