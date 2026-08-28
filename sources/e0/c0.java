package e0;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.os.Bundle;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class c0 {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, Bundle bundle) {
        return builder.addExtras(bundle);
    }

    public static Notification.Action.Builder b(Notification.Action.Builder builder, RemoteInput remoteInput) {
        return builder.addRemoteInput(remoteInput);
    }

    public static Notification.Action c(Notification.Action.Builder builder) {
        return builder.build();
    }

    public static Notification.Action.Builder d(int i9, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(i9, charSequence, pendingIntent);
    }
}
