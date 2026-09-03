package j7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class h5 {
    public static c6.b a(byte[] bArr, Parcelable.Creator creator) {
        b6.m.h(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        c6.b bVar = (c6.b) creator.createFromParcel(obtain);
        obtain.recycle();
        return bVar;
    }
}
