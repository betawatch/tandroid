package c8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public abstract class yb {
    public static r6.b a(byte[] bArr, Parcelable.Creator creator) {
        q6.m.g(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        r6.b bVar = (r6.b) creator.createFromParcel(obtain);
        obtain.recycle();
        return bVar;
    }
}
