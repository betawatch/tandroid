package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class zzr extends yfb implements is4 {
    int zza;
    final /* synthetic */ zzu zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzr(zzu zzuVar, String str, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = zzuVar;
        this.zzc = str;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new zzr(this.zzb, this.zzc, zw2Var);
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzr) create((zzhk) obj, (zw2) obj2)).invokeSuspend(g9c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        if (r10 != r3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c9, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0024, code lost:
    
        if (r10 != r3) goto L15;
     */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        rd3 rd3Var;
        String str;
        int i = this.zza;
        vx2 vx2Var = vx2.a;
        try {
            try {
                if (i == 0) {
                    ixe.b(obj);
                    rd3Var = this.zzb.zzc;
                    if (rd3Var == null) {
                        rd3Var = null;
                    }
                    this.zza = 1;
                    obj = rd3Var.await(this);
                } else {
                    if (i != 1) {
                        ixe.b(obj);
                        String str2 = ((n54) obj).a;
                        if (str2 == null) {
                            grb.i("Required value was null.");
                            return null;
                        }
                        String str3 = this.zzc;
                        zzxw zzf = zzxx.zzf();
                        zzf.zze(str3);
                        zzxi zzf2 = zzxj.zzf();
                        zzf2.zze(str2);
                        zzf.zzf((zzxj) zzf2.zzk());
                        return new he9((zzxx) zzf.zzk());
                    }
                    ixe.b(obj);
                }
                m54 m54Var = new m54();
                zzu zzuVar = this.zzb;
                str = zzuVar.zzb;
                if (str == null) {
                    str = null;
                }
                m54Var.a = str;
                m54Var.b = this.zzc;
                Application zzl = zzu.zzl(zzuVar);
                zzl.getClass();
                qa4 qa4Var = new qa4(zzl, qa4.s, wn.g, g05.c);
                wjb b = xjb.b();
                b.c = new a94[]{gjd.a};
                b.a = new oqd(m54Var);
                b.d = (char) 34002;
                Task e = qa4Var.e(0, b.a());
                e.getClass();
                rd3 zza = zzdf.zza(e);
                this.zza = 2;
                obj = zza.await(this);
            } catch (Exception unused) {
                return new he9(new ge9(new zzcg(zzce.zzb, zzcd.zzau, null, null, 12, null)));
            }
        } catch (Exception unused2) {
            return new he9(new ge9(new zzcg(zzce.zzb, zzcd.zzat, null, null, 12, null)));
        }
    }
}
