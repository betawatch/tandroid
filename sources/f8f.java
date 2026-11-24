// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class f8f extends b4 {
    public static final Parcelable.Creator<f8f> CREATOR = new e2f((byte) 10);
    public final String a;
    public final float b;
    public final String c;
    public final int d;

    public f8f(float f, int i, String str, String str2) {
        this.a = str;
        this.b = f;
        this.c = str2;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 1, this.a);
        mve.q(parcel, 2, 4);
        parcel.writeFloat(this.b);
        mve.l(parcel, 3, this.c);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        mve.s(parcel, r);
    }
}
