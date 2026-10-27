package com.google.android.recaptcha.internal;

import a8.jd;
import ld.c;
import md.a;
import nd.i;
import ud.p;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
final class zzao extends i implements p {
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

    @Override // nd.a
    public final c create(Object obj, c cVar) {
        zzao zzaoVar = new zzao(this.zzb, this.zzc, cVar);
        zzaoVar.zzd = obj;
        return zzaoVar;
    }

    @Override // ud.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzao) create((zzhk) obj, (c) obj2)).invokeSuspend(jd.i.a);
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
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        try {
        } catch (Exception e) {
            zzar zzarVar = this.zzb;
            this.zza = 2;
            obj = zzarVar.zzg(e, this);
        }
        if (i10 == 0) {
            jd.b(obj);
            zzhk zzhkVar = (zzhk) this.zzd;
            zzar zzarVar2 = this.zzb;
            int zza = zzarVar2.zza();
            zzan zzanVar = new zzan(zzarVar2, this.zzc, null);
            this.zza = 1;
            obj = new zzhf(37, zzanVar, new Integer(zza)).zza(zzhkVar, this);
        } else {
            if (i10 != 1) {
                jd.b(obj);
                return (zzat) obj;
            }
            jd.b(obj);
        }
        return (zzat) obj;
    }
}
