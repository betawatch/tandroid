package h5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import y5.l;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f extends z5.a {
    public static final Parcelable.Creator<f> CREATOR = new h(0);
    public final PendingIntent a;

    public f(PendingIntent pendingIntent) {
        l.h(pendingIntent);
        this.a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.k(parcel, 1, this.a, i10);
        r8.r(parcel, q6);
    }
}
