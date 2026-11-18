package com.google.android.recaptcha.internal;

import android.app.Application;
import b7.h;
import gd.k;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import zd.z;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
final class zzdx extends j implements p {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdx(Application application, String str, long j3, c cVar) {
        super(2, cVar);
        this.zzb = application;
        this.zzc = str;
        this.zzd = j3;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzdx(this.zzb, this.zzc, this.zzd, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdx) create((z) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i7 = this.zza;
        h.b(obj);
        if (i7 != 0) {
            return obj;
        }
        Application application = this.zzb;
        String str = this.zzc;
        long j3 = this.zzd;
        this.zza = 1;
        Object zzb = zzdz.zzb(application, str, j3, this);
        return zzb == aVar ? aVar : zzb;
    }
}
