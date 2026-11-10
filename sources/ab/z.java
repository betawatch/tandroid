package ab;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
