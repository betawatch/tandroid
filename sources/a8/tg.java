package a8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class tg extends p6.a {
    public static final Parcelable.Creator<tg> CREATOR = new vg(0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    public tg(int i10, int i11, int i12, long j10, int i13) {
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
        this.e = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        df.s(parcel, 5, 8);
        parcel.writeLong(this.e);
        df.r(parcel, q5);
    }
}
