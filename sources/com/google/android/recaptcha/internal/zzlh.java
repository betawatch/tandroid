package com.google.android.recaptcha.internal;

import b8.ib;
import dd.k;
import fd.c;
import hd.j;
import od.p;
import wd.b0;
import wd.t;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
final class zzlh extends j implements p {
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

    @Override // hd.a
    public final c create(Object obj, c cVar) {
        zzlh zzlhVar = new zzlh(this.zzc, this.zzd, cVar);
        zzlhVar.zze = obj;
        return zzlhVar;
    }

    @Override // od.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlh) create((zzhk) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        zzhk zzhkVar2;
        zzhk zzhkVar3;
        zzcr zzD;
        gd.a aVar = gd.a.a;
        int i3 = this.zzb;
        try {
        } catch (zzcg e10) {
            ((t) this.zzc.zzz()).Q(e10);
        }
        if (i3 == 0) {
            ib.b(obj);
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
        if (i3 != 1) {
            zzhkVar3 = (zzhk) this.zze;
            ib.b(obj);
            zzly zzlyVar = this.zzc;
            zzD = zzlyVar.zzD();
            b0.q(zzD.zzb(), new zzlg(zzlyVar, zzhkVar3, (String) obj, null));
            return k.a;
        }
        zzhk zzhkVar4 = (zzhk) this.zza;
        zzhk zzhkVar5 = (zzhk) this.zze;
        ib.b(obj);
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
        b0.q(zzD.zzb(), new zzlg(zzlyVar2, zzhkVar3, (String) obj, null));
        return k.a;
    }
}
