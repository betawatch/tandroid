// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
