package org.telegram.messenger;

import android.app.Notification;
import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class v3 {
    public static /* synthetic */ Notification.Builder a(FilesMigrationService filesMigrationService, String str) {
        return new Notification.Builder(filesMigrationService, str);
    }

    public static /* synthetic */ SurfaceTexture b() {
        return new SurfaceTexture(false);
    }
}
