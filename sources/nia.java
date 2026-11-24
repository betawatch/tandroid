// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class nia extends b4 {
    public static final Parcelable.Creator<nia> CREATOR = new v6d((byte) 22);
    public ArrayList a;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.n(parcel, 1, this.a);
        mve.s(parcel, r);
    }
}
