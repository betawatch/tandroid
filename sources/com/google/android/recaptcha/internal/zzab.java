package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.Map;
import kd.c;
import ld.a;
import md.i;
import td.p;
import v7.i8;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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

    @Override // md.a
    public final c create(Object obj, c cVar) {
        return new zzab(this.zza, this.zzb, cVar);
    }

    @Override // td.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzab) create((zzhk) obj, (c) obj2)).invokeSuspend(id.i.a);
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        i8.b(obj);
        zzxp zzxpVar = this.zza;
        if (zzxpVar.zzl().length() == 0) {
            this.zzb.zzj(false);
            throw new zzcg(zzce.zzb, zzcd.zzab, null, null, 12, null);
        }
        zzci zzb = zzad.zzb(this.zzb);
        Map singletonMap = Collections.singletonMap("_GRECAPTCHA_KC", zzxpVar.zzl());
        kotlin.jvm.internal.i.d(singletonMap, "singletonMap(...)");
        zzb.zzb(singletonMap);
        return id.i.a;
    }
}
