package com.google.android.recaptcha.internal;

import bd.p;
import hd.j;
import i7.c7;
import sc.c;
import uc.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
final class zzhv extends i implements p {
    int zza;
    final /* synthetic */ zzib zzb;
    final /* synthetic */ zzxn zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhv(zzib zzibVar, zzxn zzxnVar, c cVar) {
        super(2, cVar);
        this.zzb = zzibVar;
        this.zzc = zzxnVar;
    }

    @Override // uc.a
    public final c create(Object obj, c cVar) {
        zzhv zzhvVar = new zzhv(this.zzb, this.zzc, cVar);
        zzhvVar.zzd = obj;
        return zzhvVar;
    }

    @Override // bd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhv) create((zzhk) obj, (c) obj2)).invokeSuspend(qc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        if (r9 != r0) goto L15;
     */
    @Override // uc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        tc.a aVar = tc.a.a;
        int i10 = this.zza;
        try {
            if (i10 == 0) {
                c7.b(obj);
                zzhkVar = (zzhk) this.zzd;
                zzib zzibVar = this.zzb;
                zzxn zzxnVar = this.zzc;
                String zzM = zzxnVar.zzM();
                String zzN = zzxnVar.zzN();
                this.zzd = zzhkVar;
                this.zza = 1;
                obj = new zzhg(new zzhw(zzibVar, zzN, zzM, null));
            } else {
                if (i10 != 1) {
                    c7.b(obj);
                    return j.g(this.zzc.zzl(), "JAVASCRIPT_TAG", (String) obj);
                }
                zzhkVar = (zzhk) this.zzd;
                c7.b(obj);
            }
            this.zzd = null;
            this.zza = 2;
            obj = ((zzhg) obj).zza(zzhkVar, this);
            if (obj == aVar) {
                return aVar;
            }
            return j.g(this.zzc.zzl(), "JAVASCRIPT_TAG", (String) obj);
        } catch (Exception e10) {
            if (e10 instanceof zzcg) {
                throw e10;
            }
            throw new zzcg(zzce.zzb, zzcd.zzL, e10.getMessage(), null, 8, null);
        }
    }
}
