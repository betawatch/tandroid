package com.google.android.recaptcha.internal;

import dd.p;
import java.util.Iterator;
import java.util.List;
import k7.p7;
import ld.c0;
import sc.f;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
final class zzah extends i implements p {
    Object zza;
    Object zzb;
    Object zzc;
    int zzd;
    final /* synthetic */ zzxn zze;
    final /* synthetic */ zzaj zzf;
    final /* synthetic */ zzhk zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzah(zzxn zzxnVar, zzaj zzajVar, zzhk zzhkVar, c cVar) {
        super(2, cVar);
        this.zze = zzxnVar;
        this.zzf = zzajVar;
        this.zzg = zzhkVar;
    }

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        return new zzah(this.zze, this.zzf, this.zzg, cVar);
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzah) create((c0) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x00b2 -> B:5:0x0080). Please report as a decompilation issue!!! */
    @Override // wc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzxp zzk;
        List list;
        Iterator it;
        zzxp zzxpVar;
        Iterator it2;
        zzhk zzhkVar;
        a aVar = a.a;
        int i10 = this.zzd;
        if (i10 == 0) {
            p7.b(obj);
            zzxn zzxnVar = this.zze;
            if (!zzxnVar.zzU()) {
                return new f(p7.a(new zzcg(zzce.zzb, zzcd.zzab, null, null, 12, null)));
            }
            zzk = zzxnVar.zzk();
            if (zzk.zzi().zzn()) {
                return new f(p7.a(new zzcg(zzce.zzb, zzcd.zzab, null, null, 12, null)));
            }
            zzaj zzajVar = this.zzf;
            zzajVar.zzb = zzk.zzi();
            list = zzajVar.zza;
            it = list.iterator();
        } else {
            if (i10 == 1) {
                zzhkVar = (zzhk) this.zzc;
                it2 = (Iterator) this.zzb;
                zzxpVar = (zzxp) this.zza;
                p7.b(obj);
                this.zza = zzxpVar;
                this.zzb = it2;
                this.zzc = null;
                this.zzd = 2;
                if (zzhj.zzb(zzhkVar, (zzhf) obj, this) != aVar) {
                    it = it2;
                    zzk = zzxpVar;
                }
                return aVar;
            }
            it = (Iterator) this.zzb;
            zzk = (zzxp) this.zza;
            p7.b(obj);
        }
        if (!it.hasNext()) {
            return new f(sc.i.a);
        }
        zzar zzarVar = (zzar) it.next();
        zzhk zzhkVar2 = this.zzg;
        this.zza = zzk;
        this.zzb = it;
        this.zzc = zzhkVar2;
        this.zzd = 1;
        obj = zzarVar.zzd(zzk, this);
        if (obj != aVar) {
            zzxp zzxpVar2 = zzk;
            it2 = it;
            zzhkVar = zzhkVar2;
            zzxpVar = zzxpVar2;
            this.zza = zzxpVar;
            this.zzb = it2;
            this.zzc = null;
            this.zzd = 2;
            if (zzhj.zzb(zzhkVar, (zzhf) obj, this) != aVar) {
            }
        }
        return aVar;
    }
}
