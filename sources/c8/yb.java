package c8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
