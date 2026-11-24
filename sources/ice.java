// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ice extends b4 {
    public static final Parcelable.Creator<ice> CREATOR = new rhe((byte) 1);
    public final int a;
    public final boolean b;

    public ice(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        jte.s(parcel, r);
    }
}
