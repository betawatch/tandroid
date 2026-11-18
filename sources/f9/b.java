package f9;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.graphics.SurfaceTexture;
import org.telegram.messenger.FilesMigrationService;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
