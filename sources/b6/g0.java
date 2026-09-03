package b6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class g0 extends c6.a {
    public static final Parcelable.Creator<g0> CREATOR = new w.a(26);
    public Bundle a;
    public y5.c[] b;
    public int c;
    public e d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.b(parcel, 1, this.a);
        g5.o(parcel, 2, this.b, i10);
        int i11 = this.c;
        g5.s(parcel, 3, 4);
        parcel.writeInt(i11);
        g5.k(parcel, 4, this.d, i10);
        g5.r(parcel, q10);
    }
}
