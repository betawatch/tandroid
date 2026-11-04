package l8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import i7.p;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends q6.a {
    public static final Parcelable.Creator<b> CREATOR = new p(17);
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
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 2, this.a, i3);
        double d = this.b;
        j8.a.r(parcel, 3, 8);
        parcel.writeDouble(d);
        float f10 = this.c;
        j8.a.r(parcel, 4, 4);
        parcel.writeFloat(f10);
        int i10 = this.d;
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(i10);
        int i11 = this.e;
        j8.a.r(parcel, 6, 4);
        parcel.writeInt(i11);
        float f11 = this.f;
        j8.a.r(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z10 = this.h;
        j8.a.r(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.n;
        j8.a.r(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        j8.a.q(parcel, 10, this.r);
        j8.a.t(parcel, s6);
    }
}
