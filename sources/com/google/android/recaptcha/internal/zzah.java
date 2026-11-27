package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class zzah extends yfb implements is4 {
    Object zza;
    Object zzb;
    Object zzc;
    int zzd;
    final /* synthetic */ zzxn zze;
    final /* synthetic */ zzaj zzf;
    final /* synthetic */ zzhk zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzah(zzxn zzxnVar, zzaj zzajVar, zzhk zzhkVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zze = zzxnVar;
        this.zzf = zzajVar;
        this.zzg = zzhkVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new zzah(this.zze, this.zzf, this.zzg, zw2Var);
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzah) create((ux2) obj, (zw2) obj2)).invokeSuspend(g9c.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x00b4 -> B:5:0x0082). Please report as a decompilation issue!!! */
    @Override // qf0
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
        vx2 vx2Var = vx2.a;
        if (i == 0) {
            ixe.b(obj);
            zzxn zzxnVar = this.zze;
            if (!zzxnVar.zzU()) {
                return new he9(new ge9(new zzcg(zzce.zzb, zzcd.zzab, null, null, 12, null)));
            }
            zzk = zzxnVar.zzk();
            if (zzk.zzi().zzn()) {
                return new he9(new ge9(new zzcg(zzce.zzb, zzcd.zzab, null, null, 12, null)));
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
                ixe.b(obj);
                this.zza = zzxpVar;
                this.zzb = it2;
                this.zzc = null;
                this.zzd = 2;
                if (zzhj.zzb(zzhkVar, (zzhf) obj, this) != vx2Var) {
                    it = it2;
                    zzk = zzxpVar;
                }
                return vx2Var;
            }
            it = (Iterator) this.zzb;
            zzk = (zzxp) this.zza;
            ixe.b(obj);
        }
        if (!it.hasNext()) {
            return new he9(g9c.a);
        }
        zzar zzarVar = (zzar) it.next();
        zzhk zzhkVar2 = this.zzg;
        this.zza = zzk;
        this.zzb = it;
        this.zzc = zzhkVar2;
        this.zzd = 1;
        obj = zzarVar.zzd(zzk, this);
        if (obj != vx2Var) {
            zzxp zzxpVar2 = zzk;
            it2 = it;
            zzhkVar = zzhkVar2;
            zzxpVar = zzxpVar2;
            this.zza = zzxpVar;
            this.zzb = it2;
            this.zzc = null;
            this.zzd = 2;
            if (zzhj.zzb(zzhkVar, (zzhf) obj, this) != vx2Var) {
            }
        }
        return vx2Var;
    }
}
