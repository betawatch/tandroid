package com.google.android.recaptcha.internal;

import dd.p;
import java.util.LinkedHashMap;
import java.util.List;
import k7.p7;
import tc.r;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        p7.b(obj);
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
        } catch (zzcg e) {
            throw e;
        } catch (Exception e6) {
            throw new zzcg(zzce.zzb, zzcd.zzav, e6.getMessage(), null, 8, null);
        }
    }
}
