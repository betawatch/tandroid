package e0;

import android.app.Notification;
import android.net.Uri;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public abstract class u {
    public static Notification.MessagingStyle.Message a(CharSequence charSequence, long j10, CharSequence charSequence2) {
        return new Notification.MessagingStyle.Message(charSequence, j10, charSequence2);
    }

    public static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
        return message.setData(str, uri);
    }
}
