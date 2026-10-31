package com.google.android.recaptcha.internal;

import a8.f;
import ad.g;
import android.app.Application;
import cd.c;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;
import dd.a;
import ed.j;
import kotlin.jvm.internal.i;
import l9.b;
import ld.p;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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

    @Override // ed.a
    public final c create(Object obj, c cVar) {
        return new zzs(this.zza, this.zzb, cVar);
    }

    @Override // ld.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((zzhk) obj, (c) obj2)).invokeSuspend(ad.j.a);
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        zzcz zzczVar;
        a aVar = a.a;
        b.b(obj);
        zzu zzuVar = this.zza;
        zzczVar = zzuVar.zza;
        if (!zzczVar.zzb(zzu.zzl(zzuVar))) {
            return new g(b.a(new zzcg(zzce.zzb, zzcd.zzar, null, null, 12, null)));
        }
        zzxn zzxnVar = this.zzb;
        if (!zzxnVar.zzR() || zzxnVar.zzg().zzf().zzn()) {
            return new g(b.a(new zzcg(zzce.zzb, zzcd.zzaD, null, null, 12, null)));
        }
        zzuVar.zzb = zzxnVar.zzg().zzf().zzm();
        l8.c cVar = new l8.c();
        Application context = zzu.zzl(zzuVar);
        i.e(context, "context");
        f fVar = new f(context, f.k, com.google.android.gms.common.api.b.k, com.google.android.gms.common.api.i.c);
        v b10 = w.b();
        b10.d = new k6.c[]{l8.f.b};
        b10.c = new a6.i(cVar, 2);
        b10.a = 34001;
        Task e = fVar.e(0, b10.a());
        i.d(e, "doRead(...)");
        zzuVar.zzc = zzdf.zza(e);
        return new g(ad.j.a);
    }
}
