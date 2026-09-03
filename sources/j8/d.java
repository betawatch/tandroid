package j8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class d extends c6.a {
    public static final Parcelable.Creator<d> CREATOR = new t(5);
    public String a;
    public String b;
    public int c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.a);
        g5.l(parcel, 3, this.b);
        int i11 = this.c;
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            i11 = 0;
        }
        g5.s(parcel, 4, 4);
        parcel.writeInt(i11);
        g5.r(parcel, q10);
    }
}
