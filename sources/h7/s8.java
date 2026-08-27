package h7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class s8 {
    public static z5.b a(byte[] bArr, Parcelable.Creator creator) {
        y5.l.h(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        z5.b bVar = (z5.b) creator.createFromParcel(obtain);
        obtain.recycle();
        return bVar;
    }
}
