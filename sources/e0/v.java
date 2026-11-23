package e0;

import android.app.Notification;
import android.app.Person;
import android.os.Parcelable;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public abstract class v {
    public static Parcelable a(Person person) {
        return person;
    }

    public static Notification.MessagingStyle.Message b(CharSequence charSequence, long j3, Person person) {
        return new Notification.MessagingStyle.Message(charSequence, j3, person);
    }
}
