package com.google.android.exoplayer2.upstream;

import android.system.ErrnoException;
import android.system.OsConstants;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class b0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Throwable th2) {
        return (th2 instanceof ErrnoException) && ((ErrnoException) th2).errno == OsConstants.EACCES;
    }
}
