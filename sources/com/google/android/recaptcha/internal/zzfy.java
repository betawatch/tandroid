package com.google.android.recaptcha.internal;

import be.s;
import kd.c;
import ld.a;
import md.i;
import td.l;
import v7.i8;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
final class zzfy extends i implements l {
    int zza;
    final /* synthetic */ zzhk zzb;
    final /* synthetic */ zzgb zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ s zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfy(zzhk zzhkVar, zzgb zzgbVar, long j10, s sVar, c cVar) {
        super(1, cVar);
        this.zzb = zzhkVar;
        this.zzc = zzgbVar;
        this.zzd = j10;
        this.zze = sVar;
    }

    @Override // md.a
    public final c create(c cVar) {
        return new zzfy(this.zzb, this.zzc, this.zzd, this.zze, cVar);
    }

    @Override // td.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzfy) create((c) obj)).invokeSuspend(id.i.a);
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        i8.b(obj);
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
