package j8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class j extends c6.a {
    public static final Parcelable.Creator<j> CREATOR = new f8.o(24);
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
        int q10 = g5.q(parcel, 20293);
        boolean z4 = this.a;
        g5.s(parcel, 1, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z10 = this.b;
        g5.s(parcel, 2, 4);
        parcel.writeInt(z10 ? 1 : 0);
        g5.k(parcel, 3, this.c, i10);
        boolean z11 = this.d;
        g5.s(parcel, 4, 4);
        parcel.writeInt(z11 ? 1 : 0);
        g5.k(parcel, 5, this.e, i10);
        g5.h(parcel, 6, this.f);
        g5.k(parcel, 7, this.h, i10);
        g5.k(parcel, 8, this.n, i10);
        boolean z12 = this.r;
        g5.s(parcel, 9, 4);
        parcel.writeInt(z12 ? 1 : 0);
        g5.l(parcel, 10, this.s);
        g5.b(parcel, 11, this.v);
        g5.r(parcel, q10);
    }
}
