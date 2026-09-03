package com.google.android.recaptcha.internal;

import dd.p;
import k7.q7;
import kotlin.jvm.internal.j;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
final class zzeb extends i implements p {
    int zza;
    final /* synthetic */ zzeh zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzdw zzd;
    final /* synthetic */ zzdq zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ zzhh zzg;
    private /* synthetic */ Object zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzeh zzehVar, String str, zzdw zzdwVar, zzdq zzdqVar, long j10, zzhh zzhhVar, c cVar) {
        super(2, cVar);
        this.zzb = zzehVar;
        this.zzc = str;
        this.zzd = zzdwVar;
        this.zze = zzdqVar;
        this.zzf = j10;
        this.zzg = zzhhVar;
    }

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        zzeb zzebVar = new zzeb(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, cVar);
        zzebVar.zzh = obj;
        return zzebVar;
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeb) create((zzgr) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ae, code lost:
    
        if (r15 == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (r15 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r15 != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
    
        if (r15 != r0) goto L28;
     */
    @Override // wc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        zzeq zzeqVar;
        a aVar = a.a;
        int i10 = this.zza;
        if (i10 == 0) {
            q7.b(obj);
            zzgrVar = (zzgr) this.zzh;
            zzeh zzehVar = this.zzb;
            zzeqVar = zzehVar.zzc;
            if (zzeqVar != null) {
                String str = this.zzc;
                this.zzh = zzgrVar;
                this.zza = 1;
                obj = new zzhf(45, new zzeg(zzeqVar, str, null), null);
            } else {
                zzdw zzdwVar = this.zzd;
                if (zzdwVar == null) {
                    String str2 = this.zzc;
                    zzdq zzdqVar = this.zze;
                    zzfp zzfpVar = new zzfp(str2);
                    zzdwVar = j.a(zzdqVar, zzdq.zza) ? new zzge(zzfpVar) : new zzgb(zzfpVar, new zzct());
                }
                zzdw zzdwVar2 = zzdwVar;
                String str3 = this.zzc;
                long j10 = this.zzf;
                zzhh zzhhVar = this.zzg;
                this.zzh = zzgrVar;
                this.zza = 3;
                obj = new zzhg(new zzee(zzehVar, j10, zzdwVar2, str3, zzhhVar, null));
            }
            return aVar;
        }
        if (i10 == 1) {
            zzgrVar = (zzgr) this.zzh;
            q7.b(obj);
            this.zzh = null;
            this.zza = 2;
            obj = ((zzhf) obj).zza(zzgrVar.zza(), this);
        } else {
            if (i10 == 2) {
                q7.b(obj);
                return (zzeq) obj;
            }
            if (i10 != 3) {
                q7.b(obj);
                return (zzeq) obj;
            }
            zzgrVar = (zzgr) this.zzh;
            q7.b(obj);
            this.zzh = null;
            this.zza = 4;
            obj = ((zzhg) obj).zza(zzgrVar.zza(), this);
        }
    }
}
