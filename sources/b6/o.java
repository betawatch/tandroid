package b6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class o extends c6.a {
    public static final Parcelable.Creator<o> CREATOR = new w.a(24);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public o(int i10, int i11, int i12, boolean z4, boolean z10) {
        this.a = i10;
        this.b = z4;
        this.c = z10;
        this.d = i11;
        this.e = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        g5.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        g5.r(parcel, q10);
    }
}
