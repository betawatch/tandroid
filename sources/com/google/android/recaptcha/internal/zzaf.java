package com.google.android.recaptcha.internal;

import dd.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k7.p7;
import ld.c0;
import ld.e0;
import ld.f1;
import sc.f;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
final class zzaf extends i implements p {
    int zza;
    final /* synthetic */ zzaj zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzhk zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaf(zzaj zzajVar, String str, zzhk zzhkVar, c cVar) {
        super(2, cVar);
        this.zzb = zzajVar;
        this.zzc = str;
        this.zzd = zzhkVar;
    }

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        zzaf zzafVar = new zzaf(this.zzb, this.zzc, this.zzd, cVar);
        zzafVar.zze = obj;
        return zzafVar;
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaf) create((c0) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        zzxx zzp;
        List list;
        a aVar = a.a;
        int i10 = this.zza;
        p7.b(obj);
        if (i10 == 0) {
            c0 c0Var = (c0) this.zze;
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
            for (int i11 = 0; i11 < size; i11++) {
                arrayList2.add(e0.q(c0Var, new zzae(this.zzd, (zzar) arrayList3.get(i11), str, arrayList, null)));
            }
            f1[] f1VarArr = (f1[]) arrayList2.toArray(new f1[0]);
            f1[] f1VarArr2 = (f1[]) Arrays.copyOf(f1VarArr, f1VarArr.length);
            this.zza = 1;
            if (e0.p(f1VarArr2, this) == aVar) {
                return aVar;
            }
        }
        zzp = this.zzb.zzp(this.zzc);
        return new f(zzp);
    }
}
