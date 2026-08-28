package f8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j extends y5.a {
    public static final Parcelable.Creator<j> CREATOR = new c.c(28);
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
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        boolean z10 = this.a;
        p8.s(parcel, 1, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.b;
        p8.s(parcel, 2, 4);
        parcel.writeInt(z11 ? 1 : 0);
        p8.k(parcel, 3, this.c, i9);
        boolean z12 = this.d;
        p8.s(parcel, 4, 4);
        parcel.writeInt(z12 ? 1 : 0);
        p8.k(parcel, 5, this.e, i9);
        p8.h(parcel, 6, this.f);
        p8.k(parcel, 7, this.h, i9);
        p8.k(parcel, 8, this.n, i9);
        boolean z13 = this.r;
        p8.s(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        p8.l(parcel, 10, this.s);
        p8.b(parcel, 11, this.v);
        p8.r(parcel, q10);
    }
}
