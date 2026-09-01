package com.google.android.recaptcha.internal;

import dd.p;
import java.util.LinkedHashMap;
import java.util.List;
import k7.q7;
import tc.r;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
final class zzfe extends i implements p {
    final /* synthetic */ zzyg zza;
    final /* synthetic */ zzfp zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfe(zzyg zzygVar, zzfp zzfpVar, c cVar) {
        super(2, cVar);
        this.zza = zzygVar;
        this.zzb = zzfpVar;
    }

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        return new zzfe(this.zza, this.zzb, cVar);
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfe) create((zzgr) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        q7.b(obj);
        try {
            zzyg zzygVar = this.zza;
            List<zzyi> zzk = zzygVar.zzk();
            int a2 = r.a(tc.i.d(zzk));
            if (a2 < 16) {
                a2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(a2);
            for (zzyi zzyiVar : zzk) {
                linkedHashMap.put(zzyiVar.zzg(), zzyiVar.zzi());
            }
            zzfp zzfpVar = this.zzb;
            zzfp.zze(zzfpVar).zzb(linkedHashMap);
            zzfp.zzb(zzfpVar).zze(zzygVar);
            return sc.i.a;
        } catch (zzcg e6) {
            throw e6;
        } catch (Exception e10) {
            throw new zzcg(zzce.zzb, zzcd.zzav, e10.getMessage(), null, 8, null);
        }
    }
}
