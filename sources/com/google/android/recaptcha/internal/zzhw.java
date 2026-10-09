package com.google.android.recaptcha.internal;

import hd.i;
import jd.c;
import kd.a;
import ld.j;
import sd.p;
import v7.a8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
final class zzhw extends j implements p {
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

    @Override // ld.a
    public final c create(Object obj, c cVar) {
        zzhw zzhwVar = new zzhw(this.zzc, this.zzd, this.zze, cVar);
        zzhwVar.zzf = obj;
        return zzhwVar;
    }

    @Override // sd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhw) create((zzhk) obj, (c) obj2)).invokeSuspend(i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
    
        if (r11 != r0) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    @Override // ld.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        zzhk zzhkVar2;
        zzhk zzhkVar3;
        zzhf zzhfVar;
        String str;
        zzhk zzhkVar4;
        zzhk zzhkVar5;
        a aVar = a.a;
        ?? r12 = this.zzb;
        if (r12 == 0) {
            a8.b(obj);
            zzhk zzhkVar6 = (zzhk) this.zzf;
            zzib zzibVar = this.zzc;
            String str2 = this.zzd;
            this.zzf = zzhkVar6;
            this.zza = zzhkVar6;
            this.zzb = 1;
            obj = new zzhf(25, new zzhx(zzibVar, str2, null), null);
            if (obj != aVar) {
                zzhkVar4 = zzhkVar6;
                zzhkVar5 = zzhkVar6;
            }
        }
        if (r12 != 1) {
            if (r12 == 2) {
                zzhk zzhkVar7 = (zzhk) this.zzf;
                a8.b(obj);
                r12 = zzhkVar7;
                return (String) obj;
            }
            if (r12 == 3) {
                zzhk zzhkVar8 = (zzhk) this.zza;
                zzhkVar = (zzhk) this.zzf;
                a8.b(obj);
                zzhkVar2 = zzhkVar8;
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
            if (r12 != 4) {
                if (r12 != 5) {
                    String str5 = (String) this.zzf;
                    a8.b(obj);
                    return str5;
                }
                zzhkVar3 = (zzhk) this.zza;
                str = (String) this.zzf;
                a8.b(obj);
                this.zzf = str;
                this.zza = null;
                this.zzb = 6;
                return zzhj.zzb(zzhkVar3, (zzhf) obj, this) == aVar ? str : aVar;
            }
            zzhkVar3 = (zzhk) this.zzf;
            a8.b(obj);
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
        zzhk zzhkVar9 = (zzhk) this.zza;
        zzhk zzhkVar10 = (zzhk) this.zzf;
        try {
            a8.b(obj);
            zzhkVar4 = zzhkVar9;
            zzhkVar5 = zzhkVar10;
        } catch (Exception unused) {
            r12 = zzhkVar10;
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
        this.zzf = zzhkVar5;
        this.zza = null;
        this.zzb = 2;
        obj = ((zzhf) obj).zza(zzhkVar4, this);
        r12 = zzhkVar5;
    }
}
