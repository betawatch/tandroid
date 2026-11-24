// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ek5 extends b4 {
    public static final Parcelable.Creator<ek5> CREATOR = new qyd((byte) 21);
    public final int a;
    public final int b;
    public final int c;

    public ek5(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        jte.s(parcel, r);
    }
}
