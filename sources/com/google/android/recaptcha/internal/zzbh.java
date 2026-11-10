package com.google.android.recaptcha.internal;

import af.b;
import gd.k;
import id.c;
import kd.j;
import rd.p;
import zd.z;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
final class zzbh extends j implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzbo zzc;
    final /* synthetic */ zzhk zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbh(zzbo zzboVar, zzhk zzhkVar, c cVar) {
        super(2, cVar);
        this.zzc = zzboVar;
        this.zzd = zzhkVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzbh(this.zzc, this.zzd, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbh) create((z) obj, (c) obj2)).invokeSuspend(k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r4).zza(r1, r3) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r4 != r0) goto L9;
     */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        jd.a aVar = jd.a.a;
        int i7 = this.zzb;
        if (i7 == 0) {
            b.c(obj);
            zzbo zzboVar = this.zzc;
            zzboVar.zzc = zzbp.zza;
            zzhkVar = this.zzd;
            this.zza = zzhkVar;
            this.zzb = 1;
            obj = zzboVar.zze(this);
        } else {
            if (i7 != 1) {
                b.c(obj);
                return k.a;
            }
            zzhkVar = (zzhk) this.zza;
            b.c(obj);
        }
        this.zza = null;
        this.zzb = 2;
    }
}
