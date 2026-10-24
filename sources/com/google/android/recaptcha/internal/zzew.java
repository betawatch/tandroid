package com.google.android.recaptcha.internal;

import be.c0;
import kd.c;
import ld.a;
import md.i;
import td.p;
import v7.i8;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
final class zzew extends i implements p {
    Object zza;
    int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfp zzd;
    final /* synthetic */ zzgr zze;
    final /* synthetic */ zzye zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzew(long j10, zzfp zzfpVar, zzgr zzgrVar, zzye zzyeVar, c cVar) {
        super(2, cVar);
        this.zzc = j10;
        this.zzd = zzfpVar;
        this.zze = zzgrVar;
        this.zzf = zzyeVar;
    }

    @Override // md.a
    public final c create(Object obj, c cVar) {
        return new zzew(this.zzc, this.zzd, this.zze, this.zzf, cVar);
    }

    @Override // td.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzew) create((c0) obj, (c) obj2)).invokeSuspend(id.i.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    @Override // md.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.p pVar;
        kotlin.jvm.internal.p pVar2;
        long j10;
        zzev zzevVar;
        Object zzc;
        zzcg zzcgVar;
        a aVar = a.a;
        if (this.zzb != 0) {
            pVar2 = (kotlin.jvm.internal.p) this.zza;
            try {
                i8.b(obj);
                zzc = obj;
            } catch (Exception e) {
                e = e;
                zzcgVar = (zzcg) pVar2.a;
                if (zzcgVar != null) {
                    throw zzfp.zzd(this.zzd, e);
                }
                throw zzcgVar;
            }
        } else {
            i8.b(obj);
            kotlin.jvm.internal.p pVar3 = new kotlin.jvm.internal.p();
            try {
                j10 = this.zzc;
                zzevVar = new zzev(this.zze, this.zzd, this.zzf, pVar3, null);
                pVar = pVar3;
            } catch (Exception e7) {
                e = e7;
                pVar = pVar3;
            }
            try {
                this.zza = pVar;
                this.zzb = 1;
                zzc = zzcx.zzc(j10, 20, 100L, 1000L, 2.0d, zzevVar, this);
                if (zzc == aVar) {
                    return aVar;
                }
                pVar2 = pVar;
            } catch (Exception e10) {
                e = e10;
                pVar2 = pVar;
                zzcgVar = (zzcg) pVar2.a;
                if (zzcgVar != null) {
                }
            }
        }
        return (zzyg) zzc;
    }
}
