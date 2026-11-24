// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class fvd extends b4 {
    public static final Parcelable.Creator<fvd> CREATOR = new rpd((byte) 23);
    public final int a;
    public final ArrayList b;

    public fvd(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        jte.p(parcel, 3, this.b);
        jte.s(parcel, r);
    }
}
