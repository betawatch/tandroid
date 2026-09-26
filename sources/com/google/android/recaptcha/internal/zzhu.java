package com.google.android.recaptcha.internal;

import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.u7;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
final class zzhu extends j implements p {
    final /* synthetic */ zzib zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhu(zzib zzibVar, String str, c cVar) {
        super(2, cVar);
        this.zza = zzibVar;
        this.zzb = str;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzhu(this.zza, this.zzb, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhu) create((zzgr) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        u7.b(obj);
        return zzib.zzb(this.zza).zzb(this.zzb);
    }
}
