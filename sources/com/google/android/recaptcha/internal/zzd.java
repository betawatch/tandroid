package com.google.android.recaptcha.internal;

import g7.y5;
import hd.f0;
import oc.f;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        zzd zzdVar = new zzd(this.zzb, this.zzc, this.zzd, cVar);
        zzdVar.zze = obj;
        return zzdVar;
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzd) create((zzgr) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        if (r11 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r11 != r0) goto L22;
     */
    @Override // sc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i9 = this.zza;
        oc.i iVar = oc.i.a;
        try {
        } catch (Exception e10) {
            zzg zzgVar = this.zzb;
            zzgVar.zza = false;
            this.zza = 2;
            obj = zzgVar.zzf(e10, this);
        }
        if (i9 == 0) {
            y5.b(obj);
            zzgr zzgrVar = (zzgr) this.zze;
            zzg zzgVar2 = this.zzb;
            if (zzgVar2.zzi()) {
                return iVar;
            }
            long j10 = this.zzc;
            zzc zzcVar = new zzc(zzgrVar, zzgVar2, this.zzd, null);
            this.zza = 1;
            obj = f0.x(j10, zzcVar, this);
        } else {
            if (i9 != 1) {
                if (i9 != 2) {
                    zzcg zzcgVar = (zzcg) this.zze;
                    y5.b(obj);
                    throw zzcgVar;
                }
                y5.b(obj);
                zzg zzgVar3 = this.zzb;
                zzcg zzcgVar2 = (zzcg) obj;
                this.zze = zzcgVar2;
                this.zza = 3;
                if (zzgVar3.zzc(zzcgVar2, this) != aVar) {
                    throw zzcgVar2;
                }
                return aVar;
            }
            y5.b(obj);
        }
        y5.b(((f) obj).a);
        this.zzb.zza = true;
        return iVar;
    }
}
