// default package

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class c38 extends c4 {
    public static final Parcelable.Creator<c38> CREATOR = new m9d((byte) 15);
    public int a;
    public Bundle b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        int i2 = this.a;
        bye.q(parcel, 2, 4);
        parcel.writeInt(i2);
        bye.b(parcel, 3, this.b);
        bye.s(parcel, r);
    }
}
