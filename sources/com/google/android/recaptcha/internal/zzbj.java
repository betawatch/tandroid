package com.google.android.recaptcha.internal;

import g7.y5;
import java.util.Timer;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzbj extends i implements p {
    final /* synthetic */ zzbo zza;
    private /* synthetic */ Object zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbj(zzbo zzboVar, c cVar) {
        super(2, cVar);
        this.zza = zzboVar;
    }

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        zzbj zzbjVar = new zzbj(this.zza, cVar);
        zzbjVar.zzb = obj;
        return zzbjVar;
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbj) create((zzhk) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        a aVar = a.a;
        y5.b(obj);
        zzhk zzhkVar = (zzhk) this.zzb;
        zzbo zzboVar = this.zza;
        z10 = zzboVar.zzg;
        if (!z10) {
            new Timer().schedule(new zzbi(zzboVar, zzhkVar), 28800000L, 28800000L);
            zzboVar.zzg = true;
        }
        return oc.i.a;
    }
}
