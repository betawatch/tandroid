package com.google.android.recaptcha.internal;

import af.b;
import gd.k;
import id.c;
import kd.j;
import rd.p;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
final class zzao extends j implements p {
    int zza;
    final /* synthetic */ zzar zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzao(zzar zzarVar, String str, c cVar) {
        super(2, cVar);
        this.zzb = zzarVar;
        this.zzc = str;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzao zzaoVar = new zzao(this.zzb, this.zzc, cVar);
        zzaoVar.zzd = obj;
        return zzaoVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzao) create((zzhk) obj, (c) obj2)).invokeSuspend(k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r8 != r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r8 != r0) goto L18;
     */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.a;
        int i7 = this.zza;
        try {
        } catch (Exception e10) {
            zzar zzarVar = this.zzb;
            this.zza = 2;
            obj = zzarVar.zzg(e10, this);
        }
        if (i7 == 0) {
            b.c(obj);
            zzhk zzhkVar = (zzhk) this.zzd;
            zzar zzarVar2 = this.zzb;
            int zza = zzarVar2.zza();
            zzan zzanVar = new zzan(zzarVar2, this.zzc, null);
            this.zza = 1;
            obj = new zzhf(37, zzanVar, new Integer(zza)).zza(zzhkVar, this);
        } else {
            if (i7 != 1) {
                b.c(obj);
                return (zzat) obj;
            }
            b.c(obj);
        }
        return (zzat) obj;
    }
}
