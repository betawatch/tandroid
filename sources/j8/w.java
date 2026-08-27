package j8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import h7.r8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class w extends z5.a {
    public static final Parcelable.Creator<w> CREATOR = new c(18);
    public final int a;
    public final ConnectionConfiguration b;

    public w(int i10, ConnectionConfiguration connectionConfiguration) {
        this.a = i10;
        this.b = connectionConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        r8.k(parcel, 3, this.b, i10);
        r8.r(parcel, q6);
    }
}
