// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class mgb extends b4 {
    public static final Parcelable.Creator<mgb> CREATOR = new b1d((byte) 0);
    public final int a;
    public List b;

    public mgb(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        jte.p(parcel, 2, this.b);
        jte.s(parcel, r);
    }
}
