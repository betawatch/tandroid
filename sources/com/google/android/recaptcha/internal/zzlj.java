package com.google.android.recaptcha.internal;

import android.webkit.WebView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class zzlj extends yfb implements is4 {
    int zza;
    final /* synthetic */ zzly zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlj(zzly zzlyVar, String str, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = zzlyVar;
        this.zzc = str;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new zzlj(this.zzb, this.zzc, zw2Var);
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlj) create((ux2) obj, (zw2) obj2)).invokeSuspend(g9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        ixe.b(obj);
        if (i == 0) {
            zzly zzlyVar = this.zzb;
            this.zza = 1;
            obj = zzlyVar.zzv(this);
            vx2 vx2Var = vx2.a;
            if (obj == vx2Var) {
                return vx2Var;
            }
        }
        ((WebView) obj).evaluateJavascript("recaptcha.m.Main.execute(\"" + this.zzc + "\")", null);
        return g9c.a;
    }
}
