package com.google.android.recaptcha.internal;

import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.t7;
import zd.c0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
final class zzlt extends j implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzhk zzc;
    final /* synthetic */ zzly zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlt(zzhk zzhkVar, zzly zzlyVar, c cVar) {
        super(2, cVar);
        this.zzc = zzhkVar;
        this.zzd = zzlyVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzlt(this.zzc, this.zzd, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlt) create((c0) obj, (c) obj2)).invokeSuspend(i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if (com.google.android.recaptcha.internal.zzhj.zzb(r1, (com.google.android.recaptcha.internal.zzhf) r6, r5) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r6 != r0) goto L9;
     */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        a aVar = a.a;
        int i10 = this.zzb;
        if (i10 == 0) {
            t7.b(obj);
            zzhkVar = this.zzc;
            zzly zzlyVar = this.zzd;
            this.zza = zzhkVar;
            this.zzb = 1;
            obj = new zzhf(42, new zzlx(zzlyVar, null), null);
        } else {
            if (i10 != 1) {
                t7.b(obj);
                return i.a;
            }
            zzhkVar = (zzhk) this.zza;
            t7.b(obj);
        }
        this.zza = null;
        this.zzb = 2;
    }
}
