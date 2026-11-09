package com.google.android.recaptcha.internal;

import af.b;
import gd.k;
import hd.e;
import id.c;
import ie.d;
import kotlin.jvm.internal.j;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class zzdj {
    private Object zza;
    private final ie.a zzb = new d();

    public zzdj(Object obj) {
        this.zza = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v7, types: [ie.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(Object obj, c cVar) {
        zzdg zzdgVar;
        int i7;
        d dVar;
        try {
            if (cVar instanceof zzdg) {
                zzdgVar = (zzdg) cVar;
                int i10 = zzdgVar.zzd;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    zzdgVar.zzd = i10 - TLObject.FLAG_31;
                    Object obj2 = zzdgVar.zzb;
                    jd.a aVar = jd.a.a;
                    i7 = zzdgVar.zzd;
                    if (i7 != 0) {
                        b.c(obj2);
                        ie.a aVar2 = this.zzb;
                        zzdgVar.zze = (zzmc) obj;
                        zzdgVar.zza = aVar2;
                        zzdgVar.zzd = 1;
                        dVar = (d) aVar2;
                        if (dVar.d(zzdgVar) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r52 = (ie.a) zzdgVar.zza;
                        zzmc zzmcVar = zzdgVar.zze;
                        b.c(obj2);
                        dVar = r52;
                        obj = zzmcVar;
                    }
                    return Boolean.valueOf(j.a(this.zza, obj));
                }
            }
            return Boolean.valueOf(j.a(this.zza, obj));
        } finally {
            dVar.f(null);
        }
        zzdgVar = new zzdg(this, cVar);
        Object obj22 = zzdgVar.zzb;
        jd.a aVar3 = jd.a.a;
        i7 = zzdgVar.zzd;
        if (i7 != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v7, types: [ie.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb(Object[] objArr, c cVar) {
        zzdh zzdhVar;
        int i7;
        d dVar;
        try {
            if (cVar instanceof zzdh) {
                zzdhVar = (zzdh) cVar;
                int i10 = zzdhVar.zzd;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    zzdhVar.zzd = i10 - TLObject.FLAG_31;
                    Object obj = zzdhVar.zzb;
                    jd.a aVar = jd.a.a;
                    i7 = zzdhVar.zzd;
                    if (i7 != 0) {
                        b.c(obj);
                        ie.a aVar2 = this.zzb;
                        zzdhVar.zze = (zzmc[]) objArr;
                        zzdhVar.zza = aVar2;
                        zzdhVar.zzd = 1;
                        dVar = (d) aVar2;
                        if (dVar.d(zzdhVar) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r52 = (ie.a) zzdhVar.zza;
                        zzmc[] zzmcVarArr = zzdhVar.zze;
                        b.c(obj);
                        dVar = r52;
                        objArr = zzmcVarArr;
                    }
                    return Boolean.valueOf(e.a(objArr, this.zza));
                }
            }
            return Boolean.valueOf(e.a(objArr, this.zza));
        } finally {
            dVar.f(null);
        }
        zzdhVar = new zzdh(this, cVar);
        Object obj2 = zzdhVar.zzb;
        jd.a aVar3 = jd.a.a;
        i7 = zzdhVar.zzd;
        if (i7 != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v6, types: [ie.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(Object obj, c cVar) {
        zzdi zzdiVar;
        int i7;
        d dVar;
        try {
            if (cVar instanceof zzdi) {
                zzdiVar = (zzdi) cVar;
                int i10 = zzdiVar.zzd;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    zzdiVar.zzd = i10 - TLObject.FLAG_31;
                    Object obj2 = zzdiVar.zzb;
                    jd.a aVar = jd.a.a;
                    i7 = zzdiVar.zzd;
                    if (i7 != 0) {
                        b.c(obj2);
                        ie.a aVar2 = this.zzb;
                        zzdiVar.zze = (zzmc) obj;
                        zzdiVar.zza = aVar2;
                        zzdiVar.zzd = 1;
                        dVar = (d) aVar2;
                        if (dVar.d(zzdiVar) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r52 = (ie.a) zzdiVar.zza;
                        zzmc zzmcVar = zzdiVar.zze;
                        b.c(obj2);
                        dVar = r52;
                        obj = zzmcVar;
                    }
                    this.zza = obj;
                    dVar.f(null);
                    return k.a;
                }
            }
            this.zza = obj;
            dVar.f(null);
            return k.a;
        } catch (Throwable th2) {
            dVar.f(null);
            throw th2;
        }
        zzdiVar = new zzdi(this, cVar);
        Object obj22 = zzdiVar.zzb;
        jd.a aVar3 = jd.a.a;
        i7 = zzdiVar.zzd;
        if (i7 != 0) {
        }
    }
}
