package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;
import g7.y5;
import hd.i0;
import k7.e;
import oc.f;
import qc.c;
import rc.a;
import sc.i;
import v7.b;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        return new zzr(this.zzb, this.zzc, cVar);
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzr) create((zzhk) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008e  */
    @Override // sc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        i0 i0Var;
        String str;
        String str2;
        a aVar = a.a;
        int i9 = this.zza;
        try {
            try {
                if (i9 == 0) {
                    y5.b(obj);
                    i0Var = this.zzb.zzc;
                    if (i0Var == null) {
                        i0Var = null;
                    }
                    this.zza = 1;
                    obj = i0Var.await(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i9 != 1) {
                        y5.b(obj);
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
                    y5.b(obj);
                }
                v7.a aVar2 = new v7.a();
                zzu zzuVar = this.zzb;
                str = zzuVar.zzb;
                aVar2.a = str != null ? str : null;
                aVar2.b = this.zzc;
                Application context = zzu.zzl(zzuVar);
                kotlin.jvm.internal.i.e(context, "context");
                e eVar = new e(context, e.k, com.google.android.gms.common.api.b.g, com.google.android.gms.common.api.i.c);
                v b10 = w.b();
                b10.d = new u5.c[]{v7.f.a};
                b10.c = new android.support.v4.media.c(aVar2, 20);
                b10.a = 34002;
                Task e10 = eVar.e(0, b10.b());
                kotlin.jvm.internal.i.d(e10, "doRead(...)");
                i0 zza = zzdf.zza(e10);
                this.zza = 2;
                obj = zza.await(this);
                if (obj == aVar) {
                    return aVar;
                }
                str2 = ((b) obj).a;
                if (str2 != null) {
                }
            } catch (Exception unused) {
                return new f(y5.a(new zzcg(zzce.zzb, zzcd.zzau, null, null, 12, null)));
            }
        } catch (Exception unused2) {
            return new f(y5.a(new zzcg(zzce.zzb, zzcd.zzat, null, null, 12, null)));
        }
    }
}
