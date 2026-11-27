// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class i3e extends c4 {
    public static final Parcelable.Creator<i3e> CREATOR = new hud((byte) 17);
    public int a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public float f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        int i2 = this.a;
        bye.q(parcel, 2, 4);
        parcel.writeInt(i2);
        int i3 = this.b;
        bye.q(parcel, 3, 4);
        parcel.writeInt(i3);
        int i4 = this.c;
        bye.q(parcel, 4, 4);
        parcel.writeInt(i4);
        boolean z = this.d;
        bye.q(parcel, 5, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.e;
        bye.q(parcel, 6, 4);
        parcel.writeInt(z2 ? 1 : 0);
        float f = this.f;
        bye.q(parcel, 7, 4);
        parcel.writeFloat(f);
        bye.s(parcel, r);
    }
}
