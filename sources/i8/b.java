package i8;

import android.os.Parcel;
import android.os.Parcelable;
import f8.o;
import j7.f5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        int q10 = f5.q(parcel, 20293);
        int i11 = this.a;
        f5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.b;
        f5.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.c;
        f5.s(parcel, 4, 4);
        parcel.writeInt(i13);
        boolean z4 = this.d;
        f5.s(parcel, 5, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z10 = this.e;
        f5.s(parcel, 6, 4);
        parcel.writeInt(z10 ? 1 : 0);
        float f10 = this.f;
        f5.s(parcel, 7, 4);
        parcel.writeFloat(f10);
        f5.r(parcel, q10);
    }
}
