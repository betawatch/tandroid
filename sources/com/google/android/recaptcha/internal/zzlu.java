package com.google.android.recaptcha.internal;

import af.b;
import gd.k;
import id.c;
import kd.j;
import rd.p;
import zd.b0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
final class zzlu extends j implements p {
    int zza;
    final /* synthetic */ zzly zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlu(zzly zzlyVar, c cVar) {
        super(2, cVar);
        this.zzb = zzlyVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzlu zzluVar = new zzlu(this.zzb, cVar);
        zzluVar.zzc = obj;
        return zzluVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlu) create((zzhk) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        zzhk zzhkVar2;
        zzcr zzD;
        jd.a aVar = jd.a.a;
        int i7 = this.zza;
        k kVar = k.a;
        if (i7 == 0) {
            b.c(obj);
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
        if (i7 != 1) {
            zzhkVar2 = (zzhk) this.zzc;
            b.c(obj);
            zzly zzlyVar = this.zzb;
            zzlyVar.zza = b0.a();
            zzD = zzlyVar.zzD();
            b0.q(zzD.zza(), new zzlt(zzhkVar2, zzlyVar, null));
            return kVar;
        }
        zzhkVar = (zzhk) this.zzc;
        b.c(obj);
        if (((Boolean) obj).booleanValue()) {
            return kVar;
        }
        zzdj zzn2 = this.zzb.zzn();
        zzmc zzmcVar = zzmc.zzb;
        this.zzc = zzhkVar;
        this.zza = 2;
        if (zzn2.zzc(zzmcVar, this) != aVar) {
            zzhkVar2 = zzhkVar;
            zzly zzlyVar2 = this.zzb;
            zzlyVar2.zza = b0.a();
            zzD = zzlyVar2.zzD();
            b0.q(zzD.zza(), new zzlt(zzhkVar2, zzlyVar2, null));
            return kVar;
        }
        return aVar;
    }
}
