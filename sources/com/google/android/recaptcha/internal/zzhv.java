package com.google.android.recaptcha.internal;

import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.t7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        return ((zzhv) create((zzhk) obj, (c) obj2)).invokeSuspend(i.a);
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
        a aVar = a.a;
        int i10 = this.zza;
        try {
            if (i10 == 0) {
                t7.b(obj);
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
                    t7.b(obj);
                    return xd.j.g(this.zzc.zzl(), "JAVASCRIPT_TAG", (String) obj);
                }
                zzhkVar = (zzhk) this.zzd;
                t7.b(obj);
            }
            this.zzd = null;
            this.zza = 2;
            obj = ((zzhg) obj).zza(zzhkVar, this);
            if (obj == aVar) {
                return aVar;
            }
            return xd.j.g(this.zzc.zzl(), "JAVASCRIPT_TAG", (String) obj);
        } catch (Exception e7) {
            if (e7 instanceof zzcg) {
                throw e7;
            }
            throw new zzcg(zzce.zzb, zzcd.zzL, e7.getMessage(), null, 8, null);
        }
    }
}
