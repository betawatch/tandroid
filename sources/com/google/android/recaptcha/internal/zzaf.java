package com.google.android.recaptcha.internal;

import af.b;
import gd.g;
import gd.k;
import id.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kd.j;
import rd.p;
import zd.a1;
import zd.b0;
import zd.z;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
final class zzaf extends j implements p {
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

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzaf zzafVar = new zzaf(this.zzb, this.zzc, this.zzd, cVar);
        zzafVar.zze = obj;
        return zzafVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaf) create((z) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        zzxx zzp;
        List list;
        jd.a aVar = jd.a.a;
        int i7 = this.zza;
        b.c(obj);
        if (i7 == 0) {
            z zVar = (z) this.zze;
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
            for (int i10 = 0; i10 < size; i10++) {
                arrayList2.add(b0.q(zVar, new zzae(this.zzd, (zzar) arrayList3.get(i10), str, arrayList, null)));
            }
            a1[] a1VarArr = (a1[]) arrayList2.toArray(new a1[0]);
            a1[] a1VarArr2 = (a1[]) Arrays.copyOf(a1VarArr, a1VarArr.length);
            this.zza = 1;
            if (b0.p(a1VarArr2, this) == aVar) {
                return aVar;
            }
        }
        zzp = this.zzb.zzp(this.zzc);
        return new g(zzp);
    }
}
