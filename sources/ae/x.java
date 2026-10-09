package ae;

import android.os.Parcel;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public class x extends RuntimeException {
    public /* synthetic */ x() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public x(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
