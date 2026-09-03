package e0;

import android.app.Notification;
import android.net.Uri;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class x {
    public static Notification.MessagingStyle.Message a(CharSequence charSequence, long j10, CharSequence charSequence2) {
        return new Notification.MessagingStyle.Message(charSequence, j10, charSequence2);
    }

    public static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
        return message.setData(str, uri);
    }
}
