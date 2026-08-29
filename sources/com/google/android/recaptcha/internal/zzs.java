package com.google.android.recaptcha.internal;

import android.app.Application;
import bd.p;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;
import i7.c7;
import kotlin.jvm.internal.j;
import m7.e;
import qc.f;
import sc.c;
import uc.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    @Override // uc.a
    public final c create(Object obj, c cVar) {
        return new zzs(this.zza, this.zzb, cVar);
    }

    @Override // bd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((zzhk) obj, (c) obj2)).invokeSuspend(qc.i.a);
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        zzcz zzczVar;
        tc.a aVar = tc.a.a;
        c7.b(obj);
        zzu zzuVar = this.zza;
        zzczVar = zzuVar.zza;
        if (!zzczVar.zzb(zzu.zzl(zzuVar))) {
            return new f(c7.a(new zzcg(zzce.zzb, zzcd.zzar, null, null, 12, null)));
        }
        zzxn zzxnVar = this.zzb;
        if (!zzxnVar.zzR() || zzxnVar.zzg().zzf().zzn()) {
            return new f(c7.a(new zzcg(zzce.zzb, zzcd.zzaD, null, null, 12, null)));
        }
        zzuVar.zzb = zzxnVar.zzg().zzf().zzm();
        x7.c cVar = new x7.c();
        Application context = zzu.zzl(zzuVar);
        j.e(context, "context");
        e eVar = new e(context, e.k, b.i, com.google.android.gms.common.api.i.c);
        v b10 = w.b();
        b10.d = new w5.c[]{x7.f.b};
        b10.c = new ha.c(cVar, 27);
        b10.a = 34001;
        Task e10 = eVar.e(0, b10.b());
        j.d(e10, "doRead(...)");
        zzuVar.zzc = zzdf.zza(e10);
        return new f(qc.i.a);
    }
}
