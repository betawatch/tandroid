package c9;

import android.app.Notification;
import android.app.NotificationChannel;
import android.graphics.SurfaceTexture;
import org.telegram.messenger.FilesMigrationService;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ Notification.Builder a(FilesMigrationService filesMigrationService, String str) {
        return new Notification.Builder(filesMigrationService, str);
    }

    public static /* synthetic */ NotificationChannel b(String str) {
        return new NotificationChannel("Assistant_verifier", str, 2);
    }

    public static /* synthetic */ SurfaceTexture c() {
        return new SurfaceTexture(false);
    }

    public static /* synthetic */ void d() {
    }
}
