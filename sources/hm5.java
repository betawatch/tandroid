// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class hm5 extends c4 {
    public static final Parcelable.Creator<hm5> CREATOR = new g3e((byte) 21);
    public final int a;
    public final int b;
    public final int c;

    public hm5(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        bye.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        bye.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        bye.s(parcel, r);
    }
}
