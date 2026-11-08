package androidx.car.app;

import android.os.Parcel;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class j extends RuntimeException {
    public j() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j(String str, Parcel parcel) {
        super(r2.toString());
        int dataPosition = parcel.dataPosition();
        int dataSize = parcel.dataSize();
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(dataPosition).length() + 6 + String.valueOf(dataSize).length());
        sb2.append(str);
        sb2.append(" Parcel: pos=");
        sb2.append(dataPosition);
        sb2.append(" size=");
        sb2.append(dataSize);
    }
}
