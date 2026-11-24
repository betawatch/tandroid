package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzhw extends ccb implements eq4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzib zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ String zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhw(zzib zzibVar, String str, String str2, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzc = zzibVar;
        this.zzd = str;
        this.zze = str2;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzhw zzhwVar = new zzhw(this.zzc, this.zzd, this.zze, fw2Var);
        zzhwVar.zzf = obj;
        return zzhwVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhw) create((zzhk) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
    
        if (r11 != r7) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    @Override // of0
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
        ?? r0 = this.zzb;
        bx2 bx2Var = bx2.a;
        if (r0 == 0) {
            qse.b(obj);
            zzhk zzhkVar6 = (zzhk) this.zzf;
            zzib zzibVar = this.zzc;
            String str2 = this.zzd;
            this.zzf = zzhkVar6;
            this.zza = zzhkVar6;
            this.zzb = 1;
            obj = new zzhf(25, new zzhx(zzibVar, str2, null), null);
            if (obj != bx2Var) {
                zzhkVar4 = zzhkVar6;
                zzhkVar5 = zzhkVar6;
            }
        }
        if (r0 != 1) {
            if (r0 == 2) {
                zzhk zzhkVar7 = (zzhk) this.zzf;
                qse.b(obj);
                r0 = zzhkVar7;
                return (String) obj;
            }
            if (r0 == 3) {
                zzhk zzhkVar8 = (zzhk) this.zza;
                zzhkVar = (zzhk) this.zzf;
                qse.b(obj);
                zzhkVar2 = zzhkVar8;
                this.zzf = zzhkVar;
                this.zza = null;
                this.zzb = 4;
                obj = ((zzhf) obj).zza(zzhkVar2, this);
                if (obj != bx2Var) {
                    zzhkVar3 = zzhkVar;
                    zzib zzibVar2 = this.zzc;
                    String str3 = this.zzd;
                    String str4 = (String) obj;
                    this.zzf = str4;
                    this.zza = zzhkVar3;
                    this.zzb = 5;
                    zzhfVar = new zzhf(24, new zzhy(zzibVar2, str3, str4, null), null);
                    if (zzhfVar != bx2Var) {
                    }
                }
            }
            if (r0 != 4) {
                if (r0 != 5) {
                    String str5 = (String) this.zzf;
                    qse.b(obj);
                    return str5;
                }
                zzhkVar3 = (zzhk) this.zza;
                str = (String) this.zzf;
                qse.b(obj);
                this.zzf = str;
                this.zza = null;
                this.zzb = 6;
                return zzhj.zzb(zzhkVar3, (zzhf) obj, this) == bx2Var ? str : bx2Var;
            }
            zzhkVar3 = (zzhk) this.zzf;
            qse.b(obj);
            zzib zzibVar22 = this.zzc;
            String str32 = this.zzd;
            String str42 = (String) obj;
            this.zzf = str42;
            this.zza = zzhkVar3;
            this.zzb = 5;
            zzhfVar = new zzhf(24, new zzhy(zzibVar22, str32, str42, null), null);
            if (zzhfVar != bx2Var) {
                str = str42;
                obj = zzhfVar;
                this.zzf = str;
                this.zza = null;
                this.zzb = 6;
                if (zzhj.zzb(zzhkVar3, (zzhf) obj, this) == bx2Var) {
                }
            }
        }
        zzhk zzhkVar9 = (zzhk) this.zza;
        zzhk zzhkVar10 = (zzhk) this.zzf;
        try {
            qse.b(obj);
            zzhkVar4 = zzhkVar9;
            zzhkVar5 = zzhkVar10;
        } catch (Exception unused) {
            r0 = zzhkVar10;
            zzib zzibVar3 = this.zzc;
            zzib.zza(zzibVar3).zzb();
            String str6 = this.zze;
            this.zzf = r0;
            this.zza = r0;
            this.zzb = 3;
            obj = new zzhf(23, new zzhu(zzibVar3, str6, null), null);
            if (obj != bx2Var) {
                zzhkVar = r0;
                zzhkVar2 = r0;
                this.zzf = zzhkVar;
                this.zza = null;
                this.zzb = 4;
                obj = ((zzhf) obj).zza(zzhkVar2, this);
                if (obj != bx2Var) {
                }
            }
        }
        this.zzf = zzhkVar5;
        this.zza = null;
        this.zzb = 2;
        obj = ((zzhf) obj).zza(zzhkVar4, this);
        r0 = zzhkVar5;
    }
}
