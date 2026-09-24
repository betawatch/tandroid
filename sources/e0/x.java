package e0;

import android.app.Notification;
import android.net.Uri;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public abstract class x {
    public static Notification.MessagingStyle.Message a(CharSequence charSequence, long j3, CharSequence charSequence2) {
        return new Notification.MessagingStyle.Message(charSequence, j3, charSequence2);
    }

    public static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
        return message.setData(str, uri);
    }
}
