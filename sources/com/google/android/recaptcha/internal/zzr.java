package com.google.android.recaptcha.internal;

import a8.f;
import ad.g;
import android.app.Application;
import cd.c;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;
import dd.a;
import ed.j;
import kotlin.jvm.internal.i;
import l9.b;
import ld.p;
import td.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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

    @Override // ed.a
    public final c create(Object obj, c cVar) {
        return new zzr(this.zzb, this.zzc, cVar);
    }

    @Override // ld.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzr) create((zzhk) obj, (c) obj2)).invokeSuspend(ad.j.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008c  */
    @Override // ed.a
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
                    b.b(obj);
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
                        b.b(obj);
                        str2 = ((l8.b) obj).a;
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
                    b.b(obj);
                }
                l8.a aVar2 = new l8.a();
                zzu zzuVar = this.zzb;
                str = zzuVar.zzb;
                aVar2.a = str != null ? str : null;
                aVar2.b = this.zzc;
                Application context = zzu.zzl(zzuVar);
                i.e(context, "context");
                f fVar = new f(context, f.k, com.google.android.gms.common.api.b.k, com.google.android.gms.common.api.i.c);
                v b10 = w.b();
                b10.d = new k6.c[]{l8.f.a};
                b10.c = new za.c(aVar2, 1);
                b10.a = 34002;
                Task e = fVar.e(0, b10.a());
                i.d(e, "doRead(...)");
                h0 zza = zzdf.zza(e);
                this.zza = 2;
                obj = zza.await(this);
                if (obj == aVar) {
                    return aVar;
                }
                str2 = ((l8.b) obj).a;
                if (str2 != null) {
                }
            } catch (Exception unused) {
                return new g(b.a(new zzcg(zzce.zzb, zzcd.zzau, null, null, 12, null)));
            }
        } catch (Exception unused2) {
            return new g(b.a(new zzcg(zzce.zzb, zzcd.zzat, null, null, 12, null)));
        }
    }
}
