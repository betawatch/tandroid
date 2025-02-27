package com.google.android.gms.internal.cast;

import android.os.Build;
import org.telegram.tgnet.ConnectionsManager;

/* loaded from: classes.dex */
public abstract class zzdy {
    public static final int zza;

    static {
        zza = Build.VERSION.SDK_INT >= 23 ? ConnectionsManager.FileTypeFile : 0;
    }
}
