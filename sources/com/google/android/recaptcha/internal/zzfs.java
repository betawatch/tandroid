package com.google.android.recaptcha.internal;

import af.b;
import gd.k;
import id.c;
import kd.j;
import rd.p;
import zd.s;
import zd.t;
import zd.z;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
final class zzfs extends j implements p {
    int zza;
    final /* synthetic */ zzgb zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfs(zzgb zzgbVar, c cVar) {
        super(2, cVar);
        this.zzb = zzgbVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzfs(this.zzb, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfs) create((z) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        s sVar;
        jd.a aVar = jd.a.a;
        int i7 = this.zza;
        b.c(obj);
        if (i7 == 0) {
            sVar = this.zzb.zzb;
            this.zza = 1;
            if (((t) sVar).i(this) == aVar) {
                return aVar;
            }
        }
        return k.a;
    }
}
