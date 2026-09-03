package k8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import j8.t;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c extends c6.a {
    public static final Parcelable.Creator<c> CREATOR = new t(20);
    public String a;
    public d b;
    public f c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.a);
        f5.k(parcel, 3, this.b, i10);
        f5.k(parcel, 5, this.c, i10);
        f5.r(parcel, q10);
    }
}
