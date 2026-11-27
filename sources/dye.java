// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class dye {
    public static qs9 a(byte[] bArr, Parcelable.Creator creator) {
        xve.h(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        qs9 qs9Var = (qs9) creator.createFromParcel(obtain);
        obtain.recycle();
        return qs9Var;
    }
}
