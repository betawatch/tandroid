package com.google.android.recaptcha.internal;

import g7.y5;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzan extends i implements p {
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

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        zzan zzanVar = new zzan(this.zzb, this.zzc, cVar);
        zzanVar.zzd = obj;
        return zzanVar;
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzan) create((zzgr) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r5 != r0) goto L10;
     */
    @Override // sc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        a aVar = a.a;
        int i9 = this.zza;
        if (i9 == 0) {
            y5.b(obj);
            zzgrVar = (zzgr) this.zzd;
            zzar zzarVar = this.zzb;
            String str = this.zzc;
            this.zzd = zzgrVar;
            this.zza = 1;
            obj = zzarVar.zze(str, this);
        } else {
            if (i9 != 1) {
                y5.b(obj);
                return obj;
            }
            zzgrVar = (zzgr) this.zzd;
            y5.b(obj);
        }
        this.zzd = null;
        this.zza = 2;
        Object zza = ((zzhg) obj).zza(zzgrVar.zza(), this);
        return zza == aVar ? aVar : zza;
    }
}
