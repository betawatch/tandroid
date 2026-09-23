package e0;

import android.app.Notification;
import android.net.Uri;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public abstract class x {
    public static Notification.MessagingStyle.Message a(CharSequence charSequence, long j3, CharSequence charSequence2) {
        return new Notification.MessagingStyle.Message(charSequence, j3, charSequence2);
    }

    public static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
        return message.setData(str, uri);
    }
}
