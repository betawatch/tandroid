package j8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class r extends c6.a {
    public static final Parcelable.Creator<r> CREATOR = new f8.o(27);
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public r(int i10, int i11, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i10;
        this.d = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.a);
        f5.l(parcel, 3, this.b);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        f5.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        f5.r(parcel, q10);
    }
}
