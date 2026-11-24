// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class a0f extends b4 {
    public static final Parcelable.Creator<a0f> CREATOR = new c0f((byte) 4);
    public final byte[] a;

    public a0f(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.c(parcel, 1, this.a);
        jte.s(parcel, r);
    }
}
