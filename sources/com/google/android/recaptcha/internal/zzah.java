package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzah extends eeb implements fs4 {
    Object zza;
    Object zzb;
    Object zzc;
    int zzd;
    final /* synthetic */ zzxn zze;
    final /* synthetic */ zzaj zzf;
    final /* synthetic */ zzhk zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzah(zzxn zzxnVar, zzaj zzajVar, zzhk zzhkVar, px2 px2Var) {
        super(2, px2Var);
        this.zze = zzxnVar;
        this.zzf = zzajVar;
        this.zzg = zzhkVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new zzah(this.zze, this.zzf, this.zzg, px2Var);
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzah) create((ky2) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x00b4 -> B:5:0x0082). Please report as a decompilation issue!!! */
    @Override // og0
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
        int i = this.zzd;
        ly2 ly2Var = ly2.a;
        if (i == 0) {
            tue.b(obj);
            zzxn zzxnVar = this.zze;
            if (!zzxnVar.zzU()) {
                return new tc9(new sc9(new zzcg(zzce.zzb, zzcd.zzab, null, null, 12, null)));
            }
            zzk = zzxnVar.zzk();
            if (zzk.zzi().zzn()) {
                return new tc9(new sc9(new zzcg(zzce.zzb, zzcd.zzab, null, null, 12, null)));
            }
            zzaj zzajVar = this.zzf;
            zzajVar.zzb = zzk.zzi();
            list = zzajVar.zza;
            it = list.iterator();
        } else {
            if (i == 1) {
                zzhkVar = (zzhk) this.zzc;
                it2 = (Iterator) this.zzb;
                zzxpVar = (zzxp) this.zza;
                tue.b(obj);
                this.zza = zzxpVar;
                this.zzb = it2;
                this.zzc = null;
                this.zzd = 2;
                if (zzhj.zzb(zzhkVar, (zzhf) obj, this) != ly2Var) {
                    it = it2;
                    zzk = zzxpVar;
                }
                return ly2Var;
            }
            it = (Iterator) this.zzb;
            zzk = (zzxp) this.zza;
            tue.b(obj);
        }
        if (!it.hasNext()) {
            return new tc9(g7c.a);
        }
        zzar zzarVar = (zzar) it.next();
        zzhk zzhkVar2 = this.zzg;
        this.zza = zzk;
        this.zzb = it;
        this.zzc = zzhkVar2;
        this.zzd = 1;
        obj = zzarVar.zzd(zzk, this);
        if (obj != ly2Var) {
            zzxp zzxpVar2 = zzk;
            it2 = it;
            zzhkVar = zzhkVar2;
            zzxpVar = zzxpVar2;
            this.zza = zzxpVar;
            this.zzb = it2;
            this.zzc = null;
            this.zzd = 2;
            if (zzhj.zzb(zzhkVar, (zzhf) obj, this) != ly2Var) {
            }
        }
        return ly2Var;
    }
}
