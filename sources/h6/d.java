package h6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import f7.t0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new t0(20);
    public final String a;
    public final int b;
    public final String c;

    public d(String str, int i7, String str2) {
        this.a = str;
        this.b = i7;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.a);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        bc.l(parcel, 4, this.c);
        bc.s(parcel, r10);
    }
}
