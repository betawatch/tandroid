package com.google.android.recaptcha.internal;

import android.app.Application;
import b8.ib;
import c8.e;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.tasks.Task;
import dd.g;
import dd.k;
import fd.c;
import hd.j;
import n8.b;
import n8.f;
import od.p;
import wd.e0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    @Override // hd.a
    public final c create(Object obj, c cVar) {
        return new zzr(this.zzb, this.zzc, cVar);
    }

    @Override // od.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzr) create((zzhk) obj, (c) obj2)).invokeSuspend(k.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008e  */
    @Override // hd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        e0 e0Var;
        String str;
        String str2;
        gd.a aVar = gd.a.a;
        int i3 = this.zza;
        try {
            try {
                if (i3 == 0) {
                    ib.b(obj);
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
                    if (i3 != 1) {
                        ib.b(obj);
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
                        return new g((zzxx) zzf.zzk());
                    }
                    ib.b(obj);
                }
                n8.a aVar2 = new n8.a();
                zzu zzuVar = this.zzb;
                str = zzuVar.zzb;
                aVar2.a = str != null ? str : null;
                aVar2.b = this.zzc;
                Application context = zzu.zzl(zzuVar);
                kotlin.jvm.internal.j.e(context, "context");
                e eVar = new e(context, e.l, com.google.android.gms.common.api.b.j, i.c);
                s b10 = t.b();
                b10.d = new m6.c[]{f.a};
                b10.c = new c6.i(aVar2, 8);
                b10.a = 34002;
                Task e10 = eVar.e(0, b10.a());
                kotlin.jvm.internal.j.d(e10, "doRead(...)");
                e0 zza = zzdf.zza(e10);
                this.zza = 2;
                obj = zza.await(this);
                if (obj == aVar) {
                    return aVar;
                }
                str2 = ((b) obj).a;
                if (str2 != null) {
                }
            } catch (Exception unused) {
                return new g(ib.a(new zzcg(zzce.zzb, zzcd.zzau, null, null, 12, null)));
            }
        } catch (Exception unused2) {
            return new g(ib.a(new zzcg(zzce.zzb, zzcd.zzat, null, null, 12, null)));
        }
    }
}
