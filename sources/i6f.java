// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class i6f extends b4 {
    public static final Parcelable.Creator<i6f> CREATOR = new c0f(11);
    public final float a;
    public final int b;

    public i6f(float f, int i) {
        this.a = f;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeFloat(this.a);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        jte.s(parcel, r);
    }
}
