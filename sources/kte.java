// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
