package com.google.android.recaptcha.internal;

import af.b;
import gd.k;
import hd.f;
import id.c;
import java.util.List;
import kd.g;
import kd.j;
import rd.l;
import rd.p;
import zd.a1;
import zd.y;
import zd.z;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzim zzimVar = new zzim(this.zzb, this.zzc, this.zzd, cVar);
        zzimVar.zzf = obj;
        return zzimVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzim) create((z) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        Object zzh;
        jd.a aVar = jd.a.a;
        int i7 = this.zza;
        k kVar = k.a;
        b.c(obj);
        if (i7 != 0) {
            return kVar;
        }
        z zVar = (z) this.zzf;
        while (true) {
            zziz zzizVar = this.zzb;
            if (zzizVar.zza() < 0) {
                break;
            }
            List list = this.zzc;
            if (zzizVar.zza() < list.size()) {
                a1 a1Var = (a1) zVar.c().get(y.b);
                if (!(a1Var != null ? a1Var.isActive() : true)) {
                    break;
                }
                zzzu zzzuVar = (zzzu) list.get(zzizVar.zza());
                try {
                    zzip.zzf(this.zzd, zzzuVar, zzizVar);
                } catch (Exception e10) {
                    zzzuVar.zzk();
                    g.a(zzzuVar.zzg());
                    List zzj = zzzuVar.zzj();
                    final zzip zzipVar = this.zzd;
                    f.g(zzj, null, null, null, new l(zzipVar) { // from class: com.google.android.recaptcha.internal.zzil
                        @Override // rd.l
                        public final Object invoke(Object obj2) {
                            kotlin.jvm.internal.j.b((zzzt) obj2);
                            return "";
                        }
                    }, 31);
                    zziz zzizVar2 = this.zzb;
                    this.zza = 1;
                    zzh = zzipVar.zzh(e10, zzizVar2, this);
                    if (zzh == aVar) {
                        return aVar;
                    }
                }
            } else {
                break;
            }
        }
        return kVar;
    }
}
