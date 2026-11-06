package com.google.android.recaptcha.internal;

import af.b;
import gd.k;
import id.c;
import kd.j;
import rd.p;
import zd.b0;
import zd.t;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzlh zzlhVar = new zzlh(this.zzc, this.zzd, cVar);
        zzlhVar.zze = obj;
        return zzlhVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlh) create((zzhk) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        zzhk zzhkVar2;
        zzhk zzhkVar3;
        zzcr zzD;
        jd.a aVar = jd.a.a;
        int i7 = this.zzb;
        try {
        } catch (zzcg e10) {
            ((t) this.zzc.zzz()).Q(e10);
        }
        if (i7 == 0) {
            b.c(obj);
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
        if (i7 != 1) {
            zzhkVar3 = (zzhk) this.zze;
            b.c(obj);
            zzly zzlyVar = this.zzc;
            zzD = zzlyVar.zzD();
            b0.q(zzD.zzb(), new zzlg(zzlyVar, zzhkVar3, (String) obj, null));
            return k.a;
        }
        zzhk zzhkVar4 = (zzhk) this.zza;
        zzhk zzhkVar5 = (zzhk) this.zze;
        b.c(obj);
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
