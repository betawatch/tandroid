package k8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import j8.t;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class f extends c6.a {
    public static final Parcelable.Creator<f> CREATOR = new t(22);
    public long a;
    public long b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        long j10 = this.a;
        f5.s(parcel, 2, 8);
        parcel.writeLong(j10);
        long j11 = this.b;
        f5.s(parcel, 3, 8);
        parcel.writeLong(j11);
        f5.r(parcel, q10);
    }
}
