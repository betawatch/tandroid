package com.google.android.recaptcha.internal;

import b7.h;
import gd.k;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import zd.b0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
final class zzbf extends j implements p {
    int zza;
    final /* synthetic */ zzbo zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbf(zzbo zzboVar, c cVar) {
        super(2, cVar);
        this.zzb = zzboVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzbf(this.zzb, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbf) create((zzgr) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i7 = this.zza;
        h.b(obj);
        if (i7 == 0) {
            zzbe zzbeVar = new zzbe(this.zzb, null);
            this.zza = 1;
            if (b0.e(zzbeVar, this) == aVar) {
                return aVar;
            }
        }
        return k.a;
    }
}
