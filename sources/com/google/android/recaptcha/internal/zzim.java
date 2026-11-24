package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzim extends ccb implements eq4 {
    public static final /* synthetic */ int zze = 0;
    int zza;
    final /* synthetic */ zziz zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzip zzd;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzim(zziz zzizVar, List list, zzip zzipVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzizVar;
        this.zzc = list;
        this.zzd = zzipVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzim zzimVar = new zzim(this.zzb, this.zzc, this.zzd, fw2Var);
        zzimVar.zzf = obj;
        return zzimVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzim) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        Object zzh;
        int i = this.zza;
        g5c g5cVar = g5c.a;
        qse.b(obj);
        if (i != 0) {
            return g5cVar;
        }
        ax2 ax2Var = (ax2) this.zzf;
        while (true) {
            zziz zzizVar = this.zzb;
            if (zzizVar.zza() < 0) {
                break;
            }
            List list = this.zzc;
            if (zzizVar.zza() < list.size()) {
                bt5 bt5Var = (bt5) ax2Var.c().get(pd5.c);
                if (!(bt5Var != null ? bt5Var.isActive() : true)) {
                    break;
                }
                zzzu zzzuVar = (zzzu) list.get(zzizVar.zza());
                try {
                    zzip.zzf(this.zzd, zzzuVar, zzizVar);
                } catch (Exception e) {
                    zzzuVar.zzk();
                    wod.a(zzzuVar.zzg());
                    List zzj = zzzuVar.zzj();
                    final zzip zzipVar = this.zzd;
                    yk2.f(zzj, null, null, null, new qp4(zzipVar) { // from class: com.google.android.recaptcha.internal.zzil
                        @Override // qp4
                        public final Object invoke(Object obj2) {
                            ((zzzt) obj2).getClass();
                            return "";
                        }
                    }, 31);
                    zziz zzizVar2 = this.zzb;
                    this.zza = 1;
                    zzh = zzipVar.zzh(e, zzizVar2, this);
                    bx2 bx2Var = bx2.a;
                    if (zzh == bx2Var) {
                        return bx2Var;
                    }
                }
            } else {
                break;
            }
        }
        return g5cVar;
    }
}
