package com.google.android.gms.internal.cloudmessaging;

import android.os.Build;
import org.telegram.tgnet.ConnectionsManager;

/* loaded from: classes.dex */
public abstract class zza {
    public static final int zza;

    static {
        zza = Build.VERSION.SDK_INT >= 31 ? ConnectionsManager.FileTypeVideo : 0;
    }
}
