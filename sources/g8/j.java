package g8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j extends z5.a {
    public static final Parcelable.Creator<j> CREATOR = new f4.e(11);
    public boolean a;
    public boolean b;
    public c c;
    public boolean d;
    public m e;
    public ArrayList f;
    public l h;
    public n n;
    public boolean r;
    public String s;
    public Bundle v;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        boolean z10 = this.a;
        r8.s(parcel, 1, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.b;
        r8.s(parcel, 2, 4);
        parcel.writeInt(z11 ? 1 : 0);
        r8.k(parcel, 3, this.c, i10);
        boolean z12 = this.d;
        r8.s(parcel, 4, 4);
        parcel.writeInt(z12 ? 1 : 0);
        r8.k(parcel, 5, this.e, i10);
        r8.h(parcel, 6, this.f);
        r8.k(parcel, 7, this.h, i10);
        r8.k(parcel, 8, this.n, i10);
        boolean z13 = this.r;
        r8.s(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        r8.l(parcel, 10, this.s);
        r8.b(parcel, 11, this.v);
        r8.r(parcel, q6);
    }
}
