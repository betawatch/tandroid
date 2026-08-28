package g7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class q8 {
    public static y5.b a(byte[] bArr, Parcelable.Creator creator) {
        x5.l.h(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        y5.b bVar = (y5.b) creator.createFromParcel(obtain);
        obtain.recycle();
        return bVar;
    }
}
