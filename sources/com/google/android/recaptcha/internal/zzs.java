package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;
import g7.y5;
import k7.e;
import oc.f;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzs extends i implements p {
    final /* synthetic */ zzu zza;
    final /* synthetic */ zzxn zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzu zzuVar, zzxn zzxnVar, c cVar) {
        super(2, cVar);
        this.zza = zzuVar;
        this.zzb = zzxnVar;
    }

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        return new zzs(this.zza, this.zzb, cVar);
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((zzhk) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        zzcz zzczVar;
        a aVar = a.a;
        y5.b(obj);
        zzu zzuVar = this.zza;
        zzczVar = zzuVar.zza;
        if (!zzczVar.zzb(zzu.zzl(zzuVar))) {
            return new f(y5.a(new zzcg(zzce.zzb, zzcd.zzar, null, null, 12, null)));
        }
        zzxn zzxnVar = this.zzb;
        if (!zzxnVar.zzR() || zzxnVar.zzg().zzf().zzn()) {
            return new f(y5.a(new zzcg(zzce.zzb, zzcd.zzaD, null, null, 12, null)));
        }
        zzuVar.zzb = zzxnVar.zzg().zzf().zzm();
        v7.c cVar = new v7.c();
        Application context = zzu.zzl(zzuVar);
        kotlin.jvm.internal.i.e(context, "context");
        e eVar = new e(context, e.k, b.g, com.google.android.gms.common.api.i.c);
        v b10 = w.b();
        b10.d = new u5.c[]{v7.f.b};
        b10.c = new xa.c(cVar, 22);
        b10.a = 34001;
        Task e10 = eVar.e(0, b10.b());
        kotlin.jvm.internal.i.d(e10, "doRead(...)");
        zzuVar.zzc = zzdf.zza(e10);
        return new f(oc.i.a);
    }
}
