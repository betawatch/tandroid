package b6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.List;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class p extends c6.a {
    public static final Parcelable.Creator<p> CREATOR = new w.a(20);
    public final int a;
    public List b;

    public p(int i10, List list) {
        this.a = i10;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        f5.p(parcel, 2, this.b);
        f5.r(parcel, q10);
    }
}
