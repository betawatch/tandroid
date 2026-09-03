package c8;

import android.os.Parcel;
import android.os.Parcelable;
import b6.v;
import j7.g5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class g extends c6.a {
    public static final Parcelable.Creator<g> CREATOR = new b9.e(4);
    public final int a;
    public final v b;

    public g(int i10, v vVar) {
        this.a = i10;
        this.b = vVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        g5.k(parcel, 2, this.b, i10);
        g5.r(parcel, q10);
    }
}
