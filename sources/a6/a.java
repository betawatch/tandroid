package a6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new w.a(1);
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
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        e0.b(parcel, 3, this.c);
        e0.r(parcel, q6);
    }
}
