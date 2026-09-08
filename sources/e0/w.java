package e0;

import android.app.Notification;
import android.app.Person;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class w {
    public static Notification.MessagingStyle a(Person person) {
        return new Notification.MessagingStyle(person);
    }

    public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z10) {
        return messagingStyle.setGroupConversation(z10);
    }
}
