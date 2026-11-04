package o8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends q6.a {
    public static final Parcelable.Creator<b> CREATOR = new n8.g(8);
    public String a;
    public DataHolder b;
    public ParcelFileDescriptor c;
    public long d;
    public byte[] e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.a);
        j8.a.l(parcel, 3, this.b, i3);
        j8.a.l(parcel, 4, this.c, i3);
        long j10 = this.d;
        j8.a.r(parcel, 5, 8);
        parcel.writeLong(j10);
        j8.a.d(parcel, 6, this.e);
        j8.a.t(parcel, s6);
        this.c = null;
    }
}
