package com.google.android.recaptcha.internal;

import dd.p;
import k7.p7;
import kotlin.jvm.internal.q;
import ld.c0;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        return new zzew(this.zzc, this.zzd, this.zze, this.zzf, cVar);
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzew) create((c0) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    @Override // wc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        q qVar;
        q qVar2;
        long j10;
        zzev zzevVar;
        Object zzc;
        zzcg zzcgVar;
        a aVar = a.a;
        if (this.zzb != 0) {
            qVar2 = (q) this.zza;
            try {
                p7.b(obj);
                zzc = obj;
            } catch (Exception e) {
                e = e;
                zzcgVar = (zzcg) qVar2.a;
                if (zzcgVar != null) {
                    throw zzfp.zzd(this.zzd, e);
                }
                throw zzcgVar;
            }
        } else {
            p7.b(obj);
            q qVar3 = new q();
            try {
                j10 = this.zzc;
                zzevVar = new zzev(this.zze, this.zzd, this.zzf, qVar3, null);
                qVar = qVar3;
            } catch (Exception e6) {
                e = e6;
                qVar = qVar3;
            }
            try {
                this.zza = qVar;
                this.zzb = 1;
                zzc = zzcx.zzc(j10, 20, 100L, 1000L, 2.0d, zzevVar, this);
                if (zzc == aVar) {
                    return aVar;
                }
                qVar2 = qVar;
            } catch (Exception e10) {
                e = e10;
                qVar2 = qVar;
                zzcgVar = (zzcg) qVar2.a;
                if (zzcgVar != null) {
                }
            }
        }
        return (zzyg) zzc;
    }
}
