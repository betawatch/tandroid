package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
final class zzs extends yfb implements is4 {
    final /* synthetic */ zzu zza;
    final /* synthetic */ zzxn zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzu zzuVar, zzxn zzxnVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zza = zzuVar;
        this.zzb = zzxnVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new zzs(this.zza, this.zzb, zw2Var);
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((zzhk) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        zzcz zzczVar;
        ixe.b(obj);
        zzu zzuVar = this.zza;
        zzczVar = zzuVar.zza;
        if (!zzczVar.zzb(zzu.zzl(zzuVar))) {
            return new he9(new ge9(new zzcg(zzce.zzb, zzcd.zzar, null, null, 12, null)));
        }
        zzxn zzxnVar = this.zzb;
        if (!zzxnVar.zzR() || zzxnVar.zzg().zzf().zzn()) {
            return new he9(new ge9(new zzcg(zzce.zzb, zzcd.zzaD, null, null, 12, null)));
        }
        zzuVar.zzb = zzxnVar.zzg().zzf().zzm();
        pp5 pp5Var = new pp5();
        Application zzl = zzu.zzl(zzuVar);
        zzl.getClass();
        qa4 qa4Var = new qa4(zzl, qa4.s, wn.g, g05.c);
        wjb b = xjb.b();
        b.c = new a94[]{gjd.b};
        b.a = new uae(pp5Var, (byte) 1);
        b.d = (char) 34001;
        Task e = qa4Var.e(0, b.a());
        e.getClass();
        zzuVar.zzc = zzdf.zza(e);
        return new he9(f9c.a);
    }
}
