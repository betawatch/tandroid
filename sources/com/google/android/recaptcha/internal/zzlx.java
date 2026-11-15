package com.google.android.recaptcha.internal;

import af.b;
import gd.k;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import zd.b0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
final class zzlx extends j implements p {
    int zza;
    final /* synthetic */ zzly zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlx(zzly zzlyVar, c cVar) {
        super(2, cVar);
        this.zzb = zzlyVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzlx zzlxVar = new zzlx(this.zzb, cVar);
        zzlxVar.zzc = obj;
        return zzlxVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlx) create((zzgr) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i7 = this.zza;
        b.c(obj);
        if (i7 == 0) {
            zzlw zzlwVar = new zzlw(this.zzb, (zzgr) this.zzc, null);
            this.zza = 1;
            if (b0.e(zzlwVar, this) == aVar) {
                return aVar;
            }
        }
        return k.a;
    }
}
