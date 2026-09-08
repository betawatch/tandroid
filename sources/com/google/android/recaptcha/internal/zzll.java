package com.google.android.recaptcha.internal;

import gd.f;
import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.t7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        return ((zzll) create((zzhk) obj, (c) obj2)).invokeSuspend(i.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // kd.a
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
                t7.b(obj);
                a2 = t7.a(new zzcg(zzce.zzb, zzcd.zzay, null, null, 12, null));
                return new f(a2);
            }
            if (i10 != 2) {
                t7.b(obj);
                a2 = i.a;
                return new f(a2);
            }
            zzhkVar = (zzhk) this.zzd;
            t7.b(obj);
            this.zzd = null;
            this.zza = 3;
            if (((zzhg) obj).zza(zzhkVar, this) == aVar) {
                return aVar;
            }
            a2 = i.a;
            return new f(a2);
        }
        t7.b(obj);
        zzhkVar = (zzhk) this.zzd;
        zzxn zzxnVar = this.zzb;
        if (!zzxnVar.zzV() || !zzxnVar.zzT() || !zzxnVar.zzS()) {
            zzdj zzn = this.zzc.zzn();
            zzmc zzmcVar = zzmc.zzd;
            this.zza = 1;
            if (zzn.zzc(zzmcVar, this) == aVar) {
                return aVar;
            }
            a2 = t7.a(new zzcg(zzce.zzb, zzcd.zzay, null, null, 12, null));
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
        a2 = i.a;
        return new f(a2);
    }
}
