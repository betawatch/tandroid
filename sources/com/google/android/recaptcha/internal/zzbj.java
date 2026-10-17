package com.google.android.recaptcha.internal;

import java.util.Timer;
import kd.c;
import ld.a;
import md.i;
import td.p;
import v7.i8;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
final class zzbj extends i implements p {
    final /* synthetic */ zzbo zza;
    private /* synthetic */ Object zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbj(zzbo zzboVar, c cVar) {
        super(2, cVar);
        this.zza = zzboVar;
    }

    @Override // md.a
    public final c create(Object obj, c cVar) {
        zzbj zzbjVar = new zzbj(this.zza, cVar);
        zzbjVar.zzb = obj;
        return zzbjVar;
    }

    @Override // td.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbj) create((zzhk) obj, (c) obj2)).invokeSuspend(id.i.a);
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        a aVar = a.a;
        i8.b(obj);
        zzhk zzhkVar = (zzhk) this.zzb;
        zzbo zzboVar = this.zza;
        z10 = zzboVar.zzg;
        if (!z10) {
            new Timer().schedule(new zzbi(zzboVar, zzhkVar), 28800000L, 28800000L);
            zzboVar.zzg = true;
        }
        return id.i.a;
    }
}
