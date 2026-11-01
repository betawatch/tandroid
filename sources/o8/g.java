package o8;

import android.os.Parcel;
import android.os.Parcelable;
import m8.i;
import n6.u;
import w7.h0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new i(21);
    public final int a;
    public final u b;

    public g(int i10, u uVar) {
        this.a = i10;
        this.b = uVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        h0.k(parcel, 2, this.b, i10);
        h0.r(parcel, q6);
    }
}
