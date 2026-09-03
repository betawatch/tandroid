package e0;

import android.app.Notification;
import android.app.Person;
import android.os.Parcelable;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class y {
    public static Parcelable a(Person person) {
        return person;
    }

    public static Notification.MessagingStyle.Message b(CharSequence charSequence, long j10, Person person) {
        return new Notification.MessagingStyle.Message(charSequence, j10, person);
    }
}
