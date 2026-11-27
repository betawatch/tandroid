// default package

import android.app.Notification;
import android.app.PictureInPictureParams;
import android.content.Context;
import android.graphics.SurfaceTexture;
import org.telegram.messenger.FilesMigrationService;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class gk {
    public static /* synthetic */ Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static /* synthetic */ Notification.Builder b(FilesMigrationService filesMigrationService, String str) {
        return new Notification.Builder(filesMigrationService, str);
    }

    public static /* synthetic */ PictureInPictureParams.Builder c() {
        return new PictureInPictureParams.Builder();
    }

    public static /* synthetic */ SurfaceTexture d() {
        return new SurfaceTexture(false);
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void f() {
    }

    public static /* synthetic */ void g() {
    }
}
