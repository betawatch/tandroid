// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class kte {
    public static yo9 a(byte[] bArr, Parcelable.Creator creator) {
        fre.h(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        yo9 yo9Var = (yo9) creator.createFromParcel(obtain);
        obtain.recycle();
        return yo9Var;
    }
}
