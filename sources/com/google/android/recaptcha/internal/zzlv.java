package com.google.android.recaptcha.internal;

import af.b;
import android.webkit.WebView;
import gd.k;
import id.c;
import kd.g;
import kd.j;
import rd.p;
import zd.s;
import zd.z;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
        return ((zzlv) create((z) obj, (c) obj2)).invokeSuspend(k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e2, code lost:
    
        return gd.k.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00cc, code lost:
    
        if (((zd.t) r10).i(r9) != r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b1, code lost:
    
        if (com.google.android.recaptcha.internal.zzhj.zzc(r1, (com.google.android.recaptcha.internal.zzhg) r10, r9) != r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a5, code lost:
    
        if (r10 != r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r1 != 4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00ce, code lost:
    
        r10 = r9.zzf.zzn();
        r1 = com.google.android.recaptcha.internal.zzmc.zzc;
        r9.zze = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00dd, code lost:
    
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
        jd.a aVar = jd.a.a;
        int i7 = this.zze;
        if (i7 == 0) {
            b.c(obj);
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
        if (i7 == 1) {
            zzdoVar = (zzdo) this.zzd;
            zzxnVar3 = (zzxn) this.zzc;
            zzlyVar = (zzly) this.zzb;
            zzlyVar2 = (zzly) this.zza;
            b.c(obj);
        } else if (i7 != 2) {
            b.c(obj);
            if (i7 != 3) {
            }
            zzly zzlyVar3 = this.zzf;
            g.a(zzlyVar3.zzz().hashCode());
            s zzz = zzlyVar3.zzz();
            this.zze = 4;
        } else {
            zzgrVar = (zzgr) this.zza;
            b.c(obj);
            this.zza = null;
            this.zze = 3;
        }
        zzlyVar2.zzb = zzlyVar.zzB(zzxnVar3, zzdoVar, (WebView) obj);
        zzly zzlyVar4 = this.zzf;
        g.a(zzlyVar4.zzz().hashCode());
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
