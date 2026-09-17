package androidx.car.app;

import android.os.Parcel;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public class j extends RuntimeException {
    public /* synthetic */ j() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public j(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
