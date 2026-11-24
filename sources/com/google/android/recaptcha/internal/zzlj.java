package com.google.android.recaptcha.internal;

import android.webkit.WebView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzlj extends ccb implements eq4 {
    int zza;
    final /* synthetic */ zzly zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlj(zzly zzlyVar, String str, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzlyVar;
        this.zzc = str;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzlj(this.zzb, this.zzc, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlj) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        qse.b(obj);
        if (i == 0) {
            zzly zzlyVar = this.zzb;
            this.zza = 1;
            obj = zzlyVar.zzv(this);
            bx2 bx2Var = bx2.a;
            if (obj == bx2Var) {
                return bx2Var;
            }
        }
        ((WebView) obj).evaluateJavascript("recaptcha.m.Main.execute(\"" + this.zzc + "\")", null);
        return g5c.a;
    }
}
