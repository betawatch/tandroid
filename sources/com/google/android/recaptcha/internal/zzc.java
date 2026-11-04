package com.google.android.recaptcha.internal;

import b8.ib;
import dd.k;
import fd.c;
import hd.j;
import od.p;
import wd.z;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
final class zzc extends j implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ zzg zzd;
    final /* synthetic */ zzxn zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(zzgr zzgrVar, zzg zzgVar, zzxn zzxnVar, c cVar) {
        super(2, cVar);
        this.zzc = zzgrVar;
        this.zzd = zzgVar;
        this.zze = zzxnVar;
    }

    @Override // hd.a
    public final c create(Object obj, c cVar) {
        return new zzc(this.zzc, this.zzd, this.zze, cVar);
    }

    @Override // od.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzc) create((z) obj, (c) obj2)).invokeSuspend(k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r5 != r0) goto L10;
     */
    @Override // hd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        gd.a aVar = gd.a.a;
        int i3 = this.zzb;
        if (i3 == 0) {
            ib.b(obj);
            zzgrVar = this.zzc;
            zzg zzgVar = this.zzd;
            zzxn zzxnVar = this.zze;
            this.zza = zzgrVar;
            this.zzb = 1;
            obj = zzgVar.zzd(zzxnVar, this);
        } else {
            if (i3 != 1) {
                ib.b(obj);
                return obj;
            }
            zzgrVar = (zzgr) this.zza;
            ib.b(obj);
        }
        this.zza = null;
        this.zzb = 2;
        Object zza = ((zzhg) obj).zza(zzgrVar.zza(), this);
        return zza == aVar ? aVar : zza;
    }
}
