package j8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class c extends c6.a {
    public static final Parcelable.Creator<c> CREATOR = new t(3);
    public ArrayList a;
    public boolean b;
    public boolean c;
    public int d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.h(parcel, 1, this.a);
        boolean z4 = this.b;
        g5.s(parcel, 2, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z10 = this.c;
        g5.s(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i11 = this.d;
        g5.s(parcel, 4, 4);
        parcel.writeInt(i11);
        g5.r(parcel, q10);
    }
}
