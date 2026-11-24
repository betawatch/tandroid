// default package

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class lb6 extends b4 implements ua9 {
    public static final Parcelable.Creator<lb6> CREATOR = new t4d((byte) 3);
    public final Status a;
    public final mb6 b;

    public lb6(Status status, mb6 mb6Var) {
        this.a = status;
        this.b = mb6Var;
    }

    @Override // ua9
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 1, this.a, i);
        jte.k(parcel, 2, this.b, i);
        jte.s(parcel, r);
    }
}
