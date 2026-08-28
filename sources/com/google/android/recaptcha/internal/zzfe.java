package com.google.android.recaptcha.internal;

import g7.y5;
import java.util.LinkedHashMap;
import java.util.List;
import pc.r;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        return new zzfe(this.zza, this.zzb, cVar);
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfe) create((zzgr) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        y5.b(obj);
        try {
            zzyg zzygVar = this.zza;
            List<zzyi> zzk = zzygVar.zzk();
            int a2 = r.a(pc.i.d(zzk));
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
            return oc.i.a;
        } catch (zzcg e10) {
            throw e10;
        } catch (Exception e11) {
            throw new zzcg(zzce.zzb, zzcd.zzav, e11.getMessage(), null, 8, null);
        }
    }
}
