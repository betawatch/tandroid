package i8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class w extends y5.a {
    public static final Parcelable.Creator<w> CREATOR = new c(18);
    public final int a;
    public final ConnectionConfiguration b;

    public w(int i9, ConnectionConfiguration connectionConfiguration) {
        this.a = i9;
        this.b = connectionConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        p8.k(parcel, 3, this.b, i9);
        p8.r(parcel, q10);
    }
}
