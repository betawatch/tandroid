// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ce1 extends b4 {
    public static final Parcelable.Creator<ce1> CREATOR = new t0e((byte) 10);
    public ArrayList a;
    public boolean b;
    public boolean c;
    public int d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.h(parcel, 1, this.a);
        boolean z = this.b;
        mve.q(parcel, 2, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.c;
        mve.q(parcel, 3, 4);
        parcel.writeInt(z2 ? 1 : 0);
        int i2 = this.d;
        mve.q(parcel, 4, 4);
        parcel.writeInt(i2);
        mve.s(parcel, r);
    }
}
