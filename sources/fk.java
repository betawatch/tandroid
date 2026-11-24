// default package

import android.app.Notification;
import android.app.PictureInPictureParams;
import android.content.Context;
import android.graphics.SurfaceTexture;
import org.telegram.messenger.FilesMigrationService;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract /* synthetic */ class fk {
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
