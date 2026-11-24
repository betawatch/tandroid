// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class g2d extends b4 {
    public static final Parcelable.Creator<g2d> CREATOR = new hx6((byte) 24);
    public final ArrayList a;

    public g2d(ArrayList arrayList) {
        arrayList.getClass();
        this.a = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = mve.r(parcel, 20293);
        mve.p(parcel, 1, this.a);
        mve.s(parcel, r);
    }
}
