package androidx.car.app;

import android.os.Parcel;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public class j extends RuntimeException {
    public /* synthetic */ j() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public j(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
