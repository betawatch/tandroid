// default package

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class no9 extends b4 {
    public static final Parcelable.Creator<no9> CREATOR = new rhe((byte) 8);
    public String a;
    public DataHolder b;
    public ParcelFileDescriptor c;
    public long d;
    public byte[] e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.k(parcel, 3, this.b, i);
        jte.k(parcel, 4, this.c, i);
        long j = this.d;
        jte.q(parcel, 5, 8);
        parcel.writeLong(j);
        jte.c(parcel, 6, this.e);
        jte.s(parcel, r);
        this.c = null;
    }
}
