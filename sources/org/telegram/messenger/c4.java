package org.telegram.messenger;

import android.app.Notification;
import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class c4 {
    public static /* synthetic */ Notification.Builder a(FilesMigrationService filesMigrationService, String str) {
        return new Notification.Builder(filesMigrationService, str);
    }

    public static /* synthetic */ SurfaceTexture b() {
        return new SurfaceTexture(false);
    }
}
