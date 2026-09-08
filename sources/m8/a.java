package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.e0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(28);
    public final String a;
    public final byte[] b;
    public final int c;

    public a(String str, byte[] bArr, int i10) {
        this.a = str;
        this.b = bArr;
        this.c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.a);
        e0.c(parcel, 3, this.b);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        e0.r(parcel, q6);
    }
}
