package com.google.android.recaptcha.internal;

import b8.ib;
import dd.k;
import fd.c;
import hd.j;
import od.p;
import wd.z;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    @Override // hd.a
    public final c create(Object obj, c cVar) {
        return new zzhq(this.zza, this.zzb, this.zzc, cVar);
    }

    @Override // od.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhq) create((z) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        gd.a aVar = gd.a.a;
        ib.b(obj);
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
