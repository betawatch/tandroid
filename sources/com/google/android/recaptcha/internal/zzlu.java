package com.google.android.recaptcha.internal;

import be.f0;
import kd.c;
import ld.a;
import md.i;
import td.p;
import v7.i8;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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

    @Override // md.a
    public final c create(Object obj, c cVar) {
        zzlu zzluVar = new zzlu(this.zzb, cVar);
        zzluVar.zzc = obj;
        return zzluVar;
    }

    @Override // td.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlu) create((zzhk) obj, (c) obj2)).invokeSuspend(id.i.a);
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        zzhk zzhkVar2;
        zzcr zzD;
        a aVar = a.a;
        int i10 = this.zza;
        id.i iVar = id.i.a;
        if (i10 == 0) {
            i8.b(obj);
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
            i8.b(obj);
            zzly zzlyVar = this.zzb;
            zzlyVar.zza = f0.a();
            zzD = zzlyVar.zzD();
            f0.q(zzD.zza(), new zzlt(zzhkVar2, zzlyVar, null));
            return iVar;
        }
        zzhkVar = (zzhk) this.zzc;
        i8.b(obj);
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
