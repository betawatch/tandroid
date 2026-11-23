package m8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.a, i7);
        double d = this.b;
        bc.q(parcel, 3, 8);
        parcel.writeDouble(d);
        float f10 = this.c;
        bc.q(parcel, 4, 4);
        parcel.writeFloat(f10);
        int i10 = this.d;
        bc.q(parcel, 5, 4);
        parcel.writeInt(i10);
        int i11 = this.e;
        bc.q(parcel, 6, 4);
        parcel.writeInt(i11);
        float f11 = this.f;
        bc.q(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z10 = this.h;
        bc.q(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.n;
        bc.q(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        bc.p(parcel, 10, this.r);
        bc.s(parcel, r10);
    }
}
