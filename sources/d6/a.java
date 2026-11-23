package d6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new w.a(26);
    public final int a;
    public final int b;
    public final Bundle c;

    public a(int i7, int i10, Bundle bundle) {
        this.a = i7;
        this.b = i10;
        this.c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        cc.b(parcel, 3, this.c);
        cc.s(parcel, r10);
    }
}
