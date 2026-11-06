package m8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
        int r10 = wb.r(parcel, 20293);
        wb.k(parcel, 2, this.a, i7);
        double d = this.b;
        wb.q(parcel, 3, 8);
        parcel.writeDouble(d);
        float f10 = this.c;
        wb.q(parcel, 4, 4);
        parcel.writeFloat(f10);
        int i10 = this.d;
        wb.q(parcel, 5, 4);
        parcel.writeInt(i10);
        int i11 = this.e;
        wb.q(parcel, 6, 4);
        parcel.writeInt(i11);
        float f11 = this.f;
        wb.q(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z9 = this.h;
        wb.q(parcel, 8, 4);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = this.n;
        wb.q(parcel, 9, 4);
        parcel.writeInt(z10 ? 1 : 0);
        wb.p(parcel, 10, this.r);
        wb.s(parcel, r10);
    }
}
