package j8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new g8.g(10);
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
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.k(parcel, 2, this.a, i10);
        double d = this.b;
        h0.s(parcel, 3, 8);
        parcel.writeDouble(d);
        float f7 = this.c;
        h0.s(parcel, 4, 4);
        parcel.writeFloat(f7);
        int i11 = this.d;
        h0.s(parcel, 5, 4);
        parcel.writeInt(i11);
        int i12 = this.e;
        h0.s(parcel, 6, 4);
        parcel.writeInt(i12);
        float f10 = this.f;
        h0.s(parcel, 7, 4);
        parcel.writeFloat(f10);
        boolean z10 = this.h;
        h0.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.n;
        h0.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        h0.p(parcel, 10, this.r);
        h0.r(parcel, q6);
    }
}
