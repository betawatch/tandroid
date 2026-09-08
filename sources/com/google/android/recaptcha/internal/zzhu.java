package com.google.android.recaptcha.internal;

import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.t7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        t7.b(obj);
        return zzib.zzb(this.zza).zzb(this.zzb);
    }
}
