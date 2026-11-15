package c8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class tb {
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
