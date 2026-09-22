package com.google.android.recaptcha.internal;

import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.u7;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
final class zzan extends j implements p {
    int zza;
    final /* synthetic */ zzar zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzan(zzar zzarVar, String str, c cVar) {
        super(2, cVar);
        this.zzb = zzarVar;
        this.zzc = str;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzan zzanVar = new zzan(this.zzb, this.zzc, cVar);
        zzanVar.zzd = obj;
        return zzanVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzan) create((zzgr) obj, (c) obj2)).invokeSuspend(i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r5 != r0) goto L10;
     */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        a aVar = a.a;
        int i10 = this.zza;
        if (i10 == 0) {
            u7.b(obj);
            zzgrVar = (zzgr) this.zzd;
            zzar zzarVar = this.zzb;
            String str = this.zzc;
            this.zzd = zzgrVar;
            this.zza = 1;
            obj = zzarVar.zze(str, this);
        } else {
            if (i10 != 1) {
                u7.b(obj);
                return obj;
            }
            zzgrVar = (zzgr) this.zzd;
            u7.b(obj);
        }
        this.zzd = null;
        this.zza = 2;
        Object zza = ((zzhg) obj).zza(zzgrVar.zza(), this);
        return zza == aVar ? aVar : zza;
    }
}
