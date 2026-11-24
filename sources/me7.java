// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class me7 extends b4 {
    public static final Parcelable.Creator<me7> CREATOR = new hv6((byte) 29);
    public final boolean a;
    public final int b;

    public me7(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        jte.s(parcel, r);
    }
}
