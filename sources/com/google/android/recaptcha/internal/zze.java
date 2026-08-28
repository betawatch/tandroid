package com.google.android.recaptcha.internal;

import g7.y5;
import hd.c0;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zze extends i implements p {
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

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        return new zze(this.zzc, this.zzd, this.zze, cVar);
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zze) create((c0) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r5 != r0) goto L10;
     */
    @Override // sc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        a aVar = a.a;
        int i9 = this.zzb;
        if (i9 == 0) {
            y5.b(obj);
            zzgrVar = this.zzc;
            zzg zzgVar = this.zzd;
            String str = this.zze;
            this.zza = zzgrVar;
            this.zzb = 1;
            obj = zzgVar.zzb(str, this);
        } else {
            if (i9 != 1) {
                y5.b(obj);
                return obj;
            }
            zzgrVar = (zzgr) this.zza;
            y5.b(obj);
        }
        this.zza = null;
        this.zzb = 2;
        Object zza = ((zzhg) obj).zza(zzgrVar.zza(), this);
        return zza == aVar ? aVar : zza;
    }
}
