package com.google.android.recaptcha.internal;

import android.app.Application;
import bd.p;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;
import i7.c7;
import jd.h0;
import kotlin.jvm.internal.j;
import m7.e;
import qc.f;
import sc.c;
import uc.i;
import x7.b;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    @Override // uc.a
    public final c create(Object obj, c cVar) {
        return new zzr(this.zzb, this.zzc, cVar);
    }

    @Override // bd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzr) create((zzhk) obj, (c) obj2)).invokeSuspend(qc.i.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008e  */
    @Override // uc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        h0 h0Var;
        String str;
        String str2;
        tc.a aVar = tc.a.a;
        int i10 = this.zza;
        try {
            try {
                if (i10 == 0) {
                    c7.b(obj);
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
                        c7.b(obj);
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
                    c7.b(obj);
                }
                x7.a aVar2 = new x7.a();
                zzu zzuVar = this.zzb;
                str = zzuVar.zzb;
                aVar2.a = str != null ? str : null;
                aVar2.b = this.zzc;
                Application context = zzu.zzl(zzuVar);
                j.e(context, "context");
                e eVar = new e(context, e.k, com.google.android.gms.common.api.b.i, com.google.android.gms.common.api.i.c);
                v b10 = w.b();
                b10.d = new w5.c[]{x7.f.a};
                b10.c = new za.c(aVar2, 26);
                b10.a = 34002;
                Task e10 = eVar.e(0, b10.b());
                j.d(e10, "doRead(...)");
                h0 zza = zzdf.zza(e10);
                this.zza = 2;
                obj = zza.await(this);
                if (obj == aVar) {
                    return aVar;
                }
                str2 = ((b) obj).a;
                if (str2 != null) {
                }
            } catch (Exception unused) {
                return new f(c7.a(new zzcg(zzce.zzb, zzcd.zzau, null, null, 12, null)));
            }
        } catch (Exception unused2) {
            return new f(c7.a(new zzcg(zzce.zzb, zzcd.zzat, null, null, 12, null)));
        }
    }
}
