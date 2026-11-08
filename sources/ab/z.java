package ab;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class z extends r6.a {
    public static final Parcelable.Creator<z> CREATOR = new w.a(9);
    public final Bundle a;
    public a0.f b;

    public z(Bundle bundle) {
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.b(parcel, 2, this.a);
        xb.s(parcel, r10);
    }
}
