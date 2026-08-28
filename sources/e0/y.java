package e0;

import android.app.Notification;
import android.app.Person;
import android.os.Parcelable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class y {
    public static Parcelable a(Person person) {
        return person;
    }

    public static Notification.MessagingStyle.Message b(CharSequence charSequence, long j10, Person person) {
        return new Notification.MessagingStyle.Message(charSequence, j10, person);
    }
}
