package com.google.android.recaptcha.internal;

import a8.jd;
import ce.c0;
import ld.c;
import md.a;
import nd.i;
import ud.p;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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

    @Override // nd.a
    public final c create(Object obj, c cVar) {
        return new zze(this.zzc, this.zzd, this.zze, cVar);
    }

    @Override // ud.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zze) create((c0) obj, (c) obj2)).invokeSuspend(jd.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r5 != r0) goto L10;
     */
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        a aVar = a.a;
        int i10 = this.zzb;
        if (i10 == 0) {
            jd.b(obj);
            zzgrVar = this.zzc;
            zzg zzgVar = this.zzd;
            String str = this.zze;
            this.zza = zzgrVar;
            this.zzb = 1;
            obj = zzgVar.zzb(str, this);
        } else {
            if (i10 != 1) {
                jd.b(obj);
                return obj;
            }
            zzgrVar = (zzgr) this.zza;
            jd.b(obj);
        }
        this.zza = null;
        this.zzb = 2;
        Object zza = ((zzhg) obj).zza(zzgrVar.zza(), this);
        return zza == aVar ? aVar : zza;
    }
}
