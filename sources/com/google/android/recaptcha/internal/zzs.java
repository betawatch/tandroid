package com.google.android.recaptcha.internal;

import a8.jd;
import android.app.Application;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.tasks.Task;
import jd.f;
import ld.c;
import md.a;
import nd.i;
import ud.p;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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

    @Override // nd.a
    public final c create(Object obj, c cVar) {
        return new zzs(this.zza, this.zzb, cVar);
    }

    @Override // ud.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((zzhk) obj, (c) obj2)).invokeSuspend(jd.i.a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        zzcz zzczVar;
        a aVar = a.a;
        jd.b(obj);
        zzu zzuVar = this.zza;
        zzczVar = zzuVar.zza;
        if (!zzczVar.zzb(zzu.zzl(zzuVar))) {
            return new f(jd.a(new zzcg(zzce.zzb, zzcd.zzar, null, null, 12, null)));
        }
        zzxn zzxnVar = this.zzb;
        if (!zzxnVar.zzR() || zzxnVar.zzg().zzf().zzn()) {
            return new f(jd.a(new zzcg(zzce.zzb, zzcd.zzaD, null, null, 12, null)));
        }
        zzuVar.zzb = zzxnVar.zzg().zzf().zzm();
        m8.c cVar = new m8.c();
        Application context = zzu.zzl(zzuVar);
        kotlin.jvm.internal.i.e(context, "context");
        b8.f fVar = new b8.f(context, b8.f.k, b.j, com.google.android.gms.common.api.i.c);
        u b10 = v.b();
        b10.d = new l6.c[]{m8.f.b};
        b10.c = new za.c(cVar, 5);
        b10.a = 34001;
        Task e = fVar.e(0, b10.a());
        kotlin.jvm.internal.i.d(e, "doRead(...)");
        zzuVar.zzc = zzdf.zza(e);
        return new f(jd.i.a);
    }
}
