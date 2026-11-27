// default package

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class bld {
    public static final /* synthetic */ int a = 0;

    static {
        bld.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
