package e0;

import android.app.Notification;
import android.net.Uri;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public abstract class x {
    public static Notification.MessagingStyle.Message a(CharSequence charSequence, long j3, CharSequence charSequence2) {
        return new Notification.MessagingStyle.Message(charSequence, j3, charSequence2);
    }

    public static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
        return message.setData(str, uri);
    }
}
