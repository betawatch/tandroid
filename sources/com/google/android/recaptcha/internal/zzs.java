package com.google.android.recaptcha.internal;

import android.app.Application;
import b8.ib;
import c8.e;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.tasks.Task;
import dd.g;
import dd.k;
import fd.c;
import hd.j;
import n8.f;
import od.p;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    @Override // hd.a
    public final c create(Object obj, c cVar) {
        return new zzs(this.zza, this.zzb, cVar);
    }

    @Override // od.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((zzhk) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        zzcz zzczVar;
        gd.a aVar = gd.a.a;
        ib.b(obj);
        zzu zzuVar = this.zza;
        zzczVar = zzuVar.zza;
        if (!zzczVar.zzb(zzu.zzl(zzuVar))) {
            return new g(ib.a(new zzcg(zzce.zzb, zzcd.zzar, null, null, 12, null)));
        }
        zzxn zzxnVar = this.zzb;
        if (!zzxnVar.zzR() || zzxnVar.zzg().zzf().zzn()) {
            return new g(ib.a(new zzcg(zzce.zzb, zzcd.zzaD, null, null, 12, null)));
        }
        zzuVar.zzb = zzxnVar.zzg().zzf().zzm();
        n8.c cVar = new n8.c();
        Application context = zzu.zzl(zzuVar);
        kotlin.jvm.internal.j.e(context, "context");
        e eVar = new e(context, e.l, b.j, i.c);
        s b10 = t.b();
        b10.d = new m6.c[]{f.b};
        b10.c = new android.support.v4.media.c(cVar, 7);
        b10.a = 34001;
        Task e10 = eVar.e(0, b10.a());
        kotlin.jvm.internal.j.d(e10, "doRead(...)");
        zzuVar.zzc = zzdf.zza(e10);
        return new g(k.a);
    }
}
