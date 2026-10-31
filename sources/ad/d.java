package ad;

import android.os.Parcel;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class d extends RuntimeException {
    public /* synthetic */ d() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public d(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
