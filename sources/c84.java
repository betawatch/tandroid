// default package

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class c84 extends b4 {
    public static final Parcelable.Creator<c84> CREATOR = new f41((byte) 17);
    public final Bundle a;

    public c84(Bundle bundle) {
        bundle.getClass();
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = mve.r(parcel, 20293);
        mve.b(parcel, 1, this.a);
        mve.s(parcel, r);
    }
}
