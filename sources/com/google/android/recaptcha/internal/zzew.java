package com.google.android.recaptcha.internal;

import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.t7;
import zd.c0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
final class zzew extends j implements p {
    Object zza;
    int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfp zzd;
    final /* synthetic */ zzgr zze;
    final /* synthetic */ zzye zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzew(long j3, zzfp zzfpVar, zzgr zzgrVar, zzye zzyeVar, c cVar) {
        super(2, cVar);
        this.zzc = j3;
        this.zzd = zzfpVar;
        this.zze = zzgrVar;
        this.zzf = zzyeVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzew(this.zzc, this.zzd, this.zze, this.zzf, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzew) create((c0) obj, (c) obj2)).invokeSuspend(i.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.p pVar;
        kotlin.jvm.internal.p pVar2;
        long j3;
        zzev zzevVar;
        Object zzc;
        zzcg zzcgVar;
        a aVar = a.a;
        if (this.zzb != 0) {
            pVar2 = (kotlin.jvm.internal.p) this.zza;
            try {
                t7.b(obj);
                zzc = obj;
            } catch (Exception e7) {
                e = e7;
                zzcgVar = (zzcg) pVar2.a;
                if (zzcgVar != null) {
                    throw zzfp.zzd(this.zzd, e);
                }
                throw zzcgVar;
            }
        } else {
            t7.b(obj);
            kotlin.jvm.internal.p pVar3 = new kotlin.jvm.internal.p();
            try {
                j3 = this.zzc;
                zzevVar = new zzev(this.zze, this.zzd, this.zzf, pVar3, null);
                pVar = pVar3;
            } catch (Exception e10) {
                e = e10;
                pVar = pVar3;
            }
            try {
                this.zza = pVar;
                this.zzb = 1;
                zzc = zzcx.zzc(j3, 20, 100L, 1000L, 2.0d, zzevVar, this);
                if (zzc == aVar) {
                    return aVar;
                }
                pVar2 = pVar;
            } catch (Exception e11) {
                e = e11;
                pVar2 = pVar;
                zzcgVar = (zzcg) pVar2.a;
                if (zzcgVar != null) {
                }
            }
        }
        return (zzyg) zzc;
    }
}
