package j8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c extends c6.a {
    public static final Parcelable.Creator<c> CREATOR = new t(3);
    public ArrayList a;
    public boolean b;
    public boolean c;
    public int d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.h(parcel, 1, this.a);
        boolean z4 = this.b;
        f5.s(parcel, 2, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z10 = this.c;
        f5.s(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i11 = this.d;
        f5.s(parcel, 4, 4);
        parcel.writeInt(i11);
        f5.r(parcel, q10);
    }
}
