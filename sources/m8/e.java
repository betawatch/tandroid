package m8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import q6.m;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new m6.e(6);
    public final String a;

    public e(String str) {
        m.h(str, "json must not be null");
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.a);
        xb.s(parcel, r10);
    }
}
