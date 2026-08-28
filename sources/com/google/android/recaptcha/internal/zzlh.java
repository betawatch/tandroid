package com.google.android.recaptcha.internal;

import g7.y5;
import hd.f0;
import hd.t;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        zzlh zzlhVar = new zzlh(this.zzc, this.zzd, cVar);
        zzlhVar.zze = obj;
        return zzlhVar;
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlh) create((zzhk) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        zzhk zzhkVar2;
        zzhk zzhkVar3;
        zzcr zzD;
        a aVar = a.a;
        int i9 = this.zzb;
        try {
        } catch (zzcg e10) {
            ((t) this.zzc.zzz()).L(e10);
        }
        if (i9 == 0) {
            y5.b(obj);
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
        if (i9 != 1) {
            zzhkVar3 = (zzhk) this.zze;
            y5.b(obj);
            zzly zzlyVar = this.zzc;
            zzD = zzlyVar.zzD();
            f0.q(zzD.zzb(), new zzlg(zzlyVar, zzhkVar3, (String) obj, null));
            return oc.i.a;
        }
        zzhk zzhkVar4 = (zzhk) this.zza;
        zzhk zzhkVar5 = (zzhk) this.zze;
        y5.b(obj);
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
        return oc.i.a;
    }
}
