package com.google.android.recaptcha.internal;

import b8.ib;
import dd.g;
import dd.k;
import fd.c;
import hd.j;
import od.p;
import wd.b0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
final class zzd extends j implements p {
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

    @Override // hd.a
    public final c create(Object obj, c cVar) {
        zzd zzdVar = new zzd(this.zzb, this.zzc, this.zzd, cVar);
        zzdVar.zze = obj;
        return zzdVar;
    }

    @Override // od.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzd) create((zzgr) obj, (c) obj2)).invokeSuspend(k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        if (r11 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r11 != r0) goto L22;
     */
    @Override // hd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        gd.a aVar = gd.a.a;
        int i3 = this.zza;
        k kVar = k.a;
        try {
        } catch (Exception e10) {
            zzg zzgVar = this.zzb;
            zzgVar.zza = false;
            this.zza = 2;
            obj = zzgVar.zzf(e10, this);
        }
        if (i3 == 0) {
            ib.b(obj);
            zzgr zzgrVar = (zzgr) this.zze;
            zzg zzgVar2 = this.zzb;
            if (zzgVar2.zzi()) {
                return kVar;
            }
            long j10 = this.zzc;
            zzc zzcVar = new zzc(zzgrVar, zzgVar2, this.zzd, null);
            this.zza = 1;
            obj = b0.z(j10, zzcVar, this);
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    zzcg zzcgVar = (zzcg) this.zze;
                    ib.b(obj);
                    throw zzcgVar;
                }
                ib.b(obj);
                zzg zzgVar3 = this.zzb;
                zzcg zzcgVar2 = (zzcg) obj;
                this.zze = zzcgVar2;
                this.zza = 3;
                if (zzgVar3.zzc(zzcgVar2, this) != aVar) {
                    throw zzcgVar2;
                }
                return aVar;
            }
            ib.b(obj);
        }
        ib.b(((g) obj).a);
        this.zzb.zza = true;
        return kVar;
    }
}
