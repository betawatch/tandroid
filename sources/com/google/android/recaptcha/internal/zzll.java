package com.google.android.recaptcha.internal;

import dd.p;
import k7.q7;
import sc.f;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
final class zzll extends i implements p {
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

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        zzll zzllVar = new zzll(this.zzb, this.zzc, cVar);
        zzllVar.zzd = obj;
        return zzllVar;
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzll) create((zzhk) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // wc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        Object a2;
        a aVar = a.a;
        int i10 = this.zza;
        if (i10 != 0) {
            if (i10 == 1) {
                q7.b(obj);
                a2 = q7.a(new zzcg(zzce.zzb, zzcd.zzay, null, null, 12, null));
                return new f(a2);
            }
            if (i10 != 2) {
                q7.b(obj);
                a2 = sc.i.a;
                return new f(a2);
            }
            zzhkVar = (zzhk) this.zzd;
            q7.b(obj);
            this.zzd = null;
            this.zza = 3;
            if (((zzhg) obj).zza(zzhkVar, this) == aVar) {
                return aVar;
            }
            a2 = sc.i.a;
            return new f(a2);
        }
        q7.b(obj);
        zzhkVar = (zzhk) this.zzd;
        zzxn zzxnVar = this.zzb;
        if (!zzxnVar.zzV() || !zzxnVar.zzT() || !zzxnVar.zzS()) {
            zzdj zzn = this.zzc.zzn();
            zzmc zzmcVar = zzmc.zzd;
            this.zza = 1;
            if (zzn.zzc(zzmcVar, this) == aVar) {
                return aVar;
            }
            a2 = q7.a(new zzcg(zzce.zzb, zzcd.zzay, null, null, 12, null));
            return new f(a2);
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
        a2 = sc.i.a;
        return new f(a2);
    }
}
