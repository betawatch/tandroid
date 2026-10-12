package org.telegram.messenger;

import android.app.Notification;
import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract /* synthetic */ class y3 {
    public static /* synthetic */ Notification.Builder a(FilesMigrationService filesMigrationService, String str) {
        return new Notification.Builder(filesMigrationService, str);
    }

    public static /* synthetic */ SurfaceTexture b() {
        return new SurfaceTexture(false);
    }
}
