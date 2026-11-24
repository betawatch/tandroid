// default package

import android.app.Notification;
import android.app.PictureInPictureParams;
import android.content.Context;
import android.graphics.SurfaceTexture;
import org.telegram.messenger.FilesMigrationService;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract /* synthetic */ class fl {
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
