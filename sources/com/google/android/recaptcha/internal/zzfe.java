package com.google.android.recaptcha.internal;

import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzfe extends eeb implements fs4 {
    final /* synthetic */ zzyg zza;
    final /* synthetic */ zzfp zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfe(zzyg zzygVar, zzfp zzfpVar, px2 px2Var) {
        super(2, px2Var);
        this.zza = zzygVar;
        this.zzb = zzfpVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new zzfe(this.zza, this.zzb, px2Var);
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfe) create((zzgr) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        tue.b(obj);
        try {
            zzyg zzygVar = this.zza;
            List<zzyi> zzk = zzygVar.zzk();
            int b = sk6.b(mm2.c(zzk, 10));
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
            return g7c.a;
        } catch (zzcg e) {
            throw e;
        } catch (Exception e2) {
            throw new zzcg(zzce.zzb, zzcd.zzav, e2.getMessage(), null, 8, null);
        }
    }
}
