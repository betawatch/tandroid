package e6;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new i(2);
    public final String a;
    public final int b;
    public final String c;

    public d(String str, int i10, String str2) {
        this.a = str;
        this.b = i10;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.a);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        g0.l(parcel, 4, this.c);
        g0.r(parcel, q6);
    }
}
