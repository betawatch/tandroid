package com.google.android.recaptcha.internal;

import ae.s;
import hd.i;
import jd.c;
import kd.a;
import ld.j;
import sd.l;
import v7.a8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
final class zzfy extends j implements l {
    int zza;
    final /* synthetic */ zzhk zzb;
    final /* synthetic */ zzgb zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ s zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfy(zzhk zzhkVar, zzgb zzgbVar, long j3, s sVar, c cVar) {
        super(1, cVar);
        this.zzb = zzhkVar;
        this.zzc = zzgbVar;
        this.zzd = j3;
        this.zze = sVar;
    }

    @Override // ld.a
    public final c create(c cVar) {
        return new zzfy(this.zzb, this.zzc, this.zzd, this.zze, cVar);
    }

    @Override // sd.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzfy) create((c) obj)).invokeSuspend(i.a);
    }

    @Override // ld.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        a8.b(obj);
        if (i10 != 0) {
            return obj;
        }
        zzhk zzhkVar = this.zzb;
        zzfx zzfxVar = new zzfx(this.zzc, this.zzd, this.zze, null);
        this.zza = 1;
        Object zze = zzhj.zze(zzhkVar, 41, zzfxVar, this);
        return zze == aVar ? aVar : zze;
    }
}
