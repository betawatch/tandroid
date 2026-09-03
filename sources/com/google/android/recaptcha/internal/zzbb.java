package com.google.android.recaptcha.internal;

import dd.p;
import k7.q7;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
final class zzbb extends i implements p {
    int zza;
    final /* synthetic */ zzbo zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbb(zzbo zzboVar, String str, c cVar) {
        super(2, cVar);
        this.zzb = zzboVar;
        this.zzc = str;
    }

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        zzbb zzbbVar = new zzbb(this.zzb, this.zzc, cVar);
        zzbbVar.zzd = obj;
        return zzbbVar;
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbb) create((zzhk) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0069, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        return (java.lang.String) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r7).zza(r1, r6) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        if (r7 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
    
        if (r7 != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        if (r1 != 3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0058, code lost:
    
        r7 = r6.zzb;
        r1 = r6.zzc;
        r6.zza = 4;
        r7 = r7.zzm(r1, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0063, code lost:
    
        if (r7 != r0) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // wc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        a aVar = a.a;
        Object obj2 = this.zza;
        try {
        } catch (Exception unused) {
            zzbo zzboVar = this.zzb;
            this.zzd = obj2;
            this.zza = 2;
            obj = zzboVar.zze(this);
            zzhkVar = obj2;
        }
        if (obj2 == 0) {
            q7.b(obj);
            zzhk zzhkVar2 = (zzhk) this.zzd;
            zzbo zzboVar2 = this.zzb;
            String str = this.zzc;
            this.zzd = zzhkVar2;
            this.zza = 1;
            obj = zzboVar2.zzm(str, this);
            obj2 = zzhkVar2;
        } else if (obj2 == 1) {
            zzhk zzhkVar3 = (zzhk) this.zzd;
            q7.b(obj);
            obj2 = zzhkVar3;
        } else if (obj2 != 2) {
            q7.b(obj);
        } else {
            zzhk zzhkVar4 = (zzhk) this.zzd;
            q7.b(obj);
            zzhkVar = zzhkVar4;
            this.zzd = null;
            this.zza = 3;
        }
        return (String) obj;
    }
}
