package com.google.android.recaptcha.internal;

import b7.h;
import gd.g;
import gd.k;
import id.c;
import jd.a;
import kd.j;
import rd.p;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        Object a10;
        a aVar = a.a;
        int i7 = this.zza;
        if (i7 != 0) {
            if (i7 == 1) {
                h.b(obj);
                a10 = h.a(new zzcg(zzce.zzb, zzcd.zzay, null, null, 12, null));
                return new g(a10);
            }
            if (i7 != 2) {
                h.b(obj);
                a10 = k.a;
                return new g(a10);
            }
            zzhkVar = (zzhk) this.zzd;
            h.b(obj);
            this.zzd = null;
            this.zza = 3;
            if (((zzhg) obj).zza(zzhkVar, this) == aVar) {
                return aVar;
            }
            a10 = k.a;
            return new g(a10);
        }
        h.b(obj);
        zzhkVar = (zzhk) this.zzd;
        zzxn zzxnVar = this.zzb;
        if (!zzxnVar.zzV() || !zzxnVar.zzT() || !zzxnVar.zzS()) {
            zzdj zzn = this.zzc.zzn();
            zzmc zzmcVar = zzmc.zzd;
            this.zza = 1;
            if (zzn.zzc(zzmcVar, this) == aVar) {
                return aVar;
            }
            a10 = h.a(new zzcg(zzce.zzb, zzcd.zzay, null, null, 12, null));
            return new g(a10);
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
        a10 = k.a;
        return new g(a10);
    }
}
