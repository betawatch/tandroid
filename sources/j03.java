// default package

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class j03 extends b4 {
    public static final Parcelable.Creator<j03> CREATOR = new x21((byte) 12);
    public final String a;
    public final Bundle b;

    public j03(String str, Bundle bundle) {
        str.getClass();
        bundle.getClass();
        this.a = str;
        this.b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 1, this.a);
        jte.b(parcel, 2, this.b);
        jte.s(parcel, r);
    }
}
