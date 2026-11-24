// default package

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class kd6 extends b4 implements uc9 {
    public static final Parcelable.Creator<kd6> CREATOR = new v6d((byte) 3);
    public final Status a;
    public final ld6 b;

    public kd6(Status status, ld6 ld6Var) {
        this.a = status;
        this.b = ld6Var;
    }

    @Override // uc9
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 1, this.a, i);
        mve.k(parcel, 2, this.b, i);
        mve.s(parcel, r);
    }
}
