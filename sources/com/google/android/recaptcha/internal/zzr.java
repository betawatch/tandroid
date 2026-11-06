package com.google.android.recaptcha.internal;

import af.b;
import android.app.Application;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.tasks.Task;
import d8.e;
import gd.g;
import gd.k;
import id.c;
import kd.j;
import o8.f;
import rd.p;
import zd.e0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
final class zzr extends j implements p {
    int zza;
    final /* synthetic */ zzu zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzr(zzu zzuVar, String str, c cVar) {
        super(2, cVar);
        this.zzb = zzuVar;
        this.zzc = str;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzr(this.zzb, this.zzc, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzr) create((zzhk) obj, (c) obj2)).invokeSuspend(k.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008e  */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        e0 e0Var;
        String str;
        String str2;
        jd.a aVar = jd.a.a;
        int i7 = this.zza;
        try {
            try {
                if (i7 == 0) {
                    b.c(obj);
                    e0Var = this.zzb.zzc;
                    if (e0Var == null) {
                        e0Var = null;
                    }
                    this.zza = 1;
                    obj = e0Var.await(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        b.c(obj);
                        str2 = ((o8.b) obj).a;
                        if (str2 != null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        String str3 = this.zzc;
                        zzxw zzf = zzxx.zzf();
                        zzf.zze(str3);
                        zzxi zzf2 = zzxj.zzf();
                        zzf2.zze(str2);
                        zzf.zzf((zzxj) zzf2.zzk());
                        return new g((zzxx) zzf.zzk());
                    }
                    b.c(obj);
                }
                o8.a aVar2 = new o8.a();
                zzu zzuVar = this.zzb;
                str = zzuVar.zzb;
                aVar2.a = str != null ? str : null;
                aVar2.b = this.zzc;
                Application context = zzu.zzl(zzuVar);
                kotlin.jvm.internal.j.e(context, "context");
                e eVar = new e(context, e.l, com.google.android.gms.common.api.b.j, i.c);
                s b10 = t.b();
                b10.d = new n6.c[]{f.a};
                b10.c = new cb.c(aVar2, 18);
                b10.a = 34002;
                Task e10 = eVar.e(0, b10.a());
                kotlin.jvm.internal.j.d(e10, "doRead(...)");
                e0 zza = zzdf.zza(e10);
                this.zza = 2;
                obj = zza.await(this);
                if (obj == aVar) {
                    return aVar;
                }
                str2 = ((o8.b) obj).a;
                if (str2 != null) {
                }
            } catch (Exception unused) {
                return new g(b.b(new zzcg(zzce.zzb, zzcd.zzau, null, null, 12, null)));
            }
        } catch (Exception unused2) {
            return new g(b.b(new zzcg(zzce.zzb, zzcd.zzat, null, null, 12, null)));
        }
    }
}
