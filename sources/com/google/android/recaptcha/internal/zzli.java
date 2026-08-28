package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import g7.y5;
import hd.t;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzli extends i implements p {
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

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        return new zzli(this.zzc, this.zzd, cVar);
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzli) create((zzgr) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        String zza;
        a aVar = a.a;
        try {
            if (this.zzb != 0) {
                String str = (String) this.zza;
                y5.b(obj);
                zza = str;
            } else {
                y5.b(obj);
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
            return oc.i.a;
        } catch (Exception e10) {
            zzcg zzcgVar = new zzcg(zzce.zzb, zzcd.zzU, e10.getMessage(), null, 8, null);
            ((t) this.zzc.zzz()).L(zzcgVar);
            throw zzcgVar;
        }
    }
}
