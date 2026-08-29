package com.google.android.recaptcha.internal;

import bd.p;
import i7.c7;
import jd.e0;
import qc.f;
import sc.c;
import uc.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
final class zzd extends i implements p {
    int zza;
    final /* synthetic */ zzg zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzxn zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzd(zzg zzgVar, long j10, zzxn zzxnVar, c cVar) {
        super(2, cVar);
        this.zzb = zzgVar;
        this.zzc = j10;
        this.zzd = zzxnVar;
    }

    @Override // uc.a
    public final c create(Object obj, c cVar) {
        zzd zzdVar = new zzd(this.zzb, this.zzc, this.zzd, cVar);
        zzdVar.zze = obj;
        return zzdVar;
    }

    @Override // bd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzd) create((zzgr) obj, (c) obj2)).invokeSuspend(qc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        if (r11 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r11 != r0) goto L22;
     */
    @Override // uc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tc.a aVar = tc.a.a;
        int i10 = this.zza;
        qc.i iVar = qc.i.a;
        try {
        } catch (Exception e10) {
            zzg zzgVar = this.zzb;
            zzgVar.zza = false;
            this.zza = 2;
            obj = zzgVar.zzf(e10, this);
        }
        if (i10 == 0) {
            c7.b(obj);
            zzgr zzgrVar = (zzgr) this.zze;
            zzg zzgVar2 = this.zzb;
            if (zzgVar2.zzi()) {
                return iVar;
            }
            long j10 = this.zzc;
            zzc zzcVar = new zzc(zzgrVar, zzgVar2, this.zzd, null);
            this.zza = 1;
            obj = e0.x(j10, zzcVar, this);
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    zzcg zzcgVar = (zzcg) this.zze;
                    c7.b(obj);
                    throw zzcgVar;
                }
                c7.b(obj);
                zzg zzgVar3 = this.zzb;
                zzcg zzcgVar2 = (zzcg) obj;
                this.zze = zzcgVar2;
                this.zza = 3;
                if (zzgVar3.zzc(zzcgVar2, this) != aVar) {
                    throw zzcgVar2;
                }
                return aVar;
            }
            c7.b(obj);
        }
        c7.b(((f) obj).a);
        this.zzb.zza = true;
        return iVar;
    }
}
