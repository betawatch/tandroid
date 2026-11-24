package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzlw extends ccb implements eq4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzly zzc;
    final /* synthetic */ zzgr zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlw(zzly zzlyVar, zzgr zzgrVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzc = zzlyVar;
        this.zzd = zzgrVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzlw(this.zzc, this.zzd, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlw) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (mve.a(20000, r12, r11) != r3) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
    
        if (r12.zzw(r11) != r3) goto L14;
     */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.zzb;
        bx2 bx2Var = bx2.a;
        try {
            if (i == 0) {
                qse.b(obj);
                zzly zzlyVar = this.zzc;
                this.zzb = 1;
            } else {
                if (i != 1) {
                    if (i == 2) {
                        qse.b(obj);
                        return g5c.a;
                    }
                    zzcg zzcgVar = (zzcg) this.zza;
                    qse.b(obj);
                    throw zzcgVar;
                }
                qse.b(obj);
            }
            zzlv zzlvVar = new zzlv(this.zzc, this.zzd, null);
            this.zzb = 2;
        } catch (Exception e) {
            e.getMessage();
            zzcg zza = zzh.zza(e, new zzcg(zzce.zzb, zzcd.zzV, e.getMessage(), null, 8, null));
            zzdj zzn = this.zzc.zzn();
            zzmc zzmcVar = zzmc.zza;
            this.zza = zza;
            this.zzb = 3;
            if (zzn.zzc(zzmcVar, this) != bx2Var) {
                throw zza;
            }
        }
    }
}
