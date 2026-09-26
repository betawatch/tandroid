package androidx.car.app;

import android.os.Parcel;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public class j extends RuntimeException {
    public /* synthetic */ j() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public j(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
