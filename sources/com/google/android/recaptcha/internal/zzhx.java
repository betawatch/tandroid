package com.google.android.recaptcha.internal;

import b7.h;
import gd.k;
import id.c;
import jd.a;
import kd.j;
import rd.p;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzhx(this.zza, this.zzb, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhx) create((zzgr) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        h.b(obj);
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
