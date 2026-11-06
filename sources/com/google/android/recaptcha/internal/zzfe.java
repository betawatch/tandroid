package com.google.android.recaptcha.internal;

import af.b;
import gd.k;
import hd.h;
import hd.r;
import id.c;
import java.util.LinkedHashMap;
import java.util.List;
import kd.j;
import rd.p;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
final class zzfe extends j implements p {
    final /* synthetic */ zzyg zza;
    final /* synthetic */ zzfp zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfe(zzyg zzygVar, zzfp zzfpVar, c cVar) {
        super(2, cVar);
        this.zza = zzygVar;
        this.zzb = zzfpVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzfe(this.zza, this.zzb, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfe) create((zzgr) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.a;
        b.c(obj);
        try {
            zzyg zzygVar = this.zza;
            List<zzyi> zzk = zzygVar.zzk();
            int b10 = r.b(h.d(zzk, 10));
            if (b10 < 16) {
                b10 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(b10);
            for (zzyi zzyiVar : zzk) {
                linkedHashMap.put(zzyiVar.zzg(), zzyiVar.zzi());
            }
            zzfp zzfpVar = this.zzb;
            zzfp.zze(zzfpVar).zzb(linkedHashMap);
            zzfp.zzb(zzfpVar).zze(zzygVar);
            return k.a;
        } catch (zzcg e10) {
            throw e10;
        } catch (Exception e11) {
            throw new zzcg(zzce.zzb, zzcd.zzav, e11.getMessage(), null, 8, null);
        }
    }
}
