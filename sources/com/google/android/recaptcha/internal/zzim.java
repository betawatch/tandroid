package com.google.android.recaptcha.internal;

import g7.y5;
import hd.b0;
import hd.c0;
import hd.g1;
import java.util.List;
import pc.g;
import qc.c;
import rc.a;
import sc.i;
import zc.l;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        zzim zzimVar = new zzim(this.zzb, this.zzc, this.zzd, cVar);
        zzimVar.zzf = obj;
        return zzimVar;
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzim) create((c0) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        Object zzh;
        a aVar = a.a;
        int i9 = this.zza;
        oc.i iVar = oc.i.a;
        y5.b(obj);
        if (i9 != 0) {
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
                } catch (Exception e10) {
                    zzzuVar.zzk();
                    new Integer(zzzuVar.zzg());
                    List zzj = zzzuVar.zzj();
                    final zzip zzipVar = this.zzd;
                    g.h(zzj, null, null, null, new l(zzipVar) { // from class: com.google.android.recaptcha.internal.zzil
                        @Override // zc.l
                        public final Object invoke(Object obj2) {
                            kotlin.jvm.internal.i.b((zzzt) obj2);
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
        return iVar;
    }
}
