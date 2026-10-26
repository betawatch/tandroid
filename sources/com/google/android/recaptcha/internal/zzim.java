package com.google.android.recaptcha.internal;

import a8.jd;
import ce.b0;
import ce.c0;
import ce.g1;
import java.util.List;
import kd.g;
import ld.c;
import md.a;
import nd.i;
import ud.l;
import ud.p;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
final class zzim extends i implements p {
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

    @Override // nd.a
    public final c create(Object obj, c cVar) {
        zzim zzimVar = new zzim(this.zzb, this.zzc, this.zzd, cVar);
        zzimVar.zzf = obj;
        return zzimVar;
    }

    @Override // ud.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzim) create((c0) obj, (c) obj2)).invokeSuspend(jd.i.a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        Object zzh;
        a aVar = a.a;
        int i10 = this.zza;
        jd.i iVar = jd.i.a;
        jd.b(obj);
        if (i10 != 0) {
            return iVar;
        }
        c0 c0Var = (c0) this.zzf;
        while (true) {
            zziz zzizVar = this.zzb;
            if (zzizVar.zza() < 0) {
                break;
            }
            List list = this.zzc;
            if (zzizVar.zza() < list.size()) {
                g1 g1Var = (g1) c0Var.c().get(b0.b);
                if (!(g1Var != null ? g1Var.isActive() : true)) {
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
                    g.h(zzj, null, null, null, new l(zzipVar) { // from class: com.google.android.recaptcha.internal.zzil
                        @Override // ud.l
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
        return iVar;
    }
}
