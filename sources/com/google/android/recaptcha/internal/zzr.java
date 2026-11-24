package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
final class zzr extends ccb implements eq4 {
    int zza;
    final /* synthetic */ zzu zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzr(zzu zzuVar, String str, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzuVar;
        this.zzc = str;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzr(this.zzb, this.zzc, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzr) create((zzhk) obj, (fw2) obj2)).invokeSuspend(g5c.a);
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
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zc3 zc3Var;
        String str;
        int i = this.zza;
        bx2 bx2Var = bx2.a;
        try {
            try {
                if (i == 0) {
                    qse.b(obj);
                    zc3Var = this.zzb.zzc;
                    if (zc3Var == null) {
                        zc3Var = null;
                    }
                    this.zza = 1;
                    obj = zc3Var.await(this);
                } else {
                    if (i != 1) {
                        qse.b(obj);
                        String str2 = ((r44) obj).a;
                        if (str2 == null) {
                            sc8.j("Required value was null.");
                            return null;
                        }
                        String str3 = this.zzc;
                        zzxw zzf = zzxx.zzf();
                        zzf.zze(str3);
                        zzxi zzf2 = zzxj.zzf();
                        zzf2.zze(str2);
                        zzf.zzf((zzxj) zzf2.zzk());
                        return new ta9((zzxx) zzf.zzk());
                    }
                    qse.b(obj);
                }
                q44 q44Var = new q44();
                zzu zzuVar = this.zzb;
                str = zzuVar.zzb;
                if (str == null) {
                    str = null;
                }
                q44Var.a = str;
                q44Var.b = this.zzc;
                Application zzl = zzu.zzl(zzuVar);
                zzl.getClass();
                u84 u84Var = new u84(zzl, u84.s, vn.g, ay4.c);
                agb b = bgb.b();
                b.c = new f84[]{ped.a};
                b.a = new xdd(q44Var);
                b.d = (char) 34002;
                Task e = u84Var.e(0, b.a());
                e.getClass();
                zc3 zza = zzdf.zza(e);
                this.zza = 2;
                obj = zza.await(this);
            } catch (Exception unused) {
                return new ta9(new sa9(new zzcg(zzce.zzb, zzcd.zzau, null, null, 12, null)));
            }
        } catch (Exception unused2) {
            return new ta9(new sa9(new zzcg(zzce.zzb, zzcd.zzat, null, null, 12, null)));
        }
    }
}
