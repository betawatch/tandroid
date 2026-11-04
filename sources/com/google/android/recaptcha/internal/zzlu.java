package com.google.android.recaptcha.internal;

import b8.ib;
import dd.k;
import fd.c;
import hd.j;
import od.p;
import wd.b0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    @Override // hd.a
    public final c create(Object obj, c cVar) {
        zzlu zzluVar = new zzlu(this.zzb, cVar);
        zzluVar.zzc = obj;
        return zzluVar;
    }

    @Override // od.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlu) create((zzhk) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        zzhk zzhkVar2;
        zzcr zzD;
        gd.a aVar = gd.a.a;
        int i3 = this.zza;
        k kVar = k.a;
        if (i3 == 0) {
            ib.b(obj);
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
        if (i3 != 1) {
            zzhkVar2 = (zzhk) this.zzc;
            ib.b(obj);
            zzly zzlyVar = this.zzb;
            zzlyVar.zza = b0.a();
            zzD = zzlyVar.zzD();
            b0.q(zzD.zza(), new zzlt(zzhkVar2, zzlyVar, null));
            return kVar;
        }
        zzhkVar = (zzhk) this.zzc;
        ib.b(obj);
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
