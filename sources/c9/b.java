package c9;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.graphics.SurfaceTexture;
import org.telegram.messenger.FilesMigrationService;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static /* synthetic */ Notification.Builder b(FilesMigrationService filesMigrationService, String str) {
        return new Notification.Builder(filesMigrationService, str);
    }

    public static /* synthetic */ NotificationChannel c(String str) {
        return new NotificationChannel("Assistant_verifier", str, 2);
    }

    public static /* synthetic */ SurfaceTexture d() {
        return new SurfaceTexture(false);
    }

    public static /* synthetic */ void e() {
    }
}
