package com.google.android.recaptcha.internal;

import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.t7;
import zd.c0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
final class zze extends j implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ zzg zzd;
    final /* synthetic */ String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zze(zzgr zzgrVar, zzg zzgVar, String str, c cVar) {
        super(2, cVar);
        this.zzc = zzgrVar;
        this.zzd = zzgVar;
        this.zze = str;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zze(this.zzc, this.zzd, this.zze, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zze) create((c0) obj, (c) obj2)).invokeSuspend(i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r5 != r0) goto L10;
     */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        a aVar = a.a;
        int i10 = this.zzb;
        if (i10 == 0) {
            t7.b(obj);
            zzgrVar = this.zzc;
            zzg zzgVar = this.zzd;
            String str = this.zze;
            this.zza = zzgrVar;
            this.zzb = 1;
            obj = zzgVar.zzb(str, this);
        } else {
            if (i10 != 1) {
                t7.b(obj);
                return obj;
            }
            zzgrVar = (zzgr) this.zza;
            t7.b(obj);
        }
        this.zza = null;
        this.zzb = 2;
        Object zza = ((zzhg) obj).zza(zzgrVar.zza(), this);
        return zza == aVar ? aVar : zza;
    }
}
