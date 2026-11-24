package com.google.android.recaptcha.internal;

import android.webkit.WebView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzli extends ccb implements eq4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzly zzc;
    final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzli(zzly zzlyVar, String str, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzc = zzlyVar;
        this.zzd = str;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzli(this.zzc, this.zzd, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzli) create((zzgr) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        String zza;
        try {
            if (this.zzb != 0) {
                zza = (String) this.zza;
                qse.b(obj);
            } else {
                qse.b(obj);
                zzly zzlyVar = this.zzc;
                zza = zzly.zzm(zzlyVar).zza();
                this.zza = zza;
                this.zzb = 1;
                obj = zzlyVar.zzv(this);
                bx2 bx2Var = bx2.a;
                if (obj == bx2Var) {
                    return bx2Var;
                }
            }
            ((WebView) obj).loadDataWithBaseURL(zza, this.zzd, "text/html", "utf-8", null);
            return g5c.a;
        } catch (Exception e) {
            zzcg zzcgVar = new zzcg(zzce.zzb, zzcd.zzU, e.getMessage(), null, 8, null);
            ((cp2) this.zzc.zzz()).P(zzcgVar);
            throw zzcgVar;
        }
    }
}
