// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
