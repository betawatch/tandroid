package j8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class l extends c6.a {
    public static final Parcelable.Creator<l> CREATOR = new f8.o(26);
    public int a;
    public Bundle b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        int i11 = this.a;
        g5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        g5.b(parcel, 3, this.b);
        g5.r(parcel, q10);
    }
}
