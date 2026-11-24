// default package

import android.app.Notification;
import android.app.Person;
import android.os.Parcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class dl7 {
    public static Parcelable a(Person person) {
        return person;
    }

    public static Notification.MessagingStyle.Message b(CharSequence charSequence, long j, Person person) {
        return new Notification.MessagingStyle.Message(charSequence, j, person);
    }
}
