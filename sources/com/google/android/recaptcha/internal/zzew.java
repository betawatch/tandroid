package com.google.android.recaptcha.internal;

import af.b;
import gd.k;
import id.c;
import kd.j;
import kotlin.jvm.internal.r;
import rd.p;
import zd.z;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
        return ((zzew) create((z) obj, (c) obj2)).invokeSuspend(k.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r rVar;
        r rVar2;
        long j3;
        zzev zzevVar;
        Object zzc;
        zzcg zzcgVar;
        jd.a aVar = jd.a.a;
        if (this.zzb != 0) {
            rVar2 = (r) this.zza;
            try {
                b.c(obj);
                zzc = obj;
            } catch (Exception e10) {
                e = e10;
                zzcgVar = (zzcg) rVar2.a;
                if (zzcgVar != null) {
                    throw zzfp.zzd(this.zzd, e);
                }
                throw zzcgVar;
            }
        } else {
            b.c(obj);
            r rVar3 = new r();
            try {
                j3 = this.zzc;
                zzevVar = new zzev(this.zze, this.zzd, this.zzf, rVar3, null);
                rVar = rVar3;
            } catch (Exception e11) {
                e = e11;
                rVar = rVar3;
            }
            try {
                this.zza = rVar;
                this.zzb = 1;
                zzc = zzcx.zzc(j3, 20, 100L, 1000L, 2.0d, zzevVar, this);
                if (zzc == aVar) {
                    return aVar;
                }
                rVar2 = rVar;
            } catch (Exception e12) {
                e = e12;
                rVar2 = rVar;
                zzcgVar = (zzcg) rVar2.a;
                if (zzcgVar != null) {
                }
            }
        }
        return (zzyg) zzc;
    }
}
