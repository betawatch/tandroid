package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import g7.y5;
import oc.f;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        zzel zzelVar = new zzel(this.zzb, this.zzc, this.zzd, cVar);
        zzelVar.zze = obj;
        return zzelVar;
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzel) create((zzhk) obj, (c) obj2)).invokeSuspend(oc.i.a);
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
    @Override // sc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        a aVar = a.a;
        int i9 = this.zza;
        try {
        } catch (zzcg e10) {
            obj = y5.a(e10.zzc());
        }
        if (i9 == 0) {
            y5.b(obj);
            zzhkVar = (zzhk) this.zze;
            zzeq zzeqVar = this.zzb;
            long j10 = this.zzc;
            RecaptchaAction recaptchaAction = this.zzd;
            this.zze = zzhkVar;
            this.zza = 1;
            obj = new zzhf(9, new zzeo(zzeqVar, j10, recaptchaAction, null), null);
        } else {
            if (i9 != 1) {
                y5.b(obj);
                return new f(obj);
            }
            zzhkVar = (zzhk) this.zze;
            y5.b(obj);
        }
        this.zze = null;
        this.zza = 2;
        obj = ((zzhf) obj).zza(zzhkVar, this);
    }
}
