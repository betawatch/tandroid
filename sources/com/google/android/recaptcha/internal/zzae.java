package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzae extends ccb implements eq4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzhk zzc;
    final /* synthetic */ zzar zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ List zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzae(zzhk zzhkVar, zzar zzarVar, String str, List list, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzc = zzhkVar;
        this.zzd = zzarVar;
        this.zze = str;
        this.zzf = list;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzae(this.zzc, this.zzd, this.zze, this.zzf, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzae) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r5 != r2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r5 != r2) goto L9;
     */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        int i = this.zzb;
        bx2 bx2Var = bx2.a;
        if (i == 0) {
            qse.b(obj);
            zzhkVar = this.zzc;
            zzar zzarVar = this.zzd;
            String str = this.zze;
            this.zza = zzhkVar;
            this.zzb = 1;
            obj = zzarVar.zzc(str, this);
        } else {
            if (i != 1) {
                qse.b(obj);
                this.zzf.add((zzat) obj);
                return g5c.a;
            }
            zzhkVar = (zzhk) this.zza;
            qse.b(obj);
        }
        this.zza = null;
        this.zzb = 2;
        obj = ((zzhg) obj).zza(zzhkVar, this);
    }
}
