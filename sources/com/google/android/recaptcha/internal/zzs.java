package com.google.android.recaptcha.internal;

import ad.p;
import android.app.Application;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;
import h7.k6;
import kotlin.jvm.internal.j;
import l7.e;
import pc.f;
import rc.c;
import tc.i;
import w7.g;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    @Override // tc.a
    public final c create(Object obj, c cVar) {
        return new zzs(this.zza, this.zzb, cVar);
    }

    @Override // ad.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((zzhk) obj, (c) obj2)).invokeSuspend(pc.i.a);
    }

    @Override // tc.a
    public final Object invokeSuspend(Object obj) {
        zzcz zzczVar;
        sc.a aVar = sc.a.a;
        k6.b(obj);
        zzu zzuVar = this.zza;
        zzczVar = zzuVar.zza;
        if (!zzczVar.zzb(zzu.zzl(zzuVar))) {
            return new f(k6.a(new zzcg(zzce.zzb, zzcd.zzar, null, null, 12, null)));
        }
        zzxn zzxnVar = this.zzb;
        if (!zzxnVar.zzR() || zzxnVar.zzg().zzf().zzn()) {
            return new f(k6.a(new zzcg(zzce.zzb, zzcd.zzaD, null, null, 12, null)));
        }
        zzuVar.zzb = zzxnVar.zzg().zzf().zzm();
        w7.c cVar = new w7.c();
        Application context = zzu.zzl(zzuVar);
        j.e(context, "context");
        e eVar = new e(context, e.k, b.g, com.google.android.gms.common.api.i.c);
        v b10 = w.b();
        b10.d = new v5.c[]{g.b};
        b10.c = new ae.b(cVar, 23);
        b10.a = 34001;
        Task e9 = eVar.e(0, b10.b());
        j.d(e9, "doRead(...)");
        zzuVar.zzc = zzdf.zza(e9);
        return new f(pc.i.a);
    }
}
