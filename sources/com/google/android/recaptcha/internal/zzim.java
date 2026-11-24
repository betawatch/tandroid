package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzim extends eeb implements fs4 {
    public static final /* synthetic */ int zze = 0;
    int zza;
    final /* synthetic */ zziz zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzip zzd;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzim(zziz zzizVar, List list, zzip zzipVar, px2 px2Var) {
        super(2, px2Var);
        this.zzb = zzizVar;
        this.zzc = list;
        this.zzd = zzipVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzim zzimVar = new zzim(this.zzb, this.zzc, this.zzd, px2Var);
        zzimVar.zzf = obj;
        return zzimVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzim) create((ky2) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        Object zzh;
        int i = this.zza;
        g7c g7cVar = g7c.a;
        tue.b(obj);
        if (i != 0) {
            return g7cVar;
        }
        ky2 ky2Var = (ky2) this.zzf;
        while (true) {
            zziz zzizVar = this.zzb;
            if (zzizVar.zza() < 0) {
                break;
            }
            List list = this.zzc;
            if (zzizVar.zza() < list.size()) {
                av5 av5Var = (av5) ky2Var.c().get(nf5.c);
                if (!(av5Var != null ? av5Var.isActive() : true)) {
                    break;
                }
                zzzu zzzuVar = (zzzu) list.get(zzizVar.zza());
                try {
                    zzip.zzf(this.zzd, zzzuVar, zzizVar);
                } catch (Exception e) {
                    zzzuVar.zzk();
                    zqd.a(zzzuVar.zzg());
                    List zzj = zzzuVar.zzj();
                    final zzip zzipVar = this.zzd;
                    km2.f(zzj, null, null, null, new rr4(zzipVar) { // from class: com.google.android.recaptcha.internal.zzil
                        @Override // rr4
                        public final Object invoke(Object obj2) {
                            ((zzzt) obj2).getClass();
                            return "";
                        }
                    }, 31);
                    zziz zzizVar2 = this.zzb;
                    this.zza = 1;
                    zzh = zzipVar.zzh(e, zzizVar2, this);
                    ly2 ly2Var = ly2.a;
                    if (zzh == ly2Var) {
                        return ly2Var;
                    }
                }
            } else {
                break;
            }
        }
        return g7cVar;
    }
}
