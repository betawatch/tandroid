package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzr extends eeb implements fs4 {
    int zza;
    final /* synthetic */ zzu zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzr(zzu zzuVar, String str, px2 px2Var) {
        super(2, px2Var);
        this.zzb = zzuVar;
        this.zzc = str;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new zzr(this.zzb, this.zzc, px2Var);
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzr) create((zzhk) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
    
        if (r10 != r3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cc, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0025, code lost:
    
        if (r10 != r3) goto L15;
     */
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        le3 le3Var;
        String str;
        int i = this.zza;
        ly2 ly2Var = ly2.a;
        try {
            try {
                if (i == 0) {
                    tue.b(obj);
                    le3Var = this.zzb.zzc;
                    if (le3Var == null) {
                        le3Var = null;
                    }
                    this.zza = 1;
                    obj = le3Var.await(this);
                } else {
                    if (i != 1) {
                        tue.b(obj);
                        String str2 = ((c64) obj).a;
                        if (str2 == null) {
                            dq9.m("Required value was null.");
                            return null;
                        }
                        String str3 = this.zzc;
                        zzxw zzf = zzxx.zzf();
                        zzf.zze(str3);
                        zzxi zzf2 = zzxj.zzf();
                        zzf2.zze(str2);
                        zzf.zzf((zzxj) zzf2.zzk());
                        return new tc9((zzxx) zzf.zzk());
                    }
                    tue.b(obj);
                }
                b64 b64Var = new b64();
                zzu zzuVar = this.zzb;
                str = zzuVar.zzb;
                if (str == null) {
                    str = null;
                }
                b64Var.a = str;
                b64Var.b = this.zzc;
                Application zzl = zzu.zzl(zzuVar);
                zzl.getClass();
                ua4 ua4Var = new ua4(zzl, ua4.s, wo.g, b05.c);
                bib b = cib.b();
                b.c = new o94[]{qgd.a};
                b.a = new cf9(b64Var, (byte) 27);
                b.d = (char) 34002;
                Task e = ua4Var.e(0, b.a());
                e.getClass();
                le3 zza = zzdf.zza(e);
                this.zza = 2;
                obj = zza.await(this);
            } catch (Exception unused) {
                return new tc9(new sc9(new zzcg(zzce.zzb, zzcd.zzat, null, null, 12, null)));
            }
        } catch (Exception unused2) {
            return new tc9(new sc9(new zzcg(zzce.zzb, zzcd.zzau, null, null, 12, null)));
        }
    }
}
