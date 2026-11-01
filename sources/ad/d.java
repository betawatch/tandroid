package ad;

import android.os.Parcel;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public class d extends RuntimeException {
    public /* synthetic */ d() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public d(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
