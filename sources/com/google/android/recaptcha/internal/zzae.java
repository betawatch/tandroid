package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzae extends eeb implements fs4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzhk zzc;
    final /* synthetic */ zzar zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ List zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzae(zzhk zzhkVar, zzar zzarVar, String str, List list, px2 px2Var) {
        super(2, px2Var);
        this.zzc = zzhkVar;
        this.zzd = zzarVar;
        this.zze = str;
        this.zzf = list;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new zzae(this.zzc, this.zzd, this.zze, this.zzf, px2Var);
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzae) create((ky2) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r5 != r2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r5 != r2) goto L9;
     */
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        int i = this.zzb;
        ly2 ly2Var = ly2.a;
        if (i == 0) {
            tue.b(obj);
            zzhkVar = this.zzc;
            zzar zzarVar = this.zzd;
            String str = this.zze;
            this.zza = zzhkVar;
            this.zzb = 1;
            obj = zzarVar.zzc(str, this);
        } else {
            if (i != 1) {
                tue.b(obj);
                this.zzf.add((zzat) obj);
                return g7c.a;
            }
            zzhkVar = (zzhk) this.zza;
            tue.b(obj);
        }
        this.zza = null;
        this.zzb = 2;
        obj = ((zzhg) obj).zza(zzhkVar, this);
    }
}
