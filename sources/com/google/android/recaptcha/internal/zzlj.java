package com.google.android.recaptcha.internal;

import af.b;
import android.webkit.WebView;
import gd.k;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import zd.z;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
final class zzlj extends j implements p {
    int zza;
    final /* synthetic */ zzly zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlj(zzly zzlyVar, String str, c cVar) {
        super(2, cVar);
        this.zzb = zzlyVar;
        this.zzc = str;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzlj(this.zzb, this.zzc, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlj) create((z) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i7 = this.zza;
        b.c(obj);
        if (i7 == 0) {
            zzly zzlyVar = this.zzb;
            this.zza = 1;
            obj = zzlyVar.zzv(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        ((WebView) obj).evaluateJavascript("recaptcha.m.Main.execute(\"" + this.zzc + "\")", null);
        return k.a;
    }
}
