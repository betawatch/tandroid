package com.google.android.recaptcha.internal;

import dd.p;
import k7.p7;
import ld.e0;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
final class zzlu extends i implements p {
    int zza;
    final /* synthetic */ zzly zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlu(zzly zzlyVar, c cVar) {
        super(2, cVar);
        this.zzb = zzlyVar;
    }

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        zzlu zzluVar = new zzlu(this.zzb, cVar);
        zzluVar.zzc = obj;
        return zzluVar;
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlu) create((zzhk) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        zzhk zzhkVar2;
        zzcr zzD;
        a aVar = a.a;
        int i10 = this.zza;
        sc.i iVar = sc.i.a;
        if (i10 == 0) {
            p7.b(obj);
            zzhk zzhkVar3 = (zzhk) this.zzc;
            zzdj zzn = this.zzb.zzn();
            zzmc[] zzmcVarArr = {zzmc.zzd, zzmc.zzc, zzmc.zzb};
            this.zzc = zzhkVar3;
            this.zza = 1;
            Object zzb = zzn.zzb(zzmcVarArr, this);
            if (zzb != aVar) {
                zzhkVar = zzhkVar3;
                obj = zzb;
            }
            return aVar;
        }
        if (i10 != 1) {
            zzhkVar2 = (zzhk) this.zzc;
            p7.b(obj);
            zzly zzlyVar = this.zzb;
            zzlyVar.zza = e0.a();
            zzD = zzlyVar.zzD();
            e0.q(zzD.zza(), new zzlt(zzhkVar2, zzlyVar, null));
            return iVar;
        }
        zzhkVar = (zzhk) this.zzc;
        p7.b(obj);
        if (((Boolean) obj).booleanValue()) {
            return iVar;
        }
        zzdj zzn2 = this.zzb.zzn();
        zzmc zzmcVar = zzmc.zzb;
        this.zzc = zzhkVar;
        this.zza = 2;
        if (zzn2.zzc(zzmcVar, this) != aVar) {
            zzhkVar2 = zzhkVar;
            zzly zzlyVar2 = this.zzb;
            zzlyVar2.zza = e0.a();
            zzD = zzlyVar2.zzD();
            e0.q(zzD.zza(), new zzlt(zzhkVar2, zzlyVar2, null));
            return iVar;
        }
        return aVar;
    }
}
