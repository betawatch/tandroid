package g8;

import android.os.Parcel;
import android.os.Parcelable;
import f8.r;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f extends y5.a {
    public static final Parcelable.Creator<f> CREATOR = new r(26);
    public long a;
    public long b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        long j10 = this.a;
        p8.s(parcel, 2, 8);
        parcel.writeLong(j10);
        long j11 = this.b;
        p8.s(parcel, 3, 8);
        parcel.writeLong(j11);
        p8.r(parcel, q10);
    }
}
