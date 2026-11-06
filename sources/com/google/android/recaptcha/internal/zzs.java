package com.google.android.recaptcha.internal;

import af.b;
import android.app.Application;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.tasks.Task;
import d8.e;
import gd.g;
import gd.k;
import id.c;
import kd.j;
import o8.f;
import rd.p;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
final class zzs extends j implements p {
    final /* synthetic */ zzu zza;
    final /* synthetic */ zzxn zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzu zzuVar, zzxn zzxnVar, c cVar) {
        super(2, cVar);
        this.zza = zzuVar;
        this.zzb = zzxnVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzs(this.zza, this.zzb, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((zzhk) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        zzcz zzczVar;
        jd.a aVar = jd.a.a;
        b.c(obj);
        zzu zzuVar = this.zza;
        zzczVar = zzuVar.zza;
        if (!zzczVar.zzb(zzu.zzl(zzuVar))) {
            return new g(b.b(new zzcg(zzce.zzb, zzcd.zzar, null, null, 12, null)));
        }
        zzxn zzxnVar = this.zzb;
        if (!zzxnVar.zzR() || zzxnVar.zzg().zzf().zzn()) {
            return new g(b.b(new zzcg(zzce.zzb, zzcd.zzaD, null, null, 12, null)));
        }
        zzuVar.zzb = zzxnVar.zzg().zzf().zzm();
        o8.c cVar = new o8.c();
        Application context = zzu.zzl(zzuVar);
        kotlin.jvm.internal.j.e(context, "context");
        e eVar = new e(context, e.l, com.google.android.gms.common.api.b.j, i.c);
        s b10 = t.b();
        b10.d = new n6.c[]{f.b};
        b10.c = new d6.i(cVar, 17);
        b10.a = 34001;
        Task e10 = eVar.e(0, b10.a());
        kotlin.jvm.internal.j.d(e10, "doRead(...)");
        zzuVar.zzc = zzdf.zza(e10);
        return new g(k.a);
    }
}
