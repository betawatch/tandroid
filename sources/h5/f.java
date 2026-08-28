package h5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import x5.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f extends y5.a {
    public static final Parcelable.Creator<f> CREATOR = new h(1);
    public final PendingIntent a;

    public f(PendingIntent pendingIntent) {
        l.h(pendingIntent);
        this.a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 1, this.a, i9);
        p8.r(parcel, q10);
    }
}
