package j8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import n6.l;
import w7.e0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new j(14);
    public final String a;

    public e(String str) {
        l.i(str, "json must not be null");
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.a);
        e0.r(parcel, q6);
    }
}
