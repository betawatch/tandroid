package e0;

import android.app.Notification;
import android.app.Person;
import android.os.Parcelable;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class v {
    public static Parcelable a(Person person) {
        return person;
    }

    public static Notification.MessagingStyle.Message b(CharSequence charSequence, long j3, Person person) {
        return new Notification.MessagingStyle.Message(charSequence, j3, person);
    }
}
