package org.telegram.messenger;

import android.app.Notification;
import android.content.Context;
import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class z8 {
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
