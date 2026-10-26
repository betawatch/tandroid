package com.google.android.recaptcha.internal;

import a8.jd;
import ce.s;
import ld.c;
import md.a;
import nd.i;
import ud.l;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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

    @Override // nd.a
    public final c create(c cVar) {
        return new zzfy(this.zzb, this.zzc, this.zzd, this.zze, cVar);
    }

    @Override // ud.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzfy) create((c) obj)).invokeSuspend(jd.i.a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        jd.b(obj);
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
