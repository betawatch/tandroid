package com.google.android.recaptcha.internal;

import android.app.Application;
import androidx.biometric.f0;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;
import dd.p;
import k7.p7;
import kotlin.jvm.internal.j;
import ld.h0;
import o7.e;
import sc.f;
import uc.c;
import vc.a;
import wc.i;
import z7.b;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
final class zzr extends i implements p {
    int zza;
    final /* synthetic */ zzu zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzr(zzu zzuVar, String str, c cVar) {
        super(2, cVar);
        this.zzb = zzuVar;
        this.zzc = str;
    }

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        return new zzr(this.zzb, this.zzc, cVar);
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzr) create((zzhk) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008e  */
    @Override // wc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        h0 h0Var;
        String str;
        String str2;
        a aVar = a.a;
        int i10 = this.zza;
        try {
            try {
                if (i10 == 0) {
                    p7.b(obj);
                    h0Var = this.zzb.zzc;
                    if (h0Var == null) {
                        h0Var = null;
                    }
                    this.zza = 1;
                    obj = h0Var.await(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        p7.b(obj);
                        str2 = ((b) obj).a;
                        if (str2 != null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        String str3 = this.zzc;
                        zzxw zzf = zzxx.zzf();
                        zzf.zze(str3);
                        zzxi zzf2 = zzxj.zzf();
                        zzf2.zze(str2);
                        zzf.zzf((zzxj) zzf2.zzk());
                        return new f((zzxx) zzf.zzk());
                    }
                    p7.b(obj);
                }
                z7.a aVar2 = new z7.a();
                zzu zzuVar = this.zzb;
                str = zzuVar.zzb;
                aVar2.a = str != null ? str : null;
                aVar2.b = this.zzc;
                Application context = zzu.zzl(zzuVar);
                j.e(context, "context");
                e eVar = new e(context, e.k, com.google.android.gms.common.api.b.i, com.google.android.gms.common.api.i.c);
                v e = w.e();
                e.d = new y5.c[]{z7.f.a};
                e.c = new f0(aVar2, 25);
                e.a = 34002;
                Task e6 = eVar.e(0, e.e());
                j.d(e6, "doRead(...)");
                h0 zza = zzdf.zza(e6);
                this.zza = 2;
                obj = zza.await(this);
                if (obj == aVar) {
                    return aVar;
                }
                str2 = ((b) obj).a;
                if (str2 != null) {
                }
            } catch (Exception unused) {
                return new f(p7.a(new zzcg(zzce.zzb, zzcd.zzau, null, null, 12, null)));
            }
        } catch (Exception unused2) {
            return new f(p7.a(new zzcg(zzce.zzb, zzcd.zzat, null, null, 12, null)));
        }
    }
}
