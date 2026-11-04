package com.google.android.recaptcha.internal;

import b8.ib;
import dd.k;
import fd.c;
import hd.g;
import hd.j;
import java.util.List;
import od.l;
import od.p;
import wd.a1;
import wd.y;
import wd.z;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    @Override // hd.a
    public final c create(Object obj, c cVar) {
        zzim zzimVar = new zzim(this.zzb, this.zzc, this.zzd, cVar);
        zzimVar.zzf = obj;
        return zzimVar;
    }

    @Override // od.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzim) create((z) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        Object zzh;
        gd.a aVar = gd.a.a;
        int i3 = this.zza;
        k kVar = k.a;
        ib.b(obj);
        if (i3 != 0) {
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
                    ed.g.g(zzj, null, null, null, new l(zzipVar) { // from class: com.google.android.recaptcha.internal.zzil
                        @Override // od.l
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
