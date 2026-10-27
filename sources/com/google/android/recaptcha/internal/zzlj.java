package com.google.android.recaptcha.internal;

import a8.jd;
import android.webkit.WebView;
import ce.c0;
import ld.c;
import md.a;
import nd.i;
import ud.p;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
final class zzlj extends i implements p {
    int zza;
    final /* synthetic */ zzly zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlj(zzly zzlyVar, String str, c cVar) {
        super(2, cVar);
        this.zzb = zzlyVar;
        this.zzc = str;
    }

    @Override // nd.a
    public final c create(Object obj, c cVar) {
        return new zzlj(this.zzb, this.zzc, cVar);
    }

    @Override // ud.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlj) create((c0) obj, (c) obj2)).invokeSuspend(jd.i.a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        jd.b(obj);
        if (i10 == 0) {
            zzly zzlyVar = this.zzb;
            this.zza = 1;
            obj = zzlyVar.zzv(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        ((WebView) obj).evaluateJavascript("recaptcha.m.Main.execute(\"" + this.zzc + "\")", null);
        return jd.i.a;
    }
}
