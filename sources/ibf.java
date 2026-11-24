// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ibf extends b4 {
    public static final Parcelable.Creator<ibf> CREATOR = new e2f((byte) 18);
    public final int a;
    public final ArrayList b;
    public final boe c;

    public ibf(int i, ArrayList arrayList, boe boeVar) {
        this.a = i;
        this.b = arrayList;
        this.c = boeVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        mve.p(parcel, 2, this.b);
        mve.k(parcel, 3, this.c, i);
        mve.s(parcel, r);
    }
}
