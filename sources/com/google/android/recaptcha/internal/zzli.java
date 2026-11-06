package com.google.android.recaptcha.internal;

import af.b;
import android.webkit.WebView;
import gd.k;
import id.c;
import kd.j;
import rd.p;
import zd.t;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
final class zzli extends j implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzly zzc;
    final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzli(zzly zzlyVar, String str, c cVar) {
        super(2, cVar);
        this.zzc = zzlyVar;
        this.zzd = str;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzli(this.zzc, this.zzd, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzli) create((zzgr) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        String zza;
        jd.a aVar = jd.a.a;
        try {
            if (this.zzb != 0) {
                String str = (String) this.zza;
                b.c(obj);
                zza = str;
            } else {
                b.c(obj);
                zzly zzlyVar = this.zzc;
                zza = zzly.zzm(zzlyVar).zza();
                this.zza = zza;
                this.zzb = 1;
                obj = zzlyVar.zzv(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            ((WebView) obj).loadDataWithBaseURL(zza, this.zzd, "text/html", "utf-8", null);
            return k.a;
        } catch (Exception e10) {
            zzcg zzcgVar = new zzcg(zzce.zzb, zzcd.zzU, e10.getMessage(), null, 8, null);
            ((t) this.zzc.zzz()).Q(zzcgVar);
            throw zzcgVar;
        }
    }
}
