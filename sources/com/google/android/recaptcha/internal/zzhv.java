package com.google.android.recaptcha.internal;

import af.b;
import gd.k;
import id.c;
import kd.j;
import rd.p;
import xd.l;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
final class zzhv extends j implements p {
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

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzhv zzhvVar = new zzhv(this.zzb, this.zzc, cVar);
        zzhvVar.zzd = obj;
        return zzhvVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhv) create((zzhk) obj, (c) obj2)).invokeSuspend(k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        if (r9 != r0) goto L15;
     */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        jd.a aVar = jd.a.a;
        int i7 = this.zza;
        try {
            if (i7 == 0) {
                b.c(obj);
                zzhkVar = (zzhk) this.zzd;
                zzib zzibVar = this.zzb;
                zzxn zzxnVar = this.zzc;
                String zzM = zzxnVar.zzM();
                String zzN = zzxnVar.zzN();
                this.zzd = zzhkVar;
                this.zza = 1;
                obj = new zzhg(new zzhw(zzibVar, zzN, zzM, null));
            } else {
                if (i7 != 1) {
                    b.c(obj);
                    return l.c(this.zzc.zzl(), "JAVASCRIPT_TAG", (String) obj);
                }
                zzhkVar = (zzhk) this.zzd;
                b.c(obj);
            }
            this.zzd = null;
            this.zza = 2;
            obj = ((zzhg) obj).zza(zzhkVar, this);
            if (obj == aVar) {
                return aVar;
            }
            return l.c(this.zzc.zzl(), "JAVASCRIPT_TAG", (String) obj);
        } catch (Exception e10) {
            if (e10 instanceof zzcg) {
                throw e10;
            }
            throw new zzcg(zzce.zzb, zzcd.zzL, e10.getMessage(), null, 8, null);
        }
    }
}
