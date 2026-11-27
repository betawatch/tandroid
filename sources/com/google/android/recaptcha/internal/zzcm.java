package com.google.android.recaptcha.internal;

import java.util.concurrent.Executors;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zzcm implements zzcr {
    private final ux2 zza;
    private final ux2 zzb;
    private final ux2 zzc;
    private final ux2 zzd;

    public zzcm() {
        lfb lfbVar = new lfb();
        qc3 qc3Var = bp3.a;
        this.zza = new xw2(azd.c(lfbVar, zi6.a));
        xw2 a = xde.a(new p54(Executors.newSingleThreadExecutor()));
        fud.b(a, new zzcl(null));
        this.zzb = a;
        this.zzc = xde.a(qb3.c);
        xw2 a2 = xde.a(new p54(Executors.newSingleThreadExecutor()));
        fud.b(a2, new zzck(null));
        this.zzd = a2;
        fud.b(xde.a(new p54(Executors.newSingleThreadExecutor())), new zzcj(null));
    }

    @Override // com.google.android.recaptcha.internal.zzcr
    public final ux2 zza() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzcr
    public final ux2 zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzcr
    public final ux2 zzc() {
        return this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzcr
    public final ux2 zzd() {
        return this.zzb;
    }
}
