package ab;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class a0 extends r6.a {
    public static final Parcelable.Creator<a0> CREATOR = new w.a(9);
    public final Bundle a;
    public a0.f b;

    public a0(Bundle bundle) {
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.b(parcel, 2, this.a);
        yb.s(parcel, r10);
    }
}
