package com.google.android.recaptcha.internal;

import java.util.concurrent.Executors;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class zzcm implements zzcr {
    private final ax2 zza;
    private final ax2 zzb;
    private final ax2 zzc;
    private final ax2 zzd;

    public zzcm() {
        pbb pbbVar = new pbb();
        xb3 xb3Var = ko3.a;
        this.zza = new dw2(kud.c(pbbVar, ug6.a));
        dw2 a = h9e.a(new t44(Executors.newSingleThreadExecutor()));
        ppd.b(a, new zzcl(null));
        this.zzb = a;
        this.zzc = h9e.a(xa3.c);
        dw2 a2 = h9e.a(new t44(Executors.newSingleThreadExecutor()));
        ppd.b(a2, new zzck(null));
        this.zzd = a2;
        ppd.b(h9e.a(new t44(Executors.newSingleThreadExecutor())), new zzcj(null));
    }

    @Override // com.google.android.recaptcha.internal.zzcr
    public final ax2 zza() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzcr
    public final ax2 zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzcr
    public final ax2 zzc() {
        return this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzcr
    public final ax2 zzd() {
        return this.zzb;
    }
}
