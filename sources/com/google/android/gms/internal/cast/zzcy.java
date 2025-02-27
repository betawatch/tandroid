package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.cast.internal.Logger;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class zzcy {
    protected final Logger zza;
    protected final zzda zzb;

    public zzcy(Context context) {
        zzda zzddVar = Build.VERSION.SDK_INT >= 23 ? new zzdd(context, zzsc.zza(Executors.newFixedThreadPool(3))) : new zzde();
        this.zza = new Logger("BaseNetUtils");
        this.zzb = zzddVar;
        zzddVar.zza();
    }
}
