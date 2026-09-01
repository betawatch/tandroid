package f8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new b9.e(22);
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean h;
    public String n;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        int i11 = this.a;
        g5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.b;
        g5.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.c;
        g5.s(parcel, 4, 4);
        parcel.writeInt(i13);
        int i14 = this.d;
        g5.s(parcel, 5, 4);
        parcel.writeInt(i14);
        int i15 = this.e;
        g5.s(parcel, 6, 4);
        parcel.writeInt(i15);
        int i16 = this.f;
        g5.s(parcel, 7, 4);
        parcel.writeInt(i16);
        boolean z4 = this.h;
        g5.s(parcel, 8, 4);
        parcel.writeInt(z4 ? 1 : 0);
        g5.l(parcel, 9, this.n);
        g5.r(parcel, q10);
    }
}
