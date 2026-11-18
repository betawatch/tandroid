package com.google.android.recaptcha.internal;

import b7.h;
import com.google.android.recaptcha.RecaptchaAction;
import gd.g;
import gd.k;
import id.c;
import jd.a;
import kd.j;
import rd.p;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
final class zzel extends j implements p {
    int zza;
    final /* synthetic */ zzeq zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzel(zzeq zzeqVar, long j3, RecaptchaAction recaptchaAction, c cVar) {
        super(2, cVar);
        this.zzb = zzeqVar;
        this.zzc = j3;
        this.zzd = recaptchaAction;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzel zzelVar = new zzel(this.zzb, this.zzc, this.zzd, cVar);
        zzelVar.zze = obj;
        return zzelVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzel) create((zzhk) obj, (c) obj2)).invokeSuspend(k.a);
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
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        a aVar = a.a;
        int i7 = this.zza;
        try {
        } catch (zzcg e10) {
            obj = h.a(e10.zzc());
        }
        if (i7 == 0) {
            h.b(obj);
            zzhkVar = (zzhk) this.zze;
            zzeq zzeqVar = this.zzb;
            long j3 = this.zzc;
            RecaptchaAction recaptchaAction = this.zzd;
            this.zze = zzhkVar;
            this.zza = 1;
            obj = new zzhf(9, new zzeo(zzeqVar, j3, recaptchaAction, null), null);
        } else {
            if (i7 != 1) {
                h.b(obj);
                return new g(obj);
            }
            zzhkVar = (zzhk) this.zze;
            h.b(obj);
        }
        this.zze = null;
        this.zza = 2;
        obj = ((zzhf) obj).zza(zzhkVar, this);
    }
}
