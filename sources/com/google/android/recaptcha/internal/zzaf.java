package com.google.android.recaptcha.internal;

import a8.jd;
import ce.c0;
import ce.f0;
import ce.g1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jd.f;
import ld.c;
import md.a;
import nd.i;
import ud.p;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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

    @Override // nd.a
    public final c create(Object obj, c cVar) {
        zzaf zzafVar = new zzaf(this.zzb, this.zzc, this.zzd, cVar);
        zzafVar.zze = obj;
        return zzafVar;
    }

    @Override // ud.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaf) create((c0) obj, (c) obj2)).invokeSuspend(jd.i.a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        zzxx zzp;
        List list;
        a aVar = a.a;
        int i10 = this.zza;
        jd.b(obj);
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
                arrayList2.add(f0.q(c0Var, new zzae(this.zzd, (zzar) arrayList3.get(i11), str, arrayList, null)));
            }
            g1[] g1VarArr = (g1[]) arrayList2.toArray(new g1[0]);
            g1[] g1VarArr2 = (g1[]) Arrays.copyOf(g1VarArr, g1VarArr.length);
            this.zza = 1;
            if (f0.p(g1VarArr2, this) == aVar) {
                return aVar;
            }
        }
        zzp = this.zzb.zzp(this.zzc);
        return new f(zzp);
    }
}
