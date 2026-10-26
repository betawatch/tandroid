package com.google.android.recaptcha.internal;

import a8.jd;
import ce.f0;
import ld.c;
import md.a;
import nd.i;
import ud.p;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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

    @Override // nd.a
    public final c create(Object obj, c cVar) {
        zzlu zzluVar = new zzlu(this.zzb, cVar);
        zzluVar.zzc = obj;
        return zzluVar;
    }

    @Override // ud.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlu) create((zzhk) obj, (c) obj2)).invokeSuspend(jd.i.a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        zzhk zzhkVar2;
        zzcr zzD;
        a aVar = a.a;
        int i10 = this.zza;
        jd.i iVar = jd.i.a;
        if (i10 == 0) {
            jd.b(obj);
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
            jd.b(obj);
            zzly zzlyVar = this.zzb;
            zzlyVar.zza = f0.a();
            zzD = zzlyVar.zzD();
            f0.q(zzD.zza(), new zzlt(zzhkVar2, zzlyVar, null));
            return iVar;
        }
        zzhkVar = (zzhk) this.zzc;
        jd.b(obj);
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
            zzlyVar2.zza = f0.a();
            zzD = zzlyVar2.zzD();
            f0.q(zzD.zza(), new zzlt(zzhkVar2, zzlyVar2, null));
            return iVar;
        }
        return aVar;
    }
}
