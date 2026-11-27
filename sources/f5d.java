// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class f5d extends c4 {
    public static final Parcelable.Creator<f5d> CREATOR = new mx6((byte) 26);
    public final List a;

    public f5d(List list) {
        list.getClass();
        this.a = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = bye.r(parcel, 20293);
        bye.h(parcel, 1, this.a);
        bye.s(parcel, r);
    }
}
