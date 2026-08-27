package c7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import h7.r8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class x extends z5.a implements com.google.android.gms.common.api.q {
    public static final Parcelable.Creator<x> CREATOR = new n(4);
    public final Status a;

    public x(Status status) {
        this.a = status;
    }

    @Override // com.google.android.gms.common.api.q
    public final Status i() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.k(parcel, 1, this.a, i10);
        r8.r(parcel, q6);
    }
}
