package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import be.t;
import kd.c;
import ld.a;
import md.i;
import td.p;
import v7.i8;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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

    @Override // md.a
    public final c create(Object obj, c cVar) {
        return new zzli(this.zzc, this.zzd, cVar);
    }

    @Override // td.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzli) create((zzgr) obj, (c) obj2)).invokeSuspend(id.i.a);
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        String zza;
        a aVar = a.a;
        try {
            if (this.zzb != 0) {
                String str = (String) this.zza;
                i8.b(obj);
                zza = str;
            } else {
                i8.b(obj);
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
            return id.i.a;
        } catch (Exception e) {
            zzcg zzcgVar = new zzcg(zzce.zzb, zzcd.zzU, e.getMessage(), null, 8, null);
            ((t) this.zzc.zzz()).L(zzcgVar);
            throw zzcgVar;
        }
    }
}
