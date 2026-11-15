package m8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new m6.e(3);
    public LatLng a;
    public double b;
    public float c;
    public int d;
    public int e;
    public float f;
    public boolean h;
    public boolean n;
    public ArrayList r;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.k(parcel, 2, this.a, i7);
        double d = this.b;
        yb.q(parcel, 3, 8);
        parcel.writeDouble(d);
        float f10 = this.c;
        yb.q(parcel, 4, 4);
        parcel.writeFloat(f10);
        int i10 = this.d;
        yb.q(parcel, 5, 4);
        parcel.writeInt(i10);
        int i11 = this.e;
        yb.q(parcel, 6, 4);
        parcel.writeInt(i11);
        float f11 = this.f;
        yb.q(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z10 = this.h;
        yb.q(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.n;
        yb.q(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        yb.p(parcel, 10, this.r);
        yb.s(parcel, r10);
    }
}
