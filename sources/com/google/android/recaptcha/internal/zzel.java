package com.google.android.recaptcha.internal;

import bd.p;
import com.google.android.recaptcha.RecaptchaAction;
import i7.c7;
import qc.f;
import sc.c;
import uc.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
final class zzel extends i implements p {
    int zza;
    final /* synthetic */ zzeq zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzel(zzeq zzeqVar, long j10, RecaptchaAction recaptchaAction, c cVar) {
        super(2, cVar);
        this.zzb = zzeqVar;
        this.zzc = j10;
        this.zzd = recaptchaAction;
    }

    @Override // uc.a
    public final c create(Object obj, c cVar) {
        zzel zzelVar = new zzel(this.zzb, this.zzc, this.zzd, cVar);
        zzelVar.zze = obj;
        return zzelVar;
    }

    @Override // bd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzel) create((zzhk) obj, (c) obj2)).invokeSuspend(qc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if (r11 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r11 != r0) goto L15;
     */
    @Override // uc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        tc.a aVar = tc.a.a;
        int i10 = this.zza;
        try {
        } catch (zzcg e10) {
            obj = c7.a(e10.zzc());
        }
        if (i10 == 0) {
            c7.b(obj);
            zzhkVar = (zzhk) this.zze;
            zzeq zzeqVar = this.zzb;
            long j10 = this.zzc;
            RecaptchaAction recaptchaAction = this.zzd;
            this.zze = zzhkVar;
            this.zza = 1;
            obj = new zzhf(9, new zzeo(zzeqVar, j10, recaptchaAction, null), null);
        } else {
            if (i10 != 1) {
                c7.b(obj);
                return new f(obj);
            }
            zzhkVar = (zzhk) this.zze;
            c7.b(obj);
        }
        this.zze = null;
        this.zza = 2;
        obj = ((zzhf) obj).zza(zzhkVar, this);
    }
}
