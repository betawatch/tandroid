package com.google.android.recaptcha.internal;

import gd.i;
import id.c;
import java.util.Collections;
import java.util.Map;
import jd.a;
import kd.j;
import rd.p;
import v7.t7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
final class zzab extends j implements p {
    final /* synthetic */ zzxp zza;
    final /* synthetic */ zzad zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzab(zzxp zzxpVar, zzad zzadVar, c cVar) {
        super(2, cVar);
        this.zza = zzxpVar;
        this.zzb = zzadVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzab(this.zza, this.zzb, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzab) create((zzhk) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        t7.b(obj);
        zzxp zzxpVar = this.zza;
        if (zzxpVar.zzl().length() == 0) {
            this.zzb.zzj(false);
            throw new zzcg(zzce.zzb, zzcd.zzab, null, null, 12, null);
        }
        zzci zzb = zzad.zzb(this.zzb);
        Map singletonMap = Collections.singletonMap("_GRECAPTCHA_KC", zzxpVar.zzl());
        kotlin.jvm.internal.i.d(singletonMap, "singletonMap(...)");
        zzb.zzb(singletonMap);
        return i.a;
    }
}
