package k8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import j8.t;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class f extends c6.a {
    public static final Parcelable.Creator<f> CREATOR = new t(22);
    public long a;
    public long b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        long j10 = this.a;
        g5.s(parcel, 2, 8);
        parcel.writeLong(j10);
        long j11 = this.b;
        g5.s(parcel, 3, 8);
        parcel.writeLong(j11);
        g5.r(parcel, q10);
    }
}
