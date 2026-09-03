package i8;

import android.os.Parcel;
import android.os.Parcelable;
import f8.o;
import j7.g5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new o(10);
    public int a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public float f;

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
        boolean z4 = this.d;
        g5.s(parcel, 5, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z10 = this.e;
        g5.s(parcel, 6, 4);
        parcel.writeInt(z10 ? 1 : 0);
        float f10 = this.f;
        g5.s(parcel, 7, 4);
        parcel.writeFloat(f10);
        g5.r(parcel, q10);
    }
}
