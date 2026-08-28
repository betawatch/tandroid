package f8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c extends y5.a {
    public static final Parcelable.Creator<c> CREATOR = new r(7);
    public ArrayList a;
    public boolean b;
    public boolean c;
    public int d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.h(parcel, 1, this.a);
        boolean z10 = this.b;
        p8.s(parcel, 2, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.c;
        p8.s(parcel, 3, 4);
        parcel.writeInt(z11 ? 1 : 0);
        int i10 = this.d;
        p8.s(parcel, 4, 4);
        parcel.writeInt(i10);
        p8.r(parcel, q10);
    }
}
