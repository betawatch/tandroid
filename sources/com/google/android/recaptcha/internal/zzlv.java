package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.u7;
import zd.c0;
import zd.s;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
final class zzlv extends j implements p {
    Object zza;
    Object zzb;
    Object zzc;
    Object zzd;
    int zze;
    final /* synthetic */ zzly zzf;
    final /* synthetic */ zzgr zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlv(zzly zzlyVar, zzgr zzgrVar, c cVar) {
        super(2, cVar);
        this.zzf = zzlyVar;
        this.zzg = zzgrVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzlv(this.zzf, this.zzg, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlv) create((c0) obj, (c) obj2)).invokeSuspend(i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e6, code lost:
    
        return gd.i.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d0, code lost:
    
        if (((zd.t) r10).h(r9) != r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b3, code lost:
    
        if (com.google.android.recaptcha.internal.zzhj.zzc(r1, (com.google.android.recaptcha.internal.zzhg) r10, r9) != r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        if (r10 != r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r1 != 4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00d2, code lost:
    
        r10 = r9.zzf.zzn();
        r1 = com.google.android.recaptcha.internal.zzmc.zzc;
        r9.zze = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00e1, code lost:
    
        if (r10.zzc(r1, r9) != r0) goto L33;
     */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzly zzlyVar;
        zzxn zzxnVar;
        zzdo zzdoVar;
        zzxn zzxnVar2;
        zzxn zzxnVar3;
        zzly zzlyVar2;
        zzmf zzmfVar;
        zzmf zzmfVar2;
        zzgr zzgrVar;
        zzxn zzxnVar4;
        a aVar = a.a;
        int i10 = this.zze;
        if (i10 == 0) {
            u7.b(obj);
            zzlyVar = this.zzf;
            zzxnVar = zzlyVar.zze;
            if (zzxnVar == null) {
                zzxnVar = null;
            }
            zzxnVar2 = zzlyVar.zze;
            if (zzxnVar2 == null) {
                zzxnVar2 = null;
            }
            zzdoVar = new zzdo(zzxnVar2.zzf());
            this.zza = zzlyVar;
            this.zzb = zzlyVar;
            this.zzc = zzxnVar;
            this.zzd = zzdoVar;
            this.zze = 1;
            Object zzv = zzlyVar.zzv(this);
            if (zzv != aVar) {
                zzxnVar3 = zzxnVar;
                obj = zzv;
                zzlyVar2 = zzlyVar;
            }
            return aVar;
        }
        if (i10 == 1) {
            zzdoVar = (zzdo) this.zzd;
            zzxnVar3 = (zzxn) this.zzc;
            zzlyVar = (zzly) this.zzb;
            zzlyVar2 = (zzly) this.zza;
            u7.b(obj);
        } else if (i10 != 2) {
            u7.b(obj);
            if (i10 != 3) {
            }
            zzly zzlyVar3 = this.zzf;
            new Integer(zzlyVar3.zzz().hashCode());
            s zzz = zzlyVar3.zzz();
            this.zze = 4;
        } else {
            zzgrVar = (zzgr) this.zza;
            u7.b(obj);
            this.zza = null;
            this.zze = 3;
        }
        zzlyVar2.zzb = zzlyVar.zzB(zzxnVar3, zzdoVar, (WebView) obj);
        zzly zzlyVar4 = this.zzf;
        new Integer(zzlyVar4.zzz().hashCode());
        zzmfVar = zzlyVar4.zzg;
        zzmfVar.zzd();
        zzmfVar2 = zzlyVar4.zzg;
        zzmfVar2.zze();
        zzgrVar = this.zzg;
        zzxnVar4 = zzlyVar4.zze;
        if (zzxnVar4 == null) {
            zzxnVar4 = null;
        }
        this.zza = zzgrVar;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = 2;
        obj = new zzhg(new zzlh(zzlyVar4, zzxnVar4, null));
    }
}
