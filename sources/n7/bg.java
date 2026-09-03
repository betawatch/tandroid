package n7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class bg extends c6.a {
    public static final Parcelable.Creator<bg> CREATOR = new dg(0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    public bg(int i10, int i11, int i12, long j10, int i13) {
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
        this.e = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = j7.g5.q(parcel, 20293);
        j7.g5.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        j7.g5.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        j7.g5.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        j7.g5.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        j7.g5.s(parcel, 5, 8);
        parcel.writeLong(this.e);
        j7.g5.r(parcel, q10);
    }
}
