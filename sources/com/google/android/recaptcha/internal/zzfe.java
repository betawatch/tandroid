package com.google.android.recaptcha.internal;

import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzfe extends ccb implements eq4 {
    final /* synthetic */ zzyg zza;
    final /* synthetic */ zzfp zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfe(zzyg zzygVar, zzfp zzfpVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zza = zzygVar;
        this.zzb = zzfpVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzfe(this.zza, this.zzb, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfe) create((zzgr) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        qse.b(obj);
        try {
            zzyg zzygVar = this.zza;
            List<zzyi> zzk = zzygVar.zzk();
            int b = qi6.b(al2.c(zzk, 10));
            if (b < 16) {
                b = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(b);
            for (zzyi zzyiVar : zzk) {
                linkedHashMap.put(zzyiVar.zzg(), zzyiVar.zzi());
            }
            zzfp zzfpVar = this.zzb;
            zzfp.zze(zzfpVar).zzb(linkedHashMap);
            zzfp.zzb(zzfpVar).zze(zzygVar);
            return g5c.a;
        } catch (zzcg e) {
            throw e;
        } catch (Exception e2) {
            throw new zzcg(zzce.zzb, zzcd.zzav, e2.getMessage(), null, 8, null);
        }
    }
}
