package com.google.android.recaptcha.internal;

import g7.y5;
import hd.c0;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzhq extends i implements p {
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

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        return new zzhq(this.zza, this.zzb, this.zzc, cVar);
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhq) create((c0) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        y5.b(obj);
        try {
            zzht zzhtVar = this.zza;
            zzig zzb = zzht.zzb(zzhtVar);
            String str = this.zzb;
            if (zzb.zzb(str)) {
                return zzht.zza(zzhtVar).zza(str, this.zzc);
            }
            throw new zzcg(zzce.zzc, zzcd.zzQ, null, null, 12, null);
        } catch (zzcg e10) {
            throw e10;
        } catch (Exception e11) {
            throw new zzcg(zzce.zzb, zzcd.zzaz, e11.getMessage(), null, 8, null);
        }
    }
}
