package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class u0 extends c6.a {
    public static final Parcelable.Creator<u0> CREATOR = new o0(6);
    public final int a;
    public final int b;

    public u0(int i10, int i11) {
        this.a = i10;
        this.b = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        g5.r(parcel, q10);
    }
}
