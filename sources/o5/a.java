package o5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new l4.j(16);
    public final int a;
    public final int b;
    public final Bundle c;

    public a(int i10, int i11, Bundle bundle) {
        this.a = i10;
        this.b = i11;
        this.c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        f5.b(parcel, 3, this.c);
        f5.r(parcel, q10);
    }
}
