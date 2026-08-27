package com.google.android.recaptcha.internal;

import ad.p;
import h7.k6;
import id.f0;
import id.t;
import rc.c;
import tc.i;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
final class zzlh extends i implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzly zzc;
    final /* synthetic */ zzxn zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlh(zzly zzlyVar, zzxn zzxnVar, c cVar) {
        super(2, cVar);
        this.zzc = zzlyVar;
        this.zzd = zzxnVar;
    }

    @Override // tc.a
    public final c create(Object obj, c cVar) {
        zzlh zzlhVar = new zzlh(this.zzc, this.zzd, cVar);
        zzlhVar.zze = obj;
        return zzlhVar;
    }

    @Override // ad.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlh) create((zzhk) obj, (c) obj2)).invokeSuspend(pc.i.a);
    }

    @Override // tc.a
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        zzhk zzhkVar2;
        zzhk zzhkVar3;
        zzcr zzD;
        sc.a aVar = sc.a.a;
        int i10 = this.zzb;
        try {
        } catch (zzcg e9) {
            ((t) this.zzc.zzz()).L(e9);
        }
        if (i10 == 0) {
            k6.b(obj);
            zzhkVar = (zzhk) this.zze;
            zzib zzp = zzly.zzp(this.zzc);
            zzxn zzxnVar = this.zzd;
            this.zze = zzhkVar;
            this.zza = zzhkVar;
            this.zzb = 1;
            obj = zzp.zzc(zzxnVar, this);
            if (obj != aVar) {
                zzhkVar2 = zzhkVar;
            }
            return aVar;
        }
        if (i10 != 1) {
            zzhkVar3 = (zzhk) this.zze;
            k6.b(obj);
            zzly zzlyVar = this.zzc;
            zzD = zzlyVar.zzD();
            f0.q(zzD.zzb(), new zzlg(zzlyVar, zzhkVar3, (String) obj, null));
            return pc.i.a;
        }
        zzhk zzhkVar4 = (zzhk) this.zza;
        zzhk zzhkVar5 = (zzhk) this.zze;
        k6.b(obj);
        zzhkVar2 = zzhkVar4;
        zzhkVar = zzhkVar5;
        this.zze = zzhkVar;
        this.zza = null;
        this.zzb = 2;
        obj = ((zzhg) obj).zza(zzhkVar2, this);
        if (obj == aVar) {
            return aVar;
        }
        zzhkVar3 = zzhkVar;
        zzly zzlyVar2 = this.zzc;
        zzD = zzlyVar2.zzD();
        f0.q(zzD.zzb(), new zzlg(zzlyVar2, zzhkVar3, (String) obj, null));
        return pc.i.a;
    }
}
