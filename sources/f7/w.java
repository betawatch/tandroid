package f7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import j7.f5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class w extends c6.a implements com.google.android.gms.common.api.q {
    public static final Parcelable.Creator<w> CREATOR = new n(4);
    public final Status a;

    public w(Status status) {
        this.a = status;
    }

    @Override // com.google.android.gms.common.api.q
    public final Status i() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 1, this.a, i10);
        f5.r(parcel, q10);
    }
}
