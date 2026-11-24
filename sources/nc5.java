// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class nc5 extends b4 {
    public static final Parcelable.Creator<nc5> CREATOR = new igd(3);
    public final String a;
    public final byte[] b;
    public final int c;

    public nc5(int i, String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.c(parcel, 3, this.b);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        jte.s(parcel, r);
    }
}
