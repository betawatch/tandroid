package com.google.android.recaptcha.internal;

import b7.h;
import gd.k;
import id.c;
import jd.a;
import kd.j;
import rd.p;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
final class zzed extends j implements p {
    int zza;
    final /* synthetic */ zzeh zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzdw zzd;
    final /* synthetic */ zzdq zze;
    final /* synthetic */ long zzf;
    private /* synthetic */ Object zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzed(zzeh zzehVar, String str, zzdw zzdwVar, zzdq zzdqVar, long j3, c cVar) {
        super(2, cVar);
        this.zzb = zzehVar;
        this.zzc = str;
        this.zzd = zzdwVar;
        this.zze = zzdqVar;
        this.zzf = j3;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzed zzedVar = new zzed(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, cVar);
        zzedVar.zzg = obj;
        return zzedVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzed) create((zzhh) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i7 = this.zza;
        h.b(obj);
        if (i7 != 0) {
            return obj;
        }
        zzhh zzhhVar = (zzhh) this.zzg;
        zzec zzecVar = new zzec(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, zzhhVar, null);
        this.zza = 1;
        Object zza = zzhj.zza(zzhhVar, zzecVar, this);
        return zza == aVar ? aVar : zza;
    }
}
