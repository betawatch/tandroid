package com.google.android.recaptcha.internal;

import bd.p;
import i7.c7;
import java.util.List;
import jd.c0;
import sc.c;
import uc.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
final class zzae extends i implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzhk zzc;
    final /* synthetic */ zzar zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ List zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzae(zzhk zzhkVar, zzar zzarVar, String str, List list, c cVar) {
        super(2, cVar);
        this.zzc = zzhkVar;
        this.zzd = zzarVar;
        this.zze = str;
        this.zzf = list;
    }

    @Override // uc.a
    public final c create(Object obj, c cVar) {
        return new zzae(this.zzc, this.zzd, this.zze, this.zzf, cVar);
    }

    @Override // bd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzae) create((c0) obj, (c) obj2)).invokeSuspend(qc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r5 == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r5 != r0) goto L9;
     */
    @Override // uc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        tc.a aVar = tc.a.a;
        int i10 = this.zzb;
        if (i10 == 0) {
            c7.b(obj);
            zzhkVar = this.zzc;
            zzar zzarVar = this.zzd;
            String str = this.zze;
            this.zza = zzhkVar;
            this.zzb = 1;
            obj = zzarVar.zzc(str, this);
        } else {
            if (i10 != 1) {
                c7.b(obj);
                this.zzf.add((zzat) obj);
                return qc.i.a;
            }
            zzhkVar = (zzhk) this.zza;
            c7.b(obj);
        }
        this.zza = null;
        this.zzb = 2;
        obj = ((zzhg) obj).zza(zzhkVar, this);
    }
}
