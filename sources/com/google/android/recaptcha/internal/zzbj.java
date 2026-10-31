package com.google.android.recaptcha.internal;

import cd.c;
import dd.a;
import ed.j;
import java.util.Timer;
import l9.b;
import ld.p;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
final class zzbj extends j implements p {
    final /* synthetic */ zzbo zza;
    private /* synthetic */ Object zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbj(zzbo zzboVar, c cVar) {
        super(2, cVar);
        this.zza = zzboVar;
    }

    @Override // ed.a
    public final c create(Object obj, c cVar) {
        zzbj zzbjVar = new zzbj(this.zza, cVar);
        zzbjVar.zzb = obj;
        return zzbjVar;
    }

    @Override // ld.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbj) create((zzhk) obj, (c) obj2)).invokeSuspend(ad.j.a);
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        a aVar = a.a;
        b.b(obj);
        zzhk zzhkVar = (zzhk) this.zzb;
        zzbo zzboVar = this.zza;
        z10 = zzboVar.zzg;
        if (!z10) {
            new Timer().schedule(new zzbi(zzboVar, zzhkVar), 28800000L, 28800000L);
            zzboVar.zzg = true;
        }
        return ad.j.a;
    }
}
