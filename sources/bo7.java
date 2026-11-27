// default package

import android.app.Notification;
import android.net.Uri;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class bo7 {
    public static Notification.MessagingStyle.Message a(CharSequence charSequence, long j, CharSequence charSequence2) {
        return new Notification.MessagingStyle.Message(charSequence, j, charSequence2);
    }

    public static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
        return message.setData(str, uri);
    }
}
