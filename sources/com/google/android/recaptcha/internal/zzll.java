package com.google.android.recaptcha.internal;

import af.b;
import gd.g;
import gd.k;
import id.c;
import kd.j;
import rd.p;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
final class zzll extends j implements p {
    int zza;
    final /* synthetic */ zzxn zzb;
    final /* synthetic */ zzly zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzll(zzxn zzxnVar, zzly zzlyVar, c cVar) {
        super(2, cVar);
        this.zzb = zzxnVar;
        this.zzc = zzlyVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzll zzllVar = new zzll(this.zzb, this.zzc, cVar);
        zzllVar.zzd = obj;
        return zzllVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzll) create((zzhk) obj, (c) obj2)).invokeSuspend(k.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        Object b10;
        jd.a aVar = jd.a.a;
        int i7 = this.zza;
        if (i7 != 0) {
            if (i7 == 1) {
                b.c(obj);
                b10 = b.b(new zzcg(zzce.zzb, zzcd.zzay, null, null, 12, null));
                return new g(b10);
            }
            if (i7 != 2) {
                b.c(obj);
                b10 = k.a;
                return new g(b10);
            }
            zzhkVar = (zzhk) this.zzd;
            b.c(obj);
            this.zzd = null;
            this.zza = 3;
            if (((zzhg) obj).zza(zzhkVar, this) == aVar) {
                return aVar;
            }
            b10 = k.a;
            return new g(b10);
        }
        b.c(obj);
        zzhkVar = (zzhk) this.zzd;
        zzxn zzxnVar = this.zzb;
        if (!zzxnVar.zzV() || !zzxnVar.zzT() || !zzxnVar.zzS()) {
            zzdj zzn = this.zzc.zzn();
            zzmc zzmcVar = zzmc.zzd;
            this.zza = 1;
            if (zzn.zzc(zzmcVar, this) == aVar) {
                return aVar;
            }
            b10 = b.b(new zzcg(zzce.zzb, zzcd.zzay, null, null, 12, null));
            return new g(b10);
        }
        zzly zzlyVar = this.zzc;
        zzlyVar.zze = zzxnVar;
        this.zzd = zzhkVar;
        this.zza = 2;
        obj = zzly.zzu(zzlyVar, this);
        if (obj == aVar) {
            return aVar;
        }
        this.zzd = null;
        this.zza = 3;
        if (((zzhg) obj).zza(zzhkVar, this) == aVar) {
        }
        b10 = k.a;
        return new g(b10);
    }
}
