package com.google.android.recaptcha.internal;

import bd.p;
import i7.c7;
import jd.c0;
import jd.s;
import jd.t;
import sc.c;
import uc.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
final class zzfs extends i implements p {
    int zza;
    final /* synthetic */ zzgb zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfs(zzgb zzgbVar, c cVar) {
        super(2, cVar);
        this.zzb = zzgbVar;
    }

    @Override // uc.a
    public final c create(Object obj, c cVar) {
        return new zzfs(this.zzb, cVar);
    }

    @Override // bd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfs) create((c0) obj, (c) obj2)).invokeSuspend(qc.i.a);
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        s sVar;
        tc.a aVar = tc.a.a;
        int i10 = this.zza;
        c7.b(obj);
        if (i10 == 0) {
            sVar = this.zzb.zzb;
            this.zza = 1;
            if (((t) sVar).h(this) == aVar) {
                return aVar;
            }
        }
        return qc.i.a;
    }
}
