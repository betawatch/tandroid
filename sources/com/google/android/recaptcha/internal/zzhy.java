package com.google.android.recaptcha.internal;

import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.u7;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
final class zzhy extends j implements p {
    final /* synthetic */ zzib zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhy(zzib zzibVar, String str, String str2, c cVar) {
        super(2, cVar);
        this.zza = zzibVar;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzhy(this.zza, this.zzb, this.zzc, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhy) create((zzgr) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        u7.b(obj);
        try {
            zzib.zza(this.zza).zzc(this.zzb, this.zzc);
            return i.a;
        } catch (Exception e) {
            throw new zzcg(zzce.zzk, zzcd.zzT, e.getMessage(), null, 8, null);
        }
    }
}
