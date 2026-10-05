package m8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import w7.g0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new h(2);
    public String a;
    public DataHolder b;
    public ParcelFileDescriptor c;
    public long d;
    public byte[] e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.a);
        g0.k(parcel, 3, this.b, i10);
        g0.k(parcel, 4, this.c, i10);
        long j3 = this.d;
        g0.s(parcel, 5, 8);
        parcel.writeLong(j3);
        g0.c(parcel, 6, this.e);
        g0.r(parcel, q6);
        this.c = null;
    }
}
