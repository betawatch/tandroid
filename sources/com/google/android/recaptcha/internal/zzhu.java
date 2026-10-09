package com.google.android.recaptcha.internal;

import hd.i;
import jd.c;
import kd.a;
import ld.j;
import sd.p;
import v7.a8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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

    @Override // ld.a
    public final c create(Object obj, c cVar) {
        return new zzhu(this.zza, this.zzb, cVar);
    }

    @Override // sd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhu) create((zzgr) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // ld.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        a8.b(obj);
        return zzib.zzb(this.zza).zzb(this.zzb);
    }
}
