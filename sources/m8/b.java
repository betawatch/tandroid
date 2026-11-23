package m8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 2, this.a, i7);
        double d = this.b;
        cc.q(parcel, 3, 8);
        parcel.writeDouble(d);
        float f10 = this.c;
        cc.q(parcel, 4, 4);
        parcel.writeFloat(f10);
        int i10 = this.d;
        cc.q(parcel, 5, 4);
        parcel.writeInt(i10);
        int i11 = this.e;
        cc.q(parcel, 6, 4);
        parcel.writeInt(i11);
        float f11 = this.f;
        cc.q(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z10 = this.h;
        cc.q(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.n;
        cc.q(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        cc.p(parcel, 10, this.r);
        cc.s(parcel, r10);
    }
}
