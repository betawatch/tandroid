package org.telegram.messenger;

import android.app.Notification;
import android.content.Context;
import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class f9 {
    public static /* synthetic */ Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static /* synthetic */ Notification.Builder b(FilesMigrationService filesMigrationService, String str) {
        return new Notification.Builder(filesMigrationService, str);
    }

    public static /* synthetic */ SurfaceTexture c() {
        return new SurfaceTexture(false);
    }
}
