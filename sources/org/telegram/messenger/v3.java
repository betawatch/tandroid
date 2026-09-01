package org.telegram.messenger;

import android.app.Notification;
import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class v3 {
    public static /* synthetic */ Notification.Builder a(FilesMigrationService filesMigrationService, String str) {
        return new Notification.Builder(filesMigrationService, str);
    }

    public static /* synthetic */ SurfaceTexture b() {
        return new SurfaceTexture(false);
    }
}
