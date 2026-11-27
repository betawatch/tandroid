package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzim extends yfb implements is4 {
    public static final /* synthetic */ int zze = 0;
    int zza;
    final /* synthetic */ zziz zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzip zzd;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzim(zziz zzizVar, List list, zzip zzipVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = zzizVar;
        this.zzc = list;
        this.zzd = zzipVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        zzim zzimVar = new zzim(this.zzb, this.zzc, this.zzd, zw2Var);
        zzimVar.zzf = obj;
        return zzimVar;
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzim) create((ux2) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        Object zzh;
        int i = this.zza;
        f9c f9cVar = f9c.a;
        ixe.b(obj);
        if (i != 0) {
            return f9cVar;
        }
        ux2 ux2Var = (ux2) this.zzf;
        while (true) {
            zziz zzizVar = this.zzb;
            if (zzizVar.zza() < 0) {
                break;
            }
            List list = this.zzc;
            if (zzizVar.zza() < list.size()) {
                ev5 ev5Var = (ev5) ux2Var.c().get(qf5.c);
                if (!(ev5Var != null ? ev5Var.isActive() : true)) {
                    break;
                }
                zzzu zzzuVar = (zzzu) list.get(zzizVar.zza());
                try {
                    zzip.zzf(this.zzd, zzzuVar, zzizVar);
                } catch (Exception e) {
                    zzzuVar.zzk();
                    mtd.a(zzzuVar.zzg());
                    List zzj = zzzuVar.zzj();
                    final zzip zzipVar = this.zzd;
                    sl2.f(zzj, null, null, null, new ur4(zzipVar) { // from class: com.google.android.recaptcha.internal.zzil
                        @Override // ur4
                        public final Object invoke(Object obj2) {
                            ((zzzt) obj2).getClass();
                            return "";
                        }
                    }, 31);
                    zziz zzizVar2 = this.zzb;
                    this.zza = 1;
                    zzh = zzipVar.zzh(e, zzizVar2, this);
                    vx2 vx2Var = vx2.a;
                    if (zzh == vx2Var) {
                        return vx2Var;
                    }
                }
            } else {
                break;
            }
        }
        return f9cVar;
    }
}
