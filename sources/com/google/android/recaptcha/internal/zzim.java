package com.google.android.recaptcha.internal;

import bd.i;
import cd.c;
import dd.a;
import ed.j;
import java.util.List;
import l9.b;
import ld.l;
import ld.p;
import td.b0;
import td.c0;
import td.f1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
final class zzim extends j implements p {
    public static final /* synthetic */ int zze = 0;
    int zza;
    final /* synthetic */ zziz zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzip zzd;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzim(zziz zzizVar, List list, zzip zzipVar, c cVar) {
        super(2, cVar);
        this.zzb = zzizVar;
        this.zzc = list;
        this.zzd = zzipVar;
    }

    @Override // ed.a
    public final c create(Object obj, c cVar) {
        zzim zzimVar = new zzim(this.zzb, this.zzc, this.zzd, cVar);
        zzimVar.zzf = obj;
        return zzimVar;
    }

    @Override // ld.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzim) create((c0) obj, (c) obj2)).invokeSuspend(ad.j.a);
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        Object zzh;
        a aVar = a.a;
        int i10 = this.zza;
        ad.j jVar = ad.j.a;
        b.b(obj);
        if (i10 != 0) {
            return jVar;
        }
        c0 c0Var = (c0) this.zzf;
        while (true) {
            zziz zzizVar = this.zzb;
            if (zzizVar.zza() < 0) {
                break;
            }
            List list = this.zzc;
            if (zzizVar.zza() < list.size()) {
                f1 f1Var = (f1) c0Var.c().get(b0.b);
                if (!(f1Var != null ? f1Var.isActive() : true)) {
                    break;
                }
                zzzu zzzuVar = (zzzu) list.get(zzizVar.zza());
                try {
                    zzip.zzf(this.zzd, zzzuVar, zzizVar);
                } catch (Exception e) {
                    zzzuVar.zzk();
                    new Integer(zzzuVar.zzg());
                    List zzj = zzzuVar.zzj();
                    final zzip zzipVar = this.zzd;
                    i.h(zzj, null, null, null, new l(zzipVar) { // from class: com.google.android.recaptcha.internal.zzil
                        @Override // ld.l
                        public final Object invoke(Object obj2) {
                            kotlin.jvm.internal.i.b((zzzt) obj2);
                            return "";
                        }
                    }, 31);
                    zziz zzizVar2 = this.zzb;
                    this.zza = 1;
                    zzh = zzipVar.zzh(e, zzizVar2, this);
                    if (zzh == aVar) {
                        return aVar;
                    }
                }
            } else {
                break;
            }
        }
        return jVar;
    }
}
