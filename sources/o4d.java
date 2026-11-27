// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class o4d extends c4 {
    public static final Parcelable.Creator<o4d> CREATOR = new mx6((byte) 21);
    public final String a;

    public o4d(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 1, this.a);
        bye.s(parcel, r);
    }
}
