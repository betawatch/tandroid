package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzan extends ccb implements eq4 {
    int zza;
    final /* synthetic */ zzar zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzan(zzar zzarVar, String str, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzarVar;
        this.zzc = str;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzan zzanVar = new zzan(this.zzb, this.zzc, fw2Var);
        zzanVar.zzd = obj;
        return zzanVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzan) create((zzgr) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r5 != r2) goto L10;
     */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        int i = this.zza;
        bx2 bx2Var = bx2.a;
        if (i == 0) {
            qse.b(obj);
            zzgrVar = (zzgr) this.zzd;
            zzar zzarVar = this.zzb;
            String str = this.zzc;
            this.zzd = zzgrVar;
            this.zza = 1;
            obj = zzarVar.zze(str, this);
        } else {
            if (i != 1) {
                qse.b(obj);
                return obj;
            }
            zzgrVar = (zzgr) this.zzd;
            qse.b(obj);
        }
        this.zzd = null;
        this.zza = 2;
        Object zza = ((zzhg) obj).zza(zzgrVar.zza(), this);
        return zza != bx2Var ? zza : bx2Var;
    }
}
