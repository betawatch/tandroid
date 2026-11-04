package com.google.android.recaptcha.internal;

import b8.ib;
import dd.k;
import fd.c;
import hd.j;
import od.p;
import wd.z;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
final class zzfn extends j implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ zzfp zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfn(zzgr zzgrVar, zzfp zzfpVar, c cVar) {
        super(2, cVar);
        this.zzc = zzgrVar;
        this.zzd = zzfpVar;
    }

    @Override // hd.a
    public final c create(Object obj, c cVar) {
        return new zzfn(this.zzc, this.zzd, cVar);
    }

    @Override // od.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfn) create((z) obj, (c) obj2)).invokeSuspend(k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (r5 == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r5 != r0) goto L9;
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
            zzfp zzfpVar = this.zzd;
            this.zza = zzgrVar;
            this.zzb = 1;
            obj = new zzhg(new zzez(zzfpVar, null));
        } else {
            if (i3 != 1) {
                ib.b(obj);
                return (zzxn) obj;
            }
            zzgrVar = (zzgr) this.zza;
            ib.b(obj);
        }
        this.zza = null;
        this.zzb = 2;
        obj = ((zzhg) obj).zza(zzgrVar.zza(), this);
    }
}
