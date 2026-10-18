package com.google.android.recaptcha.internal;

import android.app.Application;
import be.i0;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.tasks.Task;
import id.f;
import kd.c;
import l8.b;
import ld.a;
import md.i;
import td.p;
import v7.i8;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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

    @Override // md.a
    public final c create(Object obj, c cVar) {
        return new zzr(this.zzb, this.zzc, cVar);
    }

    @Override // td.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzr) create((zzhk) obj, (c) obj2)).invokeSuspend(id.i.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008c  */
    @Override // md.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        i0 i0Var;
        String str;
        String str2;
        a aVar = a.a;
        int i10 = this.zza;
        try {
            try {
                if (i10 == 0) {
                    i8.b(obj);
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
                    if (i10 != 1) {
                        i8.b(obj);
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
                    i8.b(obj);
                }
                l8.a aVar2 = new l8.a();
                zzu zzuVar = this.zzb;
                str = zzuVar.zzb;
                aVar2.a = str != null ? str : null;
                aVar2.b = this.zzc;
                Application context = zzu.zzl(zzuVar);
                kotlin.jvm.internal.i.e(context, "context");
                a8.f fVar = new a8.f(context, a8.f.k, com.google.android.gms.common.api.b.p, com.google.android.gms.common.api.i.c);
                u b10 = v.b();
                b10.d = new k6.c[]{l8.f.a};
                b10.c = new ya.c(aVar2, 1);
                b10.a = 34002;
                Task e = fVar.e(0, b10.a());
                kotlin.jvm.internal.i.d(e, "doRead(...)");
                i0 zza = zzdf.zza(e);
                this.zza = 2;
                obj = zza.await(this);
                if (obj == aVar) {
                    return aVar;
                }
                str2 = ((b) obj).a;
                if (str2 != null) {
                }
            } catch (Exception unused) {
                return new f(i8.a(new zzcg(zzce.zzb, zzcd.zzau, null, null, 12, null)));
            }
        } catch (Exception unused2) {
            return new f(i8.a(new zzcg(zzce.zzb, zzcd.zzat, null, null, 12, null)));
        }
    }
}
