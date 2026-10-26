package a8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class hf {
    public static p6.b a(byte[] bArr, Parcelable.Creator creator) {
        o6.l.h(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        p6.b bVar = (p6.b) creator.createFromParcel(obtain);
        obtain.recycle();
        return bVar;
    }
}
