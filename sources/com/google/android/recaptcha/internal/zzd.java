package com.google.android.recaptcha.internal;

import ad.g;
import cd.c;
import dd.a;
import ed.j;
import l9.b;
import ld.p;
import td.e0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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

    @Override // ed.a
    public final c create(Object obj, c cVar) {
        zzd zzdVar = new zzd(this.zzb, this.zzc, this.zzd, cVar);
        zzdVar.zze = obj;
        return zzdVar;
    }

    @Override // ld.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzd) create((zzgr) obj, (c) obj2)).invokeSuspend(ad.j.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        if (r11 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r11 != r0) goto L22;
     */
    @Override // ed.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        ad.j jVar = ad.j.a;
        try {
        } catch (Exception e) {
            zzg zzgVar = this.zzb;
            zzgVar.zza = false;
            this.zza = 2;
            obj = zzgVar.zzf(e, this);
        }
        if (i10 == 0) {
            b.b(obj);
            zzgr zzgrVar = (zzgr) this.zze;
            zzg zzgVar2 = this.zzb;
            if (zzgVar2.zzi()) {
                return jVar;
            }
            long j10 = this.zzc;
            zzc zzcVar = new zzc(zzgrVar, zzgVar2, this.zzd, null);
            this.zza = 1;
            obj = e0.x(j10, zzcVar, this);
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    zzcg zzcgVar = (zzcg) this.zze;
                    b.b(obj);
                    throw zzcgVar;
                }
                b.b(obj);
                zzg zzgVar3 = this.zzb;
                zzcg zzcgVar2 = (zzcg) obj;
                this.zze = zzcgVar2;
                this.zza = 3;
                if (zzgVar3.zzc(zzcgVar2, this) != aVar) {
                    throw zzcgVar2;
                }
                return aVar;
            }
            b.b(obj);
        }
        b.b(((g) obj).a);
        this.zzb.zza = true;
        return jVar;
    }
}
