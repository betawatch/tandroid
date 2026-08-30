package a7;

import android.os.Parcel;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class b extends RuntimeException {
    public /* synthetic */ b() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public b(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
