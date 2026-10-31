package com.google.android.recaptcha.internal;

import cd.c;
import dd.a;
import ed.j;
import l9.b;
import ld.p;
import td.c0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
final class zzhq extends j implements p {
    final /* synthetic */ zzht zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzzd zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhq(zzht zzhtVar, String str, zzzd zzzdVar, c cVar) {
        super(2, cVar);
        this.zza = zzhtVar;
        this.zzb = str;
        this.zzc = zzzdVar;
    }

    @Override // ed.a
    public final c create(Object obj, c cVar) {
        return new zzhq(this.zza, this.zzb, this.zzc, cVar);
    }

    @Override // ld.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhq) create((c0) obj, (c) obj2)).invokeSuspend(ad.j.a);
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        b.b(obj);
        try {
            zzht zzhtVar = this.zza;
            zzig zzb = zzht.zzb(zzhtVar);
            String str = this.zzb;
            if (zzb.zzb(str)) {
                return zzht.zza(zzhtVar).zza(str, this.zzc);
            }
            throw new zzcg(zzce.zzc, zzcd.zzQ, null, null, 12, null);
        } catch (zzcg e) {
            throw e;
        } catch (Exception e7) {
            throw new zzcg(zzce.zzb, zzcd.zzaz, e7.getMessage(), null, 8, null);
        }
    }
}
