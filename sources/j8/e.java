package j8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class e extends c6.a {
    public static final Parcelable.Creator<e> CREATOR = new t(6);
    public ArrayList a;
    public String b;
    public String c;
    public ArrayList d;
    public boolean e;
    public String f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.h(parcel, 2, this.a);
        f5.l(parcel, 4, this.b);
        f5.l(parcel, 5, this.c);
        f5.h(parcel, 6, this.d);
        boolean z4 = this.e;
        f5.s(parcel, 7, 4);
        parcel.writeInt(z4 ? 1 : 0);
        f5.l(parcel, 8, this.f);
        f5.r(parcel, q10);
    }
}
