package androidx.car.app;

import android.os.Parcel;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public class j extends RuntimeException {
    public /* synthetic */ j() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public j(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
