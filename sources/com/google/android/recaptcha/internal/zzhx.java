package com.google.android.recaptcha.internal;

import b8.ib;
import dd.k;
import fd.c;
import hd.j;
import od.p;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
final class zzhx extends j implements p {
    final /* synthetic */ zzib zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhx(zzib zzibVar, String str, c cVar) {
        super(2, cVar);
        this.zza = zzibVar;
        this.zzb = str;
    }

    @Override // hd.a
    public final c create(Object obj, c cVar) {
        return new zzhx(this.zza, this.zzb, cVar);
    }

    @Override // od.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhx) create((zzgr) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        gd.a aVar = gd.a.a;
        ib.b(obj);
        zzib zzibVar = this.zza;
        zzbt zza = zzib.zza(zzibVar);
        String str = this.zzb;
        if (!zza.zzd(str)) {
            throw new zzcg(zzce.zzk, zzcd.zzS, null, null, 12, null);
        }
        try {
            String zza2 = zzib.zza(zzibVar).zza(str);
            if (zza2 != null) {
                return zza2;
            }
            throw new zzcg(zzce.zzk, zzcd.zzS, null, null, 12, null);
        } catch (Exception e10) {
            throw new zzcg(zzce.zzk, zzcd.zzR, e10.getMessage(), null, 8, null);
        }
    }
}
