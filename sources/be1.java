// default package

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class be1 extends b4 {
    public static final Parcelable.Creator<be1> CREATOR = new urd((byte) 18);
    public String a;
    public String b;
    public String c;
    public int d;
    public UserAddress e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 1, this.a);
        mve.l(parcel, 2, this.b);
        mve.l(parcel, 3, this.c);
        int i2 = this.d;
        mve.q(parcel, 4, 4);
        parcel.writeInt(i2);
        mve.k(parcel, 5, this.e, i);
        mve.s(parcel, r);
    }
}
