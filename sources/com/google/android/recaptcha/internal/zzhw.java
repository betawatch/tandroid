package com.google.android.recaptcha.internal;

import ad.p;
import h7.k6;
import rc.c;
import tc.i;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
final class zzhw extends i implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzib zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ String zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhw(zzib zzibVar, String str, String str2, c cVar) {
        super(2, cVar);
        this.zzc = zzibVar;
        this.zzd = str;
        this.zze = str2;
    }

    @Override // tc.a
    public final c create(Object obj, c cVar) {
        zzhw zzhwVar = new zzhw(this.zzc, this.zzd, this.zze, cVar);
        zzhwVar.zzf = obj;
        return zzhwVar;
    }

    @Override // ad.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhw) create((zzhk) obj, (c) obj2)).invokeSuspend(pc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
    
        if (r11 != r0) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16, types: [com.google.android.recaptcha.internal.zzhk] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    @Override // tc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? r12;
        zzhk zzhkVar;
        zzhk zzhkVar2;
        zzhk zzhkVar3;
        zzhf zzhfVar;
        String str;
        zzhk zzhkVar4;
        ?? r13;
        sc.a aVar = sc.a.a;
        int i10 = this.zzb;
        try {
        } catch (Exception unused) {
            r12 = i10;
        }
        if (i10 == 0) {
            k6.b(obj);
            zzhk zzhkVar5 = (zzhk) this.zzf;
            zzib zzibVar = this.zzc;
            String str2 = this.zzd;
            this.zzf = zzhkVar5;
            this.zza = zzhkVar5;
            this.zzb = 1;
            obj = new zzhf(25, new zzhx(zzibVar, str2, null), null);
            if (obj != aVar) {
                zzhkVar4 = zzhkVar5;
                r13 = zzhkVar5;
            }
        }
        if (i10 != 1) {
            if (i10 == 2) {
                ?? r14 = (zzhk) this.zzf;
                k6.b(obj);
                i10 = r14;
                return (String) obj;
            }
            if (i10 == 3) {
                zzhk zzhkVar6 = (zzhk) this.zza;
                zzhkVar = (zzhk) this.zzf;
                k6.b(obj);
                zzhkVar2 = zzhkVar6;
                this.zzf = zzhkVar;
                this.zza = null;
                this.zzb = 4;
                obj = ((zzhf) obj).zza(zzhkVar2, this);
                if (obj != aVar) {
                    zzhkVar3 = zzhkVar;
                    zzib zzibVar2 = this.zzc;
                    String str3 = this.zzd;
                    String str4 = (String) obj;
                    this.zzf = str4;
                    this.zza = zzhkVar3;
                    this.zzb = 5;
                    zzhfVar = new zzhf(24, new zzhy(zzibVar2, str3, str4, null), null);
                    if (zzhfVar != aVar) {
                    }
                }
            }
            if (i10 != 4) {
                if (i10 != 5) {
                    String str5 = (String) this.zzf;
                    k6.b(obj);
                    return str5;
                }
                zzhkVar3 = (zzhk) this.zza;
                str = (String) this.zzf;
                k6.b(obj);
                this.zzf = str;
                this.zza = null;
                this.zzb = 6;
                return zzhj.zzb(zzhkVar3, (zzhf) obj, this) == aVar ? str : aVar;
            }
            zzhkVar3 = (zzhk) this.zzf;
            k6.b(obj);
            zzib zzibVar22 = this.zzc;
            String str32 = this.zzd;
            String str42 = (String) obj;
            this.zzf = str42;
            this.zza = zzhkVar3;
            this.zzb = 5;
            zzhfVar = new zzhf(24, new zzhy(zzibVar22, str32, str42, null), null);
            if (zzhfVar != aVar) {
                str = str42;
                obj = zzhfVar;
                this.zzf = str;
                this.zza = null;
                this.zzb = 6;
                if (zzhj.zzb(zzhkVar3, (zzhf) obj, this) == aVar) {
                }
            }
        }
        zzhk zzhkVar7 = (zzhk) this.zza;
        zzhk zzhkVar8 = (zzhk) this.zzf;
        try {
            k6.b(obj);
            zzhkVar4 = zzhkVar7;
            r13 = zzhkVar8;
        } catch (Exception unused2) {
            r12 = zzhkVar8;
            zzib zzibVar3 = this.zzc;
            zzib.zza(zzibVar3).zzb();
            String str6 = this.zze;
            this.zzf = r12;
            this.zza = r12;
            this.zzb = 3;
            obj = new zzhf(23, new zzhu(zzibVar3, str6, null), null);
            if (obj != aVar) {
                zzhkVar = r12;
                zzhkVar2 = r12;
                this.zzf = zzhkVar;
                this.zza = null;
                this.zzb = 4;
                obj = ((zzhf) obj).zza(zzhkVar2, this);
                if (obj != aVar) {
                }
            }
        }
        this.zzf = r13;
        this.zza = null;
        this.zzb = 2;
        obj = ((zzhf) obj).zza(zzhkVar4, this);
        i10 = r13;
    }
}
