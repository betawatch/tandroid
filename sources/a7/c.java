package a7;

import android.os.Parcel;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class c extends RuntimeException {
    public /* synthetic */ c() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public c(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
