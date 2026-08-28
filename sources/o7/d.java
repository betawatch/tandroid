package o7;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import o5.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d extends y5.a {
    public static final Parcelable.Creator<d> CREATOR = new p(2);
    public final byte[] a;

    public d(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.c(parcel, 2, this.a);
        p8.r(parcel, q10);
    }
}
