package com.google.android.recaptcha.internal;

import ad.p;
import h7.k6;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.j;
import rc.c;
import tc.i;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
final class zzab extends i implements p {
    final /* synthetic */ zzxp zza;
    final /* synthetic */ zzad zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzab(zzxp zzxpVar, zzad zzadVar, c cVar) {
        super(2, cVar);
        this.zza = zzxpVar;
        this.zzb = zzadVar;
    }

    @Override // tc.a
    public final c create(Object obj, c cVar) {
        return new zzab(this.zza, this.zzb, cVar);
    }

    @Override // ad.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzab) create((zzhk) obj, (c) obj2)).invokeSuspend(pc.i.a);
    }

    @Override // tc.a
    public final Object invokeSuspend(Object obj) {
        sc.a aVar = sc.a.a;
        k6.b(obj);
        zzxp zzxpVar = this.zza;
        if (zzxpVar.zzl().length() == 0) {
            this.zzb.zzj(false);
            throw new zzcg(zzce.zzb, zzcd.zzab, null, null, 12, null);
        }
        zzci zzb = zzad.zzb(this.zzb);
        Map singletonMap = Collections.singletonMap("_GRECAPTCHA_KC", zzxpVar.zzl());
        j.d(singletonMap, "singletonMap(...)");
        zzb.zzb(singletonMap);
        return pc.i.a;
    }
}
