package com.google.android.recaptcha.internal;

import android.webkit.WebView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzlv extends ccb implements eq4 {
    Object zza;
    Object zzb;
    Object zzc;
    Object zzd;
    int zze;
    final /* synthetic */ zzly zzf;
    final /* synthetic */ zzgr zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlv(zzly zzlyVar, zzgr zzgrVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzf = zzlyVar;
        this.zzg = zzgrVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzlv(this.zzf, this.zzg, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlv) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e1, code lost:
    
        return g5c.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00cc, code lost:
    
        if (((cp2) r10).h(r9) != r6) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b1, code lost:
    
        if (com.google.android.recaptcha.internal.zzhj.zzc(r0, (com.google.android.recaptcha.internal.zzhg) r10, r9) != r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a5, code lost:
    
        if (r10 != r6) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r0 != 4) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00ce, code lost:
    
        r10 = r9.zzf.zzn();
        r0 = com.google.android.recaptcha.internal.zzmc.zzc;
        r9.zze = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00dd, code lost:
    
        if (r10.zzc(r0, r9) == r6) goto L34;
     */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzly zzlyVar;
        zzxn zzxnVar;
        zzdo zzdoVar;
        zzxn zzxnVar2;
        zzxn zzxnVar3;
        zzly zzlyVar2;
        zzmf zzmfVar;
        zzmf zzmfVar2;
        zzgr zzgrVar;
        zzxn zzxnVar4;
        int i = this.zze;
        bx2 bx2Var = bx2.a;
        if (i == 0) {
            qse.b(obj);
            zzlyVar = this.zzf;
            zzxnVar = zzlyVar.zze;
            if (zzxnVar == null) {
                zzxnVar = null;
            }
            zzxnVar2 = zzlyVar.zze;
            if (zzxnVar2 == null) {
                zzxnVar2 = null;
            }
            zzdoVar = new zzdo(zzxnVar2.zzf());
            this.zza = zzlyVar;
            this.zzb = zzlyVar;
            this.zzc = zzxnVar;
            this.zzd = zzdoVar;
            this.zze = 1;
            Object zzv = zzlyVar.zzv(this);
            if (zzv != bx2Var) {
                zzxnVar3 = zzxnVar;
                obj = zzv;
                zzlyVar2 = zzlyVar;
            }
            return bx2Var;
        }
        if (i == 1) {
            zzdoVar = (zzdo) this.zzd;
            zzxnVar3 = (zzxn) this.zzc;
            zzlyVar = (zzly) this.zzb;
            zzlyVar2 = (zzly) this.zza;
            qse.b(obj);
        } else if (i != 2) {
            qse.b(obj);
            if (i != 3) {
            }
            zzly zzlyVar3 = this.zzf;
            wod.a(zzlyVar3.zzz().hashCode());
            bp2 zzz = zzlyVar3.zzz();
            this.zze = 4;
        } else {
            zzgrVar = (zzgr) this.zza;
            qse.b(obj);
            this.zza = null;
            this.zze = 3;
        }
        zzlyVar2.zzb = zzlyVar.zzB(zzxnVar3, zzdoVar, (WebView) obj);
        zzly zzlyVar4 = this.zzf;
        wod.a(zzlyVar4.zzz().hashCode());
        zzmfVar = zzlyVar4.zzg;
        zzmfVar.zzd();
        zzmfVar2 = zzlyVar4.zzg;
        zzmfVar2.zze();
        zzgrVar = this.zzg;
        zzxnVar4 = zzlyVar4.zze;
        if (zzxnVar4 == null) {
            zzxnVar4 = null;
        }
        this.zza = zzgrVar;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = 2;
        obj = new zzhg(new zzlh(zzlyVar4, zzxnVar4, null));
    }
}
