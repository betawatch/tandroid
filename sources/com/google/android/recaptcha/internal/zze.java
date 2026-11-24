package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zze extends ccb implements eq4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ zzg zzd;
    final /* synthetic */ String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zze(zzgr zzgrVar, zzg zzgVar, String str, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzc = zzgrVar;
        this.zzd = zzgVar;
        this.zze = str;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zze(this.zzc, this.zzd, this.zze, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zze) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r5 != r2) goto L10;
     */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        int i = this.zzb;
        bx2 bx2Var = bx2.a;
        if (i == 0) {
            qse.b(obj);
            zzgrVar = this.zzc;
            zzg zzgVar = this.zzd;
            String str = this.zze;
            this.zza = zzgrVar;
            this.zzb = 1;
            obj = zzgVar.zzb(str, this);
        } else {
            if (i != 1) {
                qse.b(obj);
                return obj;
            }
            zzgrVar = (zzgr) this.zza;
            qse.b(obj);
        }
        this.zza = null;
        this.zzb = 2;
        Object zza = ((zzhg) obj).zza(zzgrVar.zza(), this);
        return zza != bx2Var ? zza : bx2Var;
    }
}
