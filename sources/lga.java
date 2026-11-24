// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class lga extends b4 {
    public static final Parcelable.Creator<lga> CREATOR = new t4d((byte) 22);
    public ArrayList a;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.n(parcel, 1, this.a);
        jte.s(parcel, r);
    }
}
