package com.google.android.recaptcha.internal;

import dd.p;
import k7.p7;
import ld.e0;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
final class zzlx extends i implements p {
    int zza;
    final /* synthetic */ zzly zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlx(zzly zzlyVar, c cVar) {
        super(2, cVar);
        this.zzb = zzlyVar;
    }

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        zzlx zzlxVar = new zzlx(this.zzb, cVar);
        zzlxVar.zzc = obj;
        return zzlxVar;
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlx) create((zzgr) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        p7.b(obj);
        if (i10 == 0) {
            zzlw zzlwVar = new zzlw(this.zzb, (zzgr) this.zzc, null);
            this.zza = 1;
            if (e0.f(zzlwVar, this) == aVar) {
                return aVar;
            }
        }
        return sc.i.a;
    }
}
