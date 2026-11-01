package e6;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new p(1);
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
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.a);
        h0.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        h0.l(parcel, 4, this.c);
        h0.r(parcel, q6);
    }
}
