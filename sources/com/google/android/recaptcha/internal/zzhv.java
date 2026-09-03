package com.google.android.recaptcha.internal;

import dd.p;
import jd.j;
import k7.p7;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        zzhv zzhvVar = new zzhv(this.zzb, this.zzc, cVar);
        zzhvVar.zzd = obj;
        return zzhvVar;
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhv) create((zzhk) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        if (r9 != r0) goto L15;
     */
    @Override // wc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        a aVar = a.a;
        int i10 = this.zza;
        try {
            if (i10 == 0) {
                p7.b(obj);
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
                    p7.b(obj);
                    return j.g(this.zzc.zzl(), "JAVASCRIPT_TAG", (String) obj);
                }
                zzhkVar = (zzhk) this.zzd;
                p7.b(obj);
            }
            this.zzd = null;
            this.zza = 2;
            obj = ((zzhg) obj).zza(zzhkVar, this);
            if (obj == aVar) {
                return aVar;
            }
            return j.g(this.zzc.zzl(), "JAVASCRIPT_TAG", (String) obj);
        } catch (Exception e) {
            if (e instanceof zzcg) {
                throw e;
            }
            throw new zzcg(zzce.zzb, zzcd.zzL, e.getMessage(), null, 8, null);
        }
    }
}
