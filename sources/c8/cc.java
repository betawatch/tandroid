package c8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public abstract class cc {
    public static r6.b a(byte[] bArr, Parcelable.Creator creator) {
        q6.m.h(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        r6.b bVar = (r6.b) creator.createFromParcel(obtain);
        obtain.recycle();
        return bVar;
    }
}
