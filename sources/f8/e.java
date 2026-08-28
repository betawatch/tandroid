package f8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e extends y5.a {
    public static final Parcelable.Creator<e> CREATOR = new r(10);
    public ArrayList a;
    public String b;
    public String c;
    public ArrayList d;
    public boolean e;
    public String f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.h(parcel, 2, this.a);
        p8.l(parcel, 4, this.b);
        p8.l(parcel, 5, this.c);
        p8.h(parcel, 6, this.d);
        boolean z10 = this.e;
        p8.s(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        p8.l(parcel, 8, this.f);
        p8.r(parcel, q10);
    }
}
