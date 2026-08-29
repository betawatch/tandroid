package com.google.android.recaptcha.internal;

import bd.p;
import i7.c7;
import java.util.Timer;
import sc.c;
import uc.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
final class zzbj extends i implements p {
    final /* synthetic */ zzbo zza;
    private /* synthetic */ Object zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbj(zzbo zzboVar, c cVar) {
        super(2, cVar);
        this.zza = zzboVar;
    }

    @Override // uc.a
    public final c create(Object obj, c cVar) {
        zzbj zzbjVar = new zzbj(this.zza, cVar);
        zzbjVar.zzb = obj;
        return zzbjVar;
    }

    @Override // bd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbj) create((zzhk) obj, (c) obj2)).invokeSuspend(qc.i.a);
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        tc.a aVar = tc.a.a;
        c7.b(obj);
        zzhk zzhkVar = (zzhk) this.zzb;
        zzbo zzboVar = this.zza;
        z10 = zzboVar.zzg;
        if (!z10) {
            new Timer().schedule(new zzbi(zzboVar, zzhkVar), 28800000L, 28800000L);
            zzboVar.zzg = true;
        }
        return qc.i.a;
    }
}
