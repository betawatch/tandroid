package a8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import j7.f5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new w.a(7);
    public String a;
    public DataHolder b;
    public ParcelFileDescriptor c;
    public long d;
    public byte[] e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.a);
        f5.k(parcel, 3, this.b, i10);
        f5.k(parcel, 4, this.c, i10);
        long j10 = this.d;
        f5.s(parcel, 5, 8);
        parcel.writeLong(j10);
        f5.c(parcel, 6, this.e);
        f5.r(parcel, q10);
        this.c = null;
    }
}
