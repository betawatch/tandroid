package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;
import dd.p;
import k7.p7;
import kotlin.jvm.internal.j;
import o7.e;
import sc.f;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        return new zzs(this.zza, this.zzb, cVar);
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((zzhk) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        zzcz zzczVar;
        a aVar = a.a;
        p7.b(obj);
        zzu zzuVar = this.zza;
        zzczVar = zzuVar.zza;
        if (!zzczVar.zzb(zzu.zzl(zzuVar))) {
            return new f(p7.a(new zzcg(zzce.zzb, zzcd.zzar, null, null, 12, null)));
        }
        zzxn zzxnVar = this.zzb;
        if (!zzxnVar.zzR() || zzxnVar.zzg().zzf().zzn()) {
            return new f(p7.a(new zzcg(zzce.zzb, zzcd.zzaD, null, null, 12, null)));
        }
        zzuVar.zzb = zzxnVar.zzg().zzf().zzm();
        z7.c cVar = new z7.c();
        Application context = zzu.zzl(zzuVar);
        j.e(context, "context");
        e eVar = new e(context, e.k, b.i, com.google.android.gms.common.api.i.c);
        v e = w.e();
        e.d = new y5.c[]{z7.f.b};
        e.c = new ja.c(cVar, 25);
        e.a = 34001;
        Task e6 = eVar.e(0, e.e());
        j.d(e6, "doRead(...)");
        zzuVar.zzc = zzdf.zza(e6);
        return new f(sc.i.a);
    }
}
