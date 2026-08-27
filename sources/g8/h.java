package g8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h extends z5.a {
    public static final Parcelable.Creator<h> CREATOR = new f4.e(27);
    public PendingIntent a;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.k(parcel, 1, this.a, i10);
        r8.r(parcel, q6);
    }
}
