package c8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class sb {
    public static Parcelable a(Parcelable parcelable, Parcelable.Creator creator) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } finally {
            obtain.recycle();
        }
    }
}
