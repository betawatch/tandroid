// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class k8f extends b4 {
    public static final Parcelable.Creator<k8f> CREATOR = new e2f(11);
    public final float a;
    public final int b;

    public k8f(float f, int i) {
        this.a = f;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeFloat(this.a);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        mve.s(parcel, r);
    }
}
