package org.telegram.messenger;

import android.app.Notification;
import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class v3 {
    public static /* synthetic */ Notification.Builder a(FilesMigrationService filesMigrationService, String str) {
        return new Notification.Builder(filesMigrationService, str);
    }

    public static /* synthetic */ SurfaceTexture b() {
        return new SurfaceTexture(false);
    }
}
