// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mt5 extends b4 {
    public static final Parcelable.Creator<mt5> CREATOR = new e2f((byte) 16);
    public ArrayList a;
    public String b;
    public String c;
    public ArrayList d;
    public boolean e;
    public String f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.h(parcel, 2, this.a);
        mve.l(parcel, 4, this.b);
        mve.l(parcel, 5, this.c);
        mve.h(parcel, 6, this.d);
        boolean z = this.e;
        mve.q(parcel, 7, 4);
        parcel.writeInt(z ? 1 : 0);
        mve.l(parcel, 8, this.f);
        mve.s(parcel, r);
    }
}
