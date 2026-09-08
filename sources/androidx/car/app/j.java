package androidx.car.app;

import android.os.Parcel;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class j extends RuntimeException {
    public /* synthetic */ j() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public j(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
